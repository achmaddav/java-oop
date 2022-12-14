package interfaceClass;

public class HasBrandImpl implements HasBrand{
    private final String brandName;
    private final Integer price;

    public HasBrandImpl(String brandName, Integer price) {
        this.brandName = brandName;
        this.price = price;
    }

    @Override
    public String getBrand() {
        return this.brandName;
    }

    @Override
    public Integer getPrice() {
        return this.price;
    }
}
