package com.google.android.gms.phenotype.notification;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.phenotype.AppContextProvider;
import defpackage.aqup;
import defpackage.asej;
import defpackage.asot;
import defpackage.cwav;
import defpackage.cwba;
import defpackage.cwbb;
import defpackage.cwbg;
import defpackage.cwbi;
import defpackage.cwbj;
import defpackage.cwbk;
import defpackage.cwbo;
import defpackage.cwbr;
import defpackage.cwco;
import defpackage.cwdf;
import defpackage.cwdy;
import defpackage.cwey;
import defpackage.cwge;
import defpackage.cwhc;
import defpackage.dvuf;
import defpackage.egjy;
import defpackage.egmm;
import defpackage.eiig;
import defpackage.ejdg;
import defpackage.ejfg;
import defpackage.ejhf;
import defpackage.epqs;
import defpackage.frlm;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class PackagesChangedIntentOperation extends IntentOperation {
    private static final asot a = asot.e(asej.PHENOTYPE);
    private Context b;
    private cwbr c;
    private PackageManager d;
    private aqup e;

    public PackagesChangedIntentOperation() {
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        this.b = this;
        this.c = cwbo.b(AppContextProvider.a());
        this.d = getPackageManager();
        this.e = aqup.d(this);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onDestroy() {
        this.c.close();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        cwbi b;
        if ("android.intent.action.PACKAGE_REMOVED".equals(intent.getAction()) || "android.intent.action.PACKAGE_ADDED".equals(intent.getAction()) || "android.intent.action.PACKAGE_DATA_CLEARED".equals(intent.getAction())) {
            Uri data = intent.getData();
            String schemeSpecificPart = data == null ? null : data.getSchemeSpecificPart();
            if (schemeSpecificPart == null) {
                return;
            }
            try {
                if ("android.intent.action.PACKAGE_REMOVED".equals(intent.getAction()) && (!intent.getBooleanExtra("android.intent.extra.REPLACING", false) || (intent.getBooleanExtra("android.intent.extra.REPLACING", true) && intent.getBooleanExtra("android.intent.extra.DATA_REMOVED", true)))) {
                    cwbk a2 = this.c.a();
                    cwba a3 = a2.a();
                    try {
                        cwhc.a(this.b, schemeSpecificPart, a3);
                        a3.close();
                        b = a2.b();
                        try {
                            if (b.f()) {
                                if (frlm.d()) {
                                    cwdy.a.a(b, schemeSpecificPart);
                                }
                                if (b.c("DELETE FROM android_packages WHERE name = ?1;").g(schemeSpecificPart).b() > 0 && !frlm.d()) {
                                    cwdy.a.e();
                                }
                                b.e();
                            } else {
                                if (frlm.d()) {
                                    cwdy.a.a(b, schemeSpecificPart);
                                }
                                ejdg ejdgVar = new ejdg(schemeSpecificPart);
                                int i = cwge.c;
                                cwbg d = b.d("temp_deleted_pkgs", "CREATE TEMP TABLE temp_deleted_pkgs (packageName TEXT PRIMARY KEY) WITHOUT ROWID;\n");
                                try {
                                    ejfg listIterator = ejdgVar.listIterator();
                                    while (listIterator.hasNext()) {
                                        b.c("INSERT INTO temp_deleted_pkgs SELECT packageName FROM Packages WHERE androidPackageName=?").g((String) listIterator.next()).d();
                                    }
                                    cwge.c(b);
                                    d.close();
                                    d = b.d("temp_deleted_pkgs", "CREATE TEMP TABLE temp_deleted_pkgs (packageName TEXT PRIMARY KEY) WITHOUT ROWID;\n");
                                    try {
                                        ejfg listIterator2 = ejdgVar.listIterator();
                                        while (listIterator2.hasNext()) {
                                            b.c("INSERT INTO temp_deleted_pkgs VALUES (?)").g((String) listIterator2.next()).d();
                                        }
                                        b.c("DELETE FROM StorageInfos WHERE androidPackageName IN (SELECT temp_deleted_pkgs.packageName FROM temp_deleted_pkgs)").b();
                                        d.close();
                                        b.e();
                                    } finally {
                                    }
                                } finally {
                                }
                            }
                            b.close();
                            return;
                        } finally {
                        }
                    } finally {
                    }
                }
                if (!"android.intent.action.PACKAGE_DATA_CLEARED".equals(intent.getAction())) {
                    if ("android.intent.action.PACKAGE_ADDED".equals(intent.getAction()) && cwco.a(this.e, schemeSpecificPart)) {
                        PackageInfo packageInfo = this.d.getPackageInfo(schemeSpecificPart, 128);
                        List arrayList = new ArrayList();
                        try {
                            egjy e = egmm.e("com/google/android/gms/phenotype/notification/PackagesChangedIntentOperation", "onPackageAdded", 257, "Read registration info");
                            try {
                                arrayList = new dvuf(this.d).a(packageInfo);
                                e.close();
                            } catch (Throwable th) {
                                try {
                                    e.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (IllegalArgumentException e2) {
                            ((ejhf) ((ejhf) a.i()).s(e2)).B("Error registering %s", schemeSpecificPart);
                        }
                        if (arrayList.isEmpty()) {
                            return;
                        }
                        new cwey(new cwdf(), (epqs[]) arrayList.toArray(new epqs[0])).h(this.b, this.c);
                        return;
                    }
                    return;
                }
                cwbk a4 = this.c.a();
                Context context = this.b;
                b = a4.b();
                try {
                    cwhc.a(context, schemeSpecificPart, b);
                    HashSet<String> hashSet = new HashSet();
                    cwav i2 = ((cwbb) b).b(b.f() ? "    SELECT config_packages.name\n    FROM config_packages\n    INNER JOIN android_packages\n      USING (android_package_id)\n    WHERE android_packages.name = ?1;\n" : "SELECT packageName FROM Packages WHERE androidPackageName = ?").g(schemeSpecificPart).i();
                    try {
                        if (i2.b()) {
                            do {
                                hashSet.add(i2.f(0));
                            } while (i2.b());
                            i2.close();
                            if (b.f()) {
                                if (frlm.d()) {
                                    cwdy.a.a(b, schemeSpecificPart);
                                }
                                b.c("DELETE FROM experiment_states\nWHERE experiment_state_id in (\n  SELECT experiment_state_id\n  FROM experiment_states\n  INNER JOIN config_packages\n    USING (config_package_id)\n  INNER JOIN android_packages\n    USING (android_package_id)\n  WHERE android_packages.name = ?1\n);\n").g(schemeSpecificPart).d();
                            } else {
                                if (frlm.d()) {
                                    cwdy.a.a(b, schemeSpecificPart);
                                }
                                for (String str : hashSet) {
                                    b.c("DELETE FROM ExperimentTokens WHERE packageName = ? AND isCommitted = 1").g(str).d();
                                    b.c("DELETE FROM Flags WHERE packageName = ? AND committed = 1").g(str).d();
                                    b.c("DELETE FROM FlagOverrides WHERE packageName = ? AND committed = 1").g(str).d();
                                    b.c("DELETE FROM CrossLoggedExperimentTokens WHERE fromPackageName = ? AND isCommitted = 1").g(str).d();
                                    b.c("DELETE FROM ApplicationStates WHERE packageName = ?").g(str).d();
                                    b.c("DELETE FROM StorageInfos WHERE androidPackageName = ?").g(schemeSpecificPart).d();
                                }
                            }
                            b.e();
                            if (!hashSet.isEmpty() && !frlm.d()) {
                                cwdy.a.e();
                            }
                        } else {
                            eiig.p(!((cwbj) b).d);
                            ((cwbj) b).d = true;
                            i2.close();
                        }
                        b.close();
                        return;
                    } finally {
                    }
                } finally {
                }
            } catch (Exception e3) {
                ((ejhf) ((ejhf) a.i()).s(e3)).P("Could not manipulate package: %s with intent: %s", schemeSpecificPart, intent.getAction());
            }
            ((ejhf) ((ejhf) a.i()).s(e3)).P("Could not manipulate package: %s with intent: %s", schemeSpecificPart, intent.getAction());
        }
    }

    public PackagesChangedIntentOperation(Context context, cwbr cwbrVar, PackageManager packageManager, aqup aqupVar) {
        this.b = context;
        this.c = cwbrVar;
        this.d = packageManager;
        this.e = aqupVar;
    }
}
