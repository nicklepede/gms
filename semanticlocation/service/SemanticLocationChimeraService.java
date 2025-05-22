package com.google.android.gms.semanticlocation.service;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.WorkSource;
import android.util.Base64;
import android.util.Base64OutputStream;
import com.google.android.chimera.Service;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.chimera.modules.semanticlocation.AppContextProvider;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.internal.LocationRequestInternal;
import com.google.android.gms.semanticlocation.SemanticLocationState;
import com.google.android.gms.semanticlocation.internal.SemanticLocationParameters;
import com.google.android.gms.semanticlocation.service.SemanticLocationChimeraService;
import com.google.android.gms.semanticlocation.subscriptions.Subscription;
import defpackage.aszs;
import defpackage.atfd;
import defpackage.atfn;
import defpackage.atos;
import defpackage.auid;
import defpackage.ausn;
import defpackage.auub;
import defpackage.auuo;
import defpackage.auvd;
import defpackage.cbpo;
import defpackage.cbpq;
import defpackage.cbrh;
import defpackage.cciv;
import defpackage.ccjt;
import defpackage.ceqg;
import defpackage.ceqm;
import defpackage.cyjh;
import defpackage.cyki;
import defpackage.dbrg;
import defpackage.dbrn;
import defpackage.dbro;
import defpackage.dbsd;
import defpackage.dbsj;
import defpackage.dbsv;
import defpackage.dbtg;
import defpackage.dbvg;
import defpackage.dbwb;
import defpackage.dbwo;
import defpackage.dbxd;
import defpackage.dbxn;
import defpackage.dcbg;
import defpackage.dcca;
import defpackage.dcep;
import defpackage.dcer;
import defpackage.dchx;
import defpackage.dcis;
import defpackage.dciw;
import defpackage.dcix;
import defpackage.dciz;
import defpackage.dcke;
import defpackage.dckf;
import defpackage.dclb;
import defpackage.dclv;
import defpackage.dclw;
import defpackage.ddjx;
import defpackage.ddzi;
import defpackage.dhln;
import defpackage.dhlq;
import defpackage.dhlw;
import defpackage.dxxi;
import defpackage.dzwm;
import defpackage.ekut;
import defpackage.ekvi;
import defpackage.ekvk;
import defpackage.ekvl;
import defpackage.elgj;
import defpackage.elgo;
import defpackage.elhx;
import defpackage.elhz;
import defpackage.elpg;
import defpackage.eluo;
import defpackage.emha;
import defpackage.eqdl;
import defpackage.eqdv;
import defpackage.eqex;
import defpackage.eqgb;
import defpackage.eqgl;
import defpackage.eqgo;
import defpackage.fbhp;
import defpackage.fbhq;
import defpackage.fbjs;
import defpackage.fgub;
import defpackage.fgvq;
import defpackage.fupv;
import defpackage.fush;
import defpackage.fusk;
import defpackage.futm;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class SemanticLocationChimeraService extends Service implements dcix {
    public static final ausn a = ausn.c("SemanticLocation", auid.SEMANTIC_LOCATION, "Service");
    public static eqgl b = null;
    public dciw c;
    public final AtomicInteger d = new AtomicInteger();
    private final Object e = new Object();
    private long f;

    public static void n(Context context) {
        context.startService(dbtg.a(context, "com.google.android.gms.semanticlocation.ACTION_UPDATE_SUBSCRIPTIONS"));
    }

    private static PendingIntent q(Context context, String str) {
        PendingIntent service = PendingIntent.getService(context, 0, dbtg.a(context, str), 134217728);
        ekvl.y(service);
        return service;
    }

    private final eqgl r() {
        eqgl submit = this.c.m().submit(new Callable() { // from class: dcho
            @Override // java.util.concurrent.Callable
            public final Object call() {
                SemanticLocationChimeraService semanticLocationChimeraService = SemanticLocationChimeraService.this;
                dbwb.a(semanticLocationChimeraService, semanticLocationChimeraService.c.f());
                return null;
            }
        });
        submit.hD(new Runnable() { // from class: dchp
            @Override // java.lang.Runnable
            public final void run() {
                ausn ausnVar = SemanticLocationChimeraService.a;
            }
        }, eqex.a);
        return submit;
    }

    @Override // defpackage.dcix
    public final Subscription a(Subscription subscription) {
        Subscription subscription2;
        dbxn j = this.c.j();
        synchronized (j.b) {
            atos atosVar = j.c;
            Iterator it = atosVar.c().iterator();
            while (true) {
                if (!it.hasNext()) {
                    subscription2 = null;
                    break;
                }
                subscription2 = (Subscription) it.next();
                if (subscription2.equals(subscription)) {
                    break;
                }
            }
            atosVar.d(subscription);
            j.c(subscription);
        }
        dbxn.a = ekvi.j(true);
        n(getApplicationContext());
        return subscription2;
    }

    @Override // defpackage.dcix
    public final eqgl b(final Subscription subscription) {
        return this.c.m().submit(new Callable() { // from class: dcif
            @Override // java.util.concurrent.Callable
            public final Object call() {
                SemanticLocationChimeraService semanticLocationChimeraService = SemanticLocationChimeraService.this;
                dbxn j = semanticLocationChimeraService.c.j();
                Lock lock = j.b;
                Subscription subscription2 = subscription;
                synchronized (lock) {
                    j.c.d(subscription2);
                    j.c(subscription2);
                }
                dbxn.a = ekvi.j(true);
                SemanticLocationChimeraService.n(semanticLocationChimeraService.getApplicationContext());
                return null;
            }
        });
    }

    @Override // defpackage.dcix
    public final eqgl c(final dclv dclvVar) {
        return this.c.m().submit(new Callable() { // from class: dcip
            @Override // java.util.concurrent.Callable
            public final Object call() {
                SemanticLocationChimeraService semanticLocationChimeraService = SemanticLocationChimeraService.this;
                dbxn j = semanticLocationChimeraService.c.j();
                Lock lock = j.b;
                dclv dclvVar2 = dclvVar;
                synchronized (lock) {
                    List list = j.d;
                    list.remove(dclvVar2);
                    list.add(dclvVar2);
                }
                SemanticLocationChimeraService.n(semanticLocationChimeraService.getApplicationContext());
                return null;
            }
        });
    }

    @Override // defpackage.dcix
    public final eqgl d(final elhz elhzVar) {
        elhz g;
        elhz G;
        eqgl f;
        eqgl eqglVar;
        dbxn j = this.c.j();
        synchronized (j.b) {
            elhx elhxVar = new elhx();
            Iterator it = j.c.c().iterator();
            while (it.hasNext()) {
                elhxVar.c(((Subscription) it.next()).b.a);
            }
            Iterator it2 = j.d.iterator();
            while (it2.hasNext()) {
                elhxVar.c(((dclv) it2.next()).a.a);
            }
            Iterator it3 = j.e.iterator();
            while (it3.hasNext()) {
                elhxVar.c(((dclw) it3.next()).a.a);
            }
            g = elhxVar.g();
        }
        g.removeAll(elhzVar);
        Iterator it4 = g.iterator();
        while (it4.hasNext()) {
            this.c.j().e((Account) it4.next());
        }
        dclb l = this.c.l();
        elhx elhxVar2 = new elhx();
        Map map = l.b;
        synchronized (map) {
            elhxVar2.k(map.keySet());
        }
        Map map2 = l.c;
        synchronized (map2) {
            elhxVar2.k(map2.keySet());
        }
        Map map3 = l.d;
        synchronized (map3) {
            elhxVar2.k(map3.keySet());
        }
        HashSet hashSet = new HashSet(elhxVar2.g());
        hashSet.removeAll(elhzVar);
        Iterator it5 = hashSet.iterator();
        while (it5.hasNext()) {
            this.c.l().c((Account) it5.next());
        }
        this.c.i();
        Map map4 = dbwo.b;
        synchronized (map4) {
            G = elhz.G(map4.keySet());
        }
        HashSet<Account> hashSet2 = new HashSet(G);
        hashSet2.removeAll(elhzVar);
        for (Account account : hashSet2) {
            this.c.i().f(account);
            dbxd.b(account.name);
        }
        if (fusk.g()) {
            eqglVar = eqdl.f(this.c.g().q(), new ekut() { // from class: dchv
                @Override // defpackage.ekut
                public final Object apply(Object obj) {
                    dbvg dbvgVar = dbvl.a;
                    return elhz.G(DesugarCollections.unmodifiableMap(((dcex) obj).c).keySet());
                }
            }, this.c.m());
        } else {
            dzwm dzwmVar = this.c.g().f;
            synchronized (dzwmVar) {
                f = eqdl.f(dzwmVar.a(), new ekut() { // from class: dbtj
                    @Override // defpackage.ekut
                    public final Object apply(Object obj) {
                        ausn ausnVar = dbvg.a;
                        return elhz.G(DesugarCollections.unmodifiableMap(((dcex) obj).c).keySet());
                    }
                }, eqex.a);
            }
            eqglVar = f;
        }
        return eqdl.g(eqgb.h(eqglVar), new eqdv() { // from class: dchw
            @Override // defpackage.eqdv
            public final eqgl a(Object obj) {
                HashSet hashSet3 = new HashSet((elhz) obj);
                elsn listIterator = elhzVar.listIterator();
                while (listIterator.hasNext()) {
                    hashSet3.remove(((Account) listIterator.next()).name);
                }
                ArrayList arrayList = new ArrayList();
                Iterator it6 = hashSet3.iterator();
                while (it6.hasNext()) {
                    arrayList.add(SemanticLocationChimeraService.this.c.g().u(new Account((String) it6.next(), "com.google")));
                }
                return eqgc.e(arrayList);
            }
        }, this.c.m());
    }

    @Override // com.google.android.chimera.Service
    protected final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i;
        dbvg dbvgVar;
        String str;
        String str2;
        String str3;
        FileInputStream fileInputStream;
        String str4;
        String str5;
        String[] strArr2 = dbsj.a;
        ContentResolver contentResolver = AppContextProvider.a().getContentResolver();
        aszs aszsVar = cyjh.a;
        Uri a2 = dxxi.a("com.google.android.gms.semanticlocation");
        printWriter.println("\n===Phenotype Flag Values===");
        Cursor query = contentResolver.query(a2, dbsj.a, null, null, null);
        if (query != null) {
            while (query.moveToNext()) {
                try {
                    String string = query.getString(0);
                    String b2 = ekvk.b(query.getString(1));
                    if (dbsj.b.contains(string)) {
                        b2 = new String(Base64.decode(b2, 0), StandardCharsets.UTF_8);
                    }
                    printWriter.println(string + ": " + b2);
                } finally {
                    query.close();
                }
            }
        }
        this.c.n(printWriter);
        printWriter.flush();
        if (fush.Q()) {
            ddzi ddziVar = new ddzi(getApplicationContext());
            atfn atfnVar = new atfn();
            atfnVar.a = new atfd() { // from class: ddyy
                @Override // defpackage.atfd
                public final void d(Object obj, Object obj2) {
                    ddzj ddzjVar = (ddzj) obj;
                    int i2 = ddzi.a;
                    ((ddys) ddzjVar.H()).a(new ddzg((dhma) obj2), bsxa.a(ddzjVar.r));
                }
            };
            atfnVar.d = 33615;
            ddziVar.jd(atfnVar.a()).x(new dcis());
        }
        Context applicationContext = getApplicationContext();
        dbvg g = this.c.g();
        ausn ausnVar = ddjx.a;
        printWriter.println("\n===Data Transfer===");
        String str6 = "\tDownloaded Segments Byte Size: ";
        String str7 = "\tDownloaded Segments Number: ";
        String str8 = "\tState: ";
        String str9 = "Account [";
        if (futm.a.lK().g()) {
            Map unmodifiableMap = DesugarCollections.unmodifiableMap(g.g().c);
            Iterator it = unmodifiableMap.keySet().iterator();
            while (it.hasNext()) {
                String str10 = (String) it.next();
                printWriter.print("Account [");
                printWriter.print(str10);
                printWriter.println("]");
                dcep dcepVar = ((dcer) unmodifiableMap.get(str10)).q;
                if (dcepVar == null) {
                    dcepVar = dcep.a;
                }
                dcca dccaVar = dcepVar.d;
                if (dccaVar == null) {
                    dccaVar = dcca.a;
                }
                printWriter.print("\tState: ");
                Map map = unmodifiableMap;
                int b3 = fbjs.b(dccaVar.c);
                if (b3 == 0) {
                    b3 = 1;
                }
                printWriter.println(fbjs.a(b3));
                if ((dccaVar.b & 2) != 0) {
                    printWriter.print("\tStarted: ");
                    fgub fgubVar = dccaVar.d;
                    if (fgubVar == null) {
                        fgubVar = fgub.a;
                    }
                    printWriter.println(fgvq.o(fgubVar));
                }
                if (ddjx.h(dccaVar)) {
                    printWriter.print("\tCompleted: ");
                    fgub fgubVar2 = dccaVar.e;
                    if (fgubVar2 == null) {
                        fgubVar2 = fgub.a;
                    }
                    printWriter.println(fgvq.o(fgubVar2));
                } else if (ddjx.g(dccaVar)) {
                    printWriter.print("\tFailed: ");
                    fgub fgubVar3 = dccaVar.f;
                    if (fgubVar3 == null) {
                        fgubVar3 = fgub.a;
                    }
                    printWriter.println(fgvq.o(fgubVar3));
                }
                if (dccaVar.h.size() > 0) {
                    Iterator it2 = dccaVar.h.iterator();
                    while (it2.hasNext()) {
                        Iterator it3 = it2;
                        fbhq fbhqVar = (fbhq) it2.next();
                        printWriter.print("\tPending request: ");
                        Iterator it4 = it;
                        int b4 = fbhp.b(fbhqVar.c);
                        if (b4 == 0) {
                            b4 = 1;
                        }
                        printWriter.println(fbhp.a(b4));
                        printWriter.print("\tToken: ");
                        printWriter.println(fbhqVar.d);
                        it = it4;
                        it2 = it3;
                    }
                }
                Iterator it5 = it;
                if (dccaVar.i.size() > 0) {
                    for (String str11 : dccaVar.i) {
                        printWriter.print("\tFile: ");
                        printWriter.println(str11);
                    }
                }
                if (dccaVar.j > 0) {
                    printWriter.print(str7);
                    printWriter.println(dccaVar.j);
                    printWriter.print(str6);
                    str4 = str6;
                    str5 = str7;
                    printWriter.println(dccaVar.k);
                } else {
                    str4 = str6;
                    str5 = str7;
                }
                if (dccaVar.l > 0) {
                    printWriter.print("\tImported Segments Number: ");
                    printWriter.println(dccaVar.l);
                }
                unmodifiableMap = map;
                it = it5;
                str6 = str4;
                str7 = str5;
            }
            i = 2;
        } else {
            String str12 = "\tDownloaded Segments Byte Size: ";
            String str13 = "\tDownloaded Segments Number: ";
            i = 2;
            Account[] d = dbsv.d(applicationContext);
            int length = d.length;
            int i2 = 0;
            while (i2 < length) {
                Account account = d[i2];
                printWriter.print(str9);
                String str14 = str9;
                printWriter.print(account.name);
                printWriter.println("]");
                try {
                    dcca a3 = ddjx.a(g, account);
                    printWriter.print(str8);
                    int b5 = fbjs.b(a3.c);
                    if (b5 == 0) {
                        b5 = 1;
                    }
                    printWriter.println(fbjs.a(b5));
                    if ((a3.b & 2) != 0) {
                        printWriter.print("\tStarted: ");
                        fgub fgubVar4 = a3.d;
                        if (fgubVar4 == null) {
                            fgubVar4 = fgub.a;
                        }
                        printWriter.println(fgvq.o(fgubVar4));
                    }
                    if (ddjx.h(a3)) {
                        printWriter.print("\tCompleted: ");
                        fgub fgubVar5 = a3.e;
                        if (fgubVar5 == null) {
                            fgubVar5 = fgub.a;
                        }
                        printWriter.println(fgvq.o(fgubVar5));
                    } else if (ddjx.g(a3)) {
                        printWriter.print("\tFailed: ");
                        fgub fgubVar6 = a3.f;
                        if (fgubVar6 == null) {
                            fgubVar6 = fgub.a;
                        }
                        printWriter.println(fgvq.o(fgubVar6));
                    }
                    if (a3.h.size() > 0) {
                        Iterator it6 = a3.h.iterator();
                        while (it6.hasNext()) {
                            Iterator it7 = it6;
                            fbhq fbhqVar2 = (fbhq) it6.next();
                            printWriter.print("\tPending request: ");
                            dbvgVar = g;
                            try {
                                int b6 = fbhp.b(fbhqVar2.c);
                                if (b6 == 0) {
                                    b6 = 1;
                                }
                                printWriter.println(fbhp.a(b6));
                                printWriter.print("\tToken: ");
                                printWriter.println(fbhqVar2.d);
                                g = dbvgVar;
                                it6 = it7;
                            } catch (IOException e) {
                                e = e;
                                str3 = str13;
                                str = str12;
                                str2 = str8;
                                printWriter.println(e);
                                i2++;
                                g = dbvgVar;
                                str8 = str2;
                                str12 = str;
                                str13 = str3;
                                str9 = str14;
                            }
                        }
                    }
                    dbvgVar = g;
                    if (a3.i.size() > 0) {
                        for (String str15 : a3.i) {
                            printWriter.print("\tFile: ");
                            printWriter.println(str15);
                        }
                    }
                    if (a3.j > 0) {
                        str3 = str13;
                        try {
                            printWriter.print(str3);
                            printWriter.println(a3.j);
                            String str16 = str12;
                            try {
                                printWriter.print(str16);
                                str = str16;
                                str2 = str8;
                                try {
                                    printWriter.println(a3.k);
                                } catch (IOException e2) {
                                    e = e2;
                                    printWriter.println(e);
                                    i2++;
                                    g = dbvgVar;
                                    str8 = str2;
                                    str12 = str;
                                    str13 = str3;
                                    str9 = str14;
                                }
                            } catch (IOException e3) {
                                e = e3;
                                str = str16;
                                str2 = str8;
                                printWriter.println(e);
                                i2++;
                                g = dbvgVar;
                                str8 = str2;
                                str12 = str;
                                str13 = str3;
                                str9 = str14;
                            }
                        } catch (IOException e4) {
                            e = e4;
                            str = str12;
                            str2 = str8;
                            printWriter.println(e);
                            i2++;
                            g = dbvgVar;
                            str8 = str2;
                            str12 = str;
                            str13 = str3;
                            str9 = str14;
                        }
                    } else {
                        str3 = str13;
                        str = str12;
                        str2 = str8;
                    }
                    if (a3.l > 0) {
                        printWriter.print("\tImported Segments Number: ");
                        printWriter.println(a3.l);
                    }
                } catch (IOException e5) {
                    e = e5;
                    dbvgVar = g;
                }
                i2++;
                g = dbvgVar;
                str8 = str2;
                str12 = str;
                str13 = str3;
                str9 = str14;
            }
        }
        if (fupv.a.lK().a()) {
            dckf dckfVar = new dckf(getApplicationContext());
            File a4 = dckfVar.a();
            if (a4.exists()) {
                printWriter.println("\n===Debug Recordings===");
                File[] listFiles = a4.listFiles();
                if (listFiles != null) {
                    int i3 = 0;
                    while (i3 < listFiles.length) {
                        File file = listFiles[i3];
                        String name = file.getName();
                        Long valueOf = Long.valueOf(file.length());
                        int i4 = i;
                        Object[] objArr = new Object[i4];
                        objArr[0] = name;
                        objArr[1] = valueOf;
                        printWriter.printf("%s - %,d bytes\n", objArr);
                        try {
                            Base64OutputStream base64OutputStream = new Base64OutputStream(new dcke(printWriter), 16);
                            try {
                                try {
                                    fileInputStream = new FileInputStream(file);
                                } catch (FileNotFoundException e6) {
                                    ((eluo) ((eluo) ((eluo) dckfVar.a.j()).s(e6)).ai(9929)).x("dump file not found");
                                } catch (IOException e7) {
                                    ((eluo) ((eluo) ((eluo) dckfVar.a.j()).s(e7)).ai(9930)).x("dump input error");
                                }
                                try {
                                    emha.a(fileInputStream, base64OutputStream);
                                    fileInputStream.close();
                                    base64OutputStream.close();
                                } finally {
                                }
                            } finally {
                            }
                        } catch (IOException e8) {
                            ((eluo) ((eluo) ((eluo) dckfVar.a.j()).s(e8)).ai((char) 9928)).x("dump output error");
                        }
                        i3++;
                        i = i4;
                    }
                }
            }
        }
    }

    @Override // defpackage.dcix
    public final eqgl e(final Account account, final long j) {
        return this.c.m().submit(new Callable() { // from class: dcih
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Account account2;
                long j2;
                SemanticLocationChimeraService semanticLocationChimeraService = SemanticLocationChimeraService.this;
                dclb l = semanticLocationChimeraService.c.l();
                synchronized (l.b) {
                    dclp dclpVar = l.e;
                    account2 = account;
                    j2 = j;
                    if (dclpVar != null) {
                        dclpVar.n(account2, j2);
                    }
                }
                synchronized (l.c) {
                    dclp dclpVar2 = l.e;
                    if (dclpVar2 != null) {
                        dclpVar2.p(account2, j2);
                    }
                }
                synchronized (l.d) {
                    dclp dclpVar3 = l.e;
                    if (dclpVar3 != null) {
                        dclpVar3.r(account2, fgvq.h(j2));
                    }
                }
                semanticLocationChimeraService.c.i().f(account2);
                dbxd.b(account2.name);
                return null;
            }
        });
    }

    @Override // defpackage.dcix
    public final eqgl f(final Account account) {
        return this.c.m().submit(new Callable() { // from class: dchs
            @Override // java.util.concurrent.Callable
            public final Object call() {
                dclp dclpVar = SemanticLocationChimeraService.this.c.l().e;
                if (dclpVar == null) {
                    return null;
                }
                dclpVar.u(account);
                return null;
            }
        });
    }

    @Override // defpackage.dcix
    public final eqgl g(final Account account, String str, final String str2) {
        if (!this.c.j().h(account, str)) {
            account = dbsd.a;
        }
        return eqdl.f(eqdl.g(fusk.g() ? eqdl.f(eqgb.h(this.c.g().q()), new dchx(), this.c.m()) : eqgb.h(this.c.g().k()), new eqdv() { // from class: dchy
            @Override // defpackage.eqdv
            public final eqgl a(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    return eqgc.i(dbqy.a(SemanticLocationState.a, 0L));
                }
                fbjd fbjdVar = SemanticLocationChimeraService.this.c.i().a(account).i;
                if (fbjdVar == null) {
                    fbjdVar = fbjd.a;
                }
                return eqgc.i(dbsc.d(fbjdVar));
            }
        }, this.c.m()), new ekut() { // from class: dchz
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                return ekvi.i(dbsx.a((SemanticLocationState) obj, dbsx.d(SemanticLocationChimeraService.this.getApplicationContext().getPackageManager(), str2)));
            }
        }, this.c.m());
    }

    @Override // defpackage.dcix
    public final eqgl h(final Account account, final String str, final String str2) {
        return this.c.m().submit(new Callable() { // from class: dcin
            @Override // java.util.concurrent.Callable
            public final Object call() {
                boolean z;
                dbxn j = SemanticLocationChimeraService.this.c.j();
                synchronized (j.b) {
                    Iterator it = j.c.c().iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        Account account2 = account;
                        String str3 = str;
                        String str4 = str2;
                        z = true;
                        if (!hasNext) {
                            Iterator it2 = j.d.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    z = false;
                                    break;
                                }
                                if (((dclv) it2.next()).g(account2, str3, str4)) {
                                    break;
                                }
                            }
                        } else if (((Subscription) it.next()).g(account2, str3, str4)) {
                            break;
                        }
                    }
                }
                return Boolean.valueOf(z);
            }
        });
    }

    public final eqgl i() {
        eqgl r;
        eqgl eqglVar = b;
        if (eqglVar == null) {
            final Context applicationContext = getApplicationContext();
            synchronized (this.e) {
                aszs aszsVar = ceqg.a;
                dcbg.a(applicationContext, new ceqm(applicationContext), this.c.g(), this.c.f(), this.c.m()).hD(new Runnable() { // from class: dciq
                    @Override // java.lang.Runnable
                    public final void run() {
                        SemanticLocationChimeraService semanticLocationChimeraService = SemanticLocationChimeraService.this;
                        dcbd.j(applicationContext, semanticLocationChimeraService.c.f());
                        semanticLocationChimeraService.c.k().c();
                    }
                }, this.c.m());
                if (fush.a.lK().aS()) {
                    aszs aszsVar2 = cyjh.a;
                    dhlw bq = new cyki(applicationContext).bq("com.google.android.gms.semanticlocation");
                    bq.w(this.c.m(), new dhlq() { // from class: dcir
                        @Override // defpackage.dhlq
                        public final void gC(Object obj) {
                            ausn ausnVar = SemanticLocationChimeraService.a;
                        }
                    });
                    bq.t(this.c.m(), new dhln() { // from class: dchn
                        @Override // defpackage.dhln
                        public final void gB(Exception exc) {
                            ((eluo) ((eluo) ((eluo) SemanticLocationChimeraService.a.j()).s(exc)).ai((char) 9829)).B("Failed to commit phenotype configuration for %s for logged out user", "com.google.android.gms.semanticlocation");
                        }
                    });
                }
                this.c.g().D();
                o();
                r = r();
            }
            b = r;
        } else if (this.f > 0 && eqglVar.isDone() && !dbwb.c()) {
            this.f--;
            b = r();
        }
        eqgl eqglVar2 = b;
        ekvl.y(eqglVar2);
        return eqglVar2;
    }

    @Override // defpackage.dcix
    public final eqgl j(final Account account, final String str, final String str2, final PendingIntent pendingIntent) {
        return this.c.m().submit(new Callable() { // from class: dcik
            @Override // java.util.concurrent.Callable
            public final Object call() {
                SemanticLocationChimeraService semanticLocationChimeraService = SemanticLocationChimeraService.this;
                dbxn j = semanticLocationChimeraService.c.j();
                Account account2 = account;
                j.f(account2, str, str2, pendingIntent);
                semanticLocationChimeraService.c.i().f(account2);
                SemanticLocationChimeraService.n(semanticLocationChimeraService.getApplicationContext());
                return null;
            }
        });
    }

    @Override // defpackage.dcix
    public final eqgl k(final Account account, final String str, final String str2) {
        return this.c.m().submit(new Callable() { // from class: dchq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                SemanticLocationChimeraService semanticLocationChimeraService = SemanticLocationChimeraService.this;
                dbxn j = semanticLocationChimeraService.c.j();
                Account account2 = account;
                j.g(account2, str, str2);
                semanticLocationChimeraService.c.i().f(account2);
                SemanticLocationChimeraService.n(semanticLocationChimeraService.getApplicationContext());
                return null;
            }
        });
    }

    @Override // defpackage.dcix
    public final eqgl l(final boolean z) {
        eqgl b2;
        final Context applicationContext = getApplicationContext();
        dzwm dzwmVar = this.c.g().f;
        synchronized (dzwmVar) {
            b2 = dzwmVar.b(new ekut() { // from class: dbud
                @Override // defpackage.ekut
                public final Object apply(Object obj) {
                    dcex dcexVar = (dcex) obj;
                    ausn ausnVar = dbvg.a;
                    fgrc fgrcVar = (fgrc) dcexVar.iQ(5, null);
                    fgrcVar.X(dcexVar);
                    dcek dcekVar = (dcek) fgrcVar;
                    if (!dcekVar.b.L()) {
                        dcekVar.U();
                    }
                    boolean z2 = z;
                    dcex dcexVar2 = (dcex) dcekVar.b;
                    dcex dcexVar3 = dcex.a;
                    dcexVar2.b |= 2;
                    dcexVar2.e = z2;
                    return (dcex) dcekVar.Q();
                }
            }, eqex.a);
        }
        return eqdl.f(eqgb.h(b2), new ekut() { // from class: dcia
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                SemanticLocationChimeraService.n(applicationContext);
                return null;
            }
        }, this.c.m());
    }

    public final synchronized void m(int i) {
        boolean isEmpty;
        if (this.d.get() <= 0 && !this.c.g().S() && !this.c.j().i()) {
            dbxn j = this.c.j();
            synchronized (j.b) {
                isEmpty = j.e.isEmpty();
            }
            if (isEmpty) {
                stopSelf(i);
            }
        }
    }

    public final void o() {
        elgo g;
        Context applicationContext = getApplicationContext();
        if ((!this.c.g().S() && !this.c.j().i()) || (!fusk.g() ? !this.c.g().J() : !this.c.g().g().e)) {
            PendingIntent q = q(applicationContext, "com.google.android.gms.semanticlocation.ACTION_ACTIVITY");
            this.c.a();
            int i = cbpo.a;
            new cciv(applicationContext).b(q);
            q.cancel();
            PendingIntent q2 = q(applicationContext, "com.google.android.gms.semanticlocation.ACTION_LOCATION");
            this.c.b();
            aszs aszsVar = cbrh.a;
            new ccjt(applicationContext).d(q2);
            q2.cancel();
            this.c.d().b(applicationContext);
            if (fush.aa() || Build.VERSION.SDK_INT < 30 || !fush.y()) {
                return;
            }
            this.c.c().a.c();
            return;
        }
        if (auub.g() && (applicationContext = ModuleManager.createSubmoduleContext(this, "current_semantic_location")) == null) {
            ((eluo) ((eluo) a.i()).ai((char) 9842)).x("createSubmoduleContext failed");
            applicationContext = getApplicationContext();
        }
        this.c.a();
        int i2 = cbpo.a;
        cciv ccivVar = new cciv(applicationContext);
        PendingIntent q3 = q(applicationContext, "com.google.android.gms.semanticlocation.ACTION_ACTIVITY");
        dbxn j = this.c.j();
        synchronized (j.b) {
            elhx elhxVar = new elhx();
            Iterator it = j.c.c().iterator();
            while (it.hasNext()) {
                elhxVar.c(((Subscription) it.next()).b.c);
            }
            Iterator it2 = j.d.iterator();
            while (it2.hasNext()) {
                elhxVar.c(((dclv) it2.next()).a.c);
            }
            elhz g2 = elhxVar.g();
            int i3 = elgo.d;
            elgj elgjVar = new elgj();
            for (ApplicationInfo applicationInfo : j.f.getPackageManager().getInstalledApplications(128)) {
                if (g2.contains(applicationInfo.packageName)) {
                    int i4 = applicationInfo.uid;
                    String str = applicationInfo.packageName;
                    elgjVar.i(new ClientIdentity(applicationInfo.uid, applicationInfo.packageName));
                }
            }
            g = elgjVar.g();
        }
        cbpq cbpqVar = new cbpq();
        cbpqVar.c(dbrg.b);
        cbpqVar.c = false;
        cbpqVar.e = "SemanticLocation";
        if (!g.isEmpty()) {
            WorkSource workSource = new WorkSource();
            int i5 = ((elpg) g).c;
            for (int i6 = 0; i6 < i5; i6++) {
                ClientIdentity clientIdentity = (ClientIdentity) g.get(i6);
                auvd.e(workSource, clientIdentity.a, clientIdentity.b);
            }
            cbpqVar.d = workSource;
        }
        ccivVar.d(cbpqVar.a(), q3);
        this.c.g();
        this.c.b();
        aszs aszsVar2 = cbrh.a;
        ccjt ccjtVar = new ccjt(applicationContext);
        PendingIntent q4 = q(applicationContext, "com.google.android.gms.semanticlocation.ACTION_LOCATION");
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.h(102);
        locationRequest.e(dbrn.b);
        locationRequest.f(dbrn.c);
        locationRequest.d(dbrn.d);
        ccjtVar.h(new LocationRequestInternal(locationRequest, null, false, false, false, false, Long.MAX_VALUE), q4).t(eqex.a, new dhln() { // from class: dcij
            @Override // defpackage.dhln
            public final void gB(Exception exc) {
                ((eluo) ((eluo) ((eluo) SemanticLocationChimeraService.a.i()).s(exc)).ai((char) 9830)).x("requestBackgroundLocations failed");
            }
        });
        this.c.d().a(applicationContext, this.c.m());
        if (fush.aa() || Build.VERSION.SDK_INT < 30 || !fush.y()) {
            return;
        }
        dbro c = this.c.c();
        auuo auuoVar = c.a;
        auuoVar.c();
        auuoVar.b(c);
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        if (dbsv.a() && fush.P()) {
            return new dciz(this);
        }
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        this.c = new dciw(getApplicationContext());
        this.f = fush.a.lK().E();
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        super.onDestroy();
        eqgo m = this.c.m();
        final dciw dciwVar = this.c;
        Objects.requireNonNull(dciwVar);
        m.execute(new Runnable() { // from class: dcie
            @Override // java.lang.Runnable
            public final void run() {
                dciw.this.q();
            }
        });
    }

    @Override // com.google.android.chimera.Service
    public final void onStart(Intent intent, int i) {
        ((eluo) ((eluo) a.i()).ai((char) 9835)).x("onStart shouldn't be called");
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(final Intent intent, int i, final int i2) {
        if (intent == null) {
            return 2;
        }
        this.d.getAndIncrement();
        this.c.m().submit(new Runnable() { // from class: dcht
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            @Override // java.lang.Runnable
            public final void run() {
                char c;
                long j;
                int c2;
                dcce dcceVar;
                final int intExtra;
                final SemanticLocationChimeraService semanticLocationChimeraService = SemanticLocationChimeraService.this;
                semanticLocationChimeraService.d.getAndDecrement();
                int i3 = i2;
                if (!dbsv.a() || !fush.P()) {
                    semanticLocationChimeraService.stopSelf(i3);
                    return;
                }
                Intent intent2 = intent;
                if (atos.m(intent2)) {
                    dciw.o(intent2);
                    return;
                }
                if (intent2.getAction() == null) {
                    ((eluo) ((eluo) SemanticLocationChimeraService.a.j()).ai((char) 9825)).x("Invalid intent");
                    return;
                }
                intent2.getAction();
                String action = intent2.getAction();
                ekvl.y(action);
                boolean z = false;
                switch (action.hashCode()) {
                    case -1732078989:
                        if (action.equals("com.google.android.gms.semanticlocation.ACTION_LOCATION")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1561694514:
                        if (action.equals("com.google.android.gms.semanticlocation.ACTION_INIT")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -994122291:
                        if (action.equals("com.google.android.gms.semanticlocation.ACTION_ACTIVITY")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -970934685:
                        if (action.equals("com.google.andriod.gms.semanticlocation.ACTION_LOCATION_HISTORY_SETTINGS_CHANGED")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case -207811042:
                        if (action.equals("com.google.android.gms.semanticlocation.ACTION_UPDATE_ACCOUNTS")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1226443393:
                        if (action.equals("com.google.android.gms.semanticlocation.ACTION_UPDATE_INFERRER_FOR_MDD")) {
                            c = '\b';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1442194334:
                        if (action.equals("com.google.android.gms.semanticlocation.ACTION_UPDATE_SUBSCRIPTIONS")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1492820409:
                        if (action.equals("com.google.android.gms.semanticlocation.ACTION_LOCATION_SETTING_CHANGED")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 2098941897:
                        if (action.equals("com.google.android.gms.semanticlocation.ACTION_UPDATE_INFERRER")) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        dbrg a2 = semanticLocationChimeraService.c.a();
                        if (ActivityRecognitionResult.g(intent2)) {
                            ActivityRecognitionResult.c(intent2);
                            a2.c.e("SemanticLocationActivityRecognitionResult");
                            ActivityRecognitionResult c3 = ActivityRecognitionResult.c(intent2);
                            if (c3 != null) {
                                fgrc v = dcbt.b.v();
                                for (DetectedActivity detectedActivity : c3.a) {
                                    int a3 = detectedActivity.a();
                                    switch (a3) {
                                        case 0:
                                            dcceVar = dcce.IN_VEHICLE;
                                            break;
                                        case 1:
                                            dcceVar = dcce.ON_BICYCLE;
                                            break;
                                        case 2:
                                            dcceVar = dcce.ON_FOOT;
                                            break;
                                        case 3:
                                            dcceVar = dcce.STILL;
                                            break;
                                        case 4:
                                            dcceVar = dcce.UNKNOWN;
                                            break;
                                        case 5:
                                            dcceVar = dcce.TILTING;
                                            break;
                                        case 6:
                                            dcceVar = dcce.EXITING_VEHICLE;
                                            break;
                                        case 7:
                                            dcceVar = dcce.WALKING;
                                            break;
                                        case 8:
                                            dcceVar = dcce.RUNNING;
                                            break;
                                        default:
                                            switch (a3) {
                                                case 16:
                                                case 19:
                                                case fywe.t /* 20 */:
                                                case fywe.u /* 21 */:
                                                    dcceVar = dcce.IN_ROAD_VEHICLE;
                                                    break;
                                                case fywe.q /* 17 */:
                                                    dcceVar = dcce.IN_RAIL_VEHICLE;
                                                    break;
                                                case 18:
                                                    dcceVar = dcce.IN_TWO_WHEELER_VEHICLE;
                                                    break;
                                                default:
                                                    ((eluo) ((eluo) dbrg.a.j()).ai((char) 9601)).z("Unknown activity type: %d", a3);
                                                    dcceVar = dcce.UNKNOWN;
                                                    break;
                                            }
                                    }
                                    if (!v.b.L()) {
                                        v.U();
                                    }
                                    dcbt dcbtVar = (dcbt) v.b;
                                    dcceVar.getClass();
                                    fgrr fgrrVar = dcbtVar.d;
                                    if (!fgrrVar.c()) {
                                        dcbtVar.d = fgri.C(fgrrVar);
                                    }
                                    dcbtVar.d.i(dcceVar.m);
                                    float f = detectedActivity.e;
                                    if (!v.b.L()) {
                                        v.U();
                                    }
                                    dcbt dcbtVar2 = (dcbt) v.b;
                                    fgrq fgrqVar = dcbtVar2.e;
                                    if (!fgrqVar.c()) {
                                        dcbtVar2.e = fgri.B(fgrqVar);
                                    }
                                    dcbtVar2.e.h(f / 100.0f);
                                }
                                if (c3.b() != null && (c2 = cbps.c(c3.b())) != -1) {
                                    if (!v.b.L()) {
                                        v.U();
                                    }
                                    dcbt dcbtVar3 = (dcbt) v.b;
                                    dcbtVar3.c = 2 | dcbtVar3.c;
                                    dcbtVar3.g = c2;
                                }
                                long j2 = c3.b;
                                if (!v.b.L()) {
                                    v.U();
                                }
                                dcbt dcbtVar4 = (dcbt) v.b;
                                dcbtVar4.c |= 1;
                                dcbtVar4.f = j2;
                                final dcbt dcbtVar5 = (dcbt) v.Q();
                                dckl dcklVar = a2.e;
                                Deque deque = dcklVar.a;
                                synchronized (deque) {
                                    if (deque.isEmpty()) {
                                        j = 0;
                                    } else {
                                        dcbt dcbtVar6 = (dcbt) deque.peekLast();
                                        ekvl.y(dcbtVar6);
                                        j = dcbtVar6.f;
                                    }
                                    deque.addLast(dcbtVar5);
                                    if (deque.size() != 1) {
                                        if (((dcbt) elja.p(deque)).f < j) {
                                            dcklVar.d.e("CSLActivityRecordOutOfOrder");
                                            ((eluo) ((eluo) dbsp.a.h()).ai(9935)).x("New activity record out of order; sorting");
                                            ArrayList arrayList = new ArrayList(deque);
                                            deque.clear();
                                            Collections.sort(arrayList, new Comparator() { // from class: dckk
                                                @Override // java.util.Comparator
                                                public final int compare(Object obj, Object obj2) {
                                                    return Long.compare(((dcbt) obj).f, ((dcbt) obj2).f);
                                                }
                                            });
                                            deque.addAll(arrayList);
                                            arrayList.clear();
                                        }
                                    }
                                }
                                dckf dckfVar = a2.d;
                                if (dckfVar != null) {
                                    dckfVar.c(new ekut() { // from class: dcjw
                                        @Override // defpackage.ekut
                                        public final Object apply(Object obj) {
                                            fgrc fgrcVar = (fgrc) obj;
                                            int i4 = dckf.b;
                                            if (!fgrcVar.b.L()) {
                                                fgrcVar.U();
                                            }
                                            dcbt dcbtVar7 = dcbt.this;
                                            dccc dcccVar = (dccc) fgrcVar.b;
                                            dccc dcccVar2 = dccc.a;
                                            dcbtVar7.getClass();
                                            dcccVar.f = dcbtVar7;
                                            dcccVar.b |= 8;
                                            return fgrcVar;
                                        }
                                    });
                                    break;
                                }
                            }
                        }
                        break;
                    case 1:
                        dbrn b2 = semanticLocationChimeraService.c.b();
                        eqgl i4 = semanticLocationChimeraService.i();
                        eqgo m = semanticLocationChimeraService.c.m();
                        if (LocationResult.d(intent2)) {
                            LocationResult c4 = LocationResult.c(intent2);
                            b2.f.e("SemanticLocationLocationResult");
                            dbwo dbwoVar = b2.e;
                            ekvl.y(c4);
                            if (i4.isDone() && dbwoVar.f.g()) {
                                z = true;
                            }
                            dbwoVar.d(c4.b, true, m, z);
                            break;
                        }
                        break;
                    case 2:
                        semanticLocationChimeraService.i();
                        break;
                    case 3:
                        if (bzbx.a(semanticLocationChimeraService) == 0) {
                            dbwo i5 = semanticLocationChimeraService.c.i();
                            Map map = dbwo.b;
                            synchronized (map) {
                                Iterator it = map.values().iterator();
                                while (it.hasNext()) {
                                    ((dbwv) it.next()).e();
                                }
                                map.clear();
                                dclb dclbVar = i5.d;
                                Map map2 = dclbVar.b;
                                synchronized (map2) {
                                    map2.clear();
                                }
                                Map map3 = dclbVar.c;
                                synchronized (map3) {
                                    map3.clear();
                                }
                                Map map4 = dclbVar.d;
                                synchronized (map4) {
                                    map4.clear();
                                }
                                break;
                            }
                        }
                        break;
                    case 4:
                        semanticLocationChimeraService.c.g().D();
                        semanticLocationChimeraService.o();
                        dbwo i6 = semanticLocationChimeraService.c.i();
                        Map map5 = dbwo.b;
                        synchronized (map5) {
                            Iterator it2 = map5.entrySet().iterator();
                            while (it2.hasNext()) {
                                Map.Entry entry = (Map.Entry) it2.next();
                                Account account = (Account) entry.getKey();
                                dbwv dbwvVar = (dbwv) entry.getValue();
                                if (!i6.e.R(account)) {
                                    if (i6.c.j(account) && !dbwvVar.l) {
                                    }
                                    dbwvVar.e();
                                    it2.remove();
                                    i6.d.b(account);
                                } else if (!dbwvVar.l) {
                                    dbwvVar.e();
                                    it2.remove();
                                    i6.d.b(account);
                                }
                            }
                        }
                        break;
                    case 5:
                        ArrayList parcelableArrayListExtra = intent2.getParcelableArrayListExtra("accountsAdded");
                        ArrayList<Account> parcelableArrayListExtra2 = intent2.getParcelableArrayListExtra("accountsRemoved");
                        Map f2 = xgt.f(intent2.getParcelableArrayExtra("accountsRenamed"));
                        if (parcelableArrayListExtra != null) {
                            parcelableArrayListExtra.size();
                        }
                        if (parcelableArrayListExtra2 != null) {
                            parcelableArrayListExtra2.size();
                        }
                        if (f2 != null) {
                            f2.size();
                        }
                        if (parcelableArrayListExtra2 != null && !parcelableArrayListExtra2.isEmpty()) {
                            for (Account account2 : parcelableArrayListExtra2) {
                                semanticLocationChimeraService.c.j().e(account2);
                                semanticLocationChimeraService.c.i().f(account2);
                                semanticLocationChimeraService.c.l().c(account2);
                                if (fupb.c() && f2 != null && f2.containsKey(account2)) {
                                    final dcer d = semanticLocationChimeraService.c.g().d(account2);
                                    semanticLocationChimeraService.c.g().x((Account) f2.get(account2), new ekut() { // from class: dcib
                                        @Override // defpackage.ekut
                                        public final Object apply(Object obj) {
                                            ausn ausnVar = SemanticLocationChimeraService.a;
                                            return dcer.this;
                                        }
                                    }).hD(new Runnable() { // from class: dcic
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            ausn ausnVar = SemanticLocationChimeraService.a;
                                        }
                                    }, eqex.a);
                                }
                                semanticLocationChimeraService.c.g().u(account2).hD(new Runnable() { // from class: dcid
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ausn ausnVar = SemanticLocationChimeraService.a;
                                    }
                                }, eqex.a);
                                dbxd.b(account2.name);
                            }
                        }
                        if (parcelableArrayListExtra != null) {
                            parcelableArrayListExtra.isEmpty();
                            break;
                        }
                        break;
                    case 6:
                        semanticLocationChimeraService.c.k().c();
                        semanticLocationChimeraService.o();
                        break;
                    case 7:
                        semanticLocationChimeraService.c.k().c();
                        semanticLocationChimeraService.c.i();
                        if (dbwb.c()) {
                            Map map6 = dbwo.b;
                            synchronized (map6) {
                                Iterator it3 = map6.values().iterator();
                                while (it3.hasNext()) {
                                    ((dbwv) it3.next()).h();
                                }
                            }
                            break;
                        } else {
                            ((eluo) ((eluo) dbwo.a.j()).ai((char) 9679)).x("IncrementalTimelineInferrerEnvironment not initialized");
                            break;
                        }
                    case '\b':
                        if (intent2.hasExtra("semanticlocation_mdd_version_number") && (intExtra = intent2.getIntExtra("semanticlocation_mdd_version_number", -1)) != -1) {
                            dbwo i7 = semanticLocationChimeraService.c.i();
                            Callable callable = new Callable() { // from class: dcig
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    eqgl i8;
                                    SemanticLocationChimeraService semanticLocationChimeraService2 = SemanticLocationChimeraService.this;
                                    Context applicationContext = semanticLocationChimeraService2.getApplicationContext();
                                    dbvg g = semanticLocationChimeraService2.c.g();
                                    final dbtc f3 = semanticLocationChimeraService2.c.f();
                                    ausn ausnVar = dcbd.a;
                                    final int i9 = intExtra;
                                    if (fush.H()) {
                                        int i10 = elgo.d;
                                        elgj elgjVar = new elgj();
                                        if (fush.H()) {
                                            try {
                                                FileInputStream f4 = dcbd.f(applicationContext, "staging_semantic_location_mdd_metadata.pb");
                                                try {
                                                    fyvl fyvlVar = fyvl.a;
                                                    fgpx M = fgpx.M(f4);
                                                    fgqp fgqpVar = fgqp.a;
                                                    fgti fgtiVar = fgti.a;
                                                    fgqp fgqpVar2 = fgqp.a;
                                                    fgri x = fyvlVar.x();
                                                    try {
                                                        try {
                                                            try {
                                                                fgtq b3 = fgti.a.b(x);
                                                                b3.l(x, fgpy.p(M), fgqpVar2);
                                                                b3.g(x);
                                                                fgri.M(x);
                                                                for (fyvm fyvmVar : ((fyvl) x).b) {
                                                                    if (!fyvmVar.d.isEmpty()) {
                                                                        elgjVar.i(fyvmVar.d);
                                                                    }
                                                                    if (!fyvmVar.e.isEmpty()) {
                                                                        elgjVar.i(fyvmVar.e);
                                                                    }
                                                                    if (!fyvmVar.f.isEmpty()) {
                                                                        elgjVar.i(fyvmVar.f);
                                                                    }
                                                                }
                                                                elgjVar.i("semantic_location_mdd_metadata.pb");
                                                                if (f4 != null) {
                                                                    f4.close();
                                                                }
                                                            } catch (fguf e) {
                                                                throw e.a();
                                                            } catch (IOException e2) {
                                                                if (e2.getCause() instanceof fgsd) {
                                                                    throw ((fgsd) e2.getCause());
                                                                }
                                                                throw new fgsd(e2);
                                                            }
                                                        } catch (fgsd e3) {
                                                            if (e3.a) {
                                                                throw new fgsd(e3);
                                                            }
                                                            throw e3;
                                                        }
                                                    } catch (RuntimeException e4) {
                                                        if (e4.getCause() instanceof fgsd) {
                                                            throw ((fgsd) e4.getCause());
                                                        }
                                                        throw e4;
                                                    }
                                                } finally {
                                                }
                                            } catch (IOException unused) {
                                                elgjVar.i("ranker.tflite");
                                                elgjVar.i("segmenter.tflite");
                                                elgjVar.i("model_bundle_metadata.pb");
                                            }
                                        } else {
                                            elgjVar.i("ranker.tflite");
                                            elgjVar.i("segmenter.tflite");
                                            elgjVar.i("model_bundle_metadata.pb");
                                        }
                                        elgo g2 = elgjVar.g();
                                        int i11 = ((elpg) g2).c;
                                        boolean z2 = true;
                                        for (int i12 = 0; i12 < i11; i12++) {
                                            z2 &= dcbd.i((String) g2.get(i12), applicationContext, f3);
                                        }
                                        if (z2) {
                                            f3.w(2, 13);
                                            i8 = eqdl.f(eqgb.h(g.v(i9)), new ekut() { // from class: dcat
                                                @Override // defpackage.ekut
                                                public final Object apply(Object obj) {
                                                    ausn ausnVar2 = dcbd.a;
                                                    dbtc dbtcVar = dbtc.this;
                                                    dbtcVar.q(i9);
                                                    dbtcVar.w(2, 2);
                                                    return true;
                                                }
                                            }, eqex.a);
                                        } else {
                                            ((eluo) ((eluo) dcbd.a.j()).ai((char) 9785)).x("Deploying models failed!");
                                            f3.w(2, 12);
                                            i8 = eqgc.i(false);
                                        }
                                    } else if (dcbd.i("ranker.tflite", applicationContext, f3) && dcbd.i("segmenter.tflite", applicationContext, f3) && dcbd.i("model_bundle_metadata.pb", applicationContext, f3)) {
                                        f3.w(2, 13);
                                        i8 = eqdl.f(eqgb.h(g.v(i9)), new ekut() { // from class: dcas
                                            @Override // defpackage.ekut
                                            public final Object apply(Object obj) {
                                                ausn ausnVar2 = dcbd.a;
                                                dbtc dbtcVar = dbtc.this;
                                                dbtcVar.q(i9);
                                                dbtcVar.w(2, 2);
                                                return true;
                                            }
                                        }, eqex.a);
                                    } else {
                                        ((eluo) ((eluo) dcbd.a.j()).ai((char) 9784)).x("Deploying models failed!");
                                        f3.w(2, 12);
                                        i8 = eqgc.i(false);
                                    }
                                    if (!((Boolean) i8.get()).booleanValue()) {
                                        return null;
                                    }
                                    semanticLocationChimeraService2.c.k().c();
                                    return null;
                                }
                            };
                            eqgo m2 = semanticLocationChimeraService.c.m();
                            List list = i7.h;
                            synchronized (list) {
                                list.add(callable);
                            }
                            i7.g(m2);
                            break;
                        }
                        break;
                    default:
                        ((eluo) ((eluo) SemanticLocationChimeraService.a.j()).ai((char) 9824)).B("Unexpected action %s", intent2.getAction());
                        break;
                }
                semanticLocationChimeraService.m(i3);
            }
        }).hD(new Runnable() { // from class: dchu
            @Override // java.lang.Runnable
            public final void run() {
                ausn ausnVar = SemanticLocationChimeraService.a;
            }
        }, eqex.a);
        return 2;
    }

    @Override // defpackage.dcix
    public final eqgl p(final SemanticLocationParameters semanticLocationParameters, final String str) {
        final PackageManager packageManager = getApplicationContext().getPackageManager();
        return eqdl.f(eqdl.g(fusk.g() ? eqdl.f(eqdl.g(eqgb.h(i()), new eqdv() { // from class: dchm
            @Override // defpackage.eqdv
            public final eqgl a(Object obj) {
                return SemanticLocationChimeraService.this.c.g().q();
            }
        }, this.c.m()), new dchx(), this.c.m()) : eqdl.g(eqgb.h(i()), new eqdv() { // from class: dcii
            @Override // defpackage.eqdv
            public final eqgl a(Object obj) {
                return SemanticLocationChimeraService.this.c.g().k();
            }
        }, this.c.m()), new eqdv() { // from class: dcil
            @Override // defpackage.eqdv
            public final eqgl a(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    return eqgc.i(dbqy.a(SemanticLocationState.a, 0L));
                }
                final SemanticLocationChimeraService semanticLocationChimeraService = SemanticLocationChimeraService.this;
                final Context applicationContext = semanticLocationChimeraService.getApplicationContext();
                if (auub.g() && (applicationContext = ModuleManager.createSubmoduleContext(semanticLocationChimeraService, "current_semantic_location")) == null) {
                    ((eluo) ((eluo) SemanticLocationChimeraService.a.i()).ai((char) 9827)).x("createSubmoduleContext for CSL failed");
                    applicationContext = semanticLocationChimeraService.getApplicationContext();
                }
                final String str2 = str;
                final SemanticLocationParameters semanticLocationParameters2 = semanticLocationParameters;
                return iif.a(new iic() { // from class: dcio
                    @Override // defpackage.iic
                    public final Object a(iia iiaVar) {
                        dchr dchrVar = new dchr(iiaVar);
                        SemanticLocationParameters semanticLocationParameters3 = semanticLocationParameters2;
                        dclw dclwVar = new dclw(semanticLocationParameters3, dchrVar);
                        SemanticLocationChimeraService semanticLocationChimeraService2 = SemanticLocationChimeraService.this;
                        dbxn j = semanticLocationChimeraService2.c.j();
                        Lock lock = j.b;
                        String str3 = str2;
                        synchronized (lock) {
                            j.e.add(dclwVar);
                        }
                        Context context = applicationContext;
                        dbrn b2 = semanticLocationChimeraService2.c.b();
                        aszs aszsVar = cbrh.a;
                        ccjt ccjtVar = new ccjt(context);
                        eqgl eqglVar = SemanticLocationChimeraService.b;
                        ekvl.y(eqglVar);
                        String str4 = semanticLocationParameters3.c;
                        PackageManager packageManager2 = context.getPackageManager();
                        com.google.android.gms.libs.identity.ClientIdentity clientIdentity = null;
                        if (fush.a.lK().aR()) {
                            try {
                                ApplicationInfo applicationInfo = packageManager2.getApplicationInfo(str4, 128);
                                clientIdentity = com.google.android.gms.libs.identity.ClientIdentity.u(applicationInfo.packageName, applicationInfo.uid, str3);
                            } catch (PackageManager.NameNotFoundException e) {
                                ((eluo) ((eluo) ((eluo) SemanticLocationChimeraService.a.j()).s(e)).ai((char) 9821)).B("%s not found", str4);
                            }
                        }
                        b2.a(ccjtVar, eqglVar, clientIdentity, semanticLocationChimeraService2.c.m());
                        return "SemanticLocationService.estimateCurrentSemanticLocation";
                    }
                });
            }
        }, this.c.m()), new ekut() { // from class: dcim
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                ausn ausnVar = SemanticLocationChimeraService.a;
                return ekvi.i(dbsx.a((SemanticLocationState) obj, dbsx.d(packageManager, semanticLocationParameters.c)));
            }
        }, this.c.m());
    }
}
