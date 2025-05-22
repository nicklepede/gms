package com.google.android.gms.phenotype.notification;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.phenotype.AppContextProvider;
import defpackage.asxe;
import defpackage.auid;
import defpackage.ausn;
import defpackage.cyks;
import defpackage.cykx;
import defpackage.cyky;
import defpackage.cyld;
import defpackage.cylf;
import defpackage.cylg;
import defpackage.cyll;
import defpackage.cylo;
import defpackage.cyml;
import defpackage.cync;
import defpackage.cynv;
import defpackage.cyov;
import defpackage.cyqb;
import defpackage.cyqz;
import defpackage.dygg;
import defpackage.eixb;
import defpackage.eizp;
import defpackage.ekvl;
import defpackage.elqn;
import defpackage.elsn;
import defpackage.eluo;
import defpackage.eser;
import defpackage.fufk;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class PackagesChangedIntentOperation extends IntentOperation {
    private static final ausn a = ausn.e(auid.PHENOTYPE);
    private Context b;
    private cylo c;
    private PackageManager d;
    private asxe e;

    public PackagesChangedIntentOperation() {
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        this.b = this;
        this.c = cyll.b(AppContextProvider.a());
        this.d = getPackageManager();
        this.e = asxe.d(this);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onDestroy() {
        this.c.close();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        eixb e;
        cylf b;
        if ("android.intent.action.PACKAGE_REMOVED".equals(intent.getAction()) || "android.intent.action.PACKAGE_ADDED".equals(intent.getAction()) || "android.intent.action.PACKAGE_DATA_CLEARED".equals(intent.getAction())) {
            Uri data = intent.getData();
            String schemeSpecificPart = data == null ? null : data.getSchemeSpecificPart();
            if (schemeSpecificPart == null) {
                return;
            }
            try {
                if ("android.intent.action.PACKAGE_REMOVED".equals(intent.getAction()) && (!intent.getBooleanExtra("android.intent.extra.REPLACING", false) || (intent.getBooleanExtra("android.intent.extra.REPLACING", true) && intent.getBooleanExtra("android.intent.extra.DATA_REMOVED", true)))) {
                    cykx a2 = this.c.a().a();
                    try {
                        cyqz.a(this.b, schemeSpecificPart, a2);
                        a2.close();
                        b = this.c.a().b();
                        try {
                            if (b.f()) {
                                if (fufk.d()) {
                                    cynv.a.a(this.c, b, schemeSpecificPart);
                                }
                                if (b.c("DELETE FROM android_packages WHERE name = ?1;").g(schemeSpecificPart).b() > 0 && !fufk.d()) {
                                    cynv.a.e();
                                }
                                b.e();
                            } else {
                                if (fufk.d()) {
                                    cynv.a.a(this.c, b, schemeSpecificPart);
                                }
                                elqn elqnVar = new elqn(schemeSpecificPart);
                                int i = cyqb.c;
                                cyld d = b.d("temp_deleted_pkgs", "CREATE TEMP TABLE temp_deleted_pkgs (packageName TEXT PRIMARY KEY) WITHOUT ROWID;\n");
                                try {
                                    elsn listIterator = elqnVar.listIterator();
                                    while (listIterator.hasNext()) {
                                        b.c("INSERT INTO temp_deleted_pkgs SELECT packageName FROM Packages WHERE androidPackageName=?").g((String) listIterator.next()).d();
                                    }
                                    cyqb.c(b);
                                    d.close();
                                    d = b.d("temp_deleted_pkgs", "CREATE TEMP TABLE temp_deleted_pkgs (packageName TEXT PRIMARY KEY) WITHOUT ROWID;\n");
                                    try {
                                        elsn listIterator2 = elqnVar.listIterator();
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
                    if ("android.intent.action.PACKAGE_ADDED".equals(intent.getAction()) && cyml.a(this.e, schemeSpecificPart)) {
                        PackageInfo packageInfo = this.d.getPackageInfo(schemeSpecificPart, 128);
                        List arrayList = new ArrayList();
                        try {
                            e = eizp.e("com/google/android/gms/phenotype/notification/PackagesChangedIntentOperation", "onPackageAdded", 245, "Read registration info");
                        } catch (IllegalArgumentException e2) {
                            ((eluo) ((eluo) a.i()).s(e2)).B("Error registering %s", schemeSpecificPart);
                        }
                        try {
                            arrayList = new dygg(this.d).a(packageInfo);
                            e.close();
                            if (arrayList.isEmpty()) {
                                return;
                            }
                            new cyov(new cync(), (eser[]) arrayList.toArray(new eser[0])).h(this.b, this.c);
                            return;
                        } catch (Throwable th) {
                            try {
                                e.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    return;
                }
                Context context = this.b;
                b = this.c.a().b();
                try {
                    cyqz.a(context, schemeSpecificPart, b);
                    HashSet<String> hashSet = new HashSet();
                    cyks i2 = ((cyky) b).b(b.f() ? "    SELECT config_packages.name\n    FROM config_packages\n    INNER JOIN android_packages\n      USING (android_package_id)\n    WHERE android_packages.name = ?1;\n" : "SELECT packageName FROM Packages WHERE androidPackageName = ?").g(schemeSpecificPart).i();
                    try {
                        if (i2.b()) {
                            do {
                                hashSet.add(i2.f(0));
                            } while (i2.b());
                            i2.close();
                            if (b.f()) {
                                if (fufk.d()) {
                                    cynv.a.a(this.c, b, schemeSpecificPart);
                                }
                                b.c("DELETE FROM experiment_states\nWHERE experiment_state_id in (\n  SELECT experiment_state_id\n  FROM experiment_states\n  INNER JOIN config_packages\n    USING (config_package_id)\n  INNER JOIN android_packages\n    USING (android_package_id)\n  WHERE android_packages.name = ?1\n);\n").g(schemeSpecificPart).d();
                            } else {
                                if (fufk.d()) {
                                    cynv.a.a(this.c, b, schemeSpecificPart);
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
                            if (!hashSet.isEmpty() && !fufk.d()) {
                                cynv.a.e();
                            }
                        } else {
                            ekvl.q(!((cylg) b).d);
                            ((cylg) b).d = true;
                            i2.close();
                        }
                        b.close();
                        return;
                    } finally {
                    }
                } finally {
                }
            } catch (Exception e3) {
                ((eluo) ((eluo) a.i()).s(e3)).P("Could not manipulate package: %s with intent: %s", schemeSpecificPart, intent.getAction());
            }
            ((eluo) ((eluo) a.i()).s(e3)).P("Could not manipulate package: %s with intent: %s", schemeSpecificPart, intent.getAction());
        }
    }

    public PackagesChangedIntentOperation(Context context, cylo cyloVar, PackageManager packageManager, asxe asxeVar) {
        this.b = context;
        this.c = cyloVar;
        this.d = packageManager;
        this.e = asxeVar;
    }
}
