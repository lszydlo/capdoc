package pl.com.bottega.capdoc;

import java.time.YearMonth;

public class NumberGenerator {

    private final String systemType;
    private final Long next;
    private final YearMonth yearMonth;
    private final boolean isDemo;
    private final boolean isAudit;

    public NumberGenerator(String systemType, Long next, YearMonth yearMonth, boolean isDemo, boolean isAudit) {
        this.systemType = systemType;
        this.next = next;
        this.yearMonth = yearMonth;
        this.isDemo = isDemo;
        this.isAudit = isAudit;
    }


    String generate() {

        String number = systemType + "/" + next + "/" + yearMonth.getMonthValue() + "/" + yearMonth.getYear();

        if(isAudit) {
            number = number + "/AUDIT";
        }

        if(isDemo) {
            number = "DEMO/" + number;
        }

        return number;
    }
}
