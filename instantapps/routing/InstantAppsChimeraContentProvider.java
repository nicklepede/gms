package com.google.android.gms.instantapps.routing;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.chimera.ContentProvider;
import defpackage.a;
import defpackage.atzb;
import defpackage.auid;
import defpackage.aura;
import defpackage.aurp;
import defpackage.ausg;
import defpackage.ausn;
import defpackage.bqmc;
import defpackage.bqme;
import defpackage.bqmj;
import defpackage.bqmk;
import defpackage.bqml;
import defpackage.bqmn;
import defpackage.bqms;
import defpackage.bqmv;
import defpackage.bqoc;
import defpackage.bqod;
import defpackage.bqoe;
import defpackage.bqop;
import defpackage.bqoq;
import defpackage.bqor;
import defpackage.bqos;
import defpackage.bqot;
import defpackage.bqou;
import defpackage.bqov;
import defpackage.bqow;
import defpackage.bqox;
import defpackage.bqoy;
import defpackage.bqoz;
import defpackage.bqpa;
import defpackage.bqpb;
import defpackage.bqpc;
import defpackage.bqpd;
import defpackage.bqpe;
import defpackage.bqpf;
import defpackage.bqpg;
import defpackage.bqph;
import defpackage.bqpj;
import defpackage.bqpk;
import defpackage.bqpl;
import defpackage.bqpm;
import defpackage.bqpn;
import defpackage.bqpp;
import defpackage.bqpr;
import defpackage.bqpv;
import defpackage.bqqi;
import defpackage.bqrd;
import defpackage.bqrs;
import defpackage.bqrt;
import defpackage.bqru;
import defpackage.bqrv;
import defpackage.bqrx;
import defpackage.bqsa;
import defpackage.bqsj;
import defpackage.bsj;
import defpackage.dowc;
import defpackage.eluo;
import defpackage.fgqp;
import defpackage.fgri;
import defpackage.fgsd;
import defpackage.fgti;
import j$.util.Objects;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class InstantAppsChimeraContentProvider extends ContentProvider {
    private static final ausn e = ausn.b("IAContentProvider", auid.INSTANT_APPS);
    private static final int f = aura.b;
    Map a;
    public bqme b;
    bqms c;
    public bqrd d;
    private bqmn g;
    private bqop h;

    private final bqmj b() {
        PackageInfo b;
        int callingUid = Binder.getCallingUid();
        String d = this.h.d(callingUid);
        boolean z = false;
        if (TextUtils.isEmpty(d)) {
            b = null;
        } else {
            try {
                b = this.h.b(d, 0);
            } catch (IOException unused) {
                throw new SecurityException(a.j(callingUid, "Unable to load package for uid "));
            }
        }
        if (b == null) {
            try {
                b = getContext().getPackageManager().getPackageInfo(getCallingPackage(), 0);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new SecurityException();
            }
        } else {
            z = true;
        }
        return new bqmj(callingUid, b, z);
    }

    private final void c() {
        if (this.a == null) {
            bqmv a = bqmv.a(getContext());
            ArrayList arrayList = new ArrayList();
            aurp aurpVar = a.b;
            bqrx bqrxVar = a.i;
            bqsa bqsaVar = a.j;
            bqme bqmeVar = a.k;
            bqrv bqrvVar = new bqrv(bqrxVar, bqsaVar, bqmeVar, bqml.a());
            ArrayList arrayList2 = new ArrayList(2);
            arrayList2.add(new bqrt(bqrvVar));
            arrayList2.add(new bqru(bqrvVar));
            arrayList.addAll(arrayList2);
            Context context = getContext();
            bqop bqopVar = a.h;
            bqqi bqqiVar = a.l;
            bqms bqmsVar = a.o;
            bqpp bqppVar = new bqpp(context, bqopVar, bqqiVar, bqmsVar, a.u);
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(new bqor(bqppVar));
            arrayList3.add(new bqos(bqppVar));
            arrayList3.add(new bqot(bqppVar));
            arrayList3.add(new bqou(bqppVar));
            arrayList3.add(new bqpb(bqppVar));
            arrayList3.add(new bqpf(bqppVar));
            arrayList3.add(new bqov(bqppVar));
            arrayList3.add(new bqox(bqppVar));
            arrayList3.add(new bqow(bqppVar));
            arrayList3.add(new bqpc(bqppVar));
            arrayList3.add(new bqpe(bqppVar));
            arrayList3.add(new bqpg(bqppVar));
            arrayList3.add(new bqph(bqppVar));
            arrayList3.add(new bqpl(bqppVar));
            arrayList3.add(new bqpm(bqppVar));
            arrayList3.add(new bqpn(bqppVar));
            arrayList3.add(new bqoy(bqppVar));
            arrayList3.add(new bqpd(bqppVar));
            arrayList3.add(new bqpk(bqppVar));
            arrayList3.add(new bqoz(bqppVar));
            arrayList3.add(new bqpa(bqppVar));
            arrayList3.add(new bqpj(bqppVar));
            arrayList.addAll(arrayList3);
            arrayList.add(new bqrs(this));
            bsj bsjVar = new bsj(arrayList.size());
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                bqmk bqmkVar = (bqmk) arrayList.get(i);
                String str = bqmkVar.a;
                atzb.c(((bqmk) bsjVar.put(str, bqmkVar)) == null, "Multiple provider methods found for ".concat(str));
            }
            this.a = bsjVar;
            this.b = bqmeVar;
            this.g = a.p;
            this.h = bqopVar;
            this.d = a.g;
            this.c = bqmsVar;
        }
    }

    public final boolean a(int i) {
        return i == f || this.c.a(i) || this.c.b(i);
    }

    @Override // com.google.android.chimera.ContentProvider
    public final Bundle call(String str, String str2, Bundle bundle) {
        try {
            if (!bqmv.a(getContext()).r.a()) {
                return null;
            }
            c();
            bqmk bqmkVar = (bqmk) this.a.get(str);
            if (bqmkVar == null) {
                ((eluo) ((eluo) e.i()).ai(5288)).B("Unrecognized method: %s", str);
                return null;
            }
            bqmj b = b();
            PackageInfo packageInfo = b.b;
            this.b.e(packageInfo.packageName, packageInfo.versionCode);
            bqmc b2 = this.b.b();
            Bundle a = bqmkVar.a(b, str2, bundle);
            b2.b(a.x(str, "IAContentProvider."));
            return a;
        } catch (RuntimeException e2) {
            ((eluo) ((eluo) ((eluo) e.i()).s(e2)).ai((char) 5289)).x("Exception: ");
            bqme bqmeVar = this.b;
            if (bqmeVar != null) {
                bqmeVar.b().b("IAContentProvider.Failure.".concat(String.valueOf(str)));
            }
            if (e2 instanceof SecurityException) {
                throw e2;
            }
            e2.getMessage();
            return null;
        }
    }

    @Override // com.google.android.chimera.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // com.google.android.chimera.ContentProvider
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        bqod c;
        bqoc b;
        bqmv a = bqmv.a(getContext());
        if (!a.r.a()) {
            printWriter.println("Disabled by KillSwitch");
            return;
        }
        printWriter.printf("Instant Apps enabled: %s\n", Boolean.valueOf(dowc.a()));
        bqsj bqsjVar = a.c;
        printWriter.printf("Accounts: %s\n", Arrays.toString(bqsjVar.e()));
        printWriter.printf("Opt-in account: %s\n", bqsjVar.a());
        printWriter.printf("Opt-in state: %s\n", Integer.valueOf(a.d.a()));
        printWriter.println("Event Log:");
        ausg ausgVar = new ausg(this.g);
        while (ausgVar.hasNext()) {
            printWriter.println(ausgVar.next());
        }
        a.g.i(printWriter);
        bqqi bqqiVar = a.l;
        printWriter.println("\n=== AppOverrides dump ===");
        try {
            bqqiVar.i();
            try {
                bqoe bqoeVar = bqqiVar.d;
                c = bqoeVar.c();
                try {
                    b = bqoeVar.b(c);
                } finally {
                }
            } catch (fgsd e2) {
                printWriter.println("AppOverrides dump exception: ".concat(e2.toString()));
            }
            try {
                b.b();
                while (b.c()) {
                    String r = bqqi.r(b.d());
                    if (r != null) {
                        byte[] e3 = b.e();
                        fgqp fgqpVar = fgqp.a;
                        fgti fgtiVar = fgti.a;
                        fgri y = fgri.y(bqpr.a, e3, 0, e3.length, fgqp.a);
                        fgri.M(y);
                        long currentTimeMillis = System.currentTimeMillis();
                        bqpv bqpvVar = ((bqpr) y).c;
                        if (bqpvVar == null) {
                            bqpvVar = bqpv.a;
                        }
                        long j = bqpvVar.b;
                        long j2 = j - currentTimeMillis;
                        long minutes = TimeUnit.MILLISECONDS.toMinutes(j2);
                        long seconds = TimeUnit.MILLISECONDS.toSeconds(j2) % 60;
                        printWriter.printf("Package: %s\n", r);
                        printWriter.printf("\tExpiration (millis): %d\n", Long.valueOf(j));
                        printWriter.printf("\tSnooze remaining: %dm%ds\n", Long.valueOf(minutes), Long.valueOf(seconds));
                        if (j == Long.MAX_VALUE) {
                            printWriter.printf("\tThis package is permanently snoozed\n", new Object[0]);
                        }
                    }
                    b.a();
                }
                b.close();
                c.close();
                printWriter.println("=== End of AppOverrides dump ===");
            } finally {
            }
        } catch (IOException e4) {
            printWriter.println("AppOverrides dump exception: ".concat(e4.toString()));
        }
    }

    @Override // com.google.android.chimera.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // com.google.android.chimera.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // com.google.android.chimera.ContentProvider
    public final boolean onCreate() {
        if (!bqmv.a(getContext()).r.a()) {
            return false;
        }
        c();
        return true;
    }

    @Override // com.google.android.chimera.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        bqod c;
        bqoc b;
        try {
            if (!bqmv.a(getContext()).r.a()) {
                return null;
            }
            c();
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 1) {
                ((eluo) ((eluo) e.i()).ai(5292)).B("Invalid URI for query: %s", uri);
                return null;
            }
            String str3 = pathSegments.get(0);
            if (!Objects.equals(str3, "snoozedApps")) {
                ((eluo) ((eluo) e.i()).ai(5290)).B("Unrecognized query path: %s", uri);
                return null;
            }
            bqmj b2 = b();
            if (!a(b2.a)) {
                return null;
            }
            PackageInfo packageInfo = b2.b;
            this.b.e(packageInfo.packageName, packageInfo.versionCode);
            bqmc b3 = this.b.b();
            bqop bqopVar = this.h;
            MatrixCursor matrixCursor = new MatrixCursor(new String[]{"packageName", "appOverrides"});
            bqqi bqqiVar = ((bqoq) bqopVar).b;
            try {
                bqqiVar.i();
                bqoe bqoeVar = bqqiVar.d;
                c = bqoeVar.c();
                try {
                    b = bqoeVar.b(c);
                } finally {
                }
            } catch (IOException e2) {
                ((eluo) ((eluo) bqqi.a.i()).s(e2)).x("QuerySnoozedApps exception while accessing levelDb");
            }
            try {
                b.b();
                while (b.c()) {
                    String r = bqqi.r(b.d());
                    if (r != null) {
                        matrixCursor.newRow().add("packageName", r).add("appOverrides", b.e());
                    }
                    b.a();
                }
                b.close();
                c.close();
                b3.b(a.x(str3, "IAContentProvider."));
                return matrixCursor;
            } finally {
            }
        } catch (RuntimeException e3) {
            ((eluo) ((eluo) ((eluo) e.i()).s(e3)).ai((char) 5291)).x("Exception: ");
            bqme bqmeVar = this.b;
            if (bqmeVar != null) {
                bqmeVar.b().b("IAContentProvider.Failure.".concat(String.valueOf(String.valueOf(uri))));
            }
            if (e3 instanceof SecurityException) {
                throw e3;
            }
            e3.getMessage();
            return null;
        }
    }

    @Override // com.google.android.chimera.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
