class ExchangeTemplateClass<T> {
    private T value;

    public ExchangeTemplateClass(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}