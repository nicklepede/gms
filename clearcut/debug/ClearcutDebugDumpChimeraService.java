package com.google.android.gms.clearcut.debug;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.aqej;
import defpackage.aqep;
import defpackage.aqev;
import defpackage.aqgf;
import defpackage.aqgu;
import defpackage.asnz;
import defpackage.eitj;
import defpackage.ejcb;
import defpackage.figj;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class ClearcutDebugDumpChimeraService extends Service {
    @Override // com.google.android.chimera.Service
    protected final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i;
        eitj b = aqev.c().b();
        int i2 = ((ejcb) b).c;
        int i3 = 0;
        while (i3 < i2) {
            aqep aqepVar = (aqep) b.get(i3);
            Map m = aqepVar.m();
            HashMap hashMap = new HashMap();
            for (Map.Entry entry : m.entrySet()) {
                String c = aqgu.c((figj) entry.getKey());
                hashMap.put(c, Long.valueOf((hashMap.containsKey(c) ? ((Long) hashMap.get(c)).longValue() : 0L) + ((aqej) entry.getValue()).a));
            }
            printWriter.print("Clearcut log storage:");
            printWriter.println(aqepVar.i());
            ArrayList arrayList = new ArrayList(hashMap.entrySet());
            Collections.sort(arrayList, new Comparator() { // from class: apve
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ((Comparable) ((Map.Entry) obj2).getValue()).compareTo(((Map.Entry) obj).getValue());
                }
            });
            Iterator it = arrayList.iterator();
            while (true) {
                i = i3 + 1;
                if (it.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it.next();
                    printWriter.println(((String) entry2.getKey()) + ": " + String.valueOf(entry2.getValue()) + " bytes");
                }
            }
            i3 = i;
        }
        printWriter.println();
        long j = new aqgf(this, asnz.a).a.getSharedPreferences("timing_control_pref", 0).getLong("last_record_wall_time_millis", 0L);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        printWriter.println("Last upload time:".concat(String.valueOf(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(calendar.getTime()))));
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        return 1;
    }
}
