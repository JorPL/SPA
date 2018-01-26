package com.example.joplagne.spa.FragmentDetailCode;

import android.provider.BaseColumns;

/**
 * Created by revivier on 26/01/18.
 */

public class CodeContract {
    private CodeContract() {}

    /* Inner class that defines the table contents */
    public static class FeedEntry implements BaseColumns {
        public static final String TABLE_NAME = "CodeScanDB";
        public static final String COLUMN_NAME_TITLE_CODE = "Code";
        public static final String COLUMN_NAME_TITLE_DATE = "Date";
        public static final String COLUMN_NAME_TITLE_TYPE = "Type";
        public static final String COLUMN_NAME_TITLE_INFOS = "Infos";


    }
}
