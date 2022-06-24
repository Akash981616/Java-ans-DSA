import
class Solution {
    int row = 0, col = 0, diag = 0, adiag = 0;

    public int totalNQueens(int n) {
        return countQueen(0, n);

    }

    public int countQueen(int floor, int n) {
        if (floor == n) {
            return 1;
        }
        int count = 0;
        int r = floor;
        for (int c = 0; c < n; c++) {

            if ((col & (1 << c)) == 0 && (adiag & (1 << r + c)) == 0 && (diag & (1 << (r - c + n - 1))) == 0) {
                col ^= (1 << c);
                diag ^= (1 << (r - c + n - 1));
                adiag ^= (1 << (r + c));
                count += countQueen(c, n);
                col ^= (1 << c);
                diag ^= (1 << (r - c + n - 1));
                adiag ^= (1 << (r + c));
            }
        }
        return count;
    }
}

using System;
using System.Collections.Generic;
import  System.Linq;

namespace TestApp
{
    public class User
    {
        public int id;
        public String name;
    }
    static class DataFactory
    {
        public static List<User> getAllUsers()
        {
            return new List<User>
            {
                new User { id = 1, name = "User 1" },
                new User { id = 2, name = "User 2" },
                new User { id = 3, name = "User 3" },
                new User { id = 4, name = "User 4" },
                new User { id = 5, name = "User 5" },
            };
        }
    }
    interface IDBService
    {
        List<User> getAllSMSByUser(long userId);
        List<User> getAllSMSSentToUser(long userId);
    }

    class DBService:IDBService
    {

        public List<User> getAllSMSByUser(long userId)
        {
            try
            {
                List<User> users = DataFactory.getAllUsers().Where(user => user.id == userId).ToList();
                return users;
            } catch(Exception ex)
            {
                return new List<User>();
            }
            
        }

        public List<User> getAllSMSSentToUser(long userId) {            
            try {
                List<User> users = DataFactory.getAllUsers().Where(user => user.id == userId).ToList();
                return users;
            }
            catch (Exception ex)
            {
                return new List<User>();
            }
        }
    }
    
    
    interface IServiceProvider
    {
        void sendSMS(String toMobile, String text);
        void sendEmail(String toEmail, String emailText);
        List<User> getAllSMSByUser(long userId);
        List<User> getAllSMSSentToUser(int uderId);
    }
    class ServiceProvider : IServiceProvider
    {
        IDBService _dbService = new DBService();
        public void sendSMS(String toMobile, String text)
        {
            Console.WriteLine("Message sent to: " + toMobile + ", with text: " + text);
        }
        public void sendEmail(String toEmail, String emailText)
        {
            Console.WriteLine("Email sent to: " + toEmail + ", with email text: " + emailText);
        }
        public List<User> getAllSMSByUser(long userId)
        {
            return _dbService.getAllSMSByUser(userId);
        }
        public List<User> getAllSMSSentToUser(int userId)
        {
            return _dbService.getAllSMSSentToUser(userId);
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            IServiceProvider service = new ServiceProvider();
            while (true)
            {
                Console.WriteLine("Please enter 1 , 2, 3, 4, or 5");
                String input = Console.ReadLine();
                if (input.Equals("1"))
                {
                    service.sendSMS("9999999999","SMS Text");
                } else if (input.Equals("2"))
                {
                    service.sendEmail("test@test.com","Email text");
                } else if (input.Equals("3"))
                {
                    List<User> users = service.getAllSMSByUser(1);
                    foreach (User user in users)
                    {
                        Console.WriteLine(user.id + " " + user.name);
                    }
                } else if (input.Equals("4"))
                {
                    List<User> users = service.getAllSMSSentToUser(2);
                    foreach (User user in users)
                    {
                        Console.WriteLine(user.id+" "+user.name);
                    }
                } else
                {
                    Console.WriteLine("Thank you for using");
                    break;
                }

            }

            Console.ReadKey();
        }
    }
}