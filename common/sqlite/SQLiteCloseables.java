package com.google.android.gms.common.sqlite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class SQLiteCloseables {
    private static final String TAG = "SQLiteCloseables";
    private static final Set closeables = Collections.newSetFromMap(new WeakHashMap());

    private SQLiteCloseables() {
    }

    public static void add(SQLiteAutoCloseable sQLiteAutoCloseable) {
        Set set = closeables;
        synchronized (set) {
            set.add(sQLiteAutoCloseable);
        }
    }

    public static void closeAll() {
        Iterator it = getCloseables().iterator();
        while (it.hasNext()) {
            try {
                ((SQLiteAutoCloseable) it.next()).close();
            } catch (Exception unused) {
            }
        }
    }

    private static List getCloseables() {
        ArrayList arrayList;
        Set set = closeables;
        synchronized (set) {
            arrayList = new ArrayList(set);
        }
        return arrayList;
    }

    public static void remove(SQLiteAutoCloseable sQLiteAutoCloseable) {
        Set set = closeables;
        synchronized (set) {
            set.remove(sQLiteAutoCloseable);
        }
    }
}
