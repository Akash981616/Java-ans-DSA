//100000 ml is 1Hl
const package = [
  { id: 1, title: "kegs", size: 30000 }, // size in milliliter
  { id: 2, title: "bottle", size: 330 }, // size in milliliter
  { id: 3, title: "can", size: 300 }, // size in milliliter
  { id: 4, title: "container", size: 1000000 }, // size in milliliter
];
const calcLiquorConsumption = (input) => {
  ({ packaging, orderFrequency, quantityPerOrder } = input);

  currentPackage = package[packaging - 1];

  totalVolume = orderFrequency * (quantityPerOrder / 100) * 48; //4 weeks * 12 months]

  (unitsPerOrderValue = (quantityPerOrder * 1000) / currentPackage.size),
    (result = {
      totalVolumeInYear: totalVolume,
      packaging: currentPackage.title + "s",
      unitsPerOrder: unitsPerOrderValue,
    });
  return result;
};

input = {
  id: 1,
  title: "Beer for a pub",
  packaging: 2, // id of the packaging
  orderFrequency: 3, // order frequency in weeks
  quantityPerOrder: 1000, // quantity per order in litres
  createdAt: 1589265720000,
};
console.log(calcLiquorConsumption(input));