package com.google.android.gms.phenotype.provider;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Binder;
import android.os.SystemClock;
import android.util.Base64;
import com.google.android.chimera.ContentProvider;
import com.google.android.gms.phenotype.Configuration;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.gms.phenotype.Flag;
import defpackage.asxe;
import defpackage.auid;
import defpackage.ausn;
import defpackage.btjm;
import defpackage.bxnb;
import defpackage.cyks;
import defpackage.cykx;
import defpackage.cyky;
import defpackage.cylf;
import defpackage.cyll;
import defpackage.cylo;
import defpackage.cylr;
import defpackage.cyme;
import defpackage.cymk;
import defpackage.cymm;
import defpackage.cynj;
import defpackage.cynn;
import defpackage.cyno;
import defpackage.cynz;
import defpackage.cyoe;
import defpackage.cyoq;
import defpackage.dpya;
import defpackage.dxwx;
import defpackage.eixb;
import defpackage.eizp;
import defpackage.ekvk;
import defpackage.ekvl;
import defpackage.eluo;
import defpackage.fgrc;
import defpackage.fkve;
import defpackage.fkvf;
import defpackage.fkvz;
import defpackage.fkwa;
import defpackage.fkwc;
import defpackage.fkwd;
import defpackage.fuec;
import defpackage.fufv;
import j$.util.Objects;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class ConfigurationChimeraProvider extends ContentProvider {
    private static final ausn a = ausn.e(auid.PHENOTYPE);

    @Override // com.google.android.chimera.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.chimera.ContentProvider
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        cykx a2;
        cyks i;
        cylo b = cyll.b(getContext());
        try {
            try {
                a2 = b.a().a();
                try {
                    i = ((cyky) a2).b(a2.f() ? "SELECT\n  config_packages.name,\n  config_packages.version,\n  accounts.name,\n  experiment_states.experiment_token,\n  experiment_states.serving_version\nFROM experiment_states\nINNER JOIN config_packages\n  ON (experiment_state_id IS committed_experiment_state_id)\nINNER JOIN accounts\n  USING (account_id)\nORDER BY config_packages.name;\n" : "SELECT packageName, version, user, experimentToken, servingVersion FROM ExperimentTokens WHERE isCommitted = 1 ORDER BY packageName").d().i();
                } finally {
                }
            } catch (SQLiteException e) {
                cynj.k(getContext(), e, fkwc.CONTENT_PROVIDER_DUMP);
            }
            try {
                printWriter.println("Phenotype committed experiment tokens; config-package v=version u=user: base64-token (config version)");
                while (i.b()) {
                    String str = "";
                    if (!a2.f() || (a2.f() && !i.g(3))) {
                        str = Base64.encodeToString(i.i(3), 11);
                    }
                    printWriter.println(String.format(Locale.US, "%s v=%d u=%s: %s (%d)", i.e(0), Long.valueOf(i.d(1)), i.e(2), str, Long.valueOf(i.d(4))));
                }
                i.close();
                a2.close();
            } finally {
            }
        } finally {
            b.close();
        }
    }

    @Override // com.google.android.chimera.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // com.google.android.chimera.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.chimera.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // com.google.android.chimera.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        String str3;
        Configurations configurations;
        Configuration[] configurationArr;
        Throwable th;
        Integer num;
        Object obj = null;
        if (uri.getLastPathSegment() == null) {
            ((eluo) a.j()).B("Invalid Uri: %s", uri);
            return null;
        }
        String nameForUid = getContext().getPackageManager().getNameForUid(Binder.getCallingUid());
        String lastPathSegment = uri.getLastPathSegment();
        ekvl.y(lastPathSegment);
        String c = cyme.c(lastPathSegment, ekvk.b(nameForUid));
        if (!asxe.d(getContext().getApplicationContext()).i(Binder.getCallingUid()) && !cymm.a(fuec.c(), cyme.d(c))) {
            ((eluo) a.j()).B("Caller is not authorized to access Uri: %s", uri);
            return null;
        }
        if (strArr != null) {
            int i = 0;
            str3 = null;
            while (true) {
                int i2 = i + 1;
                if (i2 >= strArr.length) {
                    break;
                }
                String str4 = strArr[i];
                String str5 = strArr[i2];
                if (Objects.equals(str4, "account")) {
                    if (str5 == null) {
                        ((eluo) a.j()).x("Invalid argument for account: null");
                        return null;
                    }
                    if (str3 != null) {
                        ((eluo) a.j()).x("Cannot specify argument \"account\" twice");
                        return null;
                    }
                    str3 = str5;
                }
                i += 2;
            }
        } else {
            str3 = null;
        }
        if (str3 != null) {
            String b = ekvk.b(nameForUid);
            if (dpya.h(getContext())) {
                throw new IllegalArgumentException("Phenotype commitOnQuery cannot be used in direct boot mode");
            }
            eixb e = eizp.e("com/google/android/gms/phenotype/provider/ConfigurationChimeraProvider", "getLatestConfiguration", 277, "Get latest configuration");
            try {
                if (str3.equals("") || cymk.a(str3, getContext())) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    cylo b2 = cyll.b(getContext());
                    try {
                    } catch (Throwable th2) {
                        th = th2;
                        num = null;
                    }
                    try {
                        try {
                            try {
                                try {
                                    cylf b3 = b2.a().b();
                                    try {
                                        configurations = new cyoe(c, str3, b, b3).c(getContext(), b2);
                                        String str6 = configurations.a;
                                        if (str6.isEmpty()) {
                                            b3.e();
                                            b3.close();
                                            b2.close();
                                            fkwa fkwaVar = (fkwa) fkwd.a.v();
                                            fkve fkveVar = (fkve) fkvf.a.v();
                                            if (!fkveVar.b.L()) {
                                                fkveVar.U();
                                            }
                                            fkvf fkvfVar = (fkvf) fkveVar.b;
                                            c.getClass();
                                            fkvfVar.b = 1 | fkvfVar.b;
                                            fkvfVar.c = c;
                                            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                            if (!fkveVar.b.L()) {
                                                fkveVar.U();
                                            }
                                            fkvf fkvfVar2 = (fkvf) fkveVar.b;
                                            fkvfVar2.b |= 1024;
                                            fkvfVar2.k = (int) elapsedRealtime2;
                                            fkvf fkvfVar3 = (fkvf) fkveVar.Q();
                                            if (!fkwaVar.b.L()) {
                                                fkwaVar.U();
                                            }
                                            fkwd fkwdVar = (fkwd) fkwaVar.b;
                                            fkvfVar3.getClass();
                                            fkwdVar.c = fkvfVar3;
                                            fkwdVar.b |= 2;
                                            if (fufv.h() && cyoq.a().b(getContext())) {
                                                if (!fkwaVar.b.L()) {
                                                    fkwaVar.U();
                                                }
                                                fkwd.f((fkwd) fkwaVar.b);
                                            }
                                            btjm l = bxnb.v().l((fkwd) fkwaVar.Q());
                                            l.c = 37;
                                            l.a();
                                        } else {
                                            cyno cynoVar = new cyno(str6, b, b3);
                                            cynoVar.b(getContext(), b2);
                                            cynn.m(getContext(), b2, cynoVar);
                                            b3.e();
                                            b3.close();
                                            b2.close();
                                            fkwa fkwaVar2 = (fkwa) fkwd.a.v();
                                            fkve fkveVar2 = (fkve) fkvf.a.v();
                                            if (!fkveVar2.b.L()) {
                                                fkveVar2.U();
                                            }
                                            fkvf fkvfVar4 = (fkvf) fkveVar2.b;
                                            c.getClass();
                                            fkvfVar4.b = 1 | fkvfVar4.b;
                                            fkvfVar4.c = c;
                                            long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                            if (!fkveVar2.b.L()) {
                                                fkveVar2.U();
                                            }
                                            fkvf fkvfVar5 = (fkvf) fkveVar2.b;
                                            fkvfVar5.b |= 1024;
                                            fkvfVar5.k = (int) elapsedRealtime3;
                                            fkvf fkvfVar6 = (fkvf) fkveVar2.Q();
                                            if (!fkwaVar2.b.L()) {
                                                fkwaVar2.U();
                                            }
                                            fkwd fkwdVar2 = (fkwd) fkwaVar2.b;
                                            fkvfVar6.getClass();
                                            fkwdVar2.c = fkvfVar6;
                                            fkwdVar2.b |= 2;
                                            if (fufv.h() && cyoq.a().b(getContext())) {
                                                if (!fkwaVar2.b.L()) {
                                                    fkwaVar2.U();
                                                }
                                                fkwd.f((fkwd) fkwaVar2.b);
                                            }
                                            btjm l2 = bxnb.v().l((fkwd) fkwaVar2.Q());
                                            l2.c = 37;
                                            l2.a();
                                            e.close();
                                        }
                                    } catch (Throwable th3) {
                                        try {
                                            b3.close();
                                        } catch (Throwable th4) {
                                            th3.addSuppressed(th4);
                                        }
                                        throw th3;
                                    }
                                } catch (SQLiteException e2) {
                                    cynj.k(getContext(), e2, fkwc.COMMIT_ON_QUERY);
                                    throw e2;
                                }
                            } catch (RuntimeException e3) {
                                throw e3;
                            }
                        } catch (cylr e4) {
                            Integer.valueOf(e4.a);
                            throw e4;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        obj = null;
                        num = null;
                        b2.close();
                        fkwa fkwaVar3 = (fkwa) fkwd.a.v();
                        fkve fkveVar3 = (fkve) fkvf.a.v();
                        if (!fkveVar3.b.L()) {
                            fkveVar3.U();
                        }
                        fkvf fkvfVar7 = (fkvf) fkveVar3.b;
                        c.getClass();
                        fkvfVar7.b |= 1;
                        fkvfVar7.c = c;
                        long elapsedRealtime4 = SystemClock.elapsedRealtime() - elapsedRealtime;
                        if (!fkveVar3.b.L()) {
                            fkveVar3.U();
                        }
                        fkvf fkvfVar8 = (fkvf) fkveVar3.b;
                        fkvfVar8.b |= 1024;
                        fkvfVar8.k = (int) elapsedRealtime4;
                        fkvf fkvfVar9 = (fkvf) fkveVar3.Q();
                        if (!fkwaVar3.b.L()) {
                            fkwaVar3.U();
                        }
                        fkwd fkwdVar3 = (fkwd) fkwaVar3.b;
                        fkvfVar9.getClass();
                        fkwdVar3.c = fkvfVar9;
                        fkwdVar3.b |= 2;
                        if (obj != null) {
                            fgrc v = fkvz.a.v();
                            String name = obj.getClass().getName();
                            if (!v.b.L()) {
                                v.U();
                            }
                            fkvz fkvzVar = (fkvz) v.b;
                            name.getClass();
                            fkvzVar.b = 1 | fkvzVar.b;
                            fkvzVar.c = name;
                            if (num != null) {
                                int intValue = num.intValue();
                                if (!v.b.L()) {
                                    v.U();
                                }
                                fkvz fkvzVar2 = (fkvz) v.b;
                                fkvzVar2.b |= 2;
                                fkvzVar2.d = intValue;
                            }
                            if (!fkwaVar3.b.L()) {
                                fkwaVar3.U();
                            }
                            fkwd fkwdVar4 = (fkwd) fkwaVar3.b;
                            fkvz fkvzVar3 = (fkvz) v.Q();
                            fkvzVar3.getClass();
                            fkwdVar4.e = fkvzVar3;
                            fkwdVar4.b |= 8;
                        }
                        if (fufv.h() && cyoq.a().b(getContext())) {
                            if (!fkwaVar3.b.L()) {
                                fkwaVar3.U();
                            }
                            fkwd.f((fkwd) fkwaVar3.b);
                        }
                        btjm l3 = bxnb.v().l((fkwd) fkwaVar3.Q());
                        l3.c = 37;
                        l3.a();
                        throw th;
                    }
                }
                e.close();
                configurations = null;
            } catch (Throwable th6) {
                try {
                    e.close();
                } catch (Throwable th7) {
                    th6.addSuppressed(th7);
                }
                throw th6;
            }
        } else {
            try {
                eixb e5 = eizp.e("com/google/android/gms/phenotype/provider/ConfigurationChimeraProvider", "getCommittedConfiguration", 238, "Get committed configuration");
                try {
                    cylo b4 = cyll.b(getContext());
                    try {
                        cykx a2 = b4.a().a();
                        try {
                            Configurations b5 = ((cyky) a2).b(a2.f() ? "SELECT EXISTS(SELECT NULL FROM config_packages WHERE name=?);" : "SELECT EXISTS(SELECT NULL FROM Packages WHERE packageName=?)").g(c).f() ? a2.f() ? cynz.b(a2, c, b4.j()) : cynz.a(a2, c) : null;
                            a2.e();
                            a2.close();
                            b4.close();
                            e5.close();
                            configurations = b5;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } catch (SQLiteException e6) {
                cynj.k(getContext(), e6, fkwc.GET_COMMITTED_CONFIGURATION_FROM_CONTENT_PROVIDER);
                throw e6;
            }
        }
        if (configurations == null || (configurationArr = configurations.d) == null) {
            return null;
        }
        MatrixCursor matrixCursor = new MatrixCursor(dxwx.a);
        for (Configuration configuration : configurationArr) {
            for (Flag flag : configuration.b) {
                matrixCursor.addRow(new String[]{flag.b, flag.c()});
            }
        }
        matrixCursor.addRow(new String[]{"__phenotype_server_token", configurations.c});
        matrixCursor.addRow(new String[]{"__phenotype_snapshot_token", configurations.a});
        matrixCursor.addRow(new String[]{"__phenotype_configuration_version", Long.toString(configurations.g)});
        return matrixCursor;
    }

    @Override // com.google.android.chimera.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }
}
