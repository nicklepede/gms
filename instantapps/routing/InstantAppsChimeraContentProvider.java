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
import defpackage.arwm;
import defpackage.asej;
import defpackage.asng;
import defpackage.asnv;
import defpackage.asom;
import defpackage.asot;
import defpackage.boem;
import defpackage.boeo;
import defpackage.boet;
import defpackage.boeu;
import defpackage.boev;
import defpackage.boex;
import defpackage.bofc;
import defpackage.boff;
import defpackage.bogm;
import defpackage.bogn;
import defpackage.bogo;
import defpackage.bogz;
import defpackage.boha;
import defpackage.bohb;
import defpackage.bohc;
import defpackage.bohd;
import defpackage.bohe;
import defpackage.bohf;
import defpackage.bohg;
import defpackage.bohh;
import defpackage.bohi;
import defpackage.bohj;
import defpackage.bohk;
import defpackage.bohl;
import defpackage.bohm;
import defpackage.bohn;
import defpackage.boho;
import defpackage.bohp;
import defpackage.bohq;
import defpackage.bohr;
import defpackage.boht;
import defpackage.bohu;
import defpackage.bohv;
import defpackage.bohw;
import defpackage.bohx;
import defpackage.bohz;
import defpackage.boib;
import defpackage.boif;
import defpackage.bois;
import defpackage.bojn;
import defpackage.bokc;
import defpackage.bokd;
import defpackage.boke;
import defpackage.bokf;
import defpackage.bokh;
import defpackage.bokk;
import defpackage.bokt;
import defpackage.bry;
import defpackage.dmko;
import defpackage.ejhf;
import defpackage.febw;
import defpackage.fecp;
import defpackage.fedk;
import defpackage.feep;
import j$.util.Objects;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class InstantAppsChimeraContentProvider extends ContentProvider {
    private static final asot e = asot.b("IAContentProvider", asej.INSTANT_APPS);
    private static final int f = asng.b;
    Map a;
    public boeo b;
    bofc c;
    public bojn d;
    private boex g;
    private bogz h;

    private final boet b() {
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
        return new boet(callingUid, b, z);
    }

    private final void c() {
        if (this.a == null) {
            boff a = boff.a(getContext());
            ArrayList arrayList = new ArrayList();
            asnv asnvVar = a.b;
            bokh bokhVar = a.i;
            bokk bokkVar = a.j;
            boeo boeoVar = a.k;
            bokf bokfVar = new bokf(bokhVar, bokkVar, boeoVar, boev.a());
            ArrayList arrayList2 = new ArrayList(2);
            arrayList2.add(new bokd(bokfVar));
            arrayList2.add(new boke(bokfVar));
            arrayList.addAll(arrayList2);
            Context context = getContext();
            bogz bogzVar = a.h;
            bois boisVar = a.l;
            bofc bofcVar = a.o;
            bohz bohzVar = new bohz(context, bogzVar, boisVar, bofcVar, a.u);
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(new bohb(bohzVar));
            arrayList3.add(new bohc(bohzVar));
            arrayList3.add(new bohd(bohzVar));
            arrayList3.add(new bohe(bohzVar));
            arrayList3.add(new bohl(bohzVar));
            arrayList3.add(new bohp(bohzVar));
            arrayList3.add(new bohf(bohzVar));
            arrayList3.add(new bohh(bohzVar));
            arrayList3.add(new bohg(bohzVar));
            arrayList3.add(new bohm(bohzVar));
            arrayList3.add(new boho(bohzVar));
            arrayList3.add(new bohq(bohzVar));
            arrayList3.add(new bohr(bohzVar));
            arrayList3.add(new bohv(bohzVar));
            arrayList3.add(new bohw(bohzVar));
            arrayList3.add(new bohx(bohzVar));
            arrayList3.add(new bohi(bohzVar));
            arrayList3.add(new bohn(bohzVar));
            arrayList3.add(new bohu(bohzVar));
            arrayList3.add(new bohj(bohzVar));
            arrayList3.add(new bohk(bohzVar));
            arrayList3.add(new boht(bohzVar));
            arrayList.addAll(arrayList3);
            arrayList.add(new bokc(this));
            bry bryVar = new bry(arrayList.size());
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                boeu boeuVar = (boeu) arrayList.get(i);
                String str = boeuVar.a;
                arwm.c(((boeu) bryVar.put(str, boeuVar)) == null, "Multiple provider methods found for ".concat(str));
            }
            this.a = bryVar;
            this.b = boeoVar;
            this.g = a.p;
            this.h = bogzVar;
            this.d = a.g;
            this.c = bofcVar;
        }
    }

    public final boolean a(int i) {
        return i == f || this.c.a(i) || this.c.b(i);
    }

    @Override // com.google.android.chimera.ContentProvider
    public final Bundle call(String str, String str2, Bundle bundle) {
        try {
            if (!boff.a(getContext()).r.a()) {
                return null;
            }
            c();
            boeu boeuVar = (boeu) this.a.get(str);
            if (boeuVar == null) {
                ((ejhf) ((ejhf) e.i()).ah(5275)).B("Unrecognized method: %s", str);
                return null;
            }
            boet b = b();
            PackageInfo packageInfo = b.b;
            this.b.e(packageInfo.packageName, packageInfo.versionCode);
            boem b2 = this.b.b();
            Bundle a = boeuVar.a(b, str2, bundle);
            b2.b(a.x(str, "IAContentProvider."));
            return a;
        } catch (RuntimeException e2) {
            ((ejhf) ((ejhf) ((ejhf) e.i()).s(e2)).ah((char) 5276)).x("Exception: ");
            boeo boeoVar = this.b;
            if (boeoVar != null) {
                boeoVar.b().b("IAContentProvider.Failure.".concat(String.valueOf(str)));
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
        bogo bogoVar;
        bogn c;
        boff a = boff.a(getContext());
        if (!a.r.a()) {
            printWriter.println("Disabled by KillSwitch");
            return;
        }
        printWriter.printf("Instant Apps enabled: %s\n", Boolean.valueOf(dmko.a()));
        bokt boktVar = a.c;
        printWriter.printf("Accounts: %s\n", Arrays.toString(boktVar.e()));
        printWriter.printf("Opt-in account: %s\n", boktVar.a());
        printWriter.printf("Opt-in state: %s\n", Integer.valueOf(a.d.a()));
        printWriter.println("Event Log:");
        asom asomVar = new asom(this.g);
        while (asomVar.hasNext()) {
            printWriter.println(asomVar.next());
        }
        a.g.i(printWriter);
        bois boisVar = a.l;
        printWriter.println("\n=== AppOverrides dump ===");
        try {
            boisVar.i();
            try {
                bogoVar = boisVar.d;
                c = bogoVar.c();
            } catch (fedk e2) {
                printWriter.println("AppOverrides dump exception: ".concat(e2.toString()));
            }
            try {
                bogm b = bogoVar.b(c);
                try {
                    b.b();
                    while (b.c()) {
                        String r = bois.r(b.d());
                        if (r != null) {
                            byte[] e3 = b.e();
                            febw febwVar = febw.a;
                            feep feepVar = feep.a;
                            fecp y = fecp.y(boib.a, e3, 0, e3.length, febw.a);
                            fecp.M(y);
                            long currentTimeMillis = System.currentTimeMillis();
                            boif boifVar = ((boib) y).c;
                            if (boifVar == null) {
                                boifVar = boif.a;
                            }
                            long j = boifVar.b;
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
        if (!boff.a(getContext()).r.a()) {
            return false;
        }
        c();
        return true;
    }

    @Override // com.google.android.chimera.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        bogn c;
        bogm b;
        try {
            if (!boff.a(getContext()).r.a()) {
                return null;
            }
            c();
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 1) {
                ((ejhf) ((ejhf) e.i()).ah(5279)).B("Invalid URI for query: %s", uri);
                return null;
            }
            String str3 = pathSegments.get(0);
            if (!Objects.equals(str3, "snoozedApps")) {
                ((ejhf) ((ejhf) e.i()).ah(5277)).B("Unrecognized query path: %s", uri);
                return null;
            }
            boet b2 = b();
            if (!a(b2.a)) {
                return null;
            }
            PackageInfo packageInfo = b2.b;
            this.b.e(packageInfo.packageName, packageInfo.versionCode);
            boem b3 = this.b.b();
            bogz bogzVar = this.h;
            MatrixCursor matrixCursor = new MatrixCursor(new String[]{"packageName", "appOverrides"});
            bois boisVar = ((boha) bogzVar).b;
            try {
                boisVar.i();
                bogo bogoVar = boisVar.d;
                c = bogoVar.c();
                try {
                    b = bogoVar.b(c);
                } finally {
                }
            } catch (IOException e2) {
                ((ejhf) ((ejhf) bois.a.i()).s(e2)).x("QuerySnoozedApps exception while accessing levelDb");
            }
            try {
                b.b();
                while (b.c()) {
                    String r = bois.r(b.d());
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
            ((ejhf) ((ejhf) ((ejhf) e.i()).s(e3)).ah((char) 5278)).x("Exception: ");
            boeo boeoVar = this.b;
            if (boeoVar != null) {
                boeoVar.b().b("IAContentProvider.Failure.".concat(String.valueOf(String.valueOf(uri))));
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
