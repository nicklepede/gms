package com.google.android.gms.ipa.appsindexer;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.ipa.appsindexer.IpaPackageBroadcastIntentOperation;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bqus;
import defpackage.bqvj;
import defpackage.eluo;
import defpackage.fsah;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class IpaPackageBroadcastIntentOperation extends IntentOperation {
    public static final /* synthetic */ int a = 0;

    static {
        ausn.b("GmscoreIpa", auid.PLATFORM_DATA_INDEXER);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        char c;
        if (fsah.j()) {
            String action = intent.getAction();
            final String schemeSpecificPart = intent.getData() != null ? intent.getData().getSchemeSpecificPart() : null;
            boolean z = true;
            boolean z2 = false;
            switch (action.hashCode()) {
                case -810471698:
                    if (action.equals("android.intent.action.PACKAGE_REPLACED")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -19011148:
                    if (action.equals("android.intent.action.LOCALE_CHANGED")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 525384130:
                    if (action.equals("android.intent.action.PACKAGE_REMOVED")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 615541781:
                    if (action.equals("com.google.android.gms.ENTIRE_PACKAGE_CHANGED")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1544582882:
                    if (action.equals("android.intent.action.PACKAGE_ADDED")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                z = false;
                z2 = !intent.getBooleanExtra("android.intent.extra.REPLACING", false);
            } else if (c != 1 && c != 2) {
                if (c != 3) {
                    if (c == 4) {
                        bqvj.a().b(new Runnable() { // from class: bqux
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i = IpaPackageBroadcastIntentOperation.a;
                                bqur c2 = bqur.c();
                                if (c2 != null) {
                                    c2.b();
                                }
                            }
                        });
                    }
                    z = false;
                } else {
                    PackageManager packageManager = getPackageManager();
                    ausn ausnVar = bqus.a;
                    if (schemeSpecificPart != null) {
                        try {
                            z = packageManager.getApplicationInfo(schemeSpecificPart, 0).enabled;
                        } catch (PackageManager.NameNotFoundException e) {
                            ((eluo) ((eluo) bqus.a.i()).s(e)).B("Could not get app info for %s", schemeSpecificPart);
                        }
                        z2 = !z;
                    }
                    z = false;
                    z2 = !z;
                }
            }
            if (TextUtils.isEmpty(schemeSpecificPart)) {
                return;
            }
            if (z2) {
                bqvj.a().b(new Runnable() { // from class: bquw
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i = IpaPackageBroadcastIntentOperation.a;
                        bqur c2 = bqur.c();
                        if (c2 != null) {
                            fgrc v = enof.a.v();
                            if (!v.b.L()) {
                                v.U();
                            }
                            ((enof) v.b).b = enoe.a(4);
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            HashSet hashSet = new HashSet();
                            HashSet hashSet2 = new HashSet();
                            bqut bqutVar = c2.d;
                            for (ComponentName componentName : bqutVar.a()) {
                                String str = schemeSpecificPart;
                                if (str.equals(componentName.getPackageName())) {
                                    hashSet2.add(bqus.b(componentName));
                                } else {
                                    hashSet.add(componentName);
                                }
                            }
                            int size = hashSet2.size();
                            if (!v.b.L()) {
                                v.U();
                            }
                            ((enof) v.b).e = size;
                            dhlw e2 = c2.c.e((String[]) hashSet2.toArray(new String[hashSet2.size()]));
                            e2.y(new bquq(32, (enof) v.Q(), elapsedRealtime));
                            e2.z(new bqup((enof) v.Q(), elapsedRealtime));
                            bqutVar.b(hashSet);
                        }
                    }
                });
            } else if (z) {
                bqvj.a().b(new Runnable() { // from class: bquv
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean hasNext;
                        int i = IpaPackageBroadcastIntentOperation.a;
                        bqur c2 = bqur.c();
                        if (c2 != null) {
                            fgrc v = enof.a.v();
                            if (!v.b.L()) {
                                v.U();
                            }
                            String str = schemeSpecificPart;
                            ((enof) v.b).b = enoe.a(3);
                            PackageManager packageManager2 = c2.e;
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            elgo d = bqus.d(packageManager2, str);
                            if (d == null) {
                                if (!v.b.L()) {
                                    v.U();
                                }
                                ((enof) v.b).i = enod.a(4);
                                bqvi.a().b((enof) v.Q());
                                bqvi.a().c(30);
                                return;
                            }
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = new ArrayList();
                            for (int i2 = 0; i2 < ((elpg) d).c; i2++) {
                                bqui bquiVar = (bqui) d.get(i2);
                                if (bquiVar.b()) {
                                    arrayList2.add(bquiVar.c);
                                }
                                esus d2 = bqur.d(bquiVar);
                                if (d2 != null) {
                                    arrayList.add(d2);
                                }
                            }
                            int size = arrayList.size();
                            if (!v.b.L()) {
                                v.U();
                            }
                            ((enof) v.b).c = size;
                            if (arrayList.isEmpty()) {
                                if (!v.b.L()) {
                                    v.U();
                                }
                                ((enof) v.b).i = enod.a(3);
                                long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                if (!v.b.L()) {
                                    v.U();
                                }
                                ((enof) v.b).j = elapsedRealtime2;
                                bqvi.a().b((enof) v.Q());
                                return;
                            }
                            dhlw g = c2.c.g((esus[]) arrayList.toArray(new esus[arrayList.size()]));
                            g.z(new bqup((enof) v.Q(), elapsedRealtime));
                            g.y(new bquq(31, (enof) v.Q(), elapsedRealtime));
                            bqut bqutVar = c2.d;
                            synchronized (bqut.b) {
                                PrintWriter printWriter = null;
                                printWriter = null;
                                try {
                                    try {
                                        try {
                                            PrintWriter printWriter2 = new PrintWriter(new BufferedWriter(new FileWriter(bqutVar.c.getFileStreamPath("apps_3p_corpus_component_names.txt"), true)));
                                            try {
                                                Iterator it = arrayList2.iterator();
                                                while (true) {
                                                    hasNext = it.hasNext();
                                                    if (hasNext == 0) {
                                                        break;
                                                    } else {
                                                        printWriter2.println(((ComponentName) it.next()).flattenToString());
                                                    }
                                                }
                                                printWriter2.close();
                                                printWriter = hasNext;
                                            } catch (IOException e2) {
                                                e = e2;
                                                printWriter = printWriter2;
                                                ((eluo) ((eluo) bqut.a.i()).s(e)).x("Failed to append to component name file.");
                                                if (printWriter != null) {
                                                    printWriter.close();
                                                    printWriter = printWriter;
                                                }
                                            } catch (Throwable th) {
                                                th = th;
                                                printWriter = printWriter2;
                                                if (printWriter != null) {
                                                    try {
                                                        printWriter.close();
                                                    } catch (RuntimeException unused) {
                                                    }
                                                }
                                                throw th;
                                            }
                                        } catch (IOException e3) {
                                            e = e3;
                                        }
                                    } catch (RuntimeException unused2) {
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                        }
                    }
                });
            }
        }
    }
}
