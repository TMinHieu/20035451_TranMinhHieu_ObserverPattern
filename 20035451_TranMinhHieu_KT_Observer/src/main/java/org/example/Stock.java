package org.example;

import java.util.ArrayList;
import java.util.List;

public interface Stock {
    void attach(Investor investor);
    void detach(Investor investor);
    void notifyInvestors();
}
