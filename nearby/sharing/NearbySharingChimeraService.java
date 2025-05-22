package com.google.android.gms.nearby.sharing;

import android.accounts.Account;
import android.app.PendingIntent;
import android.app.backup.BackupManager;
import android.content.BroadcastReceiver;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.database.Cursor;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.PowerManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.provider.ContactsContract;
import android.provider.Settings;
import android.text.SpannedString;
import android.text.TextUtils;
import android.util.ArraySet;
import com.google.android.chimera.TileService;
import com.google.android.gms.R;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.nearby.sharing.Attachment;
import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TransferMetadata;
import com.google.android.gms.nearby.sharing.database.QuickShareRoomDatabase;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.a;
import defpackage.acs;
import defpackage.aszx;
import defpackage.atee;
import defpackage.atwu;
import defpackage.aupx;
import defpackage.auti;
import defpackage.auub;
import defpackage.bsj;
import defpackage.bzlt;
import defpackage.bzlv;
import defpackage.bzlw;
import defpackage.bzna;
import defpackage.bzoz;
import defpackage.caqj;
import defpackage.chdw;
import defpackage.cheb;
import defpackage.chei;
import defpackage.chem;
import defpackage.chen;
import defpackage.cheq;
import defpackage.chet;
import defpackage.chhe;
import defpackage.chhr;
import defpackage.chhu;
import defpackage.chig;
import defpackage.chiy;
import defpackage.chiz;
import defpackage.chjt;
import defpackage.chke;
import defpackage.chkp;
import defpackage.chkq;
import defpackage.chku;
import defpackage.chkv;
import defpackage.clxl;
import defpackage.cmsc;
import defpackage.cntk;
import defpackage.cnub;
import defpackage.cnuw;
import defpackage.cnxa;
import defpackage.cnxo;
import defpackage.cnyn;
import defpackage.cnzh;
import defpackage.cnzj;
import defpackage.cnzu;
import defpackage.coab;
import defpackage.coet;
import defpackage.coeu;
import defpackage.coew;
import defpackage.coex;
import defpackage.coey;
import defpackage.coez;
import defpackage.cofa;
import defpackage.cofp;
import defpackage.cofq;
import defpackage.cokd;
import defpackage.coke;
import defpackage.coki;
import defpackage.cokk;
import defpackage.cokr;
import defpackage.coks;
import defpackage.colj;
import defpackage.colp;
import defpackage.colq;
import defpackage.colr;
import defpackage.comd;
import defpackage.conm;
import defpackage.cont;
import defpackage.cood;
import defpackage.coog;
import defpackage.coor;
import defpackage.cpay;
import defpackage.cpbz;
import defpackage.cpcg;
import defpackage.cqrl;
import defpackage.cqrm;
import defpackage.cqrn;
import defpackage.cqrp;
import defpackage.cqrs;
import defpackage.cqrt;
import defpackage.cqsl;
import defpackage.cqsm;
import defpackage.cqyx;
import defpackage.craf;
import defpackage.crbi;
import defpackage.csbr;
import defpackage.csrr;
import defpackage.ctup;
import defpackage.ctuq;
import defpackage.ctur;
import defpackage.ctut;
import defpackage.ctvb;
import defpackage.ctvc;
import defpackage.ctvd;
import defpackage.ctvg;
import defpackage.ctvl;
import defpackage.ctvn;
import defpackage.ctvt;
import defpackage.ctvw;
import defpackage.ctvz;
import defpackage.ctwa;
import defpackage.ctwo;
import defpackage.ctwt;
import defpackage.ctwy;
import defpackage.ctxa;
import defpackage.ctxd;
import defpackage.ctxh;
import defpackage.dhln;
import defpackage.dhlq;
import defpackage.dhlw;
import defpackage.dhma;
import defpackage.dhmf;
import defpackage.dhmr;
import defpackage.dyph;
import defpackage.ekti;
import defpackage.ekut;
import defpackage.ekvk;
import defpackage.ekvl;
import defpackage.ekvm;
import defpackage.ekwo;
import defpackage.ekww;
import defpackage.ekxc;
import defpackage.ekxd;
import defpackage.elcw;
import defpackage.elgo;
import defpackage.elgx;
import defpackage.elhz;
import defpackage.elja;
import defpackage.elpp;
import defpackage.elsn;
import defpackage.eluo;
import defpackage.eqcy;
import defpackage.eqex;
import defpackage.eqgb;
import defpackage.eqgc;
import defpackage.eqgo;
import defpackage.eqhc;
import defpackage.ezuh;
import defpackage.fall;
import defpackage.falq;
import defpackage.faly;
import defpackage.fanc;
import defpackage.fand;
import defpackage.fans;
import defpackage.fatb;
import defpackage.fauu;
import defpackage.fauy;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.flml;
import defpackage.ftdn;
import defpackage.ftfn;
import defpackage.ftga;
import defpackage.ftgf;
import defpackage.ftgh;
import defpackage.ftgi;
import defpackage.ftgk;
import defpackage.fxwo;
import defpackage.iia;
import defpackage.ilr;
import defpackage.ind;
import defpackage.itn;
import defpackage.juq;
import defpackage.jvc;
import defpackage.jxc;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class NearbySharingChimeraService extends cofq implements jvc {
    public static final /* synthetic */ int ad = 0;
    private static final Charset ae = StandardCharsets.UTF_8;
    public cpcg A;
    public boolean B;
    cheb C;
    public ScheduledExecutorService D;
    public flml E;
    public cpbz F;
    public cofp G;
    public boolean H;
    public final Context I;
    public PowerManager J;
    public colj K;

    @Deprecated
    public final Map L;

    @Deprecated
    public itn M;
    public final chem N;
    public final chem O;
    public final chem P;
    public final Map Q;
    public ContentObserver R;
    public final coex S;
    public Intent T;
    public final atwu U;
    public boolean V;
    public final cood W;
    public boolean X;
    public ekww Y;
    public final ekww Z;
    cqrs a;
    private cheb aA;
    private cheb aB;
    private long aC;
    private BroadcastReceiver aD;
    private BroadcastReceiver aE;
    private BroadcastReceiver aF;
    private BroadcastReceiver aG;
    private BroadcastReceiver aH;
    private DisplayManager.DisplayListener aI;
    private BroadcastReceiver aJ;
    private BroadcastReceiver aK;
    private BroadcastReceiver aL;
    private BroadcastReceiver aM;
    private BroadcastReceiver aN;
    private ctvg aO;
    private BroadcastReceiver aP;
    private BroadcastReceiver aQ;
    private BroadcastReceiver aR;
    private BroadcastReceiver aS;
    private BroadcastReceiver aT;
    private BroadcastReceiver aU;
    private ContentObserver aV;
    private ContentObserver aW;
    private final jxc aX;
    private final ekww aY;
    public cnub aa;
    public flml ab;
    public flml ac;
    private int af;
    private cqyx ag;
    private cqrp ah;
    private int ai;

    @Deprecated
    private boolean aj;

    @Deprecated
    private boolean ak;

    @Deprecated
    private boolean al;

    @Deprecated
    private boolean am;
    private boolean an;
    private boolean ao;
    private final Map ap;
    private int aq;
    private boolean ar;
    private boolean as;
    private boolean at;
    private boolean au;
    private boolean av;
    private boolean aw;
    private boolean ax;
    private final ScheduledExecutorService ay;
    private ScheduledExecutorService az;
    public cqrt b;
    public cqrl c;
    public csrr d;
    public comd m;
    public final chem n;
    public final chem o;
    public final Set p;
    public final Map q;
    public volatile itn r;
    cqrs s;
    cmsc t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public final Map y;
    public QrCodeMetadata z;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    /* renamed from: com.google.android.gms.nearby.sharing.NearbySharingChimeraService$1, reason: invalid class name */
    public class AnonymousClass1 extends TracingBroadcastReceiver {
        public AnonymousClass1() {
            super("nearby", "AccountReceiver");
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jP(Context context, final Intent intent) {
            NearbySharingChimeraService.this.ae(new Runnable() { // from class: cnyx
                @Override // java.lang.Runnable
                public final void run() {
                    Intent intent2 = intent;
                    if (Objects.equals(intent2.getAction(), "com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE")) {
                        NearbySharingChimeraService.AnonymousClass1 anonymousClass1 = NearbySharingChimeraService.AnonymousClass1.this;
                        if (intent2.hasCategory("com.google.android.gms.auth.category.ACCOUNT_ADDED")) {
                            List a = xgt.a(intent2);
                            NearbySharingChimeraService nearbySharingChimeraService = NearbySharingChimeraService.this;
                            Account c = nearbySharingChimeraService.c.c();
                            if (!a.isEmpty() && c == null) {
                                nearbySharingChimeraService.ah();
                            }
                            nearbySharingChimeraService.aJ();
                            nearbySharingChimeraService.V();
                            if (ftgi.q()) {
                                nearbySharingChimeraService.W();
                            }
                        }
                        if (intent2.hasCategory("com.google.android.gms.auth.category.ACCOUNT_REMOVED")) {
                            List d = xgt.d(intent2);
                            NearbySharingChimeraService nearbySharingChimeraService2 = NearbySharingChimeraService.this;
                            Account c2 = nearbySharingChimeraService2.c.c();
                            if (!d.isEmpty() && c2 != null) {
                                Iterator it = d.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    Account account = (Account) it.next();
                                    if (c2.name.equals(account.name)) {
                                        nearbySharingChimeraService2.ah();
                                        ctuq.k(nearbySharingChimeraService2, account, "nearby_sharing_account_metadata");
                                        ctwo.l(nearbySharingChimeraService2.I, account.name);
                                        break;
                                    }
                                }
                            }
                            nearbySharingChimeraService2.aJ();
                            nearbySharingChimeraService2.V();
                            if (ftgi.q()) {
                                nearbySharingChimeraService2.W();
                            }
                        }
                    }
                }
            });
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    /* renamed from: com.google.android.gms.nearby.sharing.NearbySharingChimeraService$10, reason: invalid class name */
    public class AnonymousClass10 extends TracingBroadcastReceiver {
        public AnonymousClass10() {
            super("nearby", "NearbyNotificationsReceiver");
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jP(Context context, Intent intent) {
            if (Objects.equals(intent.getStringExtra("channel_id"), "nearby_sharing_alert")) {
                NearbySharingChimeraService.this.af(new Runnable() { // from class: cnyy
                    @Override // java.lang.Runnable
                    public final void run() {
                        NearbySharingChimeraService nearbySharingChimeraService = NearbySharingChimeraService.this;
                        nearbySharingChimeraService.aq();
                        conm.a.b().p("Stopping FastInitiation scanning because sharing HUN is dismissed over timeout.", new Object[0]);
                        nearbySharingChimeraService.W();
                    }
                }, ftga.J() + 1000);
            }
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    /* renamed from: com.google.android.gms.nearby.sharing.NearbySharingChimeraService$11, reason: invalid class name */
    public class AnonymousClass11 extends TracingBroadcastReceiver {
        public AnonymousClass11() {
            super("nearby", "LowStorageReceiver");
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jP(final Context context, Intent intent) {
            NearbySharingChimeraService.this.ae(new Runnable() { // from class: cnyz
                @Override // java.lang.Runnable
                public final void run() {
                    NearbySharingChimeraService nearbySharingChimeraService = NearbySharingChimeraService.this;
                    if (nearbySharingChimeraService.aI()) {
                        return;
                    }
                    ctvz.e(context, nearbySharingChimeraService.C(false));
                }
            });
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    /* renamed from: com.google.android.gms.nearby.sharing.NearbySharingChimeraService$12, reason: invalid class name */
    public class AnonymousClass12 extends TracingBroadcastReceiver {
        public AnonymousClass12() {
            super("nearby", "ConnectionStateReceiver");
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jP(Context context, final Intent intent) {
            NearbySharingChimeraService.this.ae(new Runnable() { // from class: cnza
                @Override // java.lang.Runnable
                public final void run() {
                    NearbySharingChimeraService.this.at(intent.getBooleanExtra("HAS_24GHZ_WIFI_CONNECTION", false));
                }
            });
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    /* renamed from: com.google.android.gms.nearby.sharing.NearbySharingChimeraService$13, reason: invalid class name */
    public class AnonymousClass13 extends TracingBroadcastReceiver {
        public AnonymousClass13() {
            super("nearby", "AirplaneModeReceiver");
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jP(Context context, Intent intent) {
            NearbySharingChimeraService.this.ae(new Runnable() { // from class: cnzb
                @Override // java.lang.Runnable
                public final void run() {
                    NearbySharingChimeraService.this.au();
                }
            });
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    /* renamed from: com.google.android.gms.nearby.sharing.NearbySharingChimeraService$14, reason: invalid class name */
    public class AnonymousClass14 extends TracingBroadcastReceiver {
        public AnonymousClass14() {
            super("nearby", "WifiChangeReceiver");
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jP(Context context, final Intent intent) {
            NearbySharingChimeraService.this.ae(new Runnable() { // from class: cnzc
                @Override // java.lang.Runnable
                public final void run() {
                    Intent intent2 = intent;
                    if (intent2.getAction() == null) {
                        return;
                    }
                    final NearbySharingChimeraService.AnonymousClass14 anonymousClass14 = NearbySharingChimeraService.AnonymousClass14.this;
                    int intExtra = intent2.getIntExtra("wifi_state", -1);
                    if (intExtra == 3) {
                        NearbySharingChimeraService.this.au();
                    } else if (intExtra == 1) {
                        NearbySharingChimeraService.this.af(new Runnable() { // from class: cnzd
                            @Override // java.lang.Runnable
                            public final void run() {
                                NearbySharingChimeraService.this.au();
                            }
                        }, ftga.a.lK().aH());
                    }
                }
            });
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    /* renamed from: com.google.android.gms.nearby.sharing.NearbySharingChimeraService$15, reason: invalid class name */
    public class AnonymousClass15 extends TracingBroadcastReceiver {
        public AnonymousClass15() {
            super("nearby", "LocaleChangeReceiver");
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jP(Context context, Intent intent) {
            NearbySharingChimeraService.this.ae(new Runnable() { // from class: cnze
                @Override // java.lang.Runnable
                public final void run() {
                    NearbySharingChimeraService.this.au();
                }
            });
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    /* renamed from: com.google.android.gms.nearby.sharing.NearbySharingChimeraService$16, reason: invalid class name */
    public class AnonymousClass16 extends TracingBroadcastReceiver {
        public AnonymousClass16() {
            super("nearby", "ServerSyncReceiver");
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jP(final Context context, Intent intent) {
            NearbySharingChimeraService.this.ae(new Runnable() { // from class: cnzf
                /* JADX WARN: Removed duplicated region for block: B:10:0x02c0  */
                /* JADX WARN: Removed duplicated region for block: B:40:0x0102  */
                /* JADX WARN: Removed duplicated region for block: B:43:0x0120  */
                /* JADX WARN: Removed duplicated region for block: B:46:0x013c  */
                /* JADX WARN: Removed duplicated region for block: B:49:0x0156  */
                /* JADX WARN: Removed duplicated region for block: B:52:0x016e  */
                /* JADX WARN: Removed duplicated region for block: B:55:0x0186  */
                /* JADX WARN: Removed duplicated region for block: B:58:0x019e  */
                /* JADX WARN: Removed duplicated region for block: B:61:0x01b4  */
                /* JADX WARN: Removed duplicated region for block: B:73:0x0200  */
                /* JADX WARN: Removed duplicated region for block: B:88:0x024a  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x02bf A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:91:0x0279  */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void run() {
                    /*
                        Method dump skipped, instructions count: 787
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.cnzf.run():void");
                }
            });
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    /* renamed from: com.google.android.gms.nearby.sharing.NearbySharingChimeraService$19, reason: invalid class name */
    public class AnonymousClass19 extends TracingBroadcastReceiver {
        public AnonymousClass19() {
            super("nearby", "CertificatesRegenerationReceiver");
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jP(Context context, Intent intent) {
            NearbySharingChimeraService.this.ae(new Runnable() { // from class: cnzk
                @Override // java.lang.Runnable
                public final void run() {
                    conm.a.b().p("Received broadcast that certificates are regenerating. Refreshing receive surface state", new Object[0]);
                    NearbySharingChimeraService nearbySharingChimeraService = NearbySharingChimeraService.this;
                    nearbySharingChimeraService.ap();
                    nearbySharingChimeraService.U();
                }
            });
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    /* renamed from: com.google.android.gms.nearby.sharing.NearbySharingChimeraService$2, reason: invalid class name */
    public class AnonymousClass2 extends TracingBroadcastReceiver {
        public AnonymousClass2() {
            super("nearby", "PowerSaveReceiver");
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jP(Context context, Intent intent) {
            NearbySharingChimeraService.this.ae(new Runnable() { // from class: cnzl
                @Override // java.lang.Runnable
                public final void run() {
                    NearbySharingChimeraService nearbySharingChimeraService = NearbySharingChimeraService.this;
                    nearbySharingChimeraService.aj(nearbySharingChimeraService.J.isPowerSaveMode());
                }
            });
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    /* renamed from: com.google.android.gms.nearby.sharing.NearbySharingChimeraService$20, reason: invalid class name */
    public class AnonymousClass20 extends TracingBroadcastReceiver {
        public AnonymousClass20() {
            super("nearby", "ConstellationAcceptanceReceiver");
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jP(final Context context, Intent intent) {
            NearbySharingChimeraService.this.ae(new Runnable() { // from class: cnzm
                @Override // java.lang.Runnable
                public final void run() {
                    conm.a.b().p("Received broadcast that user has accepted Constellation consent. Refreshing cached phone numbers.", new Object[0]);
                    ctwo.j(context);
                    NearbySharingChimeraService.this.m.b();
                }
            });
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    /* renamed from: com.google.android.gms.nearby.sharing.NearbySharingChimeraService$3, reason: invalid class name */
    public class AnonymousClass3 extends TracingBroadcastReceiver {
        public AnonymousClass3() {
            super("nearby", "ScreenStateReceiver");
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jP(final Context context, Intent intent) {
            NearbySharingChimeraService.this.ae(new Runnable() { // from class: cnzz
                @Override // java.lang.Runnable
                public final void run() {
                    NearbySharingChimeraService.this.ak(ctwt.j(context));
                }
            });
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    /* renamed from: com.google.android.gms.nearby.sharing.NearbySharingChimeraService$5, reason: invalid class name */
    public class AnonymousClass5 extends TracingBroadcastReceiver {
        public AnonymousClass5() {
            super("nearby", "LocationChangeReceiver");
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jP(final Context context, Intent intent) {
            NearbySharingChimeraService.this.ae(new Runnable() { // from class: coac
                @Override // java.lang.Runnable
                public final void run() {
                    NearbySharingChimeraService.this.ai(ezuc.b(context));
                }
            });
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    /* renamed from: com.google.android.gms.nearby.sharing.NearbySharingChimeraService$6, reason: invalid class name */
    public class AnonymousClass6 extends TracingBroadcastReceiver {
        public AnonymousClass6() {
            super("nearby", "BluetoothChangeReceier");
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jP(final Context context, Intent intent) {
            NearbySharingChimeraService.this.ae(new Runnable() { // from class: coad
                @Override // java.lang.Runnable
                public final void run() {
                    NearbySharingChimeraService.this.ag(ctvb.g(context));
                }
            });
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    /* renamed from: com.google.android.gms.nearby.sharing.NearbySharingChimeraService$7, reason: invalid class name */
    public class AnonymousClass7 extends TracingBroadcastReceiver {
        public AnonymousClass7() {
            super("nearby", "BleChangeReceiver");
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jP(Context context, Intent intent) {
            NearbySharingChimeraService.this.ae(new Runnable() { // from class: coae
                @Override // java.lang.Runnable
                public final void run() {
                    NearbySharingChimeraService.this.W();
                }
            });
        }
    }

    public NearbySharingChimeraService() {
        super(194, "com.google.android.gms.nearby.sharing.START_SERVICE", elpp.a, 3, 9);
        this.a = null;
        this.af = -1;
        this.n = new chem((int) ftga.Q());
        this.o = new chem((int) ftga.Q());
        this.p = new HashSet();
        this.q = new bsj();
        this.s = null;
        this.ai = -1;
        this.aj = false;
        this.ak = false;
        this.al = false;
        this.am = false;
        this.u = false;
        this.v = false;
        this.w = false;
        this.an = false;
        this.x = false;
        this.ao = false;
        this.y = new bsj();
        this.ap = new bsj();
        this.aq = 0;
        this.z = null;
        this.ar = false;
        this.as = false;
        this.ay = chkv.f();
        this.D = chkv.f();
        this.H = false;
        this.I = new acs(this, R.style.Sharing_ShareSheet);
        this.L = new bsj();
        this.N = new chem((int) ftga.Q());
        this.O = new chem((int) ftga.Q());
        this.P = new chem((int) ftga.Q());
        this.Q = new ConcurrentHashMap();
        this.aV = null;
        this.aW = null;
        this.R = null;
        this.S = new coex();
        this.W = new cood(this);
        this.Z = ekxd.a(new ekww() { // from class: cnxs
            @Override // defpackage.ekww
            public final Object lK() {
                return QuickShareRoomDatabase.m.a(NearbySharingChimeraService.this.I);
            }
        });
        this.aX = new jxc(this);
        this.aY = ekxd.a(new ekww() { // from class: cnxt
            @Override // defpackage.ekww
            public final Object lK() {
                return new BackupManager(NearbySharingChimeraService.this);
            }
        });
        this.U = new atwu(Integer.MAX_VALUE, ftga.i(), ftga.i(), TimeUnit.MILLISECONDS);
    }

    public static String G(int i) {
        return i != 0 ? i != 1 ? i != 2 ? a.l(i, "UNKNOWN[", "]") : "FOREGROUND INSTALL" : "FOREGROUND" : "BACKGROUND";
    }

    public static String H(Object obj) {
        return Integer.toString(Math.abs((int) ((short) obj.hashCode())));
    }

    public static void Z(String str, String str2, atee ateeVar, Callable callable) {
        String str3;
        int i = 13;
        if (ftga.be()) {
            try {
                i = ((Integer) callable.call()).intValue();
            } catch (Exception e) {
                conm.a.e().f(e).i("Exception while executing NearbySharingService call %s for calling package %s.", str2, str);
            }
        }
        Status status = new Status(i);
        if (!status.e()) {
            chet e2 = conm.a.e();
            switch (i) {
                case 35500:
                    str3 = "STATUS_ALREADY_IN_DESIRED_STATE";
                    break;
                case 35501:
                    str3 = "STATUS_DISABLED";
                    break;
                case 35502:
                    str3 = "STATUS_ALREADY_STOPPED";
                    break;
                case 35503:
                    str3 = "STATUS_RESET";
                    break;
                case 35504:
                    str3 = "STATUS_AT_MOST_ONE_FOREGROUND_RECEIVE_SURFACE_ALLOWED";
                    break;
                case 35505:
                    str3 = "STATUS_ACCOUNT_NOT_LOGGED_IN";
                    break;
                case 35506:
                    str3 = "STATUS_DISK_IO_ERROR";
                    break;
                case 35507:
                    str3 = "STATUS_CONTACT_ALREADY_EXISTS";
                    break;
                case 35508:
                    str3 = "STATUS_CONTACT_DOES_NOT_EXIST";
                    break;
                case 35509:
                    str3 = "STATUS_ACTIVITY_NOT_FOUND";
                    break;
                case 35510:
                    str3 = "STATUS_NETWORK_IO_ERROR";
                    break;
                case 35511:
                    str3 = "STATUS_OUT_OF_ORDER_API_CALL";
                    break;
                case 35512:
                    str3 = "STATUS_AT_MOST_ONE_FOREGROUND_SEND_SURFACE_ALLOWED";
                    break;
                case 35513:
                    str3 = "STATUS_ACCESS_DENIED";
                    break;
                case 35514:
                    str3 = "STATUS_MEDIA_UNAVAILABLE";
                    break;
                case 35515:
                    str3 = "STATUS_TRANSFER_ALREADY_IN_PROGRESS";
                    break;
                case 35516:
                    str3 = "STATUS_API_NOT_SUPPORTED";
                    break;
                case 35517:
                    str3 = "STATUS_INTENT_IS_NULL";
                    break;
                case 35518:
                    str3 = "STATUS_QR_CODE_RECEIVE_NOT_ALLOWED";
                    break;
                default:
                    str3 = aszx.d(i);
                    break;
            }
            e2.j("NearbySharingService call %s returned nonzero status code for calling package %s: %s", str2, str, str3);
        }
        try {
            ateeVar.a(status);
        } catch (RemoteException e3) {
            conm.a.e().f(e3).p("Failed to invoke IStatusCallback.", new Object[0]);
        }
    }

    public static final boolean aK(int i, int i2) {
        return i != 1 ? i == 3 && i2 == 9 : i2 == 9 || i2 == 12;
    }

    public static final void aL(Runnable runnable) {
        new aupx(9, runnable).start();
    }

    public static int aO(Context context, Account account) {
        cntk cntkVar;
        if (ftgf.j()) {
            try {
                Map map = (Map) ((eqcy) ctwo.b(context)).v(ftga.af(), TimeUnit.MILLISECONDS);
                if (map.isEmpty()) {
                    return 2;
                }
                if (account != null && (cntkVar = (cntk) map.get(account.name)) != null) {
                    if (!cntkVar.c.isEmpty()) {
                        return 4;
                    }
                }
                return 3;
            } catch (AssertionError e) {
                e = e;
                conm.a.e().f(e).p("getIdentityVerification: failed to read cached reachable phone numbers.", new Object[0]);
                return 1;
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                conm.a.e().f(e2).p("getIdentityVerification: failed to read cached reachable phone numbers.", new Object[0]);
            } catch (ExecutionException e3) {
                e = e3;
                conm.a.e().f(e).p("getIdentityVerification: failed to read cached reachable phone numbers.", new Object[0]);
                return 1;
            } catch (TimeoutException e4) {
                e = e4;
                conm.a.e().f(e).p("getIdentityVerification: failed to read cached reachable phone numbers.", new Object[0]);
                return 1;
            }
        }
        return 1;
    }

    private final int aS() {
        if (aE()) {
            return this.ah.b.a;
        }
        return -1;
    }

    private final QrCodeMetadata aT() {
        Iterator it = this.n.e().iterator();
        while (it.hasNext()) {
            QrCodeMetadata qrCodeMetadata = ((coey) it.next()).d;
            if (qrCodeMetadata != null) {
                return qrCodeMetadata;
            }
        }
        return null;
    }

    private final elgo aU() {
        return this.S.e();
    }

    private final Integer aV() {
        Iterator it = this.n.e().iterator();
        Integer num = null;
        while (it.hasNext()) {
            Integer num2 = ((coey) it.next()).c;
            if (num2 != null) {
                if (num == null) {
                    num = num2;
                } else {
                    int intValue = num.intValue();
                    int intValue2 = num2.intValue();
                    if (bt(intValue) <= bt(intValue2)) {
                        intValue = intValue2;
                    }
                    num = Integer.valueOf(intValue);
                }
            }
        }
        return num;
    }

    private final String aW(String str) {
        CharSequence filter = new ezuh(getResources().getInteger(R.integer.sharing_max_name_length_bytes)).filter(str, 0, str.length(), new SpannedString(""), 0, 0);
        return filter != null ? filter.toString() : str;
    }

    private final List aX(Integer... numArr) {
        ArrayList arrayList = new ArrayList();
        chem chemVar = this.n;
        elhz H = elhz.H(numArr);
        for (Map.Entry entry : chemVar.d()) {
            if (H.contains(Integer.valueOf(((coey) entry.getValue()).a))) {
                arrayList.add((cokk) entry.getKey());
            }
        }
        return arrayList;
    }

    private final void aY() {
        int i = 0;
        if (ftgi.D()) {
            elgo i2 = elgo.i(this.P.e());
            int size = i2.size();
            for (int i3 = 0; i3 < size; i3++) {
                c(((cofa) i2.get(i3)).a);
            }
            elgo i4 = elgo.i(this.O.e());
            int size2 = i4.size();
            while (i < size2) {
                c(((cofa) i4.get(i)).a);
                i++;
            }
            return;
        }
        itn itnVar = this.M;
        if (itnVar != null) {
            c((ShareTarget) itnVar.a);
            ba();
            this.M = null;
        }
        Map map = this.L;
        elgo i5 = elgo.i(map.keySet());
        if (i5.isEmpty()) {
            return;
        }
        int size3 = i5.size();
        while (i < size3) {
            c((ShareTarget) i5.get(i));
            i++;
        }
        ba();
        map.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0181  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void aZ() {
        /*
            Method dump skipped, instructions count: 1303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.nearby.sharing.NearbySharingChimeraService.aZ():void");
    }

    private final void ba() {
        final String str;
        this.aj = false;
        this.al = false;
        this.ak = false;
        if (!aI()) {
            final cpbz cpbzVar = this.F;
            if (cpbzVar.d != null) {
                Map map = cpbzVar.e;
                long size = map.size();
                ftga ftgaVar = ftga.a;
                if (size <= ftgaVar.lK().av() && cpbzVar.a() <= 1 && (str = cpbzVar.d) != null) {
                    ScheduledFuture scheduledFuture = (ScheduledFuture) map.get(str);
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(true);
                    }
                    map.put(str, ((chku) cpbzVar.a).schedule(new Runnable() { // from class: cpbo
                        @Override // java.lang.Runnable
                        public final void run() {
                            cpbz.this.e(str);
                        }
                    }, ftgaVar.lK().aw(), TimeUnit.MILLISECONDS));
                }
            }
            L();
            this.u = true;
            af(new Runnable() { // from class: cnyd
                @Override // java.lang.Runnable
                public final void run() {
                    NearbySharingChimeraService nearbySharingChimeraService = NearbySharingChimeraService.this;
                    nearbySharingChimeraService.u = false;
                    nearbySharingChimeraService.W();
                }
            }, ftga.ax());
        }
        chke.e(this, "com.google.android.gms.nearby.sharing.TRANSFER_FINISHED");
        conm.a.b().p("Broadcasting NearbySharing state change transfer finished", new Object[0]);
    }

    private final void bb(boolean z) {
        this.aj = true;
        if (z) {
            this.ak = true;
        } else {
            this.al = true;
        }
        W();
    }

    private final void bc() {
        if (this.as || this.aD == null) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.gms.nearby.sharing.SYNC_SERVER");
        if (aA() || br()) {
            chke.b(this, this.aD, intentFilter);
            this.as = true;
        }
    }

    private final boolean bd() {
        if (this.au) {
            return false;
        }
        return ftgf.D();
    }

    private final boolean be() {
        return this.aw && !this.ax;
    }

    private final boolean bf() {
        return bj(2);
    }

    private final boolean bg() {
        return !this.n.l();
    }

    private final boolean bh(Integer... numArr) {
        chem chemVar = this.n;
        elhz H = elhz.H(numArr);
        Iterator it = chemVar.e().iterator();
        while (it.hasNext()) {
            if (H.contains(Integer.valueOf(((coey) it.next()).a))) {
                return true;
            }
        }
        return false;
    }

    private final boolean bi() {
        return !this.o.l();
    }

    private final boolean bj(Integer... numArr) {
        return !Collections.disjoint(new elcw(this.o.e(), new ekut() { // from class: cnxf
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                int i = ((coez) obj).b;
                int i2 = NearbySharingChimeraService.ad;
                return Integer.valueOf(i);
            }
        }), elhz.H(numArr));
    }

    private final boolean bk() {
        return this.s != null;
    }

    private final boolean bl() {
        ftga.bk();
        ftgf ftgfVar = ftgf.a;
        if (ftgfVar.lK().H() && this.au) {
            return false;
        }
        return (!ftgfVar.lK().G() || chen.i(this)) && ftgf.I() && v() != null;
    }

    private final boolean bm() {
        return bd() && this.a == cqrs.BACKGROUND;
    }

    private final boolean bn() {
        return ftgi.D() ? elja.d(this.O.e(), new ekvm() { // from class: cnyh
            @Override // defpackage.ekvm
            public final boolean a(Object obj) {
                int i = NearbySharingChimeraService.ad;
                return ((cofa) obj).b.a != 1001;
            }
        }).iterator().hasNext() : this.am;
    }

    private final boolean bo() {
        return bd() ? this.a == cqrs.FOREGROUND : aE();
    }

    private final boolean bp() {
        return Settings.Global.getInt(getContentResolver(), "device_provisioned", 0) == 1;
    }

    private final boolean bq(ShareTarget shareTarget) {
        cofa cofaVar;
        cofa cofaVar2;
        if (shareTarget.f) {
            chem chemVar = this.P;
            Long valueOf = Long.valueOf(shareTarget.a);
            return chemVar.k(valueOf) && (cofaVar2 = (cofa) chemVar.a(valueOf)) != null && cofaVar2.c;
        }
        chem chemVar2 = this.O;
        Long valueOf2 = Long.valueOf(shareTarget.a);
        if (chemVar2.k(valueOf2) && (cofaVar = (cofa) chemVar2.a(valueOf2)) != null && cofaVar.c) {
            return true;
        }
        return false;
    }

    private final boolean br() {
        Context context = this.I;
        return ctuq.n(context) && chen.i(context) && !aA() && !ctwa.c(context) && this.c.b() < 2;
    }

    private final eqgb bs(final int i) {
        return ftgi.a.lK().Z() ? eqgb.h(((eqgo) Objects.requireNonNull((eqgo) this.E.a())).submit(new Callable() { // from class: cnxe
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(NearbySharingChimeraService.this.f(i));
            }
        })) : eqgb.h(eqgc.i(Integer.valueOf(f(i))));
    }

    private static final int bt(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 3;
        }
        int i2 = 2;
        if (i != 2) {
            i2 = 4;
            if (i != 3) {
                return i != 4 ? -1 : 1;
            }
        }
        return i2;
    }

    private static final void bu(ShareTarget shareTarget, TransferMetadata transferMetadata) {
        if (!ftgf.K() || shareTarget.g().isEmpty() || transferMetadata.a == 1019) {
            return;
        }
        coke f = ((StreamAttachment) shareTarget.g().get(0)).f();
        f.d = null;
        f.b = null;
        f.c = null;
        StreamAttachment b = f.b();
        shareTarget.o();
        shareTarget.l(b);
    }

    private static final int bv(int i, int i2) {
        return bt(i) > bt(i2) ? i2 : i;
    }

    private final void bw(boolean z) {
        TransferMetadata transferMetadata;
        cofa cofaVar;
        cofa cofaVar2;
        if (!aE()) {
            conm.a.d().p("Failed to stop scanning because we're not scanning.", new Object[0]);
            return;
        }
        elgo aU = aU();
        int size = aU.size();
        for (int i = 0; i < size; i++) {
            ((cqrt) aU.get(i)).C();
        }
        if (ftgi.j()) {
            if (ftgi.D()) {
                chem chemVar = this.N;
                for (ShareTarget shareTarget : chemVar.e()) {
                    chem chemVar2 = this.O;
                    Long valueOf = Long.valueOf(shareTarget.a);
                    if (!chemVar2.k(valueOf) || (cofaVar2 = (cofa) chemVar2.a(valueOf)) == null || cofaVar2.b.e) {
                        Iterator it = this.o.e().iterator();
                        while (it.hasNext()) {
                            ((coez) it.next()).a.c(shareTarget);
                        }
                        this.S.m(shareTarget);
                    }
                }
                chemVar.f();
            } else {
                elgo f = this.S.f();
                int size2 = f.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ShareTarget shareTarget2 = (ShareTarget) f.get(i2);
                    if (!shareTarget2.f) {
                        Iterator it2 = this.o.e().iterator();
                        while (it2.hasNext()) {
                            ((coez) it2.next()).a.c(shareTarget2);
                        }
                    }
                }
            }
        }
        cpcg cpcgVar = this.A;
        cpcgVar.h = null;
        cpcgVar.g = null;
        cpcgVar.e = 100;
        cpcgVar.f = (int) ftga.aj();
        cpcgVar.c.clear();
        elgo i3 = elgo.i(cpcgVar.d.keySet());
        int size3 = i3.size();
        for (int i4 = 0; i4 < size3; i4++) {
            cpcgVar.b((ShareTarget) i3.get(i4));
        }
        this.a = null;
        this.ah = null;
        coex coexVar = this.S;
        elgo f2 = coexVar.f();
        int size4 = f2.size();
        for (int i5 = 0; i5 < size4; i5++) {
            ShareTarget shareTarget3 = (ShareTarget) f2.get(i5);
            if (!shareTarget3.f) {
                if (ftgi.a.lK().y()) {
                    if (ftgi.D()) {
                        chem chemVar3 = this.O;
                        Long valueOf2 = Long.valueOf(shareTarget3.a);
                        if (chemVar3.k(valueOf2) && (cofaVar = (cofa) chemVar3.a(valueOf2)) != null && cofaVar.b.d()) {
                        }
                    } else {
                        Map map = this.L;
                        if (map.containsKey(shareTarget3) && (transferMetadata = (TransferMetadata) map.get(shareTarget3)) != null && transferMetadata.d()) {
                        }
                    }
                }
                coexVar.m(shareTarget3);
            }
        }
        conm.a.b().p("Scanning has stopped.", new Object[0]);
        af(new cnxo(this), z ? (int) ftga.ax() : 0L);
    }

    public final elgo A(Account account) {
        try {
            cntk cntkVar = (cntk) ((Map) ((eqcy) ctwo.b(this.I)).v(ftga.af(), TimeUnit.MILLISECONDS)).get(account.name);
            if (cntkVar != null && System.currentTimeMillis() - cntkVar.d <= ftga.ak() && !cntkVar.c.isEmpty()) {
                return elgo.i(cntkVar.c);
            }
        } catch (AssertionError e) {
            e = e;
            conm.a.e().f(e).p("Failed to read cached reachable phone numbers.", new Object[0]);
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            conm.a.e().f(e2).p("Failed to read cached reachable phone numbers.", new Object[0]);
        } catch (ExecutionException e3) {
            e = e3;
            conm.a.e().f(e).p("Failed to read cached reachable phone numbers.", new Object[0]);
        } catch (TimeoutException e4) {
            e = e4;
            conm.a.e().f(e).p("Failed to read cached reachable phone numbers.", new Object[0]);
        }
        List n = this.b.n(account);
        if (n == null) {
            return null;
        }
        ctwo.g(this.I, account.name, n, System.currentTimeMillis());
        return elgo.i(n);
    }

    public final fauu B() {
        return this.K.h;
    }

    public final File C(boolean z) {
        return new chkq(this.I).a(z);
    }

    public final String D(int i) {
        if (i == 1) {
            return "OFFLINE";
        }
        if (i == 2) {
            return "ONLINE";
        }
        if (i == 3) {
            return "WIFI_ONLY";
        }
        return "UNKNOWN[" + i() + "]";
    }

    final String E() {
        String str;
        String k;
        Account v = v();
        AtomicBoolean atomicBoolean = ctxd.a;
        Context context = this.I;
        String str2 = null;
        if (v != null) {
            try {
                str = ((ctup) dhmr.n(ctuq.d(v))).b;
            } catch (InterruptedException | ExecutionException unused) {
            }
            elgo elgoVar = ctxa.a;
            if (!TextUtils.isEmpty(str) || ekti.e("null", str)) {
                return ctxd.d(context);
            }
            acs acsVar = (acs) context;
            CharSequence text = acsVar.a().getText(R.string.sharing_device_type_phone);
            int e = ctwt.e(context);
            if (e == 2) {
                text = acsVar.a().getText(R.string.sharing_device_type_tablet);
            } else if (e == 3) {
                text = acsVar.a().getText(R.string.sharing_device_type_laptop);
            } else if (e == 4) {
                text = acsVar.a().getText(R.string.sharing_device_type_car);
            }
            if (ftgf.a.lK().bo()) {
                text = ctxd.e(context);
            }
            int integer = acsVar.a().getInteger(R.integer.sharing_max_name_length_bytes);
            int a = ctvc.a(context.getString(R.string.sharing_default_device_name, "", text));
            if (a >= integer) {
                conm.a.e().p("Device type string is longer than char limit.", new Object[0]);
            } else {
                str2 = ctxa.a(str, integer - a);
            }
            return TextUtils.isEmpty(str2) ? ctxd.d(context) : context.getString(R.string.sharing_default_device_name, str2, text);
        }
        Cursor b = chhr.b(context, ContactsContract.Profile.CONTENT_URI);
        if (b == null) {
            k = null;
        } else {
            try {
                k = chhr.k(b, "display_name");
            } finally {
                b.close();
            }
        }
        elgo elgoVar2 = ctxa.a;
        str = TextUtils.isEmpty(k) ? null : (String) elja.m(ekwo.h("\\s+").l(k), 0);
        elgo elgoVar3 = ctxa.a;
        if (TextUtils.isEmpty(str)) {
        }
        return ctxd.d(context);
    }

    public final String F() {
        if (!this.c.W() && !ctwa.c(this.I) && !aC()) {
            return aW(E());
        }
        String h = this.c.h(v());
        elgo elgoVar = ctxa.a;
        if (!TextUtils.isEmpty(h)) {
            return h;
        }
        String aW = aW(E());
        this.c.w(aW);
        return aW;
    }

    public final List I(Integer... numArr) {
        ArrayList arrayList = new ArrayList();
        Map map = this.q;
        elhz H = elhz.H(numArr);
        for (Map.Entry entry : map.entrySet()) {
            if (H.contains(entry.getValue())) {
                arrayList.add((cnxa) entry.getKey());
            }
        }
        return arrayList;
    }

    public final List J(Integer... numArr) {
        ArrayList arrayList = new ArrayList();
        elhz H = elhz.H(numArr);
        for (Map.Entry entry : this.o.d()) {
            if (H.contains(Integer.valueOf(((coez) entry.getValue()).b))) {
                arrayList.add(new itn((cokk) entry.getKey(), ((coez) entry.getValue()).a));
            }
        }
        return arrayList;
    }

    public final Map K(int i) {
        return this.b.o(i);
    }

    public final void L() {
        if (!aw()) {
            conm.a.b().p("Not allowed to auto turn off device settings.", new Object[0]);
            return;
        }
        if (aI() || bn()) {
            conm.a.b().p("Don't turn off device settings when share target is transferring or connecting.", new Object[0]);
            return;
        }
        for (TransferMetadata transferMetadata : K(1).values()) {
            if (ftgi.a.lK().Q()) {
                if (transferMetadata.d()) {
                    conm.a.b().p("Don't turn off device settings when there are ongoing transfers", new Object[0]);
                    return;
                }
            } else if (!transferMetadata.e) {
                conm.a.b().p("Don't turn off device settings when there are ongoing transfers", new Object[0]);
                return;
            }
            if (transferMetadata.a == 1016) {
                conm.a.b().p("Don't turn off device settings with group share when queue is not empty", new Object[0]);
                return;
            }
        }
        Context context = this.I;
        if (!ctxh.e(context)) {
            ArraySet arraySet = new ArraySet();
            if (Build.VERSION.SDK_INT != 29 && !ctxd.h(context) && bzlw.i(ctvl.a(context), "auto_enable_wifi", false)) {
                ctvl.d(context, false);
                arraySet.add(ctxh.b(context));
            }
            if (bzlw.i(ctvl.a(context), "auto_enable_bluetooth", false)) {
                ctvl.c(context, false);
                arraySet.add(ctvb.b(context));
            }
            chkp.c("revertDeviceSettings", dhmr.e(arraySet), ftga.r());
        }
        conm.a.b().p("Reverted device settings", new Object[0]);
    }

    public final void M() {
        Iterator it = this.p.iterator();
        while (it.hasNext()) {
            ((cokd) it.next()).a();
        }
        chke.e(this, "com.google.android.gms.nearby.sharing.STATE_CHANGED");
        chet chetVar = conm.a;
        chetVar.b().p("Broadcasting NearbySharing state change.", new Object[0]);
        if (ftgf.x()) {
            ((BackupManager) this.aY.lK()).dataChanged();
            chetVar.b().p("Notified backup manager of data change.", new Object[0]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void N() {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.nearby.sharing.NearbySharingChimeraService.N():void");
    }

    public final void O(ShareTarget shareTarget, final Intent intent, final ctur cturVar) {
        final eqhc eqhcVar = new eqhc();
        this.D.execute(new Runnable() { // from class: cnyp
            @Override // java.lang.Runnable
            public final void run() {
                List list;
                NearbySharingChimeraService nearbySharingChimeraService = NearbySharingChimeraService.this;
                atwu atwuVar = nearbySharingChimeraService.U;
                Intent intent2 = intent;
                List list2 = (List) atwuVar.a(intent2);
                eqhc eqhcVar2 = eqhcVar;
                if (list2 != null) {
                    eqhcVar2.q(list2);
                    return;
                }
                int intExtra = intent2.getIntExtra("nearby_share_intent_id", -1);
                if (intExtra == -1) {
                    list = ctus.k(nearbySharingChimeraService, intent2);
                } else if (nearbySharingChimeraService.r == null || ((Intent) nearbySharingChimeraService.r.a).getIntExtra("nearby_share_intent_id", -1) != intExtra) {
                    List k = ctus.k(nearbySharingChimeraService, intent2);
                    nearbySharingChimeraService.r = new itn(intent2, k);
                    list = k;
                } else {
                    itn itnVar = nearbySharingChimeraService.r;
                    atzb.s(itnVar);
                    List list3 = (List) itnVar.b;
                    SecureRandom secureRandom = new SecureRandom();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        cntr f = ((Attachment) it.next()).f();
                        f.d(secureRandom.nextLong());
                        arrayList.add(f.b());
                    }
                    list = arrayList;
                }
                atwuVar.d(intent2, list);
                eqhcVar2.q(list);
            }
        });
        final long j = shareTarget == null ? -1L : shareTarget.a;
        aupx aupxVar = new aupx(9, new Runnable() { // from class: cnyq
            @Override // java.lang.Runnable
            public final void run() {
                NearbySharingChimeraService nearbySharingChimeraService = NearbySharingChimeraService.this;
                ctur cturVar2 = cturVar;
                eqhc eqhcVar2 = eqhcVar;
                long j2 = j;
                try {
                    cturVar2.d();
                    List list = (List) chkp.g("getAttachments", eqhcVar2, ftga.U());
                    if (list == null || list.isEmpty()) {
                        cturVar2.c();
                        List list2 = (List) chkp.g("getAttachments", eqhcVar2, ftga.a.lK().aV() - ftga.U());
                        if (list2 != null && !list2.isEmpty()) {
                            cturVar2.b(list2);
                        }
                        cturVar2.a();
                    } else {
                        cturVar2.b(list);
                    }
                } finally {
                    nearbySharingChimeraService.Q.remove(Long.valueOf(j2));
                }
            }
        });
        this.Q.put(Long.valueOf(j), aupxVar);
        aupxVar.start();
    }

    public final void P(colr colrVar) {
        if (!ModuleInitializer.a(this)) {
            conm.a.b().p("Cannot force sync, because Nearby Share is not available.", new Object[0]);
        } else if (v() == null) {
            conm.a.b().p("Cannot force sync, because account is not available.", new Object[0]);
        } else {
            conm.a.b().p("Started a force sync.", new Object[0]);
            this.b.q(colrVar);
        }
    }

    public final void Q(String str, ShareTarget shareTarget) {
        Uri uri = shareTarget.c;
        if (uri != null) {
            this.W.b(str, uri);
        }
        Iterator it = shareTarget.f().iterator();
        while (it.hasNext()) {
            Uri uri2 = ((FileAttachment) it.next()).d;
            if (uri2 != null) {
                this.W.b(str, uri2);
            }
        }
    }

    public final void R() {
        int k;
        boolean z;
        int i;
        Integer aV;
        if (!this.at && !bl()) {
            ap();
            conm.a.b().p("Stopping advertising because the screen is locked.", new Object[0]);
            return;
        }
        if (!this.B) {
            ap();
            conm.a.b().p("Stopping advertising because Bluetooth is disabled.", new Object[0]);
            return;
        }
        if (!this.av) {
            ap();
            conm.a.b().p("Stopping advertising because Location is disabled.", new Object[0]);
            return;
        }
        if (!aA()) {
            ap();
            conm.a.b().p("Stopping advertising because Nearby Sharing is disabled.", new Object[0]);
            return;
        }
        if (bo()) {
            ap();
            conm.a.b().p("Stopping advertising because we're scanning for other devices.", new Object[0]);
            return;
        }
        if (aI()) {
            ap();
            conm.a.b().p("Stopping advertising because we're currently in the midst of a transfer.", new Object[0]);
            return;
        }
        if (this.u) {
            ap();
            conm.a.b().p("Stopping advertising because we recently sent/received a file. Allowing the attached surfaces a chance to unregister.", new Object[0]);
            return;
        }
        if (!bg()) {
            ap();
            conm.a.b().p("Stopping advertising because no receive surface is registered.", new Object[0]);
            return;
        }
        cqrs cqrsVar = ax() ? cqrs.FOREGROUND : this.at ? (!this.v || (ftgf.a.lK().J() && this.au)) ? cqrs.BACKGROUND : cqrs.MIDGROUND : cqrs.SCREEN_OFF;
        if ((cqrsVar == cqrs.BACKGROUND || cqrsVar == cqrs.SCREEN_OFF) && !bl()) {
            ap();
            conm.a.b().p("Stopping advertising since there's no scanning phone nearby and no receive surface in foreground.", new Object[0]);
            return;
        }
        if (!ftgf.Z() || (aV = aV()) == null) {
            k = k();
            int ordinal = cqrsVar.ordinal();
            if (ordinal == 0) {
                k = k == 0 ? 0 : bv(k, (int) ftga.a.lK().m());
            } else if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        throw new AssertionError("Invalid mode ".concat(String.valueOf(String.valueOf(cqrsVar))));
                    }
                    k = bv(k, (int) ftga.a.lK().bH());
                } else if (!ftgf.Z()) {
                    k = 3;
                }
            }
        } else {
            k = aV.intValue();
        }
        if (k == 0) {
            if (aT() == null) {
                ap();
                conm.a.b().p("Stopping advertising because no high power receive surface is registered and device is visible to HIDDEN.", new Object[0]);
                return;
            }
            k = 0;
        }
        if (be() && cqrsVar != cqrs.FOREGROUND) {
            ap();
            conm.a.b().p("Stopping advertising to avoid interference with 2.4GHz Wi-Fi connections.", new Object[0]);
            return;
        }
        this.b.v(k);
        int ordinal2 = cqrsVar.ordinal();
        if (ordinal2 == 1) {
            if (!ftgf.a.lK().R()) {
                if (this.x && k == 3) {
                    k = 3;
                } else {
                    z = false;
                    this.ao = z;
                }
            }
            z = true;
            this.ao = z;
        } else if (ordinal2 != 2) {
            this.ao = false;
        } else {
            this.ao = true;
        }
        int ordinal3 = cqrsVar.ordinal();
        if (ordinal3 != 0) {
            if (ordinal3 == 1) {
                ftgf ftgfVar = ftgf.a;
                if (ftgfVar.lK().aa()) {
                    conm.a.b().p("Starting a sync for midground advertising", new Object[0]);
                    if (ftgfVar.lK().U()) {
                        af(new Runnable() { // from class: cnyg
                            @Override // java.lang.Runnable
                            public final void run() {
                                conm.a.b().p("Repeating a sync for midground advertising", new Object[0]);
                                colq colqVar = new colq();
                                colqVar.b = 3;
                                colqVar.a = 11;
                                NearbySharingChimeraService.this.P(new colr(colqVar));
                            }
                        }, ftga.a.lK().aY());
                    }
                }
            } else if (ordinal3 != 2) {
                if (ordinal3 == 3 && ftgf.a.lK().ab()) {
                    conm.a.b().p("Starting a sync for screen-off advertising", new Object[0]);
                    colq colqVar = new colq();
                    colqVar.b = 3;
                    colqVar.a = 11;
                    P(new colr(colqVar));
                }
            } else if (ftgf.a.lK().Z()) {
                conm.a.b().p("Starting a sync for foreground advertising", new Object[0]);
                colq colqVar2 = new colq();
                colqVar2.b = 3;
                colqVar2.a = 11;
                P(new colr(colqVar2));
            }
        } else if (ftgf.a.lK().Y()) {
            conm.a.b().p("Starting a sync for background advertising", new Object[0]);
            colq colqVar3 = new colq();
            colqVar3.b = 3;
            colqVar3.a = 11;
            P(new colr(colqVar3));
        }
        if (!aA()) {
            conm.a.b().p("Failed to advertise because we're not enabled.", new Object[0]);
        } else if (bo()) {
            conm.a.b().p("Failed to advertise because we're currently scanning for other devices in the foreground.", new Object[0]);
        } else if (!bg()) {
            conm.a.b().p("Failed to advertise because there's no receive surface registered.", new Object[0]);
        } else if (!this.at && !bl()) {
            conm.a.b().p("Failed to advertise because the user's screen is locked.", new Object[0]);
        } else if (this.B) {
            int i2 = i();
            Iterator it = this.n.e().iterator();
            while (true) {
                if (!it.hasNext()) {
                    i = 0;
                    break;
                }
                int i3 = ((coey) it.next()).b;
                if (i3 != 0) {
                    i = i3;
                    break;
                }
            }
            QrCodeMetadata aT = aT();
            if (bk() && cqrsVar.equals(this.s) && i2 == this.ai && this.ap.equals(this.y) && this.an == this.ao && this.af == k && this.aq == i && Objects.equals(aT, this.z)) {
                conm.a.b().l("Failed to advertise because we're already advertising with mode %s, certificate visibility %s data usage preference %s, and bt advertising %s with vendorId %s", this.s, ctwy.s(k), D(this.ai), Boolean.valueOf(this.an), Integer.valueOf(i));
            } else {
                this.af = k;
                boolean z2 = k == 3;
                String F = (z2 || aT != null) ? F() : null;
                chet chetVar = conm.a;
                chetVar.b().l("Start advertising with mode %s certificate visibility %s data usage preference %s, and bt advertising %s with vendorId %d", cqrsVar, ctwy.s(k), D(i2), Boolean.valueOf(this.ao), Integer.valueOf(i));
                cokk cokkVar = new cokk() { // from class: cnxk
                    @Override // defpackage.cokk
                    public final void e(final ShareTarget shareTarget, final TransferMetadata transferMetadata) {
                        final NearbySharingChimeraService nearbySharingChimeraService = NearbySharingChimeraService.this;
                        nearbySharingChimeraService.ae(new Runnable() { // from class: cnyl
                            @Override // java.lang.Runnable
                            public final void run() {
                                NearbySharingChimeraService.this.aa(shareTarget, transferMetadata);
                            }
                        });
                    }
                };
                cqrm cqrmVar = new cqrm();
                cqrmVar.a = cqrsVar;
                cqrmVar.g = i2;
                cqrmVar.b = ctwt.e(this.I);
                cqrmVar.c = this.ao;
                cqrs cqrsVar2 = cqrs.FOREGROUND;
                cqrmVar.f = cqrsVar == cqrsVar2;
                cqrmVar.d = z2;
                cqrmVar.k = z2;
                aP();
                if (bl()) {
                    boolean z3 = (ftgf.a.lK().ac() && cqrsVar == cqrs.MIDGROUND) ? true : z2 || cqrsVar == cqrsVar2;
                    ftga.bk();
                    cqrmVar.e = z3;
                }
                cqrmVar.j = i;
                cqrn a = cqrmVar.a();
                elgo aU = aU();
                int size = aU.size();
                for (int i4 = 0; i4 < size; i4++) {
                    cqrt cqrtVar = (cqrt) aU.get(i4);
                    if (bk()) {
                        chetVar.b().h("Updating advertising options: %s", a);
                        cqrtVar.E(F, a, aT);
                    } else {
                        cqrtVar.x(F, cokkVar, a, aT);
                    }
                }
                this.aq = i;
                N();
                this.s = cqrsVar;
                this.ai = i2;
                this.an = this.ao;
                this.z = aT;
                cheb chebVar = this.aA;
                if (chebVar != null) {
                    chebVar.b();
                }
                this.aA = cheb.d(chetVar, new Runnable() { // from class: cnxp
                    @Override // java.lang.Runnable
                    public final void run() {
                        NearbySharingChimeraService nearbySharingChimeraService = NearbySharingChimeraService.this;
                        nearbySharingChimeraService.ap();
                        nearbySharingChimeraService.R();
                    }
                }, ((int) ftga.ar()) + new Random().nextInt((int) (ftga.a.lK().bC() - ftga.ar())), this.az);
                Map map = this.ap;
                map.clear();
                map.putAll(this.y);
                if (!map.isEmpty()) {
                    aP();
                }
                chetVar.b().i("Advertising has started with mode %s, Bt enabled : %s", cqrsVar, Boolean.valueOf(this.an));
            }
        } else {
            conm.a.b().p("Failed to advertise because Bluetooth is off.", new Object[0]);
        }
        if (ax()) {
            this.G.g();
            conm.a.b().p("Cancelling the Fast Init HUN because we're now advertising with a foreground receive surface", new Object[0]);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x021d, code lost:
    
        if (r7 == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0232, code lost:
    
        if (r0 == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0265, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0258, code lost:
    
        if (r0 == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0263, code lost:
    
        if (r0.a() != 1) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0254  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void S() {
        /*
            Method dump skipped, instructions count: 783
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.nearby.sharing.NearbySharingChimeraService.S():void");
    }

    public final void T() {
        if (!this.at) {
            conm.a.b().p("Stopping FastInitiation scanning because the screen is locked.", new Object[0]);
            aq();
            return;
        }
        if (!aA() && !aB()) {
            conm.a.b().p("Stopping FastInitiation scanning because it is disabled.", new Object[0]);
            aq();
            return;
        }
        if (!this.av) {
            aq();
            conm.a.b().p("Stopping FastInitiation scanning because location is disabled.", new Object[0]);
            return;
        }
        if (!ftgf.y() && !this.B && !this.F.j()) {
            aq();
            conm.a.b().p("Stopping FastInitiation scanning because Bluetooth is disabled.", new Object[0]);
            return;
        }
        if (this.au && ftgf.v()) {
            conm.a.b().p("Stopping FastInitiation scanning because battery is low.", new Object[0]);
            aq();
            return;
        }
        if (ftgf.y()) {
            Context context = this.I;
            chhe a = ctvb.a(context);
            if (a != null && (a.c() == 11 || a.c() == 13 || a.a() == 14 || a.a() == 16)) {
                conm.a.b().p("Failed to start FastInitiation scanning because Bluetooth is in transitioning.", new Object[0]);
                return;
            }
            if (!this.B && !ctvb.e(context)) {
                aq();
                conm.a.b().p("Stopping FastInitiation scanning because Bluetooth is disabled.", new Object[0]);
                if (!ctvb.f(context) || this.H) {
                    return;
                }
                this.H = true;
                final Context applicationContext = context.getApplicationContext();
                eqgo d = chkv.d();
                final dhma dhmaVar = new dhma();
                d.execute(new Runnable() { // from class: ctva
                    @Override // java.lang.Runnable
                    public final void run() {
                        dhma dhmaVar2 = dhmaVar;
                        final Context context2 = applicationContext;
                        final chhe a2 = ctvb.a(context2);
                        if (a2 != null) {
                            if (a2.h() || chkp.j("enableBle", iif.a(new iic() { // from class: ctux
                                @Override // defpackage.iic
                                public final Object a(final iia iiaVar) {
                                    final TracingBroadcastReceiver tracingBroadcastReceiver = new TracingBroadcastReceiver() { // from class: com.google.android.gms.nearby.sharing.utils.BluetoothUtils$1
                                        {
                                            super("nearby", "BleReceiver");
                                        }

                                        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
                                        public final void jP(Context context3, Intent intent) {
                                            if (Objects.equals(intent.getAction(), "android.bluetooth.adapter.action.BLE_STATE_CHANGED")) {
                                                int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1);
                                                if (intExtra == 15 || intExtra == 12) {
                                                    chke.f(context3, this);
                                                    iia.this.b(null);
                                                }
                                            }
                                        }
                                    };
                                    IntentFilter intentFilter = new IntentFilter("android.bluetooth.adapter.action.BLE_STATE_CHANGED");
                                    final Context context3 = context2;
                                    context3.registerReceiver(tracingBroadcastReceiver, intentFilter);
                                    iiaVar.a(new Runnable() { // from class: ctuw
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            Context context4 = context3;
                                            chke.f(context4, tracingBroadcastReceiver);
                                            ctvb.d(context4);
                                            iiaVar.c(new Exception("Ble future is cancelled."));
                                        }
                                    }, chkv.d());
                                    chhe chheVar = a2;
                                    if (chheVar.g() || chheVar.h()) {
                                        return "BluetoothUtils.setBleEnabled";
                                    }
                                    if (chheVar.a() != 10) {
                                        ((eluo) ((eluo) cheq.a.h()).ai((char) 6489)).x("Unable to enable BLE. Initial BLE state must be off.");
                                    } else {
                                        try {
                                            if (chheVar.a.o()) {
                                                return "BluetoothUtils.setBleEnabled";
                                            }
                                        } catch (NullPointerException | SecurityException unused) {
                                        }
                                    }
                                    chke.f(context3, tracingBroadcastReceiver);
                                    ctvb.d(context3);
                                    iiaVar.c(new Exception("Bluetooth Service denied the enable Ble request."));
                                    return "BluetoothUtils.setBleEnabled";
                                }
                            }), ftga.a.lK().ac()) || ctvb.e(context2)) {
                                dhmaVar2.b(null);
                                return;
                            }
                            ctvb.d(context2);
                        }
                        dhmaVar2.a(new Exception("Got exception when turning on Ble"));
                    }
                });
                dhmf dhmfVar = dhmaVar.a;
                dhmfVar.z(new dhlq() { // from class: cnxi
                    @Override // defpackage.dhlq
                    public final void gC(Object obj) {
                        int i = NearbySharingChimeraService.ad;
                        conm.a.b().p("BLE has been enabled, we can start a FastInit scan.", new Object[0]);
                    }
                });
                dhmfVar.y(new dhln() { // from class: cnxj
                    @Override // defpackage.dhln
                    public final void gB(Exception exc) {
                        NearbySharingChimeraService.this.H = false;
                        conm.a.e().f(exc).p("Failed to enable BLE for FastInit.", new Object[0]);
                    }
                });
                return;
            }
        }
        if (bo()) {
            aq();
            conm.a.b().p("Stopping FastInitiation scanning because we're scanning for other devices.", new Object[0]);
            return;
        }
        if (aI()) {
            aq();
            conm.a.b().p("Stopping FastInitiation scanning because we're currently in the midst of a transfer.", new Object[0]);
            return;
        }
        if (be()) {
            aq();
            conm.a.b().p("Stopping FastInitiation scanning to avoid interference with 2.4GHz Wi-Fi connections.", new Object[0]);
            return;
        }
        if (k() == 0) {
            conm.a.b().p("Stopping FastInitiation scanning because visibility is hidden.", new Object[0]);
            aq();
            return;
        }
        if (!ModuleInitializer.a(this)) {
            if (aF()) {
                aq();
            }
            conm.a.a().p("Cannot scan for Fast Init, because Nearby Share is not available.", new Object[0]);
            return;
        }
        if (!this.at) {
            conm.a.b().p("Failed to scan for fast initiation because the user's screen is locked.", new Object[0]);
            return;
        }
        if (!aA() && !aB()) {
            conm.a.b().p("Failed to scan for fast initiation because Nearby Share and Fast Init Notification are disabled.", new Object[0]);
            return;
        }
        if (!this.av) {
            conm.a.b().p("Failed to scan for fast initiation because location is disabled.", new Object[0]);
            return;
        }
        if (this.au && ftgf.v()) {
            conm.a.b().p("Failed to scan for fast initiation because power save mode is enabled.", new Object[0]);
            return;
        }
        boolean aA = aA();
        if (aF()) {
            if (aA == this.ar) {
                conm.a.d().h("Failed to scan for fast initiation because we're already scanning with isHighPowerAllowed=%s.", Boolean.valueOf(this.ar));
                return;
            } else {
                conm.a.b().h("Restarting scanning for fast initiation with isHighPowerAllowed=%s", Boolean.valueOf(aA));
                aq();
            }
        }
        clxl b = clxl.b();
        Intent addFlags = new Intent().setClassName(this, true != ftdn.c() ? "com.google.android.gms.nearby.sharing.receive.ReceiveActivity" : "com.google.android.gms.nearby.sharing.main.MainActivity").addFlags(268435456).addFlags(32768);
        ClipData clipData = dyph.a;
        PendingIntent a2 = dyph.a(this, 0, addFlags, 1140850688);
        ekvl.y(a2);
        b.i(a2);
        if (!this.F.p(aA, new cnyn(this))) {
            this.ar = false;
        } else {
            this.ar = aA;
            conm.a.b().p("Fast Initiation Scanning has started", new Object[0]);
        }
    }

    public final void U() {
        R();
        T();
        S();
    }

    public final void V() {
        if (aA()) {
            bc();
            Context context = this.I;
            SharingSyncChimeraService.d(context);
            SharingSyncChimeraService.e(context, ftga.a.lK().bB());
            return;
        }
        if (br()) {
            bc();
            Context context2 = this.I;
            SharingSyncChimeraService.d(context2);
            SharingSyncChimeraService.e(context2, ftga.a.lK().bX());
        }
    }

    public final void W() {
        aZ();
        U();
    }

    public final void X() {
        if (this.at) {
            aP();
        }
    }

    public final void Y(ShareTarget shareTarget) {
        cofa cofaVar;
        cofa cofaVar2;
        if (shareTarget.f) {
            chem chemVar = this.P;
            Long valueOf = Long.valueOf(shareTarget.a);
            if (chemVar.k(valueOf) && (cofaVar2 = (cofa) chemVar.a(valueOf)) != null) {
                TransferMetadata transferMetadata = cofaVar2.b;
                if (transferMetadata.e) {
                    chemVar.b(valueOf);
                    return;
                } else {
                    chemVar.j(valueOf, new cofa(cofaVar2.a, transferMetadata, false));
                    return;
                }
            }
            return;
        }
        chem chemVar2 = this.O;
        Long valueOf2 = Long.valueOf(shareTarget.a);
        if (!chemVar2.k(valueOf2) || (cofaVar = (cofa) chemVar2.a(valueOf2)) == null) {
            return;
        }
        TransferMetadata transferMetadata2 = cofaVar.b;
        if (transferMetadata2.e) {
            chemVar2.b(valueOf2);
        } else {
            chemVar2.j(valueOf2, new cofa(cofaVar.a, transferMetadata2, false));
        }
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        if (!ModuleInitializer.a(this)) {
            conm.a.b().p("Nearby sharing service is disabled.  Get service returning error.", new Object[0]);
            bzozVar.a(13, null);
            return;
        }
        Bundle bundle = getServiceRequest.i;
        final int i = bundle.getInt("vendor_id", 0);
        int i2 = bundle.getInt("vendor_flags", 0);
        if (i != 0) {
            ae(new Runnable() { // from class: cnxr
                @Override // java.lang.Runnable
                public final void run() {
                    NearbySharingChimeraService.this.b.u(i);
                }
            });
        }
        String str = getServiceRequest.f;
        int a = ctvd.a(this, str) - 1;
        if (a == 1) {
            String str2 = getServiceRequest.p;
            bzozVar.c(new coet(this, str, i, i2));
            conm.a.b().i("A new client has bound to the NearbySharingService ClientBridge for calling package %s and PID %s", str, Integer.valueOf(Binder.getCallingPid()));
        } else if (a == 2) {
            String str3 = getServiceRequest.p;
            bzozVar.c(new coet(this, str, i, i2));
            conm.a.b().h("A new client has bound to the NearbySharingService ClientBridge for calling package %s", str);
        } else if (a != 3) {
            bzozVar.a(35513, null);
            conm.a.b().h("A new client failed to bind to the NearbySharingService for calling package %s", str);
        } else {
            String str4 = getServiceRequest.p;
            bzozVar.c(new coeu(this, str, i, i2));
            conm.a.b().h("A new client has bound to the NearbySharingService ExternalClientBridge for calling package %s", str);
        }
    }

    public final boolean aA() {
        if (ftgf.t()) {
            return true;
        }
        if (!ftga.be()) {
            conm.a.a().p("Nearby Share is disabled, because Nearby Share is not enabled.", new Object[0]);
            return false;
        }
        if (ModuleInitializer.a(this)) {
            return bzlw.i(w(), "enabled", false);
        }
        conm.a.a().p("Nearby Share is disabled, because Nearby Share is not available.", new Object[0]);
        return false;
    }

    public final boolean aB() {
        return this.c.X();
    }

    public final boolean aC() {
        return this.c.Y();
    }

    public final boolean aD() {
        return ftgi.D() ? elja.d(this.P.e(), new ekvm() { // from class: cnym
            @Override // defpackage.ekvm
            public final boolean a(Object obj) {
                int i = NearbySharingChimeraService.ad;
                return !((cofa) obj).b.e;
            }
        }).iterator().hasNext() : this.ak;
    }

    public final boolean aE() {
        return this.ah != null;
    }

    public final boolean aF() {
        return this.F.k();
    }

    public final boolean aG() {
        return ftgi.D() ? elja.d(this.O.e(), new ekvm() { // from class: cnya
            @Override // defpackage.ekvm
            public final boolean a(Object obj) {
                int i = NearbySharingChimeraService.ad;
                return !((cofa) obj).b.e;
            }
        }).iterator().hasNext() : this.al;
    }

    public final boolean aH(ShareTarget shareTarget) {
        return shareTarget.f ? this.P.k(Long.valueOf(shareTarget.a)) : this.O.k(Long.valueOf(shareTarget.a));
    }

    public final boolean aI() {
        return ftgi.D() ? aG() || aD() : this.aj;
    }

    public final void aJ() {
        if (!ModuleInitializer.a(this)) {
            conm.a.a().p("Cannot invalidate default opt in state, because Nearby Share is not available.", new Object[0]);
            return;
        }
        if (ctwa.c(this.I)) {
            return;
        }
        if (!ctuq.n(this)) {
            conm.a.b().p("Not qualified for default opt-in. Multiple accounts are found.", new Object[0]);
        } else if (chen.i(this)) {
            if (this.c.b() <= 1) {
                int e = this.b.e(v());
                this.c.E(e);
                if (e <= 1) {
                    conm.a.b().p("Not qualified for default opt-in. This account does not have multiple devices.", new Object[0]);
                }
            }
            if (ctwa.c(this)) {
                conm.a.b().p("Not qualified for default opt-in. Already explicitly opted in.", new Object[0]);
            } else {
                if (bp()) {
                    chet chetVar = conm.a;
                    chetVar.b().p("Eligible for default opt-in.", new Object[0]);
                    if (ftgf.t()) {
                        if (!bzlw.i(w(), "enabled", false)) {
                            chetVar.b().p("Enabling Nearby Share, because it's qualified for default opted in.", new Object[0]);
                            this.c.y(true == ftgf.ai() ? 1 : 4, 0L);
                            t(true);
                            this.K.i(colp.r());
                            return;
                        }
                        colq colqVar = new colq();
                        colqVar.b = 1;
                        colqVar.a = 5;
                        P(new colr(colqVar));
                        chetVar.b().p("NearbySharing was default opted in", new Object[0]);
                        return;
                    }
                    if (!aA() && !this.c.Q()) {
                        chetVar.b().p("Enabling Nearby Share, because it's qualified for default opted in.", new Object[0]);
                        this.c.y(true == ftgf.ai() ? 1 : 4, 0L);
                        t(true);
                        this.K.i(colp.r());
                        return;
                    }
                    if (aA()) {
                        colq colqVar2 = new colq();
                        colqVar2.b = 1;
                        colqVar2.a = 5;
                        P(new colr(colqVar2));
                        chetVar.b().p("NearbySharing was default opted in", new Object[0]);
                        return;
                    }
                    return;
                }
                conm.a.b().p("Not qualified for default opt-in. Device is still in setup wizard.", new Object[0]);
            }
        } else {
            conm.a.b().p("Not qualified for default opt-in. Not running in the primary profile.", new Object[0]);
        }
        if (aA()) {
            conm.a.b().p("Disabling Nearby Share because it's not qualified for default opted in and the user has not manually opted in.", new Object[0]);
            t(false);
            this.c.s();
            this.c.y(0, 0L);
        }
    }

    public final void aM() {
        bw(true);
    }

    public final void aN(cokk cokkVar) {
        int i;
        itn itnVar;
        if (!ftgi.D() && bh(1) && (itnVar = this.M) != null && ((TransferMetadata) itnVar.b).e) {
            this.M = null;
        }
        bh(2);
        chem chemVar = this.n;
        coey coeyVar = chemVar.k(cokkVar) ? (coey) chemVar.b(cokkVar) : null;
        if (coeyVar != null && coeyVar.a == 1 && !ax()) {
            am(k());
            if (ftgi.D()) {
                elgo i2 = elgo.i(this.P.e());
                int size = i2.size();
                int i3 = 0;
                while (i3 < size) {
                    cofa cofaVar = (cofa) i2.get(i3);
                    Iterator it = aX(0).iterator();
                    while (true) {
                        i = i3 + 1;
                        if (it.hasNext()) {
                            cokk cokkVar2 = (cokk) it.next();
                            chet b = conm.a.b();
                            ShareTarget shareTarget = cofaVar.a;
                            b.h("Reporting in progress share target %s when unregistering receive surface", shareTarget.b);
                            coki a = cofaVar.b.a();
                            a.d();
                            cokkVar2.e(shareTarget, a.a());
                        }
                    }
                    i3 = i;
                }
            } else {
                itn itnVar2 = this.M;
                if (itnVar2 != null) {
                    Object obj = itnVar2.b;
                    ShareTarget shareTarget2 = (ShareTarget) itnVar2.a;
                    TransferMetadata transferMetadata = (TransferMetadata) obj;
                    Iterator it2 = aX(0).iterator();
                    while (it2.hasNext()) {
                        ((cokk) it2.next()).e(shareTarget2, transferMetadata);
                    }
                }
            }
        }
        L();
        if (coeyVar != null && coeyVar.a == 2) {
            bh(2);
        }
        conm.a.b().h("A ReceiveSurface(%s) has been unregistered", G(coeyVar == null ? -1 : coeyVar.a));
        af(new cnxo(this), ftga.ax());
        M();
    }

    public final void aP() {
        if (!ftgf.a.lK().ar()) {
            conm.a.b().p("Uwb feature is off.", new Object[0]);
        } else if (ctxh.e(this)) {
            conm.a.b().p("Uwb is unavailable in airplane mode", new Object[0]);
        } else {
            if (this.at) {
                return;
            }
            conm.a.b().p("Disabling Uwb when the screen is locked to save on battery power", new Object[0]);
        }
    }

    public final void aa(ShareTarget shareTarget, TransferMetadata transferMetadata) {
        bu(shareTarget, transferMetadata);
        if (ftgi.D()) {
            if (transferMetadata.m) {
                this.P.i(Long.valueOf(shareTarget.a), new cofa(shareTarget, transferMetadata), new chiz());
                if (!shareTarget.k) {
                    this.S.i(shareTarget, "INTERNAL_PROVIDER_ID");
                }
                bb(true);
            } else if (transferMetadata.e) {
                chem chemVar = this.P;
                Long valueOf = Long.valueOf(shareTarget.a);
                chemVar.j(valueOf, new cofa(shareTarget, transferMetadata, bq(shareTarget)));
                if (!bq(shareTarget) || ax()) {
                    chemVar.c(valueOf, new chiz());
                }
                ba();
            } else {
                this.P.j(Long.valueOf(shareTarget.a), new cofa(shareTarget, transferMetadata, bq(shareTarget)));
            }
            List<cokk> aX = aX(1);
            if (aX.isEmpty()) {
                aX = aX(0);
            }
            for (cokk cokkVar : aX) {
                if (ax()) {
                    this.G.f(shareTarget);
                }
                cokkVar.e(shareTarget, transferMetadata);
            }
            return;
        }
        int i = transferMetadata.a;
        if (i == 1009 || i == 1008) {
            this.M = null;
        } else {
            coki a = transferMetadata.a();
            a.d();
            this.M = new itn(shareTarget, a.a());
        }
        if (transferMetadata.e || i == 1021) {
            ba();
        } else {
            boolean z = shareTarget.n || shareTarget.q;
            if (i == 1002 || (z && i == 1003)) {
                if (!shareTarget.k) {
                    this.S.i(shareTarget, "INTERNAL_PROVIDER_ID");
                }
                bb(true);
            }
        }
        List<cokk> aX2 = aX(1);
        if (aX2.isEmpty()) {
            aX2 = aX(0);
        }
        for (cokk cokkVar2 : aX2) {
            if (ax()) {
                this.G.f(shareTarget);
            }
            cokkVar2.e(shareTarget, transferMetadata);
        }
    }

    public final void ab(ShareTarget shareTarget, TransferMetadata transferMetadata) {
        char c;
        Integer num;
        char c2;
        if (!ftgi.D()) {
            Map map = this.L;
            if (map != null && !map.containsKey(shareTarget) && transferMetadata.a == 1009) {
                conm.a.b().p("Skip the update due to not finding this shareTarget.", new Object[0]);
                return;
            }
            bu(shareTarget, transferMetadata);
            boolean z = transferMetadata.e;
            if (z) {
                this.am = false;
                ba();
            } else if (transferMetadata.a == 1002) {
                this.am = false;
                bb(false);
            }
            List J = J(1, 3, 5, 6);
            if (J.isEmpty()) {
                J = J(0);
            }
            Iterator it = J.iterator();
            while (it.hasNext()) {
                ((cokk) ((itn) it.next()).a).e(shareTarget, transferMetadata);
            }
            if (ay() && z) {
                map.remove(shareTarget);
                return;
            } else {
                if (transferMetadata.a != 1016) {
                    coki a = transferMetadata.a();
                    a.d();
                    map.put(shareTarget, a.a());
                    return;
                }
                return;
            }
        }
        bu(shareTarget, transferMetadata);
        if (transferMetadata.m) {
            c = 3;
            num = 3;
            c2 = 2;
            this.O.i(Long.valueOf(shareTarget.a), new cofa(shareTarget, transferMetadata), new chiz());
        } else {
            c = 3;
            num = 3;
            c2 = 2;
            if (transferMetadata.e) {
                chem chemVar = this.O;
                Long valueOf = Long.valueOf(shareTarget.a);
                chemVar.j(valueOf, new cofa(shareTarget, transferMetadata, bq(shareTarget)));
                if (!bq(shareTarget) || ay()) {
                    chemVar.c(valueOf, new chiz());
                }
                if (!this.N.k(valueOf)) {
                    Iterator it2 = this.o.e().iterator();
                    while (it2.hasNext()) {
                        ((coez) it2.next()).a.c(shareTarget);
                    }
                }
            } else {
                this.O.j(Long.valueOf(shareTarget.a), new cofa(shareTarget, transferMetadata, bq(shareTarget)));
            }
        }
        if (transferMetadata.e) {
            this.am = false;
            ba();
        } else if (transferMetadata.a == 1002) {
            this.am = false;
            bb(false);
        }
        Integer[] numArr = new Integer[4];
        numArr[0] = 1;
        numArr[1] = num;
        numArr[c2] = 5;
        numArr[c] = 6;
        List J2 = J(numArr);
        if (J2.isEmpty()) {
            J2 = J(0);
        } else {
            this.G.h((int) shareTarget.a);
        }
        Iterator it3 = J2.iterator();
        while (it3.hasNext()) {
            ((cokk) ((itn) it3.next()).a).e(shareTarget, transferMetadata);
        }
    }

    public final void ac(ShareTarget shareTarget, int i, RangingData rangingData) {
        Iterator it = this.o.e().iterator();
        while (it.hasNext()) {
            ((coez) it.next()).a.b(shareTarget, i, rangingData);
        }
    }

    public final void ad() {
        t(false);
        ak(false);
        aY();
        cofp.t();
        this.b.t();
        this.c.r();
        bzlt c = w().c();
        c.d();
        bzlw.g(c);
        AtomicBoolean atomicBoolean = ctxd.a;
        boolean compareAndSet = atomicBoolean.compareAndSet(false, true);
        Context context = this.I;
        if (compareAndSet) {
            chet chetVar = conm.a;
            chetVar.d().p("DeleteCachedImages start.", new Object[0]);
            ctvn.r(ctxd.b(context));
            atomicBoolean.set(false);
            chetVar.d().p("DeleteCachedImages end.", new Object[0]);
        } else {
            conm.a.d().p("DeleteCachedImages failed.", new Object[0]);
        }
        ctwo.j(context);
        if (ftgf.ac()) {
            ctut.d(context).b();
        }
        ctvz.e(context, C(false));
        conm.a.b().p("Deleted all Nearby partial payloads.", new Object[0]);
        ctwa.a(context, false);
        ctwo.i(context);
        ah();
        aJ();
        ak(true);
        if (ftgi.a.lK().m()) {
            coor coorVar = (coor) this.ab.a();
            ekvl.y(coorVar);
            final fxwo fxwoVar = new fxwo() { // from class: cooj
                @Override // defpackage.fxwo
                public final Object a(Object obj) {
                    return cnwk.a;
                }
            };
            ((eqcy) coorVar.a.b(new ekut() { // from class: cook
                @Override // defpackage.ekut
                public final Object apply(Object obj) {
                    return fxwo.this.a(obj);
                }
            }, eqex.a)).v(ftga.af(), TimeUnit.MILLISECONDS);
        }
        M();
    }

    public final void ae(Runnable runnable) {
        ScheduledExecutorService scheduledExecutorService = this.az;
        if (scheduledExecutorService == null) {
            conm.a.e().p("Unable to execute task. No executor found.", new Object[0]);
        } else {
            scheduledExecutorService.execute(runnable);
        }
    }

    public final void af(Runnable runnable, long j) {
        ((chku) this.az).schedule(runnable, j, TimeUnit.MILLISECONDS);
    }

    public final void ag(boolean z) {
        this.B = z;
        conm.a.b().h("Bluetooth is %s", true != z ? "disabled" : "enabled");
        W();
        au();
    }

    public final void ah() {
        Object obj;
        dhlw e = ctuq.e(this);
        try {
            dhmr.n(e);
            obj = e.i();
        } catch (InterruptedException | ExecutionException e2) {
            ((eluo) ((eluo) cheq.a.j()).s(e2)).B("Failed %s while waiting for the task.", "getSupportedAccounts");
            if (e2 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            obj = null;
        }
        ArrayList arrayList = (ArrayList) obj;
        if (arrayList == null || arrayList.isEmpty()) {
            conm.a.e().p("No supported accounts found.", new Object[0]);
            q(null);
            return;
        }
        String c = bzlw.c(w(), "account", "");
        if (c.isEmpty()) {
            conm.a.e().p("Account name is empty.", new Object[0]);
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Account account = (Account) arrayList.get(i);
            i++;
            if (c.equals(account.name)) {
                q(account);
                return;
            }
        }
        q((Account) arrayList.get(0));
    }

    public final void ai(boolean z) {
        this.av = z;
        conm.a.b().h("Location is %s", true != z ? "disabled" : "enabled");
        W();
        au();
    }

    public final void aj(boolean z) {
        if (z == this.au) {
            conm.a.d().h("Power Save is already %s, skipping invalidate", true == z ? "enabled" : "disabled");
            return;
        }
        this.au = z;
        conm.a.b().h("Power Save is %s", true == z ? "enabled" : "disabled");
        W();
    }

    public final void ak(boolean z) {
        if (z == this.at) {
            conm.a.d().h("Screen is already %s, skipping invalidate", true == z ? "unlocked" : "locked");
            return;
        }
        this.at = z;
        conm.a.b().h("Screen is %s", true == z ? "unlocked" : "locked");
        if (z) {
            this.aC = SystemClock.elapsedRealtime();
        }
        final ctvg ctvgVar = this.aO;
        final Runnable runnable = new Runnable() { // from class: cnxq
            @Override // java.lang.Runnable
            public final void run() {
                NearbySharingChimeraService nearbySharingChimeraService = NearbySharingChimeraService.this;
                nearbySharingChimeraService.X();
                nearbySharingChimeraService.W();
            }
        };
        if (ctvgVar.a == 0) {
            runnable.run();
            return;
        }
        if (ctvgVar.b(runnable)) {
            return;
        }
        ScheduledFuture scheduledFuture = ctvgVar.c;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            ctvgVar.c.cancel(false);
        }
        ctvgVar.c = ((chku) ctvgVar.b).schedule(new Runnable() { // from class: ctvf
            @Override // java.lang.Runnable
            public final void run() {
                ctvg.this.b(runnable);
            }
        }, ctvgVar.a(), TimeUnit.MILLISECONDS);
    }

    public final void al() {
        this.aE = new AnonymousClass19();
        this.aF = new AnonymousClass20();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.gms.nearby.sharing.CERTIFICATES_REGENERATION");
        chke.b(this, this.aE, intentFilter);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("com.google.android.gms.nearby.sharing.ACCEPT_CONSTELLATION");
        chke.b(this, this.aF, intentFilter2);
        if (ctuq.o(this, v())) {
            colq colqVar = new colq();
            colqVar.a = 7;
            colqVar.b = 1;
            ar(new colr(colqVar));
        }
        this.b.s();
    }

    public final void am(int i) {
        if (ftgf.Z()) {
            Integer aV = aV();
            if (aV != null && aV.intValue() == 3) {
                return;
            }
        } else if (ax()) {
            return;
        }
        if (i != 3 && this.c.P(v())) {
            cofp cofpVar = this.G;
            Context context = cofpVar.a;
            if (!coog.b(context).d()) {
                int i2 = i != 0 ? i != 4 ? R.string.sharing_notification_channel_contacts_visibility : R.string.sharing_notification_channel_self_share_visibility : R.string.sharing_notification_channel_hidden_visibility;
                chhu chhuVar = new chhu(context, "nearby_sharing_privacy");
                chhuVar.O(new ilr());
                chhuVar.G(context.getString(R.string.sharing_notification_channel_everyone_visibility_ended));
                chhuVar.F(context.getString(i2));
                chhuVar.g = cofpVar.b();
                chhuVar.T();
                chhuVar.l = 0;
                chhuVar.S();
                chhuVar.L(true);
                chhuVar.E(true);
                chhuVar.A = ctwt.a(context);
                chhuVar.V();
                chhuVar.U();
                chhuVar.N(R.drawable.sharing_ic_v3_foreground);
                chhuVar.R(context.getString(R.string.sharing_product_name_v3));
                cofp.u(chhuVar);
                cofpVar.s(4, chhuVar.b());
            }
            this.c.F(v(), false);
        }
    }

    public final void an() {
        this.b.w();
        conm.a.b().p("Shut down SharingProvider", new Object[0]);
    }

    public final synchronized void ao() {
        if (this.aw) {
            conm.a.b().p("2.4GHz Wi-Fi connection warming up ended", new Object[0]);
            this.ax = true;
            W();
        }
    }

    public final void ap() {
        if (!bk()) {
            conm.a.a().p("Failed to stop advertising because we weren't advertising.", new Object[0]);
            return;
        }
        cheb chebVar = this.aA;
        if (chebVar != null) {
            chebVar.b();
            this.aA = null;
        }
        elgo aU = aU();
        int size = aU.size();
        for (int i = 0; i < size; i++) {
            ((cqrt) aU.get(i)).B();
        }
        this.ai = -1;
        this.s = null;
        this.ap.clear();
        conm.a.b().p("Advertising has stopped", new Object[0]);
    }

    public final void aq() {
        if (ftgf.y() && this.H) {
            this.H = false;
            conm.a.b().h("BLE has %s", true != ctvb.d(this.I) ? "failed turned off" : "successfully turned off");
        }
        this.F.h();
        this.v = false;
        this.w = false;
        this.y.clear();
        this.ar = false;
        this.x = false;
        this.G.g();
        clxl.b().i(null);
        conm.a.b().p("Fast Initiation Scanning has stopped", new Object[0]);
    }

    public final void ar(colr colrVar) {
        if (!ModuleInitializer.a(this)) {
            conm.a.a().p("Cannot sync, because Nearby Share is not available.", new Object[0]);
            return;
        }
        this.b.D(colrVar);
        Account v = v();
        long currentTimeMillis = System.currentTimeMillis();
        if (v != null) {
            cnuw b = ctuq.b(this, v);
            fgrc fgrcVar = (fgrc) b.iQ(5, null);
            fgrcVar.X(b);
            if (!fgrcVar.b.L()) {
                fgrcVar.U();
            }
            cnuw cnuwVar = (cnuw) fgrcVar.b;
            cnuw cnuwVar2 = cnuw.a;
            cnuwVar.b |= 128;
            cnuwVar.k = currentTimeMillis;
            ctuq.p(this, v, (cnuw) fgrcVar.Q());
        }
        Context context = this.I;
        if (ctwa.c(context)) {
            Account c = this.c.c();
            if (c == null) {
                u(0);
            } else {
                cpay.a(context).d(c).z(new dhlq() { // from class: cnyf
                    @Override // defpackage.dhlq
                    public final void gC(Object obj) {
                        final Boolean bool = (Boolean) obj;
                        final NearbySharingChimeraService nearbySharingChimeraService = NearbySharingChimeraService.this;
                        nearbySharingChimeraService.ae(new Runnable() { // from class: cnxz
                            @Override // java.lang.Runnable
                            public final void run() {
                                NearbySharingChimeraService.this.c.C(bool.booleanValue());
                            }
                        });
                    }
                });
            }
        }
        this.K.o(12);
        this.K.o(23);
    }

    public final void as() {
        if (!aw()) {
            conm.a.b().p("Not allowed to auto turn on device settings.", new Object[0]);
            return;
        }
        if (!ax() && !ay()) {
            conm.a.b().p("Don't turn on the device settings without foreground surface.", new Object[0]);
            return;
        }
        final Context context = this.I;
        if (ctxh.e(context)) {
            return;
        }
        ArraySet arraySet = new ArraySet();
        if (Build.VERSION.SDK_INT != 29 && !ctxd.h(context) && !ctxh.f(context)) {
            dhlw c = ctxh.c(context);
            c.z(new dhlq() { // from class: ctvh
                @Override // defpackage.dhlq
                public final void gC(Object obj) {
                    ctvl.d(context, true);
                }
            });
            c.y(new dhln() { // from class: ctvi
                @Override // defpackage.dhln
                public final void gB(Exception exc) {
                    conm.a.e().f(exc).p("Failed to turn on Wifi.", new Object[0]);
                }
            });
            arraySet.add(c);
        }
        if (!ctvb.g(context)) {
            dhlw c2 = ctvb.c(context);
            c2.z(new dhlq() { // from class: ctvj
                @Override // defpackage.dhlq
                public final void gC(Object obj) {
                    ctvl.c(context, true);
                }
            });
            c2.y(new dhln() { // from class: ctvk
                @Override // defpackage.dhln
                public final void gB(Exception exc) {
                    conm.a.e().f(exc).p("Failed to turn on Bluetooth.", new Object[0]);
                }
            });
            arraySet.add(c2);
        }
        chkp.c("turnOnDeviceSettings", dhmr.e(arraySet), ftga.r());
    }

    public final synchronized void at(boolean z) {
        if (this.aw == z) {
            return;
        }
        if (z) {
            this.ax = false;
            this.C = cheb.d(conm.a, new Runnable() { // from class: cnyj
                @Override // java.lang.Runnable
                public final void run() {
                    NearbySharingChimeraService.this.ao();
                }
            }, ftga.a.lK().ct(), this.ay);
        } else {
            cheb chebVar = this.C;
            if (chebVar != null) {
                chebVar.b();
            }
        }
        this.aw = z;
        conm.a.b().i("%s 2.4GHz Wi-Fi connection and %s warming up period", true != z ? "Without" : "Has", true != this.ax ? "in" : "out of");
        W();
    }

    public final void au() {
        if (chen.i(this) && ctxd.i(this)) {
            if (auub.a()) {
                try {
                    TileService.requestListeningState(getApplicationContext(), new ComponentName(getPackageName(), "com.google.android.gms.nearby.sharing.SharingTileService"));
                } catch (IllegalArgumentException e) {
                    conm.a.e().f(e).p("Failed to update quick setting tile.", new Object[0]);
                } catch (SecurityException e2) {
                    conm.a.e().f(e2).p("Failed to update quick setting tile.", new Object[0]);
                }
            }
            if (ftgi.e()) {
                M();
            }
        }
    }

    public final void av() {
        colj coljVar = this.K;
        fauu B = B();
        Intent intent = this.T;
        long c = this.K.c();
        int i = this.aq;
        final Context context = this.I;
        final faly w = colp.w(context, B, intent, c, 0L, i);
        if (ftgf.ac()) {
            coljVar.k(new Runnable() { // from class: colf
                @Override // java.lang.Runnable
                public final void run() {
                    ctut.d(context).c(w);
                }
            });
        }
    }

    public final boolean aw() {
        return this.c.O(v());
    }

    public final boolean ax() {
        return bh(1);
    }

    public final boolean ay() {
        return bj(1, 3, 5, 6);
    }

    public final boolean az(Account account, int i) {
        if (ftga.be()) {
            return this.c.U(account, i);
        }
        return false;
    }

    public final int c(ShareTarget shareTarget) {
        if (ftgi.D()) {
            if (!aH(shareTarget)) {
                return 35511;
            }
            Y(shareTarget);
        }
        aupx aupxVar = (aupx) this.Q.get(Long.valueOf(shareTarget.a));
        if (ftgi.w()) {
            if (aupxVar != null) {
                aupxVar.interrupt();
                ab(shareTarget, new coki(1009).a());
                conm.a.b().p("Set to CANCELLED due to client cancelling during download.", new Object[0]);
                return 0;
            }
            int b = y(shareTarget).b(shareTarget);
            this.M = null;
            conm.a.b().i("Client cancelled file with %s, result: %s", shareTarget, Integer.valueOf(b));
            return b;
        }
        if (aupxVar != null) {
            aupxVar.interrupt();
            ab(shareTarget, new coki(1009).a());
            conm.a.b().p("Set to CANCELLED due to client cancelling during download.", new Object[0]);
            return 0;
        }
        Map map = this.L;
        if (map != null && map.containsKey(shareTarget) && ((TransferMetadata) map.get(shareTarget)).a == 1001) {
            map.put(shareTarget, new coki(1009).a());
            conm.a.b().p("Set to CANCELLED due to client cancelled immediately.", new Object[0]);
        }
        int b2 = y(shareTarget).b(shareTarget);
        this.M = null;
        conm.a.b().i("Client cancelled file with %s, result: %s", shareTarget, Integer.valueOf(b2));
        return b2;
    }

    public final int d(ContactFilter contactFilter) {
        return this.b.d(contactFilter);
    }

    @Override // defpackage.bzot, com.google.android.chimera.BoundService
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(fileDescriptor, printWriter, strArr);
        try {
            printWriter.write("                           .@@@@@@@@@@@@@@@@@@@@@@@.\n                      .@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@.\n                   .@@@@@@@@@                     @@@@@@@@@.\n                 @@@@@@@@                             @@@@@@@@\n               @@@@@@@                                   @@@@@@@\n             @@@@@@@                                       @@@@@@.\n            @@@@@@             @@@@@                         @@@@@@\n           @@@@@@               @@@@@@                        @@@@@@\n          @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@                      @@@@@@\n          .@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@                       @@@@@\n                               @@@@@@@                          @@@@@\n                              @@@@@        @@@@@\n          @@@@@                          @@@@@@\n          @@@@@                       @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@.\n          @@@@@@                      @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n           @@@@@@                        @@@@@@               @@@@@@\n            @@@@@@                         @@@@@             @@@@@@\n             @@@@@@@                                       @@@@@@.\n               @@@@@@@                                   @@@@@@@\n                 @@@@@@@@                             @@@@@@@@\n                   .@@@@@@@@@                     @@@@@@@@@.\n                       @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n                           .@@@@@@@@@@@@@@@@@@@@@@@.\n");
            printWriter.write("\n");
            printWriter.write(String.format("%s\n", "com.google.android.gms.nearby.sharing.NearbySharingService"));
            printWriter.flush();
            printWriter.write("  Device Settings: \n");
            printWriter.write(String.format("    Version: %s\n", ftgf.f()));
            Context context = this.I;
            int m = ctwt.m(context);
            printWriter.write(String.format("    Device Type: %s\n", m != 1 ? m != 2 ? m != 3 ? "LAPTOP" : "TABLET" : "PHONE" : "UNKNOWN_DEVICE_TYPE"));
            printWriter.write(String.format("    Account Type: %s\n", ftga.aT()));
            printWriter.flush();
            printWriter.write("  User Settings: \n");
            printWriter.write(String.format("    Device name: %s\n", this.c.h(v())));
            printWriter.write(String.format("    Opted In: %s\n", Boolean.valueOf(ctwa.c(context))));
            printWriter.write(String.format("    Enabled: %s\n", Boolean.valueOf(aA())));
            printWriter.write(String.format("    Visibility: %s\n", ctwy.s(k())));
            printWriter.write(String.format("    Data Usage Preference: %s\n", D(i())));
            printWriter.write(String.format("    Show HUN Enabled: %s\n", Boolean.valueOf(aB())));
            printWriter.flush();
            printWriter.write("  System State: \n");
            printWriter.write(String.format("    Screen Unlocked: %s\n", Boolean.valueOf(this.at)));
            printWriter.write(String.format("    Airplane Mode Enabled: %s\n", Boolean.valueOf(ctxh.e(this))));
            printWriter.write(String.format("    Bluetooth Enabled: %s\n", Boolean.valueOf(this.B)));
            printWriter.write(String.format("    BLE Enabled: %s\n", Boolean.valueOf(ctvb.e(context))));
            printWriter.write(String.format("    WiFi Enabled: %s\n", Boolean.valueOf(ctxh.f(this))));
            printWriter.write(String.format("    Location Enabled: %s\n", Boolean.valueOf(this.av)));
            printWriter.write(String.format("    Battery Saver Enabled: %s\n", Boolean.valueOf(this.au)));
            printWriter.write(String.format("    Do-Not-Disturb Enabled: %s\n", Boolean.valueOf(Settings.Global.getInt(this.G.a.getContentResolver(), "zen_mode", 0) != 0)));
            printWriter.write(String.format("    Primary Profile: %s\n", Boolean.valueOf(chen.i(this))));
            printWriter.write(String.format("    Setup Wizard In Progress: %s\n", Boolean.valueOf(!bp())));
            printWriter.flush();
            printWriter.write("  Internal State: \n");
            printWriter.write(String.format("    Advertising: %s\n", Boolean.valueOf(bk())));
            printWriter.write(String.format("    Scanning: %s\n", Boolean.valueOf(aE())));
            printWriter.write(String.format("    Transferring Files: %s\n", Boolean.valueOf(aI())));
            printWriter.write("    Registered Receive Surfaces:\n");
            this.n.g(printWriter, new chei() { // from class: cnxx
                @Override // defpackage.chei
                public final String a(Object obj) {
                    return NearbySharingChimeraService.H((cokk) obj);
                }
            }, new chei() { // from class: cnyi
                @Override // defpackage.chei
                public final String a(Object obj) {
                    String str;
                    coey coeyVar = (coey) obj;
                    int i = NearbySharingChimeraService.ad;
                    String G = NearbySharingChimeraService.G(coeyVar.a);
                    int i2 = coeyVar.b;
                    if (i2 == 0) {
                        str = "GOOGLE";
                    } else if (i2 != 1) {
                        str = "UNKNOWN[" + i2 + "]";
                    } else {
                        str = "SAMSUNG";
                    }
                    return G + " | " + str;
                }
            });
            printWriter.write("    Registered Send Surfaces:\n");
            this.o.g(printWriter, new chei() { // from class: cnyr
                @Override // defpackage.chei
                public final String a(Object obj) {
                    return NearbySharingChimeraService.H((cokk) obj);
                }
            }, new chei() { // from class: cnys
                @Override // defpackage.chei
                public final String a(Object obj) {
                    int i = NearbySharingChimeraService.ad;
                    return cojg.a(((coez) obj).b);
                }
            });
            printWriter.write(String.format("    Fast Init Advertising: %s\n", Boolean.valueOf(this.F.i())));
            printWriter.write(String.format("    Fast Init Scanning: %s\n", Boolean.valueOf(this.F.k())));
            printWriter.write(String.format("    Fast Init HUN Suppressed: %s\n", Boolean.valueOf(this.G.c.b())));
            printWriter.write(String.format("    Number of Owned Devices: %s\n", Integer.valueOf(this.c.b())));
            itn itnVar = this.r;
            if (itnVar != null) {
                printWriter.write(String.format("    Cached Attachments: %s\n", itnVar.b));
            }
            printWriter.flush();
            if (ftgi.D()) {
                printWriter.write("  Discovered ShareTargets:\n");
                this.N.g(printWriter, new chei() { // from class: cnyt
                    @Override // defpackage.chei
                    public final String a(Object obj) {
                        int i = NearbySharingChimeraService.ad;
                        return Long.toString(((Long) obj).longValue());
                    }
                }, new chei() { // from class: cnyu
                    @Override // defpackage.chei
                    public final String a(Object obj) {
                        int i = NearbySharingChimeraService.ad;
                        return ((ShareTarget) obj).b;
                    }
                });
                printWriter.write("  Outgoing Transfers:\n");
                this.O.g(printWriter, new chei() { // from class: cnyv
                    @Override // defpackage.chei
                    public final String a(Object obj) {
                        int i = NearbySharingChimeraService.ad;
                        return Long.toString(((Long) obj).longValue());
                    }
                }, new chei() { // from class: cnyw
                    @Override // defpackage.chei
                    public final String a(Object obj) {
                        cofa cofaVar = (cofa) obj;
                        String str = cofaVar.a.b;
                        int i = cofaVar.b.a;
                        int i2 = NearbySharingChimeraService.ad;
                        return str + " | " + TransferMetadata.c(i);
                    }
                });
                printWriter.write("  Incoming Transfers:\n");
                this.P.g(printWriter, new chei() { // from class: cnxc
                    @Override // defpackage.chei
                    public final String a(Object obj) {
                        int i = NearbySharingChimeraService.ad;
                        return Long.toString(((Long) obj).longValue());
                    }
                }, new chei() { // from class: cnxd
                    @Override // defpackage.chei
                    public final String a(Object obj) {
                        cofa cofaVar = (cofa) obj;
                        String str = cofaVar.a.b;
                        int i = cofaVar.b.a;
                        int i2 = NearbySharingChimeraService.ad;
                        return str + " | " + TransferMetadata.c(i);
                    }
                });
            } else {
                this.S.h(printWriter);
            }
            if (ftgf.a.lK().X()) {
                chjt.b(new auti(printWriter, "  "), ftgh.class, ftgk.class);
            }
            cpbz cpbzVar = this.F;
            printWriter.write(String.format("%s\n", "com.google.android.gms.nearby.sharing.discovery.FastInitiation"));
            printWriter.write(String.format("  Scan Mode: %s\n", cpbz.c(cpbzVar.b)));
            printWriter.write(String.format("  Current Advertising Fast Init Type: %s\n", cpbz.b(cpbzVar.g)));
            printWriter.write(String.format("  Reported BLE Metadata: %s\n", cpbzVar.f));
            printWriter.write(String.format("  %s\n", "Sighted BLE Peripherals"));
            elsn listIterator = elgx.k(cpbzVar.c).entrySet().listIterator();
            while (listIterator.hasNext()) {
                Map.Entry entry = (Map.Entry) listIterator.next();
                printWriter.write(String.format("    %s -> %s\n", entry.getKey(), entry.getValue()));
            }
            printWriter.flush();
            cqrl cqrlVar = this.c;
            if (cqrlVar != null) {
                cqrlVar.n(printWriter);
            }
            cqrt cqrtVar = this.b;
            if (cqrtVar != null) {
                cqrtVar.p(printWriter);
            }
            colj coljVar = this.K;
            if (coljVar != null) {
                cont contVar = coljVar.f.a;
                if (!contVar.isEmpty()) {
                    printWriter.write("\n[Analytics Logger Dump]\n");
                    Iterator it = contVar.iterator();
                    while (it.hasNext()) {
                        printWriter.write(String.valueOf((String) it.next()).concat("\n"));
                    }
                }
            }
            printWriter.flush();
        } catch (RuntimeException e) {
            printWriter.write("  Dump was interrupted by a runtime error: ".concat(String.valueOf(e.getMessage())));
            printWriter.flush();
        }
    }

    public final int f(int i) {
        if (i == 1) {
            ContactFilter contactFilter = new ContactFilter();
            contactFilter.b = true;
            return d(contactFilter);
        }
        if (i != 2) {
            return 0;
        }
        ContactFilter contactFilter2 = new ContactFilter();
        contactFilter2.a = true;
        return d(contactFilter2);
    }

    @Override // defpackage.jvc
    public final juq getLifecycle() {
        return this.aX.a;
    }

    public final int i() {
        return this.c.a();
    }

    final int j() {
        int[] iArr = {1, 3, 2, 5, 6};
        for (int i = 0; i < 5; i++) {
            int i2 = iArr[i];
            if (bj(Integer.valueOf(i2))) {
                return i2;
            }
        }
        return 0;
    }

    public final int k() {
        return x().f;
    }

    public final int o(ShareTarget shareTarget) {
        if (ftgi.D()) {
            Y(shareTarget);
        }
        int g = y(shareTarget).g(shareTarget);
        this.M = null;
        conm.a.b().h("Client opened incoming file from %s", shareTarget);
        return g;
    }

    @Override // defpackage.bzot, com.google.android.chimera.BoundService, defpackage.rtr
    public final IBinder onBind(Intent intent) {
        this.aX.a();
        return super.onBind(intent);
    }

    @Override // defpackage.cofq, com.google.android.chimera.BoundService, defpackage.rtr
    public final void onCreate() {
        this.aX.b();
        aR();
        if (!ModuleInitializer.a(this)) {
            conm.a.b().p("Nearby sharing service is disabled.  Do not instantiate Nearby Share", new Object[0]);
            return;
        }
        conm.a.b().p("NearbySharingService onCreate", new Object[0]);
        Context context = this.I;
        this.K = colj.f(context);
        this.J = (PowerManager) getApplicationContext().getSystemService(PowerManager.class);
        if (!ftgi.r()) {
            this.Y = new ekxc(QuickShareRoomDatabase.m.a(context));
        }
        if (this.az == null) {
            this.az = chkv.g(new chiy(ftfn.b(), ftgi.B()));
        }
        ae(new Runnable() { // from class: cnye
            @Override // java.lang.Runnable
            public final void run() {
                File[] listFiles;
                cpcg cpcgVar = new cpcg();
                NearbySharingChimeraService nearbySharingChimeraService = NearbySharingChimeraService.this;
                nearbySharingChimeraService.A = cpcgVar;
                if (nearbySharingChimeraService.c == null) {
                    Context context2 = nearbySharingChimeraService.I;
                    String c = bzlw.c(nearbySharingChimeraService.w(), "device_id", null);
                    if (c == null) {
                        SecureRandom secureRandom = new SecureRandom();
                        StringBuilder sb = new StringBuilder();
                        for (int i = 0; i < 10; i++) {
                            sb.append("ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".charAt(secureRandom.nextInt(36)));
                        }
                        c = sb.toString();
                        bzlt c2 = nearbySharingChimeraService.w().c();
                        c2.h("device_id", c);
                        bzlw.g(c2);
                    }
                    nearbySharingChimeraService.c = new cqrl(context2, c);
                }
                if (nearbySharingChimeraService.m == null) {
                    nearbySharingChimeraService.m = new comd(nearbySharingChimeraService.I);
                }
                nearbySharingChimeraService.b = nearbySharingChimeraService.z();
                Context context3 = nearbySharingChimeraService.I;
                ctvl.b(context3);
                if (nearbySharingChimeraService.v() == null) {
                    nearbySharingChimeraService.ah();
                }
                nearbySharingChimeraService.c.m(nearbySharingChimeraService.v());
                nearbySharingChimeraService.b.v(nearbySharingChimeraService.k());
                if (nearbySharingChimeraService.aA()) {
                    nearbySharingChimeraService.al();
                }
                nearbySharingChimeraService.aJ();
                nearbySharingChimeraService.V();
                if (coog.b(context3).i()) {
                    ContentResolver contentResolver = context3.getContentResolver();
                    if (coog.b(context3).i() && auub.b()) {
                        int integer = nearbySharingChimeraService.getResources().getInteger(R.integer.sharing_max_name_length_bytes);
                        nearbySharingChimeraService.R = new coah(nearbySharingChimeraService, contentResolver, integer);
                        try {
                            contentResolver.registerContentObserver(Settings.Global.getUriFor("device_name"), false, nearbySharingChimeraService.R);
                        } catch (SecurityException unused) {
                            conm.a.e().h("Failed to register content observer for %s", Settings.Global.getUriFor("device_name"));
                        }
                        String a = chig.a(contentResolver, "device_name");
                        if (a != null) {
                            String a2 = ctxa.a(a, integer);
                            conm.a.b().h("Changing Nearby Share device name to %s", a2);
                            nearbySharingChimeraService.r(a2);
                        }
                    }
                }
                if (ftgf.q()) {
                    File file = new File(nearbySharingChimeraService.C(true), "nearby_share_previews");
                    if (file.exists() && (listFiles = file.listFiles()) != null) {
                        for (File file2 : listFiles) {
                            conm.a.a().h("Deleting preview file: %s", file2.getName());
                            file2.delete();
                        }
                    }
                }
                nearbySharingChimeraService.M();
            }
        });
        cofp d = cofp.d(context);
        this.G = d;
        d.e();
        this.aO = new ctvg(this.az, ftga.a.lK().bI(), TimeUnit.MILLISECONDS);
        if (ModuleInitializer.a(this)) {
            this.aH = new AnonymousClass2();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            ind.b(this, this.aH, intentFilter, 2);
            ae(new Runnable() { // from class: cnxu
                @Override // java.lang.Runnable
                public final void run() {
                    NearbySharingChimeraService nearbySharingChimeraService = NearbySharingChimeraService.this;
                    nearbySharingChimeraService.aj(nearbySharingChimeraService.J.isPowerSaveMode());
                }
            });
            this.aG = new AnonymousClass3();
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction("android.intent.action.SCREEN_ON");
            intentFilter2.addAction("android.intent.action.SCREEN_OFF");
            intentFilter2.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            intentFilter2.addAction("android.intent.action.USER_PRESENT");
            ind.b(this, this.aG, intentFilter2, 2);
            DisplayManager displayManager = (DisplayManager) getSystemService(DisplayManager.class);
            coab coabVar = new coab(this);
            this.aI = coabVar;
            displayManager.registerDisplayListener(coabVar, new caqj(Looper.getMainLooper()));
            ae(new Runnable() { // from class: cnxy
                @Override // java.lang.Runnable
                public final void run() {
                    NearbySharingChimeraService nearbySharingChimeraService = NearbySharingChimeraService.this;
                    nearbySharingChimeraService.ak(ctwt.j(nearbySharingChimeraService.getApplicationContext()));
                }
            });
            AnonymousClass5 anonymousClass5 = new AnonymousClass5();
            this.aK = anonymousClass5;
            ind.b(this, anonymousClass5, new IntentFilter("android.location.MODE_CHANGED"), 2);
            ae(new Runnable() { // from class: cnxm
                @Override // java.lang.Runnable
                public final void run() {
                    NearbySharingChimeraService nearbySharingChimeraService = NearbySharingChimeraService.this;
                    nearbySharingChimeraService.ai(ezuc.b(nearbySharingChimeraService));
                }
            });
            AnonymousClass6 anonymousClass6 = new AnonymousClass6();
            this.aL = anonymousClass6;
            ind.b(this, anonymousClass6, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"), 2);
            ae(new Runnable() { // from class: cnxv
                @Override // java.lang.Runnable
                public final void run() {
                    NearbySharingChimeraService nearbySharingChimeraService = NearbySharingChimeraService.this;
                    nearbySharingChimeraService.ag(ctvb.g(nearbySharingChimeraService));
                }
            });
            if (ftgf.y()) {
                AnonymousClass7 anonymousClass7 = new AnonymousClass7();
                this.aM = anonymousClass7;
                ind.b(this, anonymousClass7, new IntentFilter("android.bluetooth.adapter.action.BLE_STATE_CHANGED"), 2);
            }
            this.aJ = new AnonymousClass1();
            IntentFilter intentFilter3 = new IntentFilter();
            intentFilter3.addAction("com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE");
            intentFilter3.addCategory("com.google.android.gms.auth.category.ACCOUNT_REMOVED");
            intentFilter3.addCategory("com.google.android.gms.auth.category.ACCOUNT_ADDED");
            ind.c(this, this.aJ, intentFilter3, "com.google.android.gms.auth.permission.GOOGLE_ACCOUNT_CHANGE", null, 2);
            AnonymousClass10 anonymousClass10 = new AnonymousClass10();
            this.aP = anonymousClass10;
            chke.b(this, anonymousClass10, new IntentFilter("com.google.android.gms.nearby.sharing.ACTION_AUTO_DISMISS"));
            AnonymousClass11 anonymousClass11 = new AnonymousClass11();
            this.aQ = anonymousClass11;
            ind.b(this, anonymousClass11, new IntentFilter("android.intent.action.DEVICE_STORAGE_LOW"), 2);
            if (ftgf.a.lK().T()) {
                AnonymousClass12 anonymousClass12 = new AnonymousClass12();
                this.aU = anonymousClass12;
                ind.c(this, anonymousClass12, new IntentFilter("com.google.android.gms.nearby.CONNECTION_STATE_CHANGED"), "com.google.android.gms.permission.INTERNAL_BROADCAST", null, true != ftfn.t() ? 2 : 4);
            }
            ContentResolver contentResolver = context.getContentResolver();
            this.aV = new cnzh(this);
            try {
                contentResolver.registerContentObserver(Settings.Global.getUriFor("ble_scan_always_enabled"), false, this.aV);
            } catch (SecurityException e) {
                conm.a.e().f(e).h("Failed to register content observer for %s", Settings.Global.getUriFor("ble_scan_always_enabled"));
            }
            ContentResolver contentResolver2 = this.I.getContentResolver();
            this.aW = new cnzj(this);
            try {
                contentResolver2.registerContentObserver(Settings.Global.getUriFor("device_provisioned"), false, this.aW);
            } catch (SecurityException e2) {
                conm.a.e().f(e2).h("Failed to register content observer for %s", Settings.Global.getUriFor("device_provisioned"));
            }
            this.aR = new AnonymousClass13();
            IntentFilter intentFilter4 = new IntentFilter();
            intentFilter4.addAction("android.intent.action.AIRPLANE_MODE");
            registerReceiver(this.aR, intentFilter4);
            this.aS = new AnonymousClass14();
            IntentFilter intentFilter5 = new IntentFilter();
            intentFilter5.addAction("android.net.wifi.WIFI_STATE_CHANGED");
            registerReceiver(this.aS, intentFilter5);
            this.aT = new AnonymousClass15();
            IntentFilter intentFilter6 = new IntentFilter();
            intentFilter6.addAction("android.intent.action.LOCALE_CHANGED");
            registerReceiver(this.aT, intentFilter6);
            this.aD = new AnonymousClass16();
        }
        if (ftgi.G()) {
            this.aN = new TracingBroadcastReceiver() { // from class: com.google.android.gms.nearby.sharing.NearbySharingChimeraService.8
                @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
                public final void jP(final Context context2, Intent intent) {
                    NearbySharingChimeraService.this.ae(new Runnable() { // from class: coaf
                        @Override // java.lang.Runnable
                        public final void run() {
                            cnvg.a(context2);
                        }
                    });
                }
            };
            IntentFilter intentFilter7 = new IntentFilter();
            intentFilter7.addAction("android.intent.action.USER_SWITCHED");
            ind.b(this, this.aN, intentFilter7, 2);
            ae(new Runnable() { // from class: cnyb
                @Override // java.lang.Runnable
                public final void run() {
                    cnvg.a(NearbySharingChimeraService.this);
                }
            });
        }
        conm.a.b().p("NearbySharingService created", new Object[0]);
    }

    @Override // defpackage.bzot, com.google.android.chimera.BoundService, defpackage.rtr
    public final void onDestroy() {
        this.aX.c();
        ae(new Runnable() { // from class: cnxn
            @Override // java.lang.Runnable
            public final void run() {
                NearbySharingChimeraService nearbySharingChimeraService = NearbySharingChimeraService.this;
                nearbySharingChimeraService.aM();
                nearbySharingChimeraService.ap();
                nearbySharingChimeraService.F.f();
                nearbySharingChimeraService.an();
                csrr csrrVar = nearbySharingChimeraService.d;
                if (csrrVar != null) {
                    csrrVar.m();
                }
            }
        });
        cheb chebVar = this.C;
        if (chebVar != null) {
            chebVar.b();
            this.C = null;
        }
        chkv.h(this.az, "NearbySharingServiceExecutor");
        chkv.h(this.ay, "NearbySharingServiceExecutor.alarmExecutor");
        chkv.h(this.D, "NearbySharingServiceExecutor.downloadAttachmentsExecutor");
        Context context = this.I;
        chke.g(context, this.aH, this.aG);
        if (this.aI != null) {
            ((DisplayManager) getSystemService(DisplayManager.class)).unregisterDisplayListener(this.aI);
            this.aI = null;
        }
        chke.g(context, this.aK, this.aL, this.aP, this.aQ, this.aU, this.aJ, this.aM, this.aR, this.aS, this.aT, this.aN);
        if (this.aV != null) {
            context.getContentResolver().unregisterContentObserver(this.aV);
        }
        if (this.aW != null) {
            context.getContentResolver().unregisterContentObserver(this.aW);
        }
        if (this.R != null) {
            context.getContentResolver().unregisterContentObserver(this.R);
        }
        if (this.aD != null) {
            SharingSyncChimeraService.d(context);
            chke.f(context, this.aD);
            this.as = false;
        }
        conm.a.b().p("NearbySharingService destroyed", new Object[0]);
        super.onDestroy();
    }

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final boolean onUnbind(Intent intent) {
        return true;
    }

    public final int p(ShareTarget shareTarget, Intent intent, boolean z) {
        if (!aE()) {
            conm.a.b().p("Failed to send file to remote ShareTarget. Not scanning.", new Object[0]);
            return ftgf.ah() ? 35511 : 13;
        }
        if (!bi()) {
            conm.a.b().p("Failed to send file to remote ShareTarget. No registered share sheet.", new Object[0]);
            return ftgf.ah() ? 35511 : 13;
        }
        if (ftgi.D() && (aH(shareTarget) || !this.N.k(Long.valueOf(shareTarget.a)))) {
            return 35511;
        }
        if (ftgf.s()) {
            as();
        }
        if (intent.hasExtra("referrer_package_name")) {
            this.K.g = intent.getStringExtra("referrer_package_name");
        }
        shareTarget.o();
        if (ftgi.j()) {
            coki cokiVar = new coki(1001);
            cokiVar.h = true;
            ab(shareTarget, cokiVar.a());
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        if (shareTarget.e().isEmpty()) {
            eqhc eqhcVar = new eqhc();
            O(shareTarget, intent, new cnzu(this, atomicBoolean, shareTarget, eqhcVar, intent));
            if (chkp.a("downloadAttachments", eqhcVar) != 0) {
                conm.a.e().p("Failed to send file to remote ShareTarget. No attachment found.", new Object[0]);
                ab(shareTarget, new coki(1011).a());
                return 35514;
            }
        }
        colj coljVar = this.K;
        List e = shareTarget.e();
        faly w = colp.w(this.I, B(), this.T, this.K.c(), 0L, this.aq);
        fgrc L = colp.L(5);
        fgrc v = falq.a.v();
        fall v2 = colp.v(e);
        if (!v.b.L()) {
            v.U();
        }
        falq falqVar = (falq) v.b;
        v2.getClass();
        falqVar.c = v2;
        falqVar.b |= 1;
        falq falqVar2 = (falq) v.Q();
        if (!L.b.L()) {
            L.U();
        }
        fans fansVar = (fans) L.b;
        fans fansVar2 = fans.a;
        falqVar2.getClass();
        fansVar.h = falqVar2;
        fansVar.b |= 32;
        if (!L.b.L()) {
            L.U();
        }
        fans fansVar3 = (fans) L.b;
        w.getClass();
        fansVar3.Y = w;
        fansVar3.c |= 8388608;
        coljVar.i(new cokr((fans) L.Q()));
        if (intent.hasExtra("com.google.android.gms.nearby.sharing.EXTRA_REQUIRED_PACKAGE")) {
            shareTarget.e.putString("com.google.android.gms.nearby.sharing.EXTRA_REQUIRED_PACKAGE", intent.getStringExtra("com.google.android.gms.nearby.sharing.EXTRA_REQUIRED_PACKAGE"));
        }
        bb(false);
        this.am = true;
        aZ();
        PendingIntent pendingIntent = shareTarget.j;
        if (pendingIntent == null) {
            return y(shareTarget).h(F(), shareTarget, new cokk() { // from class: cnxl
                @Override // defpackage.cokk
                public final void e(final ShareTarget shareTarget2, final TransferMetadata transferMetadata) {
                    final NearbySharingChimeraService nearbySharingChimeraService = NearbySharingChimeraService.this;
                    final AtomicBoolean atomicBoolean2 = atomicBoolean;
                    nearbySharingChimeraService.ae(new Runnable() { // from class: cnyo
                        @Override // java.lang.Runnable
                        public final void run() {
                            NearbySharingChimeraService nearbySharingChimeraService2 = NearbySharingChimeraService.this;
                            ShareTarget shareTarget3 = shareTarget2;
                            TransferMetadata transferMetadata2 = transferMetadata;
                            if (!atomicBoolean2.get() || ftgi.j()) {
                                nearbySharingChimeraService2.ab(shareTarget3, transferMetadata2);
                                return;
                            }
                            coki a = transferMetadata2.a();
                            a.h = false;
                            nearbySharingChimeraService2.ab(shareTarget3, a.a());
                        }
                    });
                }
            }, z);
        }
        String g = this.S.g(shareTarget);
        elgo elgoVar = ctxa.a;
        if (TextUtils.isEmpty(g)) {
            ab(shareTarget, new coki(1007).a());
            conm.a.b().i("Unable to send to %s by action %s due to missing package name", shareTarget, pendingIntent);
            return 13;
        }
        Iterator it = shareTarget.f().iterator();
        while (it.hasNext()) {
            Uri uri = ((FileAttachment) it.next()).d;
            if (uri != null) {
                this.W.b(g, uri);
            }
        }
        try {
            pendingIntent.send(this, 0, intent);
            conm.a.b().j("Sent to %s by action %s for package %s", shareTarget, pendingIntent, g);
        } catch (PendingIntent.CanceledException e2) {
            conm.a.e().f(e2).j("Failed to send to %s by action %s for package %s", shareTarget, pendingIntent, g);
            if (ftgf.ah()) {
                return 13;
            }
        }
        coki cokiVar2 = new coki(1015);
        cokiVar2.h = (atomicBoolean.get() || ftgi.j()) ? false : true;
        ab(shareTarget, cokiVar2.a());
        return 0;
    }

    public final int q(Account account) {
        cofa cofaVar;
        if (!ftgf.a.lK().l() && (aI() || bn())) {
            conm.a.b().p("Skipped setting account since a transfer is ongoing", new Object[0]);
            return 13;
        }
        if (Objects.equals(account, v())) {
            return 35500;
        }
        if (!this.c.Z(account)) {
            return 13;
        }
        if (account == null) {
            bzlt c = w().c();
            c.j("account");
            bzlw.g(c);
        } else {
            bzlt c2 = w().c();
            c2.h("account", account.name);
            bzlw.g(c2);
        }
        String h = this.c.h(account);
        elgo elgoVar = ctxa.a;
        if (TextUtils.isEmpty(h)) {
            this.c.w(F());
        }
        au();
        if (!ftgi.e()) {
            M();
        }
        if (ctuq.o(this, account)) {
            colq colqVar = new colq();
            colqVar.a = 16;
            colqVar.b = 1;
            ar(new colr(colqVar));
        }
        if (bk()) {
            ap();
            conm.a.b().p("Account has changed. Refreshing receive surface state.", new Object[0]);
            U();
        }
        if (ftgi.j()) {
            chem chemVar = this.N;
            for (ShareTarget shareTarget : chemVar.e()) {
                chem chemVar2 = this.O;
                Long valueOf = Long.valueOf(shareTarget.a);
                if (!chemVar2.k(valueOf) || (cofaVar = (cofa) chemVar2.a(valueOf)) == null || cofaVar.b.e) {
                    Iterator it = this.o.e().iterator();
                    while (it.hasNext()) {
                        ((coez) it.next()).a.c(shareTarget);
                    }
                    this.S.m(shareTarget);
                }
            }
            chemVar.f();
            elgo aU = aU();
            int size = aU.size();
            for (int i = 0; i < size; i++) {
                ((cqrt) aU.get(i)).z();
                this.K.n();
                av();
            }
        } else if (aE()) {
            aM();
            conm.a.b().p("Account has changed. Refreshing send surface state.", new Object[0]);
        }
        if (bi()) {
            conm.a.b().p("Account has changed. Refreshing send surface state.", new Object[0]);
            aZ();
        }
        this.K.h(this.I.getApplicationContext(), this.c.c());
        return 0;
    }

    public final int r(String str) {
        String trim = str.trim();
        elgo elgoVar = ctxa.a;
        if (TextUtils.isEmpty(trim)) {
            conm.a.e().p("deviceName cannot be empty", new Object[0]);
            return 13;
        }
        int integer = getResources().getInteger(R.integer.sharing_max_name_length_bytes);
        Charset charset = ae;
        if (trim.getBytes(charset).length > integer) {
            conm.a.e().i("deviceName is too large. Expected at most %d bytes. Got %d bytes.", Integer.valueOf(integer), Integer.valueOf(trim.getBytes(charset).length));
            return 13;
        }
        if (ftga.a.lK().da() && trim.equals("code:reset")) {
            ad();
            conm.a.b().p("Reset all local Nearby Sharing state", new Object[0]);
            return 35503;
        }
        if (F().equals(trim)) {
            return 35500;
        }
        this.c.x(trim);
        Context context = this.I;
        if (coog.b(context).i() && auub.b() && !trim.equals(ctxa.a(ekvk.b(chig.a(context.getContentResolver(), "device_name")), integer))) {
            Settings.Global.putString(context.getContentResolver(), "device_name", trim);
        }
        if (bk()) {
            ap();
            conm.a.b().p("Device name has changed. Refreshing receive surface state.", new Object[0]);
            U();
        }
        M();
        conm.a.b().h("Device name set to %s", trim);
        int length = !TextUtils.isEmpty(trim) ? trim.length() : 0;
        colj coljVar = this.K;
        fgrc L = colp.L(46);
        fgrc v = fanc.a.v();
        if (!v.b.L()) {
            v.U();
        }
        fanc fancVar = (fanc) v.b;
        fancVar.b |= 1;
        fancVar.c = length;
        if (!L.b.L()) {
            L.U();
        }
        fans fansVar = (fans) L.b;
        fanc fancVar2 = (fanc) v.Q();
        fans fansVar2 = fans.a;
        fancVar2.getClass();
        fansVar.R = fancVar2;
        fansVar.c |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
        coljVar.i(new coks((fans) L.Q()));
        return 0;
    }

    public final int s(int i, long j, String str) {
        final long j2 = j;
        if (i != 0 && i != 1 && i != 3 && i != 4) {
            conm.a.e().p("Cannot set invalid device visibility.", new Object[0]);
            return 13;
        }
        int i2 = this.c.d(v()).f;
        if (i != 3 && i2 == i) {
            conm.a.e().p("Cannot set device visibility, since already in the desired visibility.", new Object[0]);
            return 35500;
        }
        cheb chebVar = this.aB;
        if (chebVar != null) {
            chebVar.b();
            this.aB = null;
        }
        this.c.y(i, j2);
        this.b.v(i);
        if (j2 == 0) {
            this.c.G();
            j2 = 0;
        }
        DeviceVisibility x = x();
        int i3 = x.f;
        if (i3 == 1 || i3 == 2 || (i3 == 3 && x.j)) {
            Context context = this.I;
            if (!ctwa.d(context)) {
                ctwo.i(context);
            }
        }
        chet chetVar = conm.a;
        chetVar.b().h("Visibility mode changed to %s", ctwy.s(i));
        colj coljVar = this.K;
        fgrc L = colp.L(4);
        fgrc v = fand.a.v();
        fauy a = ctvw.a(i2);
        if (!v.b.L()) {
            v.U();
        }
        fgri fgriVar = v.b;
        fand fandVar = (fand) fgriVar;
        fandVar.d = a.g;
        fandVar.b |= 2;
        fauy a2 = ctvw.a(i);
        if (!fgriVar.L()) {
            v.U();
        }
        fgri fgriVar2 = v.b;
        fand fandVar2 = (fand) fgriVar2;
        fandVar2.c = a2.g;
        fandVar2.b |= 1;
        fatb x2 = colp.x(ekvk.b(str));
        if (!fgriVar2.L()) {
            v.U();
        }
        fgri fgriVar3 = v.b;
        fand fandVar3 = (fand) fgriVar3;
        fandVar3.e = x2.n;
        fandVar3.b |= 4;
        if (!fgriVar3.L()) {
            v.U();
        }
        fand fandVar4 = (fand) v.b;
        fandVar4.b |= 8;
        fandVar4.f = j2;
        if (!L.b.L()) {
            L.U();
        }
        fans fansVar = (fans) L.b;
        fand fandVar5 = (fand) v.Q();
        fans fansVar2 = fans.a;
        fandVar5.getClass();
        fansVar.g = fandVar5;
        fansVar.b |= 16;
        coljVar.i(new coks((fans) L.Q()));
        if (i == 3 && j2 > 0) {
            final int i4 = x().g;
            this.aB = cheb.d(chetVar, new Runnable() { // from class: cnxw
                @Override // java.lang.Runnable
                public final void run() {
                    chet b = conm.a.b();
                    long j3 = j2;
                    int i5 = i4;
                    b.i("Reverting visibility to %s after %s millis", ctwy.s(i5), Long.valueOf(j3));
                    NearbySharingChimeraService nearbySharingChimeraService = NearbySharingChimeraService.this;
                    nearbySharingChimeraService.c.F(nearbySharingChimeraService.v(), true);
                    nearbySharingChimeraService.am(i5);
                    nearbySharingChimeraService.s(i5, 0L, "");
                }
            }, Math.max(0L, j2 - 200), this.az);
        }
        if (bk()) {
            chetVar.b().p("Visibility has changed. Refreshing receive surface state.", new Object[0]);
            ap();
        }
        if (aF() && aA()) {
            aq();
        }
        U();
        if (!ftgi.e()) {
            M();
        }
        au();
        if (this.t == null) {
            this.t = chdw.d(this.I);
        }
        this.t.f("com.google.gms.nearby.sharing");
        return 0;
    }

    public final int t(boolean z) {
        if (!ModuleInitializer.a(this)) {
            conm.a.a().p("Cannot set enable, because Nearby Share is not available.", new Object[0]);
            return 35501;
        }
        if ((ftgf.t() ? bzlw.i(w(), "enabled", false) : aA()) == z) {
            return 35500;
        }
        bzlt c = w().c();
        c.e("enabled", z);
        bzlw.g(c);
        if (!z) {
            aY();
            cofp.t();
            chet chetVar = conm.a;
            chetVar.b().p("Stopping scanning because nearby share is disabled.", new Object[0]);
            aM();
            ap();
            chetVar.b().p("Stopping advertising because nearby share is disabled.", new Object[0]);
            aq();
            an();
            Context context = this.I;
            chke.f(context, this.aD);
            chke.f(context, this.aE);
            chke.f(context, this.aF);
            SharingSyncChimeraService.d(context);
            this.as = false;
            ctvz.e(context, C(false));
            this.c.N();
        }
        cqrt z2 = z();
        this.b = z2;
        z2.v(k());
        ctvl.b(this.I);
        if (z) {
            cofp.t();
            al();
            V();
            colq colqVar = new colq();
            colqVar.b = 1;
            colqVar.a = 7;
            P(new colr(colqVar));
        }
        W();
        if (!ftgi.e()) {
            M();
        }
        au();
        conm.a.b().h("NearbySharing was %s", true != z ? "disabled" : "enabled");
        return 0;
    }

    public final int u(int i) {
        return s(i, 0L, "");
    }

    public final Account v() {
        return this.c.c();
    }

    public final bzlv w() {
        return bzna.a(getApplicationContext(), "nearby", "nearbysharing:service:state", 0);
    }

    public final DeviceVisibility x() {
        DeviceVisibility d = this.c.d(v());
        if (ctvt.a(this)) {
            int i = d.f;
            if (i == 1 || i == 2) {
                this.c.y(0, 0L);
                d = this.c.d(v());
            }
            int i2 = d.g;
            if (i2 == 1 || i2 == 2) {
                this.c.y(0, 0L);
                d = this.c.d(v());
            }
        }
        if (d.f == 4 && v() == null) {
            cqrl cqrlVar = this.c;
            int i3 = d.g;
            if (i3 == 4) {
                i3 = (int) ftga.s();
            }
            cqrlVar.y(i3, 0L);
            d = this.c.d(v());
            int i4 = d.f;
            if (i4 != 4) {
                conm.a.b().h("Self-share visibility mode fallback to %s", ctwy.s(i4));
                if (!ftgi.e()) {
                    M();
                }
                au();
                return d;
            }
            conm.a.e().p("missing fallback visibility for self-share with no account", new Object[0]);
        }
        return d;
    }

    public final cqrt y(ShareTarget shareTarget) {
        cqrt c = this.S.c(shareTarget);
        if (c != null) {
            return c;
        }
        conm.a.e().h("Failed to fetch provider for %s", shareTarget);
        return new cqsl();
    }

    public final cqrt z() {
        cqrt cqsmVar;
        cqrt crafVar;
        chet chetVar = conm.a;
        chetVar.d().p("Initializing the SharingProvider.", new Object[0]);
        coex coexVar = this.S;
        if (coexVar.d("INTERNAL_PROVIDER_ID") != null) {
            if (aE()) {
                aM();
            }
            if (bk()) {
                ap();
            }
        }
        coexVar.k("INTERNAL_PROVIDER_ID");
        if (this.d == null || (aA() && (this.d.n() || this.d.o()))) {
            Context context = this.I;
            this.d = new csrr(context, this.c, this.K);
            this.ag = new cqyx(context, this.c, this.d);
            this.F = new cpbz(this, this.ag);
        }
        cqrt d = coexVar.d("INTERNAL_PROVIDER_ID");
        Context applicationContext = getApplicationContext();
        if (d != null) {
            return d;
        }
        if (ftga.a.lK().dq()) {
            crafVar = new csbr(applicationContext);
        } else {
            if (aA()) {
                cqsmVar = ftgi.r() ? new crbi(applicationContext, this.c, this.m, this.ag, this.d, this.K, this.Z, this, this.ac) : new crbi(applicationContext, this.c, this.m, this.ag, this.d, this.K, this.Y, this, this.ac);
            } else {
                chetVar.a().p("Initiated DisabledNearbySharingProvider, because Nearby Share is disabled.", new Object[0]);
                if (ftgi.a.lK().o()) {
                    crafVar = new craf(this.d);
                } else {
                    cqsmVar = new cqsm(applicationContext, this.c, this.m, this.ag, this.d, this.K, this.Y);
                }
            }
            crafVar = cqsmVar;
        }
        coexVar.j(crafVar, new coew("INTERNAL_PROVIDER_ID", getPackageName()));
        return crafVar;
    }
}
