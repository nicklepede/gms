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
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;
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
import defpackage.aqxd;
import defpackage.arco;
import defpackage.arcy;
import defpackage.armd;
import defpackage.asej;
import defpackage.asot;
import defpackage.asqh;
import defpackage.asqu;
import defpackage.asrj;
import defpackage.bzgx;
import defpackage.bzgz;
import defpackage.bziq;
import defpackage.caae;
import defpackage.cabc;
import defpackage.cchm;
import defpackage.cchs;
import defpackage.cvzk;
import defpackage.cwal;
import defpackage.czhi;
import defpackage.czhp;
import defpackage.czhq;
import defpackage.czif;
import defpackage.czil;
import defpackage.czix;
import defpackage.czji;
import defpackage.czlk;
import defpackage.czmf;
import defpackage.czms;
import defpackage.cznh;
import defpackage.cznr;
import defpackage.czrf;
import defpackage.czrz;
import defpackage.czxw;
import defpackage.czyr;
import defpackage.czyv;
import defpackage.czyw;
import defpackage.czyy;
import defpackage.daad;
import defpackage.daae;
import defpackage.daat;
import defpackage.dabn;
import defpackage.dabo;
import defpackage.dazp;
import defpackage.dbpc;
import defpackage.dfah;
import defpackage.dfak;
import defpackage.dfaq;
import defpackage.dvmh;
import defpackage.dxkm;
import defpackage.eiho;
import defpackage.eiid;
import defpackage.eiif;
import defpackage.eiig;
import defpackage.eite;
import defpackage.eitj;
import defpackage.eius;
import defpackage.eiuu;
import defpackage.ejcb;
import defpackage.ejhf;
import defpackage.ejtr;
import defpackage.enps;
import defpackage.enqc;
import defpackage.enre;
import defpackage.ensi;
import defpackage.enss;
import defpackage.ensv;
import defpackage.eytb;
import defpackage.eytc;
import defpackage.eyve;
import defpackage.fefi;
import defpackage.fegx;
import defpackage.frvb;
import defpackage.frxn;
import defpackage.frxq;
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

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class SemanticLocationChimeraService extends Service implements czyw {
    public static final asot a = asot.c("SemanticLocation", asej.SEMANTIC_LOCATION, "Service");
    public static enss b = null;
    public czyv c;
    public final AtomicInteger d = new AtomicInteger();
    private final Object e = new Object();
    private long f;

    public static void n(Context context) {
        context.startService(czji.a(context, "com.google.android.gms.semanticlocation.ACTION_UPDATE_SUBSCRIPTIONS"));
    }

    private static PendingIntent q(Context context, String str) {
        PendingIntent service = PendingIntent.getService(context, 0, czji.a(context, str), 134217728);
        eiig.x(service);
        return service;
    }

    private final enss r() {
        enss submit = this.c.m().submit(new Callable() { // from class: czxn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                SemanticLocationChimeraService semanticLocationChimeraService = SemanticLocationChimeraService.this;
                czmf.a(semanticLocationChimeraService, semanticLocationChimeraService.c.f());
                return null;
            }
        });
        submit.hn(new Runnable() { // from class: czxo
            @Override // java.lang.Runnable
            public final void run() {
                asot asotVar = SemanticLocationChimeraService.a;
            }
        }, enre.a);
        return submit;
    }

    @Override // defpackage.czyw
    public final Subscription a(Subscription subscription) {
        Subscription subscription2;
        cznr j = this.c.j();
        synchronized (j.b) {
            armd armdVar = j.c;
            Iterator it = armdVar.c().iterator();
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
            armdVar.d(subscription);
            j.c(subscription);
        }
        cznr.a = eiid.j(true);
        n(getApplicationContext());
        return subscription2;
    }

    @Override // defpackage.czyw
    public final enss b(final Subscription subscription) {
        return this.c.m().submit(new Callable() { // from class: czye
            @Override // java.util.concurrent.Callable
            public final Object call() {
                SemanticLocationChimeraService semanticLocationChimeraService = SemanticLocationChimeraService.this;
                cznr j = semanticLocationChimeraService.c.j();
                Lock lock = j.b;
                Subscription subscription2 = subscription;
                synchronized (lock) {
                    j.c.d(subscription2);
                    j.c(subscription2);
                }
                cznr.a = eiid.j(true);
                SemanticLocationChimeraService.n(semanticLocationChimeraService.getApplicationContext());
                return null;
            }
        });
    }

    @Override // defpackage.czyw
    public final enss c(final dabn dabnVar) {
        return this.c.m().submit(new Callable() { // from class: czyo
            @Override // java.util.concurrent.Callable
            public final Object call() {
                SemanticLocationChimeraService semanticLocationChimeraService = SemanticLocationChimeraService.this;
                cznr j = semanticLocationChimeraService.c.j();
                Lock lock = j.b;
                dabn dabnVar2 = dabnVar;
                synchronized (lock) {
                    List list = j.d;
                    list.remove(dabnVar2);
                    list.add(dabnVar2);
                }
                SemanticLocationChimeraService.n(semanticLocationChimeraService.getApplicationContext());
                return null;
            }
        });
    }

    @Override // defpackage.czyw
    public final enss d(final eiuu eiuuVar) {
        eiuu g;
        eiuu G;
        enss f;
        enss enssVar;
        cznr j = this.c.j();
        synchronized (j.b) {
            eius eiusVar = new eius();
            Iterator it = j.c.c().iterator();
            while (it.hasNext()) {
                eiusVar.c(((Subscription) it.next()).b.a);
            }
            Iterator it2 = j.d.iterator();
            while (it2.hasNext()) {
                eiusVar.c(((dabn) it2.next()).a.a);
            }
            Iterator it3 = j.e.iterator();
            while (it3.hasNext()) {
                eiusVar.c(((dabo) it3.next()).a.a);
            }
            g = eiusVar.g();
        }
        g.removeAll(eiuuVar);
        Iterator it4 = g.iterator();
        while (it4.hasNext()) {
            this.c.j().e((Account) it4.next());
        }
        daat l = this.c.l();
        eius eiusVar2 = new eius();
        Map map = l.b;
        synchronized (map) {
            eiusVar2.k(map.keySet());
        }
        Map map2 = l.c;
        synchronized (map2) {
            eiusVar2.k(map2.keySet());
        }
        Map map3 = l.d;
        synchronized (map3) {
            eiusVar2.k(map3.keySet());
        }
        HashSet hashSet = new HashSet(eiusVar2.g());
        hashSet.removeAll(eiuuVar);
        Iterator it5 = hashSet.iterator();
        while (it5.hasNext()) {
            this.c.l().c((Account) it5.next());
        }
        this.c.i();
        Map map4 = czms.b;
        synchronized (map4) {
            G = eiuu.G(map4.keySet());
        }
        HashSet<Account> hashSet2 = new HashSet(G);
        hashSet2.removeAll(eiuuVar);
        for (Account account : hashSet2) {
            this.c.i().f(account);
            cznh.b(account.name);
        }
        if (frxq.h()) {
            enssVar = enps.f(this.c.g().q(), new eiho() { // from class: czxu
                @Override // defpackage.eiho
                public final Object apply(Object obj) {
                    czlk czlkVar = czlp.a;
                    return eiuu.G(DesugarCollections.unmodifiableMap(((czuw) obj).c).keySet());
                }
            }, this.c.m());
        } else {
            dxkm dxkmVar = this.c.g().f;
            synchronized (dxkmVar) {
                f = enps.f(dxkmVar.a(), new eiho() { // from class: czjl
                    @Override // defpackage.eiho
                    public final Object apply(Object obj) {
                        asot asotVar = czlk.a;
                        return eiuu.G(DesugarCollections.unmodifiableMap(((czuw) obj).c).keySet());
                    }
                }, enre.a);
            }
            enssVar = f;
        }
        return enps.g(ensi.h(enssVar), new enqc() { // from class: czxv
            @Override // defpackage.enqc
            public final enss a(Object obj) {
                HashSet hashSet3 = new HashSet((eiuu) obj);
                ejfg listIterator = eiuuVar.listIterator();
                while (listIterator.hasNext()) {
                    hashSet3.remove(((Account) listIterator.next()).name);
                }
                ArrayList arrayList = new ArrayList();
                Iterator it6 = hashSet3.iterator();
                while (it6.hasNext()) {
                    arrayList.add(SemanticLocationChimeraService.this.c.g().u(new Account((String) it6.next(), "com.google")));
                }
                return ensj.e(arrayList);
            }
        }, this.c.m());
    }

    @Override // com.google.android.chimera.Service
    protected final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        Base64OutputStream base64OutputStream;
        FileInputStream fileInputStream;
        String[] strArr2 = czil.a;
        ContentResolver contentResolver = AppContextProvider.a().getContentResolver();
        aqxd aqxdVar = cvzk.a;
        Uri a2 = dvmh.a("com.google.android.gms.semanticlocation");
        printWriter.println("\n===Phenotype Flag Values===");
        Cursor query = contentResolver.query(a2, czil.a, null, null, null);
        if (query != null) {
            while (query.moveToNext()) {
                try {
                    String string = query.getString(0);
                    String b2 = eiif.b(query.getString(1));
                    if (czil.b.contains(string)) {
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
        if (frxn.Q()) {
            dbpc dbpcVar = new dbpc(getApplicationContext());
            arcy arcyVar = new arcy();
            arcyVar.a = new arco() { // from class: dbos
                @Override // defpackage.arco
                public final void d(Object obj, Object obj2) {
                    dbpd dbpdVar = (dbpd) obj;
                    int i = dbpc.a;
                    dbom dbomVar = (dbom) dbpdVar.H();
                    dbpa dbpaVar = new dbpa((dfau) obj2);
                    Context context = dbpdVar.r;
                    dbomVar.a(dbpaVar, new ApiMetadata(new ComplianceOptions(-1, -1, 0, true)));
                }
            };
            arcyVar.d = 33615;
            dbpcVar.iO(arcyVar.a()).x(new czyr());
        }
        Context applicationContext = getApplicationContext();
        czlk g = this.c.g();
        asot asotVar = dazp.a;
        printWriter.println("\n===Data Transfer===");
        for (Account account : czix.d(applicationContext)) {
            printWriter.print("Account [");
            printWriter.print(account.name);
            printWriter.println("]");
            try {
                czrz a3 = dazp.a(g, account);
                printWriter.print("\tState: ");
                int b3 = eyve.b(a3.c);
                if (b3 == 0) {
                    b3 = 1;
                }
                printWriter.println(eyve.a(b3));
                if ((2 & a3.b) != 0) {
                    printWriter.print("\tStarted: ");
                    fefi fefiVar = a3.d;
                    if (fefiVar == null) {
                        fefiVar = fefi.a;
                    }
                    printWriter.println(fegx.o(fefiVar));
                }
                if (dazp.g(a3)) {
                    printWriter.print("\tCompleted: ");
                    fefi fefiVar2 = a3.e;
                    if (fefiVar2 == null) {
                        fefiVar2 = fefi.a;
                    }
                    printWriter.println(fegx.o(fefiVar2));
                } else {
                    int b4 = eyve.b(a3.c);
                    if (b4 == 0) {
                        b4 = 1;
                    }
                    int i = b4 - 1;
                    if (i == 3 || i == 5 || i == 7 || i == 8 || i == 9) {
                        printWriter.print("\tFailed: ");
                        fefi fefiVar3 = a3.f;
                        if (fefiVar3 == null) {
                            fefiVar3 = fefi.a;
                        }
                        printWriter.println(fegx.o(fefiVar3));
                    }
                }
                if (a3.h.size() > 0) {
                    for (eytc eytcVar : a3.h) {
                        printWriter.print("\tPending request: ");
                        int b5 = eytb.b(eytcVar.c);
                        if (b5 == 0) {
                            b5 = 1;
                        }
                        printWriter.println(eytb.a(b5));
                        printWriter.print("\tToken: ");
                        printWriter.println(eytcVar.d);
                    }
                }
                if (a3.i.size() > 0) {
                    for (String str : a3.i) {
                        printWriter.print("\tFile: ");
                        printWriter.println(str);
                    }
                }
                if (a3.j > 0) {
                    printWriter.print("\tDownloaded Segments Number: ");
                    printWriter.println(a3.j);
                    printWriter.print("\tDownloaded Segments Byte Size: ");
                    printWriter.println(a3.k);
                }
                if (a3.l > 0) {
                    printWriter.print("\tImported Segments Number: ");
                    printWriter.println(a3.l);
                }
            } catch (IOException e) {
                printWriter.println(e);
            }
        }
        if (frvb.a.a().a()) {
            daae daaeVar = new daae(getApplicationContext());
            File a4 = daaeVar.a();
            if (a4.exists()) {
                printWriter.println("\n===Debug Recordings===");
                File[] listFiles = a4.listFiles();
                if (listFiles != null) {
                    for (File file : listFiles) {
                        printWriter.printf("%s - %,d bytes\n", file.getName(), Long.valueOf(file.length()));
                        try {
                            base64OutputStream = new Base64OutputStream(new daad(printWriter), 16);
                            try {
                                try {
                                    fileInputStream = new FileInputStream(file);
                                } catch (FileNotFoundException e2) {
                                    ((ejhf) ((ejhf) ((ejhf) daaeVar.a.j()).s(e2)).ah(9926)).x("dump file not found");
                                } catch (IOException e3) {
                                    ((ejhf) ((ejhf) ((ejhf) daaeVar.a.j()).s(e3)).ah(9927)).x("dump input error");
                                }
                            } finally {
                            }
                        } catch (IOException e4) {
                            ((ejhf) ((ejhf) ((ejhf) daaeVar.a.j()).s(e4)).ah((char) 9925)).x("dump output error");
                        }
                        try {
                            ejtr.a(fileInputStream, base64OutputStream);
                            fileInputStream.close();
                            base64OutputStream.close();
                        } finally {
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.czyw
    public final enss e(final Account account, final long j) {
        return this.c.m().submit(new Callable() { // from class: czyg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Account account2;
                long j2;
                SemanticLocationChimeraService semanticLocationChimeraService = SemanticLocationChimeraService.this;
                daat l = semanticLocationChimeraService.c.l();
                synchronized (l.b) {
                    dabh dabhVar = l.e;
                    account2 = account;
                    j2 = j;
                    if (dabhVar != null) {
                        dabhVar.n(account2, j2);
                    }
                }
                synchronized (l.c) {
                    dabh dabhVar2 = l.e;
                    if (dabhVar2 != null) {
                        dabhVar2.p(account2, j2);
                    }
                }
                synchronized (l.d) {
                    dabh dabhVar3 = l.e;
                    if (dabhVar3 != null) {
                        dabhVar3.r(account2, fegx.h(j2));
                    }
                }
                semanticLocationChimeraService.c.i().f(account2);
                cznh.b(account2.name);
                return null;
            }
        });
    }

    @Override // defpackage.czyw
    public final enss f(final Account account) {
        return this.c.m().submit(new Callable() { // from class: czxr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                dabh dabhVar = SemanticLocationChimeraService.this.c.l().e;
                if (dabhVar == null) {
                    return null;
                }
                dabhVar.u(account);
                return null;
            }
        });
    }

    @Override // defpackage.czyw
    public final enss g(final Account account, String str, final String str2) {
        if (!this.c.j().h(account, str)) {
            account = czif.a;
        }
        return enps.f(enps.g(frxq.h() ? enps.f(ensi.h(this.c.g().q()), new czxw(), this.c.m()) : ensi.h(this.c.g().k()), new enqc() { // from class: czxx
            @Override // defpackage.enqc
            public final enss a(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    return ensj.i(czha.a(SemanticLocationState.a, 0L));
                }
                eyup eyupVar = SemanticLocationChimeraService.this.c.i().a(account).i;
                if (eyupVar == null) {
                    eyupVar = eyup.a;
                }
                return ensj.i(czie.d(eyupVar));
            }
        }, this.c.m()), new eiho() { // from class: czxy
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                return eiid.i(cziz.a((SemanticLocationState) obj, cziz.d(SemanticLocationChimeraService.this.getApplicationContext().getPackageManager(), str2)));
            }
        }, this.c.m());
    }

    @Override // defpackage.czyw
    public final enss h(final Account account, final String str, final String str2) {
        return this.c.m().submit(new Callable() { // from class: czym
            @Override // java.util.concurrent.Callable
            public final Object call() {
                boolean z;
                cznr j = SemanticLocationChimeraService.this.c.j();
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
                                if (((dabn) it2.next()).g(account2, str3, str4)) {
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

    public final enss i() {
        enss r;
        enss enssVar = b;
        if (enssVar == null) {
            final Context applicationContext = getApplicationContext();
            synchronized (this.e) {
                aqxd aqxdVar = cchm.a;
                czrf.a(applicationContext, new cchs(applicationContext), this.c.g(), this.c.f(), this.c.m()).hn(new Runnable() { // from class: czyp
                    @Override // java.lang.Runnable
                    public final void run() {
                        SemanticLocationChimeraService semanticLocationChimeraService = SemanticLocationChimeraService.this;
                        czrc.j(applicationContext, semanticLocationChimeraService.c.f());
                        semanticLocationChimeraService.c.k().c();
                    }
                }, this.c.m());
                if (frxn.a.a().aS()) {
                    aqxd aqxdVar2 = cvzk.a;
                    dfaq bs = new cwal(applicationContext).bs("com.google.android.gms.semanticlocation");
                    bs.w(this.c.m(), new dfak() { // from class: czyq
                        @Override // defpackage.dfak
                        public final void gn(Object obj) {
                            asot asotVar = SemanticLocationChimeraService.a;
                        }
                    });
                    bs.t(this.c.m(), new dfah() { // from class: czxm
                        @Override // defpackage.dfah
                        public final void gm(Exception exc) {
                            ((ejhf) ((ejhf) ((ejhf) SemanticLocationChimeraService.a.j()).s(exc)).ah((char) 9826)).B("Failed to commit phenotype configuration for %s for logged out user", "com.google.android.gms.semanticlocation");
                        }
                    });
                }
                this.c.g().D();
                o();
                r = r();
            }
            b = r;
        } else if (this.f > 0 && enssVar.isDone() && !czmf.c()) {
            this.f--;
            b = r();
        }
        enss enssVar2 = b;
        eiig.x(enssVar2);
        return enssVar2;
    }

    @Override // defpackage.czyw
    public final enss j(final Account account, final String str, final String str2, final PendingIntent pendingIntent) {
        return this.c.m().submit(new Callable() { // from class: czyj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                SemanticLocationChimeraService semanticLocationChimeraService = SemanticLocationChimeraService.this;
                cznr j = semanticLocationChimeraService.c.j();
                Account account2 = account;
                j.f(account2, str, str2, pendingIntent);
                semanticLocationChimeraService.c.i().f(account2);
                SemanticLocationChimeraService.n(semanticLocationChimeraService.getApplicationContext());
                return null;
            }
        });
    }

    @Override // defpackage.czyw
    public final enss k(final Account account, final String str, final String str2) {
        return this.c.m().submit(new Callable() { // from class: czxp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                SemanticLocationChimeraService semanticLocationChimeraService = SemanticLocationChimeraService.this;
                cznr j = semanticLocationChimeraService.c.j();
                Account account2 = account;
                j.g(account2, str, str2);
                semanticLocationChimeraService.c.i().f(account2);
                SemanticLocationChimeraService.n(semanticLocationChimeraService.getApplicationContext());
                return null;
            }
        });
    }

    @Override // defpackage.czyw
    public final enss l(final boolean z) {
        enss b2;
        final Context applicationContext = getApplicationContext();
        dxkm dxkmVar = this.c.g().f;
        synchronized (dxkmVar) {
            b2 = dxkmVar.b(new eiho() { // from class: czkf
                @Override // defpackage.eiho
                public final Object apply(Object obj) {
                    czuw czuwVar = (czuw) obj;
                    asot asotVar = czlk.a;
                    fecj fecjVar = (fecj) czuwVar.iB(5, null);
                    fecjVar.X(czuwVar);
                    czuj czujVar = (czuj) fecjVar;
                    if (!czujVar.b.L()) {
                        czujVar.U();
                    }
                    boolean z2 = z;
                    czuw czuwVar2 = (czuw) czujVar.b;
                    czuw czuwVar3 = czuw.a;
                    czuwVar2.b |= 2;
                    czuwVar2.e = z2;
                    return (czuw) czujVar.Q();
                }
            }, enre.a);
        }
        return enps.f(ensi.h(b2), new eiho() { // from class: czxz
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                SemanticLocationChimeraService.n(applicationContext);
                return null;
            }
        }, this.c.m());
    }

    public final synchronized void m(int i) {
        boolean isEmpty;
        if (this.d.get() <= 0 && !this.c.g().S() && !this.c.j().i()) {
            cznr j = this.c.j();
            synchronized (j.b) {
                isEmpty = j.e.isEmpty();
            }
            if (isEmpty) {
                stopSelf(i);
            }
        }
    }

    public final void o() {
        eitj g;
        Context applicationContext = getApplicationContext();
        if ((!this.c.g().S() && !this.c.j().i()) || (!frxq.h() ? !this.c.g().J() : !this.c.g().g().e)) {
            PendingIntent q = q(applicationContext, "com.google.android.gms.semanticlocation.ACTION_ACTIVITY");
            this.c.a();
            int i = bzgx.a;
            new caae(applicationContext).b(q);
            q.cancel();
            PendingIntent q2 = q(applicationContext, "com.google.android.gms.semanticlocation.ACTION_LOCATION");
            this.c.b();
            aqxd aqxdVar = bziq.a;
            new cabc(applicationContext).d(q2);
            q2.cancel();
            this.c.d().b(applicationContext);
            if (frxn.Z() || Build.VERSION.SDK_INT < 30 || !frxn.z()) {
                return;
            }
            this.c.c().a.c();
            return;
        }
        if (asqh.g() && (applicationContext = ModuleManager.createSubmoduleContext(this, "current_semantic_location")) == null) {
            ((ejhf) ((ejhf) a.i()).ah((char) 9839)).x("createSubmoduleContext failed");
            applicationContext = getApplicationContext();
        }
        this.c.a();
        int i2 = bzgx.a;
        caae caaeVar = new caae(applicationContext);
        PendingIntent q3 = q(applicationContext, "com.google.android.gms.semanticlocation.ACTION_ACTIVITY");
        cznr j = this.c.j();
        synchronized (j.b) {
            eius eiusVar = new eius();
            Iterator it = j.c.c().iterator();
            while (it.hasNext()) {
                eiusVar.c(((Subscription) it.next()).b.c);
            }
            Iterator it2 = j.d.iterator();
            while (it2.hasNext()) {
                eiusVar.c(((dabn) it2.next()).a.c);
            }
            eiuu g2 = eiusVar.g();
            int i3 = eitj.d;
            eite eiteVar = new eite();
            for (ApplicationInfo applicationInfo : j.f.getPackageManager().getInstalledApplications(128)) {
                if (g2.contains(applicationInfo.packageName)) {
                    int i4 = applicationInfo.uid;
                    String str = applicationInfo.packageName;
                    eiteVar.i(new ClientIdentity(applicationInfo.uid, applicationInfo.packageName));
                }
            }
            g = eiteVar.g();
        }
        bzgz bzgzVar = new bzgz();
        bzgzVar.c(czhi.b);
        bzgzVar.c = false;
        bzgzVar.e = "SemanticLocation";
        if (!g.isEmpty()) {
            WorkSource workSource = new WorkSource();
            int i5 = ((ejcb) g).c;
            for (int i6 = 0; i6 < i5; i6++) {
                ClientIdentity clientIdentity = (ClientIdentity) g.get(i6);
                asrj.e(workSource, clientIdentity.a, clientIdentity.b);
            }
            bzgzVar.d = workSource;
        }
        caaeVar.d(bzgzVar.a(), q3);
        this.c.g();
        this.c.b();
        aqxd aqxdVar2 = bziq.a;
        cabc cabcVar = new cabc(applicationContext);
        PendingIntent q4 = q(applicationContext, "com.google.android.gms.semanticlocation.ACTION_LOCATION");
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.h(102);
        locationRequest.e(czhp.b);
        locationRequest.f(czhp.c);
        locationRequest.d(czhp.d);
        cabcVar.h(new LocationRequestInternal(locationRequest, null, false, false, false, false, Long.MAX_VALUE), q4).t(enre.a, new dfah() { // from class: czyi
            @Override // defpackage.dfah
            public final void gm(Exception exc) {
                ((ejhf) ((ejhf) ((ejhf) SemanticLocationChimeraService.a.i()).s(exc)).ah((char) 9827)).x("requestBackgroundLocations failed");
            }
        });
        this.c.d().a(applicationContext, this.c.m());
        if (frxn.Z() || Build.VERSION.SDK_INT < 30 || !frxn.z()) {
            return;
        }
        czhq c = this.c.c();
        asqu asquVar = c.a;
        asquVar.c();
        asquVar.b(c);
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        if (czix.a() && frxn.P()) {
            return new czyy(this);
        }
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        this.c = new czyv(getApplicationContext());
        this.f = frxn.a.a().E();
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        super.onDestroy();
        ensv m = this.c.m();
        final czyv czyvVar = this.c;
        Objects.requireNonNull(czyvVar);
        m.execute(new Runnable() { // from class: czyd
            @Override // java.lang.Runnable
            public final void run() {
                czyv.this.q();
            }
        });
    }

    @Override // com.google.android.chimera.Service
    public final void onStart(Intent intent, int i) {
        ((ejhf) ((ejhf) a.i()).ah((char) 9832)).x("onStart shouldn't be called");
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(final Intent intent, int i, final int i2) {
        if (intent == null) {
            return 2;
        }
        this.d.getAndIncrement();
        this.c.m().submit(new Runnable() { // from class: czxs
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            @Override // java.lang.Runnable
            public final void run() {
                char c;
                long j;
                int c2;
                czsd czsdVar;
                final int intExtra;
                final SemanticLocationChimeraService semanticLocationChimeraService = SemanticLocationChimeraService.this;
                semanticLocationChimeraService.d.getAndDecrement();
                int i3 = i2;
                if (!czix.a() || !frxn.P()) {
                    semanticLocationChimeraService.stopSelf(i3);
                    return;
                }
                Intent intent2 = intent;
                if (armd.m(intent2)) {
                    czyv.o(intent2);
                    return;
                }
                if (intent2.getAction() == null) {
                    ((ejhf) ((ejhf) SemanticLocationChimeraService.a.j()).ah((char) 9822)).x("Invalid intent");
                    return;
                }
                intent2.getAction();
                String action = intent2.getAction();
                eiig.x(action);
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
                        czhi a2 = semanticLocationChimeraService.c.a();
                        if (ActivityRecognitionResult.g(intent2)) {
                            ActivityRecognitionResult.c(intent2);
                            a2.c.e("SemanticLocationActivityRecognitionResult");
                            ActivityRecognitionResult c3 = ActivityRecognitionResult.c(intent2);
                            if (c3 != null) {
                                fecj v = czrs.b.v();
                                for (DetectedActivity detectedActivity : c3.a) {
                                    int a3 = detectedActivity.a();
                                    switch (a3) {
                                        case 0:
                                            czsdVar = czsd.IN_VEHICLE;
                                            break;
                                        case 1:
                                            czsdVar = czsd.ON_BICYCLE;
                                            break;
                                        case 2:
                                            czsdVar = czsd.ON_FOOT;
                                            break;
                                        case 3:
                                            czsdVar = czsd.STILL;
                                            break;
                                        case 4:
                                            czsdVar = czsd.UNKNOWN;
                                            break;
                                        case 5:
                                            czsdVar = czsd.TILTING;
                                            break;
                                        case 6:
                                            czsdVar = czsd.EXITING_VEHICLE;
                                            break;
                                        case 7:
                                            czsdVar = czsd.WALKING;
                                            break;
                                        case 8:
                                            czsdVar = czsd.RUNNING;
                                            break;
                                        default:
                                            switch (a3) {
                                                case 16:
                                                case 19:
                                                case fwac.t /* 20 */:
                                                case fwac.u /* 21 */:
                                                    czsdVar = czsd.IN_ROAD_VEHICLE;
                                                    break;
                                                case fwac.q /* 17 */:
                                                    czsdVar = czsd.IN_RAIL_VEHICLE;
                                                    break;
                                                case 18:
                                                    czsdVar = czsd.IN_TWO_WHEELER_VEHICLE;
                                                    break;
                                                default:
                                                    ((ejhf) ((ejhf) czhi.a.j()).ah((char) 9599)).z("Unknown activity type: %d", a3);
                                                    czsdVar = czsd.UNKNOWN;
                                                    break;
                                            }
                                    }
                                    if (!v.b.L()) {
                                        v.U();
                                    }
                                    czrs czrsVar = (czrs) v.b;
                                    czsdVar.getClass();
                                    fecy fecyVar = czrsVar.d;
                                    if (!fecyVar.c()) {
                                        czrsVar.d = fecp.C(fecyVar);
                                    }
                                    czrsVar.d.i(czsdVar.m);
                                    float f = detectedActivity.e;
                                    if (!v.b.L()) {
                                        v.U();
                                    }
                                    czrs czrsVar2 = (czrs) v.b;
                                    fecx fecxVar = czrsVar2.e;
                                    if (!fecxVar.c()) {
                                        czrsVar2.e = fecp.B(fecxVar);
                                    }
                                    czrsVar2.e.h(f / 100.0f);
                                }
                                if (c3.b() != null && (c2 = bzhb.c(c3.b())) != -1) {
                                    if (!v.b.L()) {
                                        v.U();
                                    }
                                    czrs czrsVar3 = (czrs) v.b;
                                    czrsVar3.c = 2 | czrsVar3.c;
                                    czrsVar3.g = c2;
                                }
                                long j2 = c3.b;
                                if (!v.b.L()) {
                                    v.U();
                                }
                                czrs czrsVar4 = (czrs) v.b;
                                czrsVar4.c |= 1;
                                czrsVar4.f = j2;
                                final czrs czrsVar5 = (czrs) v.Q();
                                daak daakVar = a2.e;
                                Deque deque = daakVar.a;
                                synchronized (deque) {
                                    if (deque.isEmpty()) {
                                        j = 0;
                                    } else {
                                        czrs czrsVar6 = (czrs) deque.peekLast();
                                        eiig.x(czrsVar6);
                                        j = czrsVar6.f;
                                    }
                                    deque.addLast(czrsVar5);
                                    if (deque.size() != 1) {
                                        if (((czrs) eivv.p(deque)).f < j) {
                                            daakVar.d.e("CSLActivityRecordOutOfOrder");
                                            ((ejhf) ((ejhf) czir.a.h()).ah(9932)).x("New activity record out of order; sorting");
                                            ArrayList arrayList = new ArrayList(deque);
                                            deque.clear();
                                            Collections.sort(arrayList, new Comparator() { // from class: daaj
                                                @Override // java.util.Comparator
                                                public final int compare(Object obj, Object obj2) {
                                                    return Long.compare(((czrs) obj).f, ((czrs) obj2).f);
                                                }
                                            });
                                            deque.addAll(arrayList);
                                            arrayList.clear();
                                        }
                                    }
                                }
                                daae daaeVar = a2.d;
                                if (daaeVar != null) {
                                    daaeVar.c(new eiho() { // from class: czzv
                                        @Override // defpackage.eiho
                                        public final Object apply(Object obj) {
                                            fecj fecjVar = (fecj) obj;
                                            int i4 = daae.b;
                                            if (!fecjVar.b.L()) {
                                                fecjVar.U();
                                            }
                                            czrs czrsVar7 = czrs.this;
                                            czsb czsbVar = (czsb) fecjVar.b;
                                            czsb czsbVar2 = czsb.a;
                                            czrsVar7.getClass();
                                            czsbVar.f = czrsVar7;
                                            czsbVar.b |= 8;
                                            return fecjVar;
                                        }
                                    });
                                    break;
                                }
                            }
                        }
                        break;
                    case 1:
                        czhp b2 = semanticLocationChimeraService.c.b();
                        enss i4 = semanticLocationChimeraService.i();
                        ensv m = semanticLocationChimeraService.c.m();
                        if (LocationResult.d(intent2)) {
                            LocationResult c4 = LocationResult.c(intent2);
                            b2.f.e("SemanticLocationLocationResult");
                            czms czmsVar = b2.e;
                            eiig.x(c4);
                            if (i4.isDone() && czmsVar.f.g()) {
                                z = true;
                            }
                            czmsVar.d(c4.b, true, m, z);
                            break;
                        }
                        break;
                    case 2:
                        semanticLocationChimeraService.i();
                        break;
                    case 3:
                        if (bwth.a(semanticLocationChimeraService) == 0) {
                            czms i5 = semanticLocationChimeraService.c.i();
                            Map map = czms.b;
                            synchronized (map) {
                                Iterator it = map.values().iterator();
                                while (it.hasNext()) {
                                    ((czmz) it.next()).e();
                                }
                                map.clear();
                                daat daatVar = i5.d;
                                Map map2 = daatVar.b;
                                synchronized (map2) {
                                    map2.clear();
                                }
                                Map map3 = daatVar.c;
                                synchronized (map3) {
                                    map3.clear();
                                }
                                Map map4 = daatVar.d;
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
                        czms i6 = semanticLocationChimeraService.c.i();
                        Map map5 = czms.b;
                        synchronized (map5) {
                            Iterator it2 = map5.entrySet().iterator();
                            while (it2.hasNext()) {
                                Map.Entry entry = (Map.Entry) it2.next();
                                Account account = (Account) entry.getKey();
                                czmz czmzVar = (czmz) entry.getValue();
                                if (!i6.e.R(account)) {
                                    if (i6.c.j(account) && !czmzVar.l) {
                                    }
                                    czmzVar.e();
                                    it2.remove();
                                    i6.d.b(account);
                                } else if (!czmzVar.l) {
                                    czmzVar.e();
                                    it2.remove();
                                    i6.d.b(account);
                                }
                            }
                        }
                        break;
                    case 5:
                        ArrayList parcelableArrayListExtra = intent2.getParcelableArrayListExtra("accountsAdded");
                        ArrayList<Account> parcelableArrayListExtra2 = intent2.getParcelableArrayListExtra("accountsRemoved");
                        Map f2 = vks.f(intent2.getParcelableArrayExtra("accountsRenamed"));
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
                                if (fruh.c() && f2 != null && f2.containsKey(account2)) {
                                    final czuq d = semanticLocationChimeraService.c.g().d(account2);
                                    semanticLocationChimeraService.c.g().x((Account) f2.get(account2), new eiho() { // from class: czya
                                        @Override // defpackage.eiho
                                        public final Object apply(Object obj) {
                                            asot asotVar = SemanticLocationChimeraService.a;
                                            return czuq.this;
                                        }
                                    }).hn(new Runnable() { // from class: czyb
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            asot asotVar = SemanticLocationChimeraService.a;
                                        }
                                    }, enre.a);
                                }
                                semanticLocationChimeraService.c.g().u(account2).hn(new Runnable() { // from class: czyc
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        asot asotVar = SemanticLocationChimeraService.a;
                                    }
                                }, enre.a);
                                cznh.b(account2.name);
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
                        if (czmf.c()) {
                            Map map6 = czms.b;
                            synchronized (map6) {
                                Iterator it3 = map6.values().iterator();
                                while (it3.hasNext()) {
                                    ((czmz) it3.next()).h();
                                }
                            }
                            break;
                        } else {
                            ((ejhf) ((ejhf) czms.a.j()).ah((char) 9677)).x("IncrementalTimelineInferrerEnvironment not initialized");
                            break;
                        }
                    case '\b':
                        if (intent2.hasExtra("semanticlocation_mdd_version_number") && (intExtra = intent2.getIntExtra("semanticlocation_mdd_version_number", -1)) != -1) {
                            czms i7 = semanticLocationChimeraService.c.i();
                            Callable callable = new Callable() { // from class: czyf
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    enss i8;
                                    SemanticLocationChimeraService semanticLocationChimeraService2 = SemanticLocationChimeraService.this;
                                    Context applicationContext = semanticLocationChimeraService2.getApplicationContext();
                                    czlk g = semanticLocationChimeraService2.c.g();
                                    final czje f3 = semanticLocationChimeraService2.c.f();
                                    asot asotVar = czrc.a;
                                    final int i9 = intExtra;
                                    if (frxn.H()) {
                                        int i10 = eitj.d;
                                        eite eiteVar = new eite();
                                        if (frxn.H()) {
                                            try {
                                                FileInputStream f4 = czrc.f(applicationContext, "staging_semantic_location_mdd_metadata.pb");
                                                try {
                                                    fvzj fvzjVar = fvzj.a;
                                                    febe M = febe.M(f4);
                                                    febw febwVar = febw.a;
                                                    feep feepVar = feep.a;
                                                    febw febwVar2 = febw.a;
                                                    fecp x = fvzjVar.x();
                                                    try {
                                                        try {
                                                            try {
                                                                feex b3 = feep.a.b(x);
                                                                b3.l(x, febf.p(M), febwVar2);
                                                                b3.g(x);
                                                                fecp.M(x);
                                                                for (fvzk fvzkVar : ((fvzj) x).b) {
                                                                    if (!fvzkVar.d.isEmpty()) {
                                                                        eiteVar.i(fvzkVar.d);
                                                                    }
                                                                    if (!fvzkVar.e.isEmpty()) {
                                                                        eiteVar.i(fvzkVar.e);
                                                                    }
                                                                    if (!fvzkVar.f.isEmpty()) {
                                                                        eiteVar.i(fvzkVar.f);
                                                                    }
                                                                }
                                                                eiteVar.i("semantic_location_mdd_metadata.pb");
                                                                if (f4 != null) {
                                                                    f4.close();
                                                                }
                                                            } catch (IOException e) {
                                                                if (e.getCause() instanceof fedk) {
                                                                    throw ((fedk) e.getCause());
                                                                }
                                                                throw new fedk(e);
                                                            } catch (RuntimeException e2) {
                                                                if (e2.getCause() instanceof fedk) {
                                                                    throw ((fedk) e2.getCause());
                                                                }
                                                                throw e2;
                                                            }
                                                        } catch (fedk e3) {
                                                            if (e3.a) {
                                                                throw new fedk(e3);
                                                            }
                                                            throw e3;
                                                        }
                                                    } catch (fefm e4) {
                                                        throw e4.a();
                                                    }
                                                } finally {
                                                }
                                            } catch (IOException unused) {
                                                eiteVar.i("ranker.tflite");
                                                eiteVar.i("segmenter.tflite");
                                                eiteVar.i("model_bundle_metadata.pb");
                                            }
                                        } else {
                                            eiteVar.i("ranker.tflite");
                                            eiteVar.i("segmenter.tflite");
                                            eiteVar.i("model_bundle_metadata.pb");
                                        }
                                        eitj g2 = eiteVar.g();
                                        int i11 = ((ejcb) g2).c;
                                        boolean z2 = true;
                                        for (int i12 = 0; i12 < i11; i12++) {
                                            z2 &= czrc.i((String) g2.get(i12), applicationContext, f3);
                                        }
                                        if (z2) {
                                            f3.w(2, 13);
                                            i8 = enps.f(ensi.h(g.v(i9)), new eiho() { // from class: czqs
                                                @Override // defpackage.eiho
                                                public final Object apply(Object obj) {
                                                    asot asotVar2 = czrc.a;
                                                    czje czjeVar = czje.this;
                                                    czjeVar.q(i9);
                                                    czjeVar.w(2, 2);
                                                    return true;
                                                }
                                            }, enre.a);
                                        } else {
                                            ((ejhf) ((ejhf) czrc.a.j()).ah((char) 9782)).x("Deploying models failed!");
                                            f3.w(2, 12);
                                            i8 = ensj.i(false);
                                        }
                                    } else if (czrc.i("ranker.tflite", applicationContext, f3) && czrc.i("segmenter.tflite", applicationContext, f3) && czrc.i("model_bundle_metadata.pb", applicationContext, f3)) {
                                        f3.w(2, 13);
                                        i8 = enps.f(ensi.h(g.v(i9)), new eiho() { // from class: czqr
                                            @Override // defpackage.eiho
                                            public final Object apply(Object obj) {
                                                asot asotVar2 = czrc.a;
                                                czje czjeVar = czje.this;
                                                czjeVar.q(i9);
                                                czjeVar.w(2, 2);
                                                return true;
                                            }
                                        }, enre.a);
                                    } else {
                                        ((ejhf) ((ejhf) czrc.a.j()).ah((char) 9781)).x("Deploying models failed!");
                                        f3.w(2, 12);
                                        i8 = ensj.i(false);
                                    }
                                    if (!((Boolean) i8.get()).booleanValue()) {
                                        return null;
                                    }
                                    semanticLocationChimeraService2.c.k().c();
                                    return null;
                                }
                            };
                            ensv m2 = semanticLocationChimeraService.c.m();
                            List list = i7.h;
                            synchronized (list) {
                                list.add(callable);
                            }
                            i7.g(m2);
                            break;
                        }
                        break;
                    default:
                        ((ejhf) ((ejhf) SemanticLocationChimeraService.a.j()).ah((char) 9821)).B("Unexpected action %s", intent2.getAction());
                        break;
                }
                semanticLocationChimeraService.m(i3);
            }
        }).hn(new Runnable() { // from class: czxt
            @Override // java.lang.Runnable
            public final void run() {
                asot asotVar = SemanticLocationChimeraService.a;
            }
        }, enre.a);
        return 2;
    }

    @Override // defpackage.czyw
    public final enss p(final SemanticLocationParameters semanticLocationParameters, final String str) {
        final PackageManager packageManager = getApplicationContext().getPackageManager();
        return enps.f(enps.g(frxq.h() ? enps.f(enps.g(ensi.h(i()), new enqc() { // from class: czxl
            @Override // defpackage.enqc
            public final enss a(Object obj) {
                return SemanticLocationChimeraService.this.c.g().q();
            }
        }, this.c.m()), new czxw(), this.c.m()) : enps.g(ensi.h(i()), new enqc() { // from class: czyh
            @Override // defpackage.enqc
            public final enss a(Object obj) {
                return SemanticLocationChimeraService.this.c.g().k();
            }
        }, this.c.m()), new enqc() { // from class: czyk
            @Override // defpackage.enqc
            public final enss a(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    return ensj.i(czha.a(SemanticLocationState.a, 0L));
                }
                final SemanticLocationChimeraService semanticLocationChimeraService = SemanticLocationChimeraService.this;
                final Context applicationContext = semanticLocationChimeraService.getApplicationContext();
                if (asqh.g() && (applicationContext = ModuleManager.createSubmoduleContext(semanticLocationChimeraService, "current_semantic_location")) == null) {
                    ((ejhf) ((ejhf) SemanticLocationChimeraService.a.i()).ah((char) 9824)).x("createSubmoduleContext for CSL failed");
                    applicationContext = semanticLocationChimeraService.getApplicationContext();
                }
                final String str2 = str;
                final SemanticLocationParameters semanticLocationParameters2 = semanticLocationParameters;
                return igp.a(new igm() { // from class: czyn
                    @Override // defpackage.igm
                    public final Object a(igk igkVar) {
                        czxq czxqVar = new czxq(igkVar);
                        SemanticLocationParameters semanticLocationParameters3 = semanticLocationParameters2;
                        dabo daboVar = new dabo(semanticLocationParameters3, czxqVar);
                        SemanticLocationChimeraService semanticLocationChimeraService2 = SemanticLocationChimeraService.this;
                        cznr j = semanticLocationChimeraService2.c.j();
                        Lock lock = j.b;
                        String str3 = str2;
                        synchronized (lock) {
                            j.e.add(daboVar);
                        }
                        Context context = applicationContext;
                        czhp b2 = semanticLocationChimeraService2.c.b();
                        aqxd aqxdVar = bziq.a;
                        cabc cabcVar = new cabc(context);
                        enss enssVar = SemanticLocationChimeraService.b;
                        eiig.x(enssVar);
                        String str4 = semanticLocationParameters3.c;
                        PackageManager packageManager2 = context.getPackageManager();
                        com.google.android.gms.libs.identity.ClientIdentity clientIdentity = null;
                        if (frxn.a.a().aR()) {
                            try {
                                ApplicationInfo applicationInfo = packageManager2.getApplicationInfo(str4, 128);
                                clientIdentity = com.google.android.gms.libs.identity.ClientIdentity.u(applicationInfo.packageName, applicationInfo.uid, str3);
                            } catch (PackageManager.NameNotFoundException e) {
                                ((ejhf) ((ejhf) ((ejhf) SemanticLocationChimeraService.a.j()).s(e)).ah((char) 9818)).B("%s not found", str4);
                            }
                        }
                        b2.a(cabcVar, enssVar, clientIdentity, semanticLocationChimeraService2.c.m());
                        return "SemanticLocationService.estimateCurrentSemanticLocation";
                    }
                });
            }
        }, this.c.m()), new eiho() { // from class: czyl
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                asot asotVar = SemanticLocationChimeraService.a;
                return eiid.i(cziz.a((SemanticLocationState) obj, cziz.d(packageManager, semanticLocationParameters.c)));
            }
        }, this.c.m());
    }
}
