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
import defpackage.aqup;
import defpackage.asej;
import defpackage.asot;
import defpackage.brbv;
import defpackage.bvez;
import defpackage.cwav;
import defpackage.cwba;
import defpackage.cwbb;
import defpackage.cwbi;
import defpackage.cwbo;
import defpackage.cwbr;
import defpackage.cwbu;
import defpackage.cwch;
import defpackage.cwcn;
import defpackage.cwcp;
import defpackage.cwdm;
import defpackage.cwdq;
import defpackage.cwdr;
import defpackage.cwec;
import defpackage.cweh;
import defpackage.cwet;
import defpackage.dnnr;
import defpackage.dvlw;
import defpackage.egjy;
import defpackage.egmm;
import defpackage.eiif;
import defpackage.eiig;
import defpackage.ejhf;
import defpackage.fecj;
import defpackage.fifh;
import defpackage.fifi;
import defpackage.figc;
import defpackage.figd;
import defpackage.figf;
import defpackage.figg;
import defpackage.frke;
import defpackage.frlx;
import j$.util.Objects;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class ConfigurationChimeraProvider extends ContentProvider {
    private static final asot a = asot.e(asej.PHENOTYPE);

    @Override // com.google.android.chimera.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.chimera.ContentProvider
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        cwba a2;
        cwav i;
        cwbr b = cwbo.b(getContext());
        try {
            try {
                a2 = b.a().a();
                try {
                    i = ((cwbb) a2).b(a2.f() ? "SELECT\n  config_packages.name,\n  config_packages.version,\n  accounts.name,\n  experiment_states.experiment_token,\n  experiment_states.serving_version\nFROM experiment_states\nINNER JOIN config_packages\n  ON (experiment_state_id IS committed_experiment_state_id)\nINNER JOIN accounts\n  USING (account_id)\nORDER BY config_packages.name;\n" : "SELECT packageName, version, user, experimentToken, servingVersion FROM ExperimentTokens WHERE isCommitted = 1 ORDER BY packageName").d().i();
                } finally {
                }
            } catch (SQLiteException e) {
                cwdm.k(getContext(), e, figf.CONTENT_PROVIDER_DUMP);
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
            ((ejhf) a.j()).B("Invalid Uri: %s", uri);
            return null;
        }
        String nameForUid = getContext().getPackageManager().getNameForUid(Binder.getCallingUid());
        String lastPathSegment = uri.getLastPathSegment();
        eiig.x(lastPathSegment);
        String c = cwch.c(lastPathSegment, eiif.b(nameForUid));
        if (!aqup.d(getContext().getApplicationContext()).i(Binder.getCallingUid()) && !cwcp.a(frke.c(), cwch.d(c))) {
            ((ejhf) a.j()).B("Caller is not authorized to access Uri: %s", uri);
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
                        ((ejhf) a.j()).x("Invalid argument for account: null");
                        return null;
                    }
                    if (str3 != null) {
                        ((ejhf) a.j()).x("Cannot specify argument \"account\" twice");
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
            String b = eiif.b(nameForUid);
            if (dnnr.h(getContext())) {
                throw new IllegalArgumentException("Phenotype commitOnQuery cannot be used in direct boot mode");
            }
            egjy e = egmm.e("com/google/android/gms/phenotype/provider/ConfigurationChimeraProvider", "getLatestConfiguration", 277, "Get latest configuration");
            try {
                if (str3.equals("") || cwcn.a(str3, getContext())) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    cwbr b2 = cwbo.b(getContext());
                    try {
                    } catch (Throwable th2) {
                        th = th2;
                        num = null;
                    }
                    try {
                        try {
                            try {
                                try {
                                    cwbi b3 = b2.a().b();
                                    try {
                                        configurations = new cweh(c, str3, b, b3).c(getContext(), b2);
                                        String str6 = configurations.a;
                                        if (str6.isEmpty()) {
                                            b3.e();
                                            b3.close();
                                            b2.close();
                                            figd figdVar = (figd) figg.a.v();
                                            fifh fifhVar = (fifh) fifi.a.v();
                                            if (!fifhVar.b.L()) {
                                                fifhVar.U();
                                            }
                                            fifi fifiVar = (fifi) fifhVar.b;
                                            c.getClass();
                                            fifiVar.b = 1 | fifiVar.b;
                                            fifiVar.c = c;
                                            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                            if (!fifhVar.b.L()) {
                                                fifhVar.U();
                                            }
                                            fifi fifiVar2 = (fifi) fifhVar.b;
                                            fifiVar2.b |= 1024;
                                            fifiVar2.k = (int) elapsedRealtime2;
                                            fifi fifiVar3 = (fifi) fifhVar.Q();
                                            if (!figdVar.b.L()) {
                                                figdVar.U();
                                            }
                                            figg figgVar = (figg) figdVar.b;
                                            fifiVar3.getClass();
                                            figgVar.c = fifiVar3;
                                            figgVar.b |= 2;
                                            if (frlx.h() && cwet.a().b(getContext())) {
                                                if (!figdVar.b.L()) {
                                                    figdVar.U();
                                                }
                                                figg.f((figg) figdVar.b);
                                            }
                                            brbv l = bvez.v().l((figg) figdVar.Q());
                                            l.c = 37;
                                            l.a();
                                        } else {
                                            cwdr cwdrVar = new cwdr(str6, b, b3);
                                            cwdrVar.b(getContext(), b2);
                                            cwdq.m(getContext(), b2, cwdrVar);
                                            b3.e();
                                            b3.close();
                                            b2.close();
                                            figd figdVar2 = (figd) figg.a.v();
                                            fifh fifhVar2 = (fifh) fifi.a.v();
                                            if (!fifhVar2.b.L()) {
                                                fifhVar2.U();
                                            }
                                            fifi fifiVar4 = (fifi) fifhVar2.b;
                                            c.getClass();
                                            fifiVar4.b = 1 | fifiVar4.b;
                                            fifiVar4.c = c;
                                            long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                            if (!fifhVar2.b.L()) {
                                                fifhVar2.U();
                                            }
                                            fifi fifiVar5 = (fifi) fifhVar2.b;
                                            fifiVar5.b |= 1024;
                                            fifiVar5.k = (int) elapsedRealtime3;
                                            fifi fifiVar6 = (fifi) fifhVar2.Q();
                                            if (!figdVar2.b.L()) {
                                                figdVar2.U();
                                            }
                                            figg figgVar2 = (figg) figdVar2.b;
                                            fifiVar6.getClass();
                                            figgVar2.c = fifiVar6;
                                            figgVar2.b |= 2;
                                            if (frlx.h() && cwet.a().b(getContext())) {
                                                if (!figdVar2.b.L()) {
                                                    figdVar2.U();
                                                }
                                                figg.f((figg) figdVar2.b);
                                            }
                                            brbv l2 = bvez.v().l((figg) figdVar2.Q());
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
                                    cwdm.k(getContext(), e2, figf.COMMIT_ON_QUERY);
                                    throw e2;
                                }
                            } catch (RuntimeException e3) {
                                throw e3;
                            }
                        } catch (cwbu e4) {
                            Integer.valueOf(e4.a);
                            throw e4;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        obj = null;
                        num = null;
                        b2.close();
                        figd figdVar3 = (figd) figg.a.v();
                        fifh fifhVar3 = (fifh) fifi.a.v();
                        if (!fifhVar3.b.L()) {
                            fifhVar3.U();
                        }
                        fifi fifiVar7 = (fifi) fifhVar3.b;
                        c.getClass();
                        fifiVar7.b |= 1;
                        fifiVar7.c = c;
                        long elapsedRealtime4 = SystemClock.elapsedRealtime() - elapsedRealtime;
                        if (!fifhVar3.b.L()) {
                            fifhVar3.U();
                        }
                        fifi fifiVar8 = (fifi) fifhVar3.b;
                        fifiVar8.b |= 1024;
                        fifiVar8.k = (int) elapsedRealtime4;
                        fifi fifiVar9 = (fifi) fifhVar3.Q();
                        if (!figdVar3.b.L()) {
                            figdVar3.U();
                        }
                        figg figgVar3 = (figg) figdVar3.b;
                        fifiVar9.getClass();
                        figgVar3.c = fifiVar9;
                        figgVar3.b |= 2;
                        if (obj != null) {
                            fecj v = figc.a.v();
                            String name = obj.getClass().getName();
                            if (!v.b.L()) {
                                v.U();
                            }
                            figc figcVar = (figc) v.b;
                            name.getClass();
                            figcVar.b = 1 | figcVar.b;
                            figcVar.c = name;
                            if (num != null) {
                                int intValue = num.intValue();
                                if (!v.b.L()) {
                                    v.U();
                                }
                                figc figcVar2 = (figc) v.b;
                                figcVar2.b |= 2;
                                figcVar2.d = intValue;
                            }
                            if (!figdVar3.b.L()) {
                                figdVar3.U();
                            }
                            figg figgVar4 = (figg) figdVar3.b;
                            figc figcVar3 = (figc) v.Q();
                            figcVar3.getClass();
                            figgVar4.e = figcVar3;
                            figgVar4.b |= 8;
                        }
                        if (frlx.h() && cwet.a().b(getContext())) {
                            if (!figdVar3.b.L()) {
                                figdVar3.U();
                            }
                            figg.f((figg) figdVar3.b);
                        }
                        brbv l3 = bvez.v().l((figg) figdVar3.Q());
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
                egjy e5 = egmm.e("com/google/android/gms/phenotype/provider/ConfigurationChimeraProvider", "getCommittedConfiguration", 238, "Get committed configuration");
                try {
                    cwbr b4 = cwbo.b(getContext());
                    try {
                        cwba a2 = b4.a().a();
                        try {
                            Configurations b5 = ((cwbb) a2).b(a2.f() ? "SELECT EXISTS(SELECT NULL FROM config_packages WHERE name=?);" : "SELECT EXISTS(SELECT NULL FROM Packages WHERE packageName=?)").g(c).f() ? a2.f() ? cwec.b(a2, c, b4.j()) : cwec.a(a2, c) : null;
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
                cwdm.k(getContext(), e6, figf.GET_COMMITTED_CONFIGURATION_FROM_CONTENT_PROVIDER);
                throw e6;
            }
        }
        if (configurations == null || (configurationArr = configurations.d) == null) {
            return null;
        }
        MatrixCursor matrixCursor = new MatrixCursor(dvlw.a);
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
