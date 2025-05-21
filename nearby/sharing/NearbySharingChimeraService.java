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
import defpackage.acn;
import defpackage.aqxi;
import defpackage.arbp;
import defpackage.aruf;
import defpackage.asmd;
import defpackage.aspo;
import defpackage.asqh;
import defpackage.bry;
import defpackage.bxdd;
import defpackage.bxdf;
import defpackage.bxdg;
import defpackage.bxek;
import defpackage.bxgj;
import defpackage.byhr;
import defpackage.cewl;
import defpackage.cewq;
import defpackage.cewx;
import defpackage.cexb;
import defpackage.cexc;
import defpackage.cexf;
import defpackage.cexi;
import defpackage.cezt;
import defpackage.cfag;
import defpackage.cfaj;
import defpackage.cfau;
import defpackage.cfbm;
import defpackage.cfbn;
import defpackage.cfch;
import defpackage.cfcs;
import defpackage.cfdd;
import defpackage.cfde;
import defpackage.cfdi;
import defpackage.cfdj;
import defpackage.cjpg;
import defpackage.ckjx;
import defpackage.cllc;
import defpackage.cllt;
import defpackage.clmo;
import defpackage.clos;
import defpackage.clpg;
import defpackage.clqf;
import defpackage.clqz;
import defpackage.clrb;
import defpackage.clrm;
import defpackage.clrt;
import defpackage.clwl;
import defpackage.clwm;
import defpackage.clwo;
import defpackage.clwp;
import defpackage.clwq;
import defpackage.clwr;
import defpackage.clws;
import defpackage.clxh;
import defpackage.clxi;
import defpackage.cmbv;
import defpackage.cmbw;
import defpackage.cmca;
import defpackage.cmcc;
import defpackage.cmcj;
import defpackage.cmck;
import defpackage.cmdb;
import defpackage.cmdh;
import defpackage.cmdi;
import defpackage.cmdj;
import defpackage.cmdv;
import defpackage.cmfe;
import defpackage.cmfl;
import defpackage.cmfv;
import defpackage.cmfy;
import defpackage.cmgj;
import defpackage.cmsq;
import defpackage.cmtr;
import defpackage.cmty;
import defpackage.coiq;
import defpackage.coir;
import defpackage.cois;
import defpackage.coiu;
import defpackage.coix;
import defpackage.coiy;
import defpackage.cojq;
import defpackage.cojr;
import defpackage.copw;
import defpackage.coqc;
import defpackage.cork;
import defpackage.cosn;
import defpackage.cpsw;
import defpackage.cqin;
import defpackage.crlk;
import defpackage.crll;
import defpackage.crlm;
import defpackage.crlo;
import defpackage.crlw;
import defpackage.crlx;
import defpackage.crly;
import defpackage.crmb;
import defpackage.crmg;
import defpackage.crmi;
import defpackage.crmo;
import defpackage.crmr;
import defpackage.crmu;
import defpackage.crmv;
import defpackage.crnj;
import defpackage.crno;
import defpackage.crnt;
import defpackage.crnv;
import defpackage.crny;
import defpackage.croc;
import defpackage.dfah;
import defpackage.dfak;
import defpackage.dfaq;
import defpackage.dfau;
import defpackage.dfaz;
import defpackage.dfbl;
import defpackage.dwdg;
import defpackage.eigd;
import defpackage.eiho;
import defpackage.eiif;
import defpackage.eiig;
import defpackage.eiih;
import defpackage.eijj;
import defpackage.eijr;
import defpackage.eijx;
import defpackage.eijy;
import defpackage.eipr;
import defpackage.eitj;
import defpackage.eits;
import defpackage.eiuu;
import defpackage.eivv;
import defpackage.ejck;
import defpackage.ejfg;
import defpackage.ejhf;
import defpackage.enpf;
import defpackage.enre;
import defpackage.ensi;
import defpackage.ensj;
import defpackage.ensv;
import defpackage.entj;
import defpackage.exfy;
import defpackage.exwz;
import defpackage.exxe;
import defpackage.exxm;
import defpackage.exyq;
import defpackage.exyr;
import defpackage.exzg;
import defpackage.eyep;
import defpackage.eygi;
import defpackage.eygm;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fiwo;
import defpackage.fqjv;
import defpackage.fqls;
import defpackage.fqmf;
import defpackage.fqmk;
import defpackage.fqmm;
import defpackage.fqmn;
import defpackage.fqmp;
import defpackage.fvaq;
import defpackage.igk;
import defpackage.ikb;
import defpackage.iln;
import defpackage.irx;
import defpackage.job;
import defpackage.jon;
import defpackage.jqn;
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

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class NearbySharingChimeraService extends clxi implements jon {
    public static final /* synthetic */ int ad = 0;
    private static final Charset ae = StandardCharsets.UTF_8;
    public cmty A;
    public boolean B;
    cewq C;
    public ScheduledExecutorService D;
    public fiwo E;
    public cmtr F;
    public clxh G;
    public boolean H;
    public final Context I;
    public PowerManager J;
    public cmdb K;

    @Deprecated
    public final Map L;

    @Deprecated
    public irx M;
    public final cexb N;
    public final cexb O;
    public final cexb P;
    public final Map Q;
    public ContentObserver R;
    public final clwp S;
    public Intent T;
    public final aruf U;
    public boolean V;
    public final cmfv W;
    public boolean X;
    public eijr Y;
    public final eijr Z;
    coix a;
    private cewq aA;
    private cewq aB;
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
    private crmb aO;
    private BroadcastReceiver aP;
    private BroadcastReceiver aQ;
    private BroadcastReceiver aR;
    private BroadcastReceiver aS;
    private BroadcastReceiver aT;
    private BroadcastReceiver aU;
    private ContentObserver aV;
    private ContentObserver aW;
    private final jqn aX;
    private final eijr aY;
    public cllt aa;
    public fiwo ab;
    public fiwo ac;
    private int af;
    private coqc ag;
    private coiu ah;
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
    public coiy b;
    public coiq c;
    public cqin d;
    public cmdv m;
    public final cexb n;
    public final cexb o;
    public final Set p;
    public final Map q;
    public volatile irx r;
    coix s;
    ckjx t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public final Map y;
    public QrCodeMetadata z;

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    /* renamed from: com.google.android.gms.nearby.sharing.NearbySharingChimeraService$1, reason: invalid class name */
    public class AnonymousClass1 extends TracingBroadcastReceiver {
        public AnonymousClass1() {
            super("nearby", "AccountReceiver");
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jz(Context context, final Intent intent) {
            NearbySharingChimeraService.this.ae(new Runnable() { // from class: clqp
                @Override // java.lang.Runnable
                public final void run() {
                    Intent intent2 = intent;
                    if (Objects.equals(intent2.getAction(), "com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE")) {
                        NearbySharingChimeraService.AnonymousClass1 anonymousClass1 = NearbySharingChimeraService.AnonymousClass1.this;
                        if (intent2.hasCategory("com.google.android.gms.auth.category.ACCOUNT_ADDED")) {
                            List a = vks.a(intent2);
                            NearbySharingChimeraService nearbySharingChimeraService = NearbySharingChimeraService.this;
                            Account c = nearbySharingChimeraService.c.c();
                            if (!a.isEmpty() && c == null) {
                                nearbySharingChimeraService.ah();
                            }
                            nearbySharingChimeraService.aJ();
                            nearbySharingChimeraService.V();
                            if (fqmn.q()) {
                                nearbySharingChimeraService.W();
                            }
                        }
                        if (intent2.hasCategory("com.google.android.gms.auth.category.ACCOUNT_REMOVED")) {
                            List d = vks.d(intent2);
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
                                        crll.k(nearbySharingChimeraService2, account, "nearby_sharing_account_metadata");
                                        crnj.l(nearbySharingChimeraService2.I, account.name);
                                        break;
                                    }
                                }
                            }
                            nearbySharingChimeraService2.aJ();
                            nearbySharingChimeraService2.V();
                            if (fqmn.q()) {
                                nearbySharingChimeraService2.W();
                            }
                        }
                    }
                }
            });
        }
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    /* renamed from: com.google.android.gms.nearby.sharing.NearbySharingChimeraService$10, reason: invalid class name */
    public class AnonymousClass10 extends TracingBroadcastReceiver {
        public AnonymousClass10() {
            super("nearby", "NearbyNotificationsReceiver");
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jz(Context context, Intent intent) {
            if (Objects.equals(intent.getStringExtra("channel_id"), "nearby_sharing_alert")) {
                NearbySharingChimeraService.this.af(new Runnable() { // from class: clqq
                    @Override // java.lang.Runnable
                    public final void run() {
                        NearbySharingChimeraService nearbySharingChimeraService = NearbySharingChimeraService.this;
                        nearbySharingChimeraService.aq();
                        cmfe.a.b().p("Stopping FastInitiation scanning because sharing HUN is dismissed over timeout.", new Object[0]);
                        nearbySharingChimeraService.W();
                    }
                }, fqmf.J() + 1000);
            }
        }
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    /* renamed from: com.google.android.gms.nearby.sharing.NearbySharingChimeraService$11, reason: invalid class name */
    public class AnonymousClass11 extends TracingBroadcastReceiver {
        public AnonymousClass11() {
            super("nearby", "LowStorageReceiver");
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jz(final Context context, Intent intent) {
            NearbySharingChimeraService.this.ae(new Runnable() { // from class: clqr
                @Override // java.lang.Runnable
                public final void run() {
                    NearbySharingChimeraService nearbySharingChimeraService = NearbySharingChimeraService.this;
                    if (nearbySharingChimeraService.aI()) {
                        return;
                    }
                    crmu.e(context, nearbySharingChimeraService.C(false));
                }
            });
        }
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    /* renamed from: com.google.android.gms.nearby.sharing.NearbySharingChimeraService$12, reason: invalid class name */
    public class AnonymousClass12 extends TracingBroadcastReceiver {
        public AnonymousClass12() {
            super("nearby", "ConnectionStateReceiver");
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jz(Context context, final Intent intent) {
            NearbySharingChimeraService.this.ae(new Runnable() { // from class: clqs
                @Override // java.lang.Runnable
                public final void run() {
                    NearbySharingChimeraService.this.at(intent.getBooleanExtra("HAS_24GHZ_WIFI_CONNECTION", false));
                }
            });
        }
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    /* renamed from: com.google.android.gms.nearby.sharing.NearbySharingChimeraService$13, reason: invalid class name */
    public class AnonymousClass13 extends TracingBroadcastReceiver {
        public AnonymousClass13() {
            super("nearby", "AirplaneModeReceiver");
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jz(Context context, Intent intent) {
            NearbySharingChimeraService.this.ae(new Runnable() { // from class: clqt
                @Override // java.lang.Runnable
                public final void run() {
                    NearbySharingChimeraService.this.au();
                }
            });
        }
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    /* renamed from: com.google.android.gms.nearby.sharing.NearbySharingChimeraService$14, reason: invalid class name */
    public class AnonymousClass14 extends TracingBroadcastReceiver {
        public AnonymousClass14() {
            super("nearby", "WifiChangeReceiver");
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jz(Context context, final Intent intent) {
            NearbySharingChimeraService.this.ae(new Runnable() { // from class: clqu
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
                        NearbySharingChimeraService.this.af(new Runnable() { // from class: clqv
                            @Override // java.lang.Runnable
                            public final void run() {
                                NearbySharingChimeraService.this.au();
                            }
                        }, fqmf.a.a().aE());
                    }
                }
            });
        }
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    /* renamed from: com.google.android.gms.nearby.sharing.NearbySharingChimeraService$15, reason: invalid class name */
    public class AnonymousClass15 extends TracingBroadcastReceiver {
        public AnonymousClass15() {
            super("nearby", "LocaleChangeReceiver");
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jz(Context context, Intent intent) {
            NearbySharingChimeraService.this.ae(new Runnable() { // from class: clqw
                @Override // java.lang.Runnable
                public final void run() {
                    NearbySharingChimeraService.this.au();
                }
            });
        }
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    /* renamed from: com.google.android.gms.nearby.sharing.NearbySharingChimeraService$16, reason: invalid class name */
    public class AnonymousClass16 extends TracingBroadcastReceiver {
        public AnonymousClass16() {
            super("nearby", "ServerSyncReceiver");
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jz(final Context context, Intent intent) {
            NearbySharingChimeraService.this.ae(new Runnable() { // from class: clqx
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
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.clqx.run():void");
                }
            });
        }
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    /* renamed from: com.google.android.gms.nearby.sharing.NearbySharingChimeraService$19, reason: invalid class name */
    public class AnonymousClass19 extends TracingBroadcastReceiver {
        public AnonymousClass19() {
            super("nearby", "CertificatesRegenerationReceiver");
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jz(Context context, Intent intent) {
            NearbySharingChimeraService.this.ae(new Runnable() { // from class: clrc
                @Override // java.lang.Runnable
                public final void run() {
                    cmfe.a.b().p("Received broadcast that certificates are regenerating. Refreshing receive surface state", new Object[0]);
                    NearbySharingChimeraService nearbySharingChimeraService = NearbySharingChimeraService.this;
                    nearbySharingChimeraService.ap();
                    nearbySharingChimeraService.U();
                }
            });
        }
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    /* renamed from: com.google.android.gms.nearby.sharing.NearbySharingChimeraService$2, reason: invalid class name */
    public class AnonymousClass2 extends TracingBroadcastReceiver {
        public AnonymousClass2() {
            super("nearby", "PowerSaveReceiver");
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jz(Context context, Intent intent) {
            NearbySharingChimeraService.this.ae(new Runnable() { // from class: clrd
                @Override // java.lang.Runnable
                public final void run() {
                    NearbySharingChimeraService nearbySharingChimeraService = NearbySharingChimeraService.this;
                    nearbySharingChimeraService.aj(nearbySharingChimeraService.J.isPowerSaveMode());
                }
            });
        }
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    /* renamed from: com.google.android.gms.nearby.sharing.NearbySharingChimeraService$20, reason: invalid class name */
    public class AnonymousClass20 extends TracingBroadcastReceiver {
        public AnonymousClass20() {
            super("nearby", "ConstellationAcceptanceReceiver");
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jz(final Context context, Intent intent) {
            NearbySharingChimeraService.this.ae(new Runnable() { // from class: clre
                @Override // java.lang.Runnable
                public final void run() {
                    cmfe.a.b().p("Received broadcast that user has accepted Constellation consent. Refreshing cached phone numbers.", new Object[0]);
                    crnj.j(context);
                    NearbySharingChimeraService.this.m.b();
                }
            });
        }
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    /* renamed from: com.google.android.gms.nearby.sharing.NearbySharingChimeraService$3, reason: invalid class name */
    public class AnonymousClass3 extends TracingBroadcastReceiver {
        public AnonymousClass3() {
            super("nearby", "ScreenStateReceiver");
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jz(final Context context, Intent intent) {
            NearbySharingChimeraService.this.ae(new Runnable() { // from class: clrr
                @Override // java.lang.Runnable
                public final void run() {
                    NearbySharingChimeraService.this.ak(crno.j(context));
                }
            });
        }
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    /* renamed from: com.google.android.gms.nearby.sharing.NearbySharingChimeraService$5, reason: invalid class name */
    public class AnonymousClass5 extends TracingBroadcastReceiver {
        public AnonymousClass5() {
            super("nearby", "LocationChangeReceiver");
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jz(final Context context, Intent intent) {
            NearbySharingChimeraService.this.ae(new Runnable() { // from class: clru
                @Override // java.lang.Runnable
                public final void run() {
                    NearbySharingChimeraService.this.ai(exft.b(context));
                }
            });
        }
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    /* renamed from: com.google.android.gms.nearby.sharing.NearbySharingChimeraService$6, reason: invalid class name */
    public class AnonymousClass6 extends TracingBroadcastReceiver {
        public AnonymousClass6() {
            super("nearby", "BluetoothChangeReceier");
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jz(final Context context, Intent intent) {
            NearbySharingChimeraService.this.ae(new Runnable() { // from class: clrv
                @Override // java.lang.Runnable
                public final void run() {
                    NearbySharingChimeraService.this.ag(crlw.g(context));
                }
            });
        }
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    /* renamed from: com.google.android.gms.nearby.sharing.NearbySharingChimeraService$7, reason: invalid class name */
    public class AnonymousClass7 extends TracingBroadcastReceiver {
        public AnonymousClass7() {
            super("nearby", "BleChangeReceiver");
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jz(Context context, Intent intent) {
            NearbySharingChimeraService.this.ae(new Runnable() { // from class: clrw
                @Override // java.lang.Runnable
                public final void run() {
                    NearbySharingChimeraService.this.W();
                }
            });
        }
    }

    public NearbySharingChimeraService() {
        super(194, "com.google.android.gms.nearby.sharing.START_SERVICE", ejck.a, 3, 9);
        this.a = null;
        this.af = -1;
        this.n = new cexb((int) fqmf.Q());
        this.o = new cexb((int) fqmf.Q());
        this.p = new HashSet();
        this.q = new bry();
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
        this.y = new bry();
        this.ap = new bry();
        this.aq = 0;
        this.z = null;
        this.ar = false;
        this.as = false;
        this.ay = cfdj.f();
        this.D = cfdj.f();
        this.H = false;
        this.I = new acn(this, R.style.Sharing_ShareSheet);
        this.L = new bry();
        this.N = new cexb((int) fqmf.Q());
        this.O = new cexb((int) fqmf.Q());
        this.P = new cexb((int) fqmf.Q());
        this.Q = new ConcurrentHashMap();
        this.aV = null;
        this.aW = null;
        this.R = null;
        this.S = new clwp();
        this.W = new cmfv(this);
        this.Z = eijy.a(new eijr() { // from class: clpk
            @Override // defpackage.eijr
            public final Object a() {
                return QuickShareRoomDatabase.l.a(NearbySharingChimeraService.this.I);
            }
        });
        this.aX = new jqn(this);
        this.aY = eijy.a(new eijr() { // from class: clpl
            @Override // defpackage.eijr
            public final Object a() {
                return new BackupManager(NearbySharingChimeraService.this);
            }
        });
        this.U = new aruf(Integer.MAX_VALUE, fqmf.i(), fqmf.i(), TimeUnit.MILLISECONDS);
    }

    public static String G(int i) {
        return i != 0 ? i != 1 ? i != 2 ? a.l(i, "UNKNOWN[", "]") : "FOREGROUND INSTALL" : "FOREGROUND" : "BACKGROUND";
    }

    public static String H(Object obj) {
        return Integer.toString(Math.abs((int) ((short) obj.hashCode())));
    }

    public static void Z(String str, String str2, arbp arbpVar, Callable callable) {
        String str3;
        int i = 13;
        if (fqmf.bd()) {
            try {
                i = ((Integer) callable.call()).intValue();
            } catch (Exception e) {
                cmfe.a.e().f(e).i("Exception while executing NearbySharingService call %s for calling package %s.", str2, str);
            }
        }
        Status status = new Status(i);
        if (!status.e()) {
            cexi e2 = cmfe.a.e();
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
                    str3 = aqxi.d(i);
                    break;
            }
            e2.j("NearbySharingService call %s returned nonzero status code for calling package %s: %s", str2, str, str3);
        }
        try {
            arbpVar.a(status);
        } catch (RemoteException e3) {
            cmfe.a.e().f(e3).p("Failed to invoke IStatusCallback.", new Object[0]);
        }
    }

    public static final boolean aK(int i, int i2) {
        return i != 1 ? i == 3 && i2 == 9 : i2 == 9 || i2 == 12;
    }

    public static final void aL(Runnable runnable) {
        new asmd(9, runnable).start();
    }

    public static int aO(Context context, Account account) {
        cllc cllcVar;
        if (fqmk.j()) {
            try {
                Map map = (Map) ((enpf) crnj.b(context)).v(fqmf.af(), TimeUnit.MILLISECONDS);
                if (map.isEmpty()) {
                    return 2;
                }
                if (account != null && (cllcVar = (cllc) map.get(account.name)) != null) {
                    if (!cllcVar.c.isEmpty()) {
                        return 4;
                    }
                }
                return 3;
            } catch (AssertionError e) {
                e = e;
                cmfe.a.e().f(e).p("getIdentityVerification: failed to read cached reachable phone numbers.", new Object[0]);
                return 1;
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                cmfe.a.e().f(e2).p("getIdentityVerification: failed to read cached reachable phone numbers.", new Object[0]);
            } catch (ExecutionException e3) {
                e = e3;
                cmfe.a.e().f(e).p("getIdentityVerification: failed to read cached reachable phone numbers.", new Object[0]);
                return 1;
            } catch (TimeoutException e4) {
                e = e4;
                cmfe.a.e().f(e).p("getIdentityVerification: failed to read cached reachable phone numbers.", new Object[0]);
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
            QrCodeMetadata qrCodeMetadata = ((clwq) it.next()).d;
            if (qrCodeMetadata != null) {
                return qrCodeMetadata;
            }
        }
        return null;
    }

    private final eitj aU() {
        return this.S.e();
    }

    private final Integer aV() {
        Iterator it = this.n.e().iterator();
        Integer num = null;
        while (it.hasNext()) {
            Integer num2 = ((clwq) it.next()).c;
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
        CharSequence filter = new exfy(getResources().getInteger(R.integer.sharing_max_name_length_bytes)).filter(str, 0, str.length(), new SpannedString(""), 0, 0);
        return filter != null ? filter.toString() : str;
    }

    private final List aX(Integer... numArr) {
        ArrayList arrayList = new ArrayList();
        cexb cexbVar = this.n;
        eiuu H = eiuu.H(numArr);
        for (Map.Entry entry : cexbVar.d()) {
            if (H.contains(Integer.valueOf(((clwq) entry.getValue()).a))) {
                arrayList.add((cmcc) entry.getKey());
            }
        }
        return arrayList;
    }

    private final void aY() {
        int i = 0;
        if (fqmn.D()) {
            eitj i2 = eitj.i(this.P.e());
            int size = i2.size();
            for (int i3 = 0; i3 < size; i3++) {
                c(((clws) i2.get(i3)).a);
            }
            eitj i4 = eitj.i(this.O.e());
            int size2 = i4.size();
            while (i < size2) {
                c(((clws) i4.get(i)).a);
                i++;
            }
            return;
        }
        irx irxVar = this.M;
        if (irxVar != null) {
            c((ShareTarget) irxVar.a);
            ba();
            this.M = null;
        }
        Map map = this.L;
        eitj i5 = eitj.i(map.keySet());
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
            final cmtr cmtrVar = this.F;
            if (cmtrVar.d != null) {
                Map map = cmtrVar.e;
                if (map.size() <= fqmf.a.a().as() && cmtrVar.a() <= 1 && (str = cmtrVar.d) != null) {
                    ScheduledFuture scheduledFuture = (ScheduledFuture) map.get(str);
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(true);
                    }
                    map.put(str, ((cfdi) cmtrVar.a).schedule(new Runnable() { // from class: cmtg
                        @Override // java.lang.Runnable
                        public final void run() {
                            cmtr.this.e(str);
                        }
                    }, fqmf.a.a().at(), TimeUnit.MILLISECONDS));
                }
            }
            L();
            this.u = true;
            af(new Runnable() { // from class: clpv
                @Override // java.lang.Runnable
                public final void run() {
                    NearbySharingChimeraService nearbySharingChimeraService = NearbySharingChimeraService.this;
                    nearbySharingChimeraService.u = false;
                    nearbySharingChimeraService.W();
                }
            }, fqmf.ax());
        }
        cfcs.e(this, "com.google.android.gms.nearby.sharing.TRANSFER_FINISHED");
        cmfe.a.b().p("Broadcasting NearbySharing state change transfer finished", new Object[0]);
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
            cfcs.b(this, this.aD, intentFilter);
            this.as = true;
        }
    }

    private final boolean bd() {
        if (this.au && fqmk.a.a().J()) {
            return false;
        }
        return fqmk.D();
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
        cexb cexbVar = this.n;
        eiuu H = eiuu.H(numArr);
        Iterator it = cexbVar.e().iterator();
        while (it.hasNext()) {
            if (H.contains(Integer.valueOf(((clwq) it.next()).a))) {
                return true;
            }
        }
        return false;
    }

    private final boolean bi() {
        return !this.o.l();
    }

    private final boolean bj(Integer... numArr) {
        return !Collections.disjoint(new eipr(this.o.e(), new eiho() { // from class: clox
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                int i = ((clwr) obj).b;
                int i2 = NearbySharingChimeraService.ad;
                return Integer.valueOf(i);
            }
        }), eiuu.H(numArr));
    }

    private final boolean bk() {
        return this.s != null;
    }

    private final boolean bl() {
        fqmf.bj();
        if (fqmk.a.a().I() && this.au) {
            return false;
        }
        return (!fqmk.a.a().H() || cexc.h(this)) && fqmk.I() && v() != null;
    }

    private final boolean bm() {
        return bd() && this.a == coix.BACKGROUND;
    }

    private final boolean bn() {
        return fqmn.D() ? eivv.d(this.O.e(), new eiih() { // from class: clpz
            @Override // defpackage.eiih
            public final boolean a(Object obj) {
                int i = NearbySharingChimeraService.ad;
                return ((clws) obj).b.a != 1001;
            }
        }).iterator().hasNext() : this.am;
    }

    private final boolean bo() {
        return bd() ? this.a == coix.FOREGROUND : aE();
    }

    private final boolean bp() {
        return Settings.Global.getInt(getContentResolver(), "device_provisioned", 0) == 1;
    }

    private final boolean bq(ShareTarget shareTarget) {
        clws clwsVar;
        clws clwsVar2;
        if (shareTarget.f) {
            cexb cexbVar = this.P;
            Long valueOf = Long.valueOf(shareTarget.a);
            return cexbVar.k(valueOf) && (clwsVar2 = (clws) cexbVar.a(valueOf)) != null && clwsVar2.c;
        }
        cexb cexbVar2 = this.O;
        Long valueOf2 = Long.valueOf(shareTarget.a);
        if (cexbVar2.k(valueOf2) && (clwsVar = (clws) cexbVar2.a(valueOf2)) != null && clwsVar.c) {
            return true;
        }
        return false;
    }

    private final boolean br() {
        Context context = this.I;
        return crll.n(context) && cexc.h(context) && !aA() && !crmv.c(context) && this.c.b() < 2;
    }

    private final ensi bs(final int i) {
        return fqmn.a.a().W() ? ensi.h(((ensv) Objects.requireNonNull((ensv) this.E.a())).submit(new Callable() { // from class: clow
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(NearbySharingChimeraService.this.f(i));
            }
        })) : ensi.h(ensj.i(Integer.valueOf(f(i))));
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
        if (!fqmk.K() || shareTarget.g().isEmpty() || transferMetadata.a == 1019) {
            return;
        }
        cmbw f = ((StreamAttachment) shareTarget.g().get(0)).f();
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
        clws clwsVar;
        TransferMetadata transferMetadata;
        clws clwsVar2;
        if (!aE()) {
            cmfe.a.d().p("Failed to stop scanning because we're not scanning.", new Object[0]);
            return;
        }
        eitj aU = aU();
        int size = aU.size();
        for (int i = 0; i < size; i++) {
            ((coiy) aU.get(i)).C();
        }
        if (!fqmk.aj() || fqmn.j()) {
            if (fqmn.D()) {
                cexb cexbVar = this.N;
                for (ShareTarget shareTarget : cexbVar.e()) {
                    cexb cexbVar2 = this.O;
                    Long valueOf = Long.valueOf(shareTarget.a);
                    if (!cexbVar2.k(valueOf) || (clwsVar = (clws) cexbVar2.a(valueOf)) == null || clwsVar.b.e) {
                        Iterator it = this.o.e().iterator();
                        while (it.hasNext()) {
                            ((clwr) it.next()).a.c(shareTarget);
                        }
                        this.S.m(shareTarget);
                    }
                }
                cexbVar.f();
            } else {
                eitj f = this.S.f();
                int size2 = f.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ShareTarget shareTarget2 = (ShareTarget) f.get(i2);
                    if (!shareTarget2.f) {
                        Iterator it2 = this.o.e().iterator();
                        while (it2.hasNext()) {
                            ((clwr) it2.next()).a.c(shareTarget2);
                        }
                    }
                }
            }
        }
        cmty cmtyVar = this.A;
        cmtyVar.h = null;
        cmtyVar.g = null;
        cmtyVar.e = 100;
        cmtyVar.f = (int) fqmf.aj();
        cmtyVar.c.clear();
        eitj i3 = eitj.i(cmtyVar.d.keySet());
        int size3 = i3.size();
        for (int i4 = 0; i4 < size3; i4++) {
            cmtyVar.b((ShareTarget) i3.get(i4));
        }
        this.a = null;
        this.ah = null;
        clwp clwpVar = this.S;
        eitj f2 = clwpVar.f();
        int size4 = f2.size();
        for (int i5 = 0; i5 < size4; i5++) {
            ShareTarget shareTarget3 = (ShareTarget) f2.get(i5);
            if (!shareTarget3.f) {
                if (fqmn.a.a().x()) {
                    if (fqmn.D()) {
                        cexb cexbVar3 = this.O;
                        Long valueOf2 = Long.valueOf(shareTarget3.a);
                        if (cexbVar3.k(valueOf2) && (clwsVar2 = (clws) cexbVar3.a(valueOf2)) != null && clwsVar2.b.d()) {
                        }
                    } else {
                        Map map = this.L;
                        if (map.containsKey(shareTarget3) && (transferMetadata = (TransferMetadata) map.get(shareTarget3)) != null && transferMetadata.d()) {
                        }
                    }
                }
                clwpVar.m(shareTarget3);
            }
        }
        cmfe.a.b().p("Scanning has stopped.", new Object[0]);
        af(new clpg(this), z ? (int) fqmf.ax() : 0L);
    }

    public final eitj A(Account account) {
        try {
            cllc cllcVar = (cllc) ((Map) ((enpf) crnj.b(this.I)).v(fqmf.af(), TimeUnit.MILLISECONDS)).get(account.name);
            if (cllcVar != null && System.currentTimeMillis() - cllcVar.d <= fqmf.ak() && !cllcVar.c.isEmpty()) {
                return eitj.i(cllcVar.c);
            }
        } catch (AssertionError e) {
            e = e;
            cmfe.a.e().f(e).p("Failed to read cached reachable phone numbers.", new Object[0]);
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            cmfe.a.e().f(e2).p("Failed to read cached reachable phone numbers.", new Object[0]);
        } catch (ExecutionException e3) {
            e = e3;
            cmfe.a.e().f(e).p("Failed to read cached reachable phone numbers.", new Object[0]);
        } catch (TimeoutException e4) {
            e = e4;
            cmfe.a.e().f(e).p("Failed to read cached reachable phone numbers.", new Object[0]);
        }
        List n = this.b.n(account);
        if (n == null) {
            return null;
        }
        crnj.g(this.I, account.name, n, System.currentTimeMillis());
        return eitj.i(n);
    }

    public final eygi B() {
        return this.K.h;
    }

    public final File C(boolean z) {
        return new cfde(this.I).a(z);
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
        AtomicBoolean atomicBoolean = crny.a;
        Context context = this.I;
        String str2 = null;
        if (v != null) {
            try {
                str = ((crlk) dfbl.n(crll.d(v))).b;
            } catch (InterruptedException | ExecutionException unused) {
            }
            eitj eitjVar = crnv.a;
            if (!TextUtils.isEmpty(str) || eigd.e("null", str)) {
                return crny.d(context);
            }
            acn acnVar = (acn) context;
            CharSequence text = acnVar.a().getText(R.string.sharing_device_type_phone);
            int e = crno.e(context);
            if (e == 2) {
                text = acnVar.a().getText(R.string.sharing_device_type_tablet);
            } else if (e == 3) {
                text = acnVar.a().getText(R.string.sharing_device_type_laptop);
            } else if (e == 4) {
                text = acnVar.a().getText(R.string.sharing_device_type_car);
            }
            if (fqmk.a.a().bs()) {
                text = crny.e(context);
            }
            int integer = acnVar.a().getInteger(R.integer.sharing_max_name_length_bytes);
            int a = crlx.a(context.getString(R.string.sharing_default_device_name, "", text));
            if (a >= integer) {
                cmfe.a.e().p("Device type string is longer than char limit.", new Object[0]);
            } else {
                str2 = crnv.a(str, integer - a);
            }
            return TextUtils.isEmpty(str2) ? crny.d(context) : context.getString(R.string.sharing_default_device_name, str2, text);
        }
        Cursor b = cfag.b(context, ContactsContract.Profile.CONTENT_URI);
        if (b == null) {
            k = null;
        } else {
            try {
                k = cfag.k(b, "display_name");
            } finally {
                b.close();
            }
        }
        eitj eitjVar2 = crnv.a;
        str = TextUtils.isEmpty(k) ? null : (String) eivv.m(eijj.h("\\s+").l(k), 0);
        eitj eitjVar3 = crnv.a;
        if (TextUtils.isEmpty(str)) {
        }
        return crny.d(context);
    }

    public final String F() {
        if (!this.c.W() && !crmv.c(this.I) && !aC()) {
            return aW(E());
        }
        String h = this.c.h(v());
        eitj eitjVar = crnv.a;
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
        eiuu H = eiuu.H(numArr);
        for (Map.Entry entry : map.entrySet()) {
            if (H.contains(entry.getValue())) {
                arrayList.add((clos) entry.getKey());
            }
        }
        return arrayList;
    }

    public final List J(Integer... numArr) {
        ArrayList arrayList = new ArrayList();
        eiuu H = eiuu.H(numArr);
        for (Map.Entry entry : this.o.d()) {
            if (H.contains(Integer.valueOf(((clwr) entry.getValue()).b))) {
                arrayList.add(new irx((cmcc) entry.getKey(), ((clwr) entry.getValue()).a));
            }
        }
        return arrayList;
    }

    public final Map K(int i) {
        return this.b.o(i);
    }

    public final void L() {
        if (!aw()) {
            cmfe.a.b().p("Not allowed to auto turn off device settings.", new Object[0]);
            return;
        }
        if (aI() || bn()) {
            cmfe.a.b().p("Don't turn off device settings when share target is transferring or connecting.", new Object[0]);
            return;
        }
        for (TransferMetadata transferMetadata : K(1).values()) {
            if (!transferMetadata.e || transferMetadata.a == 1016) {
                cmfe.a.b().p("Don't turn off device settings with group share when transfer is not finish or queue is not empty.", new Object[0]);
                return;
            }
        }
        Context context = this.I;
        if (!croc.e(context)) {
            ArraySet arraySet = new ArraySet();
            if (Build.VERSION.SDK_INT != 29 && !crny.h(context) && bxdg.i(crmg.a(context), "auto_enable_wifi", false)) {
                crmg.d(context, false);
                arraySet.add(croc.b(context));
            }
            if (bxdg.i(crmg.a(context), "auto_enable_bluetooth", false)) {
                crmg.c(context, false);
                arraySet.add(crlw.b(context));
            }
            cfdd.c("revertDeviceSettings", dfbl.e(arraySet), fqmf.r());
        }
        cmfe.a.b().p("Reverted device settings", new Object[0]);
    }

    public final void M() {
        Iterator it = this.p.iterator();
        while (it.hasNext()) {
            ((cmbv) it.next()).a();
        }
        cfcs.e(this, "com.google.android.gms.nearby.sharing.STATE_CHANGED");
        cmfe.a.b().p("Broadcasting NearbySharing state change.", new Object[0]);
        if (fqmk.x()) {
            ((BackupManager) this.aY.a()).dataChanged();
            cmfe.a.b().p("Notified backup manager of data change.", new Object[0]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void N() {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.nearby.sharing.NearbySharingChimeraService.N():void");
    }

    public final void O(ShareTarget shareTarget, final Intent intent, final crlm crlmVar) {
        final entj entjVar = new entj();
        this.D.execute(new Runnable() { // from class: clqh
            @Override // java.lang.Runnable
            public final void run() {
                List list;
                NearbySharingChimeraService nearbySharingChimeraService = NearbySharingChimeraService.this;
                aruf arufVar = nearbySharingChimeraService.U;
                Intent intent2 = intent;
                List list2 = (List) arufVar.a(intent2);
                entj entjVar2 = entjVar;
                if (list2 != null) {
                    entjVar2.q(list2);
                    return;
                }
                int intExtra = intent2.getIntExtra("nearby_share_intent_id", -1);
                if (intExtra == -1) {
                    list = crln.k(nearbySharingChimeraService, intent2);
                } else if (nearbySharingChimeraService.r == null || ((Intent) nearbySharingChimeraService.r.a).getIntExtra("nearby_share_intent_id", -1) != intExtra) {
                    List k = crln.k(nearbySharingChimeraService, intent2);
                    nearbySharingChimeraService.r = new irx(intent2, k);
                    list = k;
                } else {
                    irx irxVar = nearbySharingChimeraService.r;
                    arwm.s(irxVar);
                    List list3 = (List) irxVar.b;
                    SecureRandom secureRandom = new SecureRandom();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        cllj f = ((Attachment) it.next()).f();
                        f.d(secureRandom.nextLong());
                        arrayList.add(f.b());
                    }
                    list = arrayList;
                }
                arufVar.d(intent2, list);
                entjVar2.q(list);
            }
        });
        final long j = shareTarget == null ? -1L : shareTarget.a;
        asmd asmdVar = new asmd(9, new Runnable() { // from class: clqi
            @Override // java.lang.Runnable
            public final void run() {
                NearbySharingChimeraService nearbySharingChimeraService = NearbySharingChimeraService.this;
                crlm crlmVar2 = crlmVar;
                entj entjVar2 = entjVar;
                long j2 = j;
                try {
                    crlmVar2.d();
                    List list = (List) cfdd.g("getAttachments", entjVar2, fqmf.U());
                    if (list == null || list.isEmpty()) {
                        crlmVar2.c();
                        List list2 = (List) cfdd.g("getAttachments", entjVar2, fqmf.a.a().aS() - fqmf.U());
                        if (list2 != null && !list2.isEmpty()) {
                            crlmVar2.b(list2);
                        }
                        crlmVar2.a();
                    } else {
                        crlmVar2.b(list);
                    }
                } finally {
                    nearbySharingChimeraService.Q.remove(Long.valueOf(j2));
                }
            }
        });
        this.Q.put(Long.valueOf(j), asmdVar);
        asmdVar.start();
    }

    public final void P(cmdj cmdjVar) {
        if (!ModuleInitializer.a(this)) {
            cmfe.a.b().p("Cannot force sync, because Nearby Share is not available.", new Object[0]);
        } else if (v() == null) {
            cmfe.a.b().p("Cannot force sync, because account is not available.", new Object[0]);
        } else {
            cmfe.a.b().p("Started a force sync.", new Object[0]);
            this.b.q(cmdjVar);
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
            cmfe.a.b().p("Stopping advertising because the screen is locked.", new Object[0]);
            return;
        }
        if (!this.B) {
            ap();
            cmfe.a.b().p("Stopping advertising because Bluetooth is disabled.", new Object[0]);
            return;
        }
        if (!this.av) {
            ap();
            cmfe.a.b().p("Stopping advertising because Location is disabled.", new Object[0]);
            return;
        }
        if (!aA()) {
            ap();
            cmfe.a.b().p("Stopping advertising because Nearby Sharing is disabled.", new Object[0]);
            return;
        }
        if (bo()) {
            ap();
            cmfe.a.b().p("Stopping advertising because we're scanning for other devices.", new Object[0]);
            return;
        }
        if (aI()) {
            ap();
            cmfe.a.b().p("Stopping advertising because we're currently in the midst of a transfer.", new Object[0]);
            return;
        }
        if (this.u) {
            ap();
            cmfe.a.b().p("Stopping advertising because we recently sent/received a file. Allowing the attached surfaces a chance to unregister.", new Object[0]);
            return;
        }
        if (!bg()) {
            ap();
            cmfe.a.b().p("Stopping advertising because no receive surface is registered.", new Object[0]);
            return;
        }
        coix coixVar = ax() ? coix.FOREGROUND : this.at ? (!this.v || (fqmk.a.a().L() && this.au)) ? coix.BACKGROUND : coix.MIDGROUND : coix.SCREEN_OFF;
        if ((coixVar == coix.BACKGROUND || coixVar == coix.SCREEN_OFF) && !bl()) {
            ap();
            cmfe.a.b().p("Stopping advertising since there's no scanning phone nearby and no receive surface in foreground.", new Object[0]);
            return;
        }
        if (!fqmk.Z() || (aV = aV()) == null) {
            k = k();
            int ordinal = coixVar.ordinal();
            if (ordinal == 0) {
                k = k == 0 ? 0 : bv(k, (int) fqmf.a.a().m());
            } else if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        throw new AssertionError("Invalid mode ".concat(String.valueOf(String.valueOf(coixVar))));
                    }
                    k = bv(k, (int) fqmf.a.a().bE());
                } else if (!fqmk.Z()) {
                    k = 3;
                }
            }
        } else {
            k = aV.intValue();
        }
        if (k == 0) {
            if (aT() == null) {
                ap();
                cmfe.a.b().p("Stopping advertising because no high power receive surface is registered and device is visible to HIDDEN.", new Object[0]);
                return;
            }
            k = 0;
        }
        if (be() && coixVar != coix.FOREGROUND) {
            ap();
            cmfe.a.b().p("Stopping advertising to avoid interference with 2.4GHz Wi-Fi connections.", new Object[0]);
            return;
        }
        this.b.v(k);
        int ordinal2 = coixVar.ordinal();
        if (ordinal2 == 1) {
            if (!fqmk.a.a().U()) {
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
        int ordinal3 = coixVar.ordinal();
        if (ordinal3 != 0) {
            if (ordinal3 != 1) {
                if (ordinal3 != 2) {
                    if (ordinal3 == 3 && fqmk.a.a().ae()) {
                        cmfe.a.b().p("Starting a sync for screen-off advertising", new Object[0]);
                        cmdi cmdiVar = new cmdi();
                        cmdiVar.b = 3;
                        cmdiVar.a = 11;
                        P(new cmdj(cmdiVar));
                    }
                } else if (fqmk.a.a().ac()) {
                    cmfe.a.b().p("Starting a sync for foreground advertising", new Object[0]);
                    cmdi cmdiVar2 = new cmdi();
                    cmdiVar2.b = 3;
                    cmdiVar2.a = 11;
                    P(new cmdj(cmdiVar2));
                }
            } else if (fqmk.a.a().ad()) {
                cmfe.a.b().p("Starting a sync for midground advertising", new Object[0]);
                if (fqmk.a.a().X()) {
                    af(new Runnable() { // from class: clpy
                        @Override // java.lang.Runnable
                        public final void run() {
                            cmfe.a.b().p("Repeating a sync for midground advertising", new Object[0]);
                            cmdi cmdiVar3 = new cmdi();
                            cmdiVar3.b = 3;
                            cmdiVar3.a = 11;
                            NearbySharingChimeraService.this.P(new cmdj(cmdiVar3));
                        }
                    }, fqmf.a.a().aV());
                }
            }
        } else if (fqmk.a.a().ab()) {
            cmfe.a.b().p("Starting a sync for background advertising", new Object[0]);
            cmdi cmdiVar3 = new cmdi();
            cmdiVar3.b = 3;
            cmdiVar3.a = 11;
            P(new cmdj(cmdiVar3));
        }
        if (!aA()) {
            cmfe.a.b().p("Failed to advertise because we're not enabled.", new Object[0]);
        } else if (bo()) {
            cmfe.a.b().p("Failed to advertise because we're currently scanning for other devices in the foreground.", new Object[0]);
        } else if (!bg()) {
            cmfe.a.b().p("Failed to advertise because there's no receive surface registered.", new Object[0]);
        } else if (!this.at && !bl()) {
            cmfe.a.b().p("Failed to advertise because the user's screen is locked.", new Object[0]);
        } else if (this.B) {
            int i2 = i();
            Iterator it = this.n.e().iterator();
            while (true) {
                if (!it.hasNext()) {
                    i = 0;
                    break;
                }
                int i3 = ((clwq) it.next()).b;
                if (i3 != 0) {
                    i = i3;
                    break;
                }
            }
            QrCodeMetadata aT = aT();
            if (bk() && coixVar.equals(this.s) && i2 == this.ai && this.ap.equals(this.y) && this.an == this.ao && this.af == k && this.aq == i && Objects.equals(aT, this.z)) {
                cmfe.a.b().l("Failed to advertise because we're already advertising with mode %s, certificate visibility %s data usage preference %s, and bt advertising %s with vendorId %s", this.s, crnt.s(k), D(this.ai), Boolean.valueOf(this.an), Integer.valueOf(i));
            } else {
                this.af = k;
                boolean z2 = k == 3;
                String F = (z2 || aT != null) ? F() : null;
                cmfe.a.b().l("Start advertising with mode %s certificate visibility %s data usage preference %s, and bt advertising %s with vendorId %d", coixVar, crnt.s(k), D(i2), Boolean.valueOf(this.ao), Integer.valueOf(i));
                cmcc cmccVar = new cmcc() { // from class: clpc
                    @Override // defpackage.cmcc
                    public final void e(final ShareTarget shareTarget, final TransferMetadata transferMetadata) {
                        final NearbySharingChimeraService nearbySharingChimeraService = NearbySharingChimeraService.this;
                        nearbySharingChimeraService.ae(new Runnable() { // from class: clqd
                            @Override // java.lang.Runnable
                            public final void run() {
                                NearbySharingChimeraService.this.aa(shareTarget, transferMetadata);
                            }
                        });
                    }
                };
                coir coirVar = new coir();
                coirVar.a = coixVar;
                coirVar.g = i2;
                coirVar.b = crno.e(this.I);
                coirVar.c = this.ao;
                coix coixVar2 = coix.FOREGROUND;
                coirVar.f = coixVar == coixVar2;
                coirVar.d = z2;
                coirVar.k = z2;
                aP();
                if (bl()) {
                    boolean z3 = (fqmk.a.a().af() && coixVar == coix.MIDGROUND) ? true : z2 || coixVar == coixVar2;
                    fqmf.bj();
                    coirVar.e = z3;
                }
                coirVar.j = i;
                cois a = coirVar.a();
                eitj aU = aU();
                int size = aU.size();
                for (int i4 = 0; i4 < size; i4++) {
                    coiy coiyVar = (coiy) aU.get(i4);
                    if (bk()) {
                        cmfe.a.b().h("Updating advertising options: %s", a);
                        coiyVar.E(F, a, aT);
                    } else {
                        coiyVar.x(F, cmccVar, a, aT);
                    }
                }
                this.aq = i;
                N();
                this.s = coixVar;
                this.ai = i2;
                this.an = this.ao;
                this.z = aT;
                cewq cewqVar = this.aA;
                if (cewqVar != null) {
                    cewqVar.b();
                }
                int ar = ((int) fqmf.ar()) + new Random().nextInt((int) (fqmf.a.a().bz() - fqmf.ar()));
                cexi cexiVar = cmfe.a;
                this.aA = cewq.d(cexiVar, new Runnable() { // from class: clph
                    @Override // java.lang.Runnable
                    public final void run() {
                        NearbySharingChimeraService nearbySharingChimeraService = NearbySharingChimeraService.this;
                        nearbySharingChimeraService.ap();
                        nearbySharingChimeraService.R();
                    }
                }, ar, this.az);
                Map map = this.ap;
                map.clear();
                map.putAll(this.y);
                if (!map.isEmpty()) {
                    aP();
                }
                cexiVar.b().i("Advertising has started with mode %s, Bt enabled : %s", coixVar, Boolean.valueOf(this.an));
            }
        } else {
            cmfe.a.b().p("Failed to advertise because Bluetooth is off.", new Object[0]);
        }
        if (ax()) {
            this.G.g();
            cmfe.a.b().p("Cancelling the Fast Init HUN because we're now advertising with a foreground receive surface", new Object[0]);
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
            cmfe.a.b().p("Stopping FastInitiation scanning because the screen is locked.", new Object[0]);
            aq();
            return;
        }
        if (!aA() && !aB()) {
            cmfe.a.b().p("Stopping FastInitiation scanning because it is disabled.", new Object[0]);
            aq();
            return;
        }
        if (!this.av) {
            aq();
            cmfe.a.b().p("Stopping FastInitiation scanning because location is disabled.", new Object[0]);
            return;
        }
        if (!fqmk.y() && !this.B && !this.F.j()) {
            aq();
            cmfe.a.b().p("Stopping FastInitiation scanning because Bluetooth is disabled.", new Object[0]);
            return;
        }
        if (this.au && fqmk.v()) {
            cmfe.a.b().p("Stopping FastInitiation scanning because battery is low.", new Object[0]);
            aq();
            return;
        }
        if (fqmk.y()) {
            Context context = this.I;
            cezt a = crlw.a(context);
            if (a != null && (a.c() == 11 || a.c() == 13 || a.a() == 14 || a.a() == 16)) {
                cmfe.a.b().p("Failed to start FastInitiation scanning because Bluetooth is in transitioning.", new Object[0]);
                return;
            }
            if (!this.B && !crlw.e(context)) {
                aq();
                cmfe.a.b().p("Stopping FastInitiation scanning because Bluetooth is disabled.", new Object[0]);
                if (!crlw.f(context) || this.H) {
                    return;
                }
                this.H = true;
                final Context applicationContext = context.getApplicationContext();
                ensv d = cfdj.d();
                final dfau dfauVar = new dfau();
                d.execute(new Runnable() { // from class: crlv
                    @Override // java.lang.Runnable
                    public final void run() {
                        dfau dfauVar2 = dfauVar;
                        final Context context2 = applicationContext;
                        final cezt a2 = crlw.a(context2);
                        if (a2 != null) {
                            if (a2.h() || cfdd.j("enableBle", igp.a(new igm() { // from class: crls
                                @Override // defpackage.igm
                                public final Object a(final igk igkVar) {
                                    final TracingBroadcastReceiver tracingBroadcastReceiver = new TracingBroadcastReceiver() { // from class: com.google.android.gms.nearby.sharing.utils.BluetoothUtils$1
                                        {
                                            super("nearby", "BleReceiver");
                                        }

                                        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
                                        public final void jz(Context context3, Intent intent) {
                                            if (Objects.equals(intent.getAction(), "android.bluetooth.adapter.action.BLE_STATE_CHANGED")) {
                                                int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1);
                                                if (intExtra == 15 || intExtra == 12) {
                                                    cfcs.f(context3, this);
                                                    igk.this.b(null);
                                                }
                                            }
                                        }
                                    };
                                    IntentFilter intentFilter = new IntentFilter("android.bluetooth.adapter.action.BLE_STATE_CHANGED");
                                    final Context context3 = context2;
                                    context3.registerReceiver(tracingBroadcastReceiver, intentFilter);
                                    igkVar.a(new Runnable() { // from class: crlr
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            Context context4 = context3;
                                            cfcs.f(context4, tracingBroadcastReceiver);
                                            crlw.d(context4);
                                            igkVar.c(new Exception("Ble future is cancelled."));
                                        }
                                    }, cfdj.d());
                                    cezt ceztVar = a2;
                                    if (ceztVar.g() || ceztVar.h()) {
                                        return "BluetoothUtils.setBleEnabled";
                                    }
                                    if (ceztVar.a() != 10) {
                                        ((ejhf) ((ejhf) cexf.a.h()).ah((char) 6541)).x("Unable to enable BLE. Initial BLE state must be off.");
                                    } else {
                                        try {
                                            if (ceztVar.a.o()) {
                                                return "BluetoothUtils.setBleEnabled";
                                            }
                                        } catch (NullPointerException | SecurityException unused) {
                                        }
                                    }
                                    cfcs.f(context3, tracingBroadcastReceiver);
                                    crlw.d(context3);
                                    igkVar.c(new Exception("Bluetooth Service denied the enable Ble request."));
                                    return "BluetoothUtils.setBleEnabled";
                                }
                            }), fqmf.a.a().Z()) || crlw.e(context2)) {
                                dfauVar2.b(null);
                                return;
                            }
                            crlw.d(context2);
                        }
                        dfauVar2.a(new Exception("Got exception when turning on Ble"));
                    }
                });
                dfaz dfazVar = dfauVar.a;
                dfazVar.z(new dfak() { // from class: clpa
                    @Override // defpackage.dfak
                    public final void gn(Object obj) {
                        int i = NearbySharingChimeraService.ad;
                        cmfe.a.b().p("BLE has been enabled, we can start a FastInit scan.", new Object[0]);
                    }
                });
                dfazVar.y(new dfah() { // from class: clpb
                    @Override // defpackage.dfah
                    public final void gm(Exception exc) {
                        NearbySharingChimeraService.this.H = false;
                        cmfe.a.e().f(exc).p("Failed to enable BLE for FastInit.", new Object[0]);
                    }
                });
                return;
            }
        }
        if (bo()) {
            aq();
            cmfe.a.b().p("Stopping FastInitiation scanning because we're scanning for other devices.", new Object[0]);
            return;
        }
        if (aI()) {
            aq();
            cmfe.a.b().p("Stopping FastInitiation scanning because we're currently in the midst of a transfer.", new Object[0]);
            return;
        }
        if (be()) {
            aq();
            cmfe.a.b().p("Stopping FastInitiation scanning to avoid interference with 2.4GHz Wi-Fi connections.", new Object[0]);
            return;
        }
        if (k() == 0) {
            cmfe.a.b().p("Stopping FastInitiation scanning because visibility is hidden.", new Object[0]);
            aq();
            return;
        }
        if (!ModuleInitializer.a(this)) {
            if (aF()) {
                aq();
            }
            cmfe.a.a().p("Cannot scan for Fast Init, because Nearby Share is not available.", new Object[0]);
            return;
        }
        if (!this.at) {
            cmfe.a.b().p("Failed to scan for fast initiation because the user's screen is locked.", new Object[0]);
            return;
        }
        if (!aA() && !aB()) {
            cmfe.a.b().p("Failed to scan for fast initiation because Nearby Share and Fast Init Notification are disabled.", new Object[0]);
            return;
        }
        if (!this.av) {
            cmfe.a.b().p("Failed to scan for fast initiation because location is disabled.", new Object[0]);
            return;
        }
        if (this.au && fqmk.v()) {
            cmfe.a.b().p("Failed to scan for fast initiation because power save mode is enabled.", new Object[0]);
            return;
        }
        boolean aA = aA();
        if (aF()) {
            if (aA == this.ar) {
                cmfe.a.d().h("Failed to scan for fast initiation because we're already scanning with isHighPowerAllowed=%s.", Boolean.valueOf(this.ar));
                return;
            } else {
                cmfe.a.b().h("Restarting scanning for fast initiation with isHighPowerAllowed=%s", Boolean.valueOf(aA));
                aq();
            }
        }
        cjpg b = cjpg.b();
        Intent addFlags = new Intent().setClassName(this, true != fqjv.c() ? "com.google.android.gms.nearby.sharing.receive.ReceiveActivity" : "com.google.android.gms.nearby.sharing.main.MainActivity").addFlags(268435456).addFlags(32768);
        ClipData clipData = dwdg.a;
        PendingIntent a2 = dwdg.a(this, 0, addFlags, 1140850688);
        eiig.x(a2);
        b.i(a2);
        if (!this.F.p(aA, new clqf(this))) {
            this.ar = false;
        } else {
            this.ar = aA;
            cmfe.a.b().p("Fast Initiation Scanning has started", new Object[0]);
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
            SharingSyncChimeraService.e(context, fqmf.a.a().by());
            return;
        }
        if (br()) {
            bc();
            Context context2 = this.I;
            SharingSyncChimeraService.d(context2);
            SharingSyncChimeraService.e(context2, fqmf.a.a().bU());
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
        clws clwsVar;
        clws clwsVar2;
        if (shareTarget.f) {
            cexb cexbVar = this.P;
            Long valueOf = Long.valueOf(shareTarget.a);
            if (cexbVar.k(valueOf) && (clwsVar2 = (clws) cexbVar.a(valueOf)) != null) {
                TransferMetadata transferMetadata = clwsVar2.b;
                if (transferMetadata.e) {
                    cexbVar.b(valueOf);
                    return;
                } else {
                    cexbVar.j(valueOf, new clws(clwsVar2.a, transferMetadata, false));
                    return;
                }
            }
            return;
        }
        cexb cexbVar2 = this.O;
        Long valueOf2 = Long.valueOf(shareTarget.a);
        if (!cexbVar2.k(valueOf2) || (clwsVar = (clws) cexbVar2.a(valueOf2)) == null) {
            return;
        }
        TransferMetadata transferMetadata2 = clwsVar.b;
        if (transferMetadata2.e) {
            cexbVar2.b(valueOf2);
        } else {
            cexbVar2.j(valueOf2, new clws(clwsVar.a, transferMetadata2, false));
        }
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        if (!ModuleInitializer.a(this)) {
            cmfe.a.b().p("Nearby sharing service is disabled.  Get service returning error.", new Object[0]);
            bxgjVar.a(13, null);
            return;
        }
        Bundle bundle = getServiceRequest.i;
        final int i = bundle.getInt("vendor_id", 0);
        int i2 = bundle.getInt("vendor_flags", 0);
        if (i != 0) {
            ae(new Runnable() { // from class: clpj
                @Override // java.lang.Runnable
                public final void run() {
                    NearbySharingChimeraService.this.b.u(i);
                }
            });
        }
        String str = getServiceRequest.f;
        int a = crly.a(this, str) - 1;
        if (a == 1) {
            String str2 = getServiceRequest.p;
            bxgjVar.c(new clwl(this, str, i, i2));
            cmfe.a.b().i("A new client has bound to the NearbySharingService ClientBridge for calling package %s and PID %s", str, Integer.valueOf(Binder.getCallingPid()));
        } else if (a == 2) {
            String str3 = getServiceRequest.p;
            bxgjVar.c(new clwl(this, str, i, i2));
            cmfe.a.b().h("A new client has bound to the NearbySharingService ClientBridge for calling package %s", str);
        } else if (a != 3) {
            bxgjVar.a(35513, null);
            cmfe.a.b().h("A new client failed to bind to the NearbySharingService for calling package %s", str);
        } else {
            String str4 = getServiceRequest.p;
            bxgjVar.c(new clwm(this, str, i, i2));
            cmfe.a.b().h("A new client has bound to the NearbySharingService ExternalClientBridge for calling package %s", str);
        }
    }

    public final boolean aA() {
        if (fqmk.t()) {
            return true;
        }
        if (!fqmf.bd()) {
            cmfe.a.a().p("Nearby Share is disabled, because Nearby Share is not enabled.", new Object[0]);
            return false;
        }
        if (ModuleInitializer.a(this)) {
            return bxdg.i(w(), "enabled", false);
        }
        cmfe.a.a().p("Nearby Share is disabled, because Nearby Share is not available.", new Object[0]);
        return false;
    }

    public final boolean aB() {
        return this.c.X();
    }

    public final boolean aC() {
        return this.c.Y();
    }

    public final boolean aD() {
        return fqmn.D() ? eivv.d(this.P.e(), new eiih() { // from class: clqe
            @Override // defpackage.eiih
            public final boolean a(Object obj) {
                int i = NearbySharingChimeraService.ad;
                return !((clws) obj).b.e;
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
        return fqmn.D() ? eivv.d(this.O.e(), new eiih() { // from class: clps
            @Override // defpackage.eiih
            public final boolean a(Object obj) {
                int i = NearbySharingChimeraService.ad;
                return !((clws) obj).b.e;
            }
        }).iterator().hasNext() : this.al;
    }

    public final boolean aH(ShareTarget shareTarget) {
        return shareTarget.f ? this.P.k(Long.valueOf(shareTarget.a)) : this.O.k(Long.valueOf(shareTarget.a));
    }

    public final boolean aI() {
        return fqmn.D() ? aG() || aD() : this.aj;
    }

    public final void aJ() {
        if (!ModuleInitializer.a(this)) {
            cmfe.a.a().p("Cannot invalidate default opt in state, because Nearby Share is not available.", new Object[0]);
            return;
        }
        if (crmv.c(this.I)) {
            return;
        }
        if (!crll.n(this)) {
            cmfe.a.b().p("Not qualified for default opt-in. Multiple accounts are found.", new Object[0]);
        } else if (cexc.h(this)) {
            if (this.c.b() <= 1) {
                int e = this.b.e(v());
                this.c.E(e);
                if (e <= 1) {
                    cmfe.a.b().p("Not qualified for default opt-in. This account does not have multiple devices.", new Object[0]);
                }
            }
            if (crmv.c(this)) {
                cmfe.a.b().p("Not qualified for default opt-in. Already explicitly opted in.", new Object[0]);
            } else {
                if (bp()) {
                    cexi cexiVar = cmfe.a;
                    cexiVar.b().p("Eligible for default opt-in.", new Object[0]);
                    if (fqmk.t()) {
                        if (!bxdg.i(w(), "enabled", false)) {
                            cexiVar.b().p("Enabling Nearby Share, because it's qualified for default opted in.", new Object[0]);
                            this.c.y(true == fqmk.ai() ? 1 : 4, 0L);
                            t(true);
                            this.K.i(cmdh.r());
                            return;
                        }
                        cmdi cmdiVar = new cmdi();
                        cmdiVar.b = 1;
                        cmdiVar.a = 5;
                        P(new cmdj(cmdiVar));
                        cexiVar.b().p("NearbySharing was default opted in", new Object[0]);
                        return;
                    }
                    if (!aA() && !this.c.Q()) {
                        cexiVar.b().p("Enabling Nearby Share, because it's qualified for default opted in.", new Object[0]);
                        this.c.y(true == fqmk.ai() ? 1 : 4, 0L);
                        t(true);
                        this.K.i(cmdh.r());
                        return;
                    }
                    if (aA()) {
                        cmdi cmdiVar2 = new cmdi();
                        cmdiVar2.b = 1;
                        cmdiVar2.a = 5;
                        P(new cmdj(cmdiVar2));
                        cexiVar.b().p("NearbySharing was default opted in", new Object[0]);
                        return;
                    }
                    return;
                }
                cmfe.a.b().p("Not qualified for default opt-in. Device is still in setup wizard.", new Object[0]);
            }
        } else {
            cmfe.a.b().p("Not qualified for default opt-in. Not running in the primary profile.", new Object[0]);
        }
        if (aA()) {
            cmfe.a.b().p("Disabling Nearby Share because it's not qualified for default opted in and the user has not manually opted in.", new Object[0]);
            t(false);
            this.c.s();
            this.c.y(0, 0L);
        }
    }

    public final void aM() {
        bw(true);
    }

    public final void aN(cmcc cmccVar) {
        int i;
        irx irxVar;
        if (!fqmn.D() && bh(1) && (irxVar = this.M) != null && ((TransferMetadata) irxVar.b).e) {
            this.M = null;
        }
        bh(2);
        cexb cexbVar = this.n;
        clwq clwqVar = cexbVar.k(cmccVar) ? (clwq) cexbVar.b(cmccVar) : null;
        if (clwqVar != null && clwqVar.a == 1 && !ax()) {
            am(k());
            if (fqmn.D()) {
                eitj i2 = eitj.i(this.P.e());
                int size = i2.size();
                int i3 = 0;
                while (i3 < size) {
                    clws clwsVar = (clws) i2.get(i3);
                    Iterator it = aX(0).iterator();
                    while (true) {
                        i = i3 + 1;
                        if (it.hasNext()) {
                            cmcc cmccVar2 = (cmcc) it.next();
                            cexi b = cmfe.a.b();
                            ShareTarget shareTarget = clwsVar.a;
                            b.h("Reporting in progress share target %s when unregistering receive surface", shareTarget.b);
                            cmca a = clwsVar.b.a();
                            a.d();
                            cmccVar2.e(shareTarget, a.a());
                        }
                    }
                    i3 = i;
                }
            } else {
                irx irxVar2 = this.M;
                if (irxVar2 != null) {
                    Object obj = irxVar2.b;
                    ShareTarget shareTarget2 = (ShareTarget) irxVar2.a;
                    TransferMetadata transferMetadata = (TransferMetadata) obj;
                    Iterator it2 = aX(0).iterator();
                    while (it2.hasNext()) {
                        ((cmcc) it2.next()).e(shareTarget2, transferMetadata);
                    }
                }
            }
        }
        L();
        if (clwqVar != null && clwqVar.a == 2) {
            bh(2);
        }
        cmfe.a.b().h("A ReceiveSurface(%s) has been unregistered", G(clwqVar == null ? -1 : clwqVar.a));
        af(new clpg(this), fqmf.ax());
        M();
    }

    public final void aP() {
        if (!fqmk.a.a().au()) {
            cmfe.a.b().p("Uwb feature is off.", new Object[0]);
        } else if (croc.e(this)) {
            cmfe.a.b().p("Uwb is unavailable in airplane mode", new Object[0]);
        } else {
            if (this.at) {
                return;
            }
            cmfe.a.b().p("Disabling Uwb when the screen is locked to save on battery power", new Object[0]);
        }
    }

    public final void aa(ShareTarget shareTarget, TransferMetadata transferMetadata) {
        bu(shareTarget, transferMetadata);
        if (fqmn.D()) {
            if (transferMetadata.m) {
                this.P.i(Long.valueOf(shareTarget.a), new clws(shareTarget, transferMetadata), new cfbn());
                if (!shareTarget.k) {
                    this.S.i(shareTarget, "INTERNAL_PROVIDER_ID");
                }
                bb(true);
            } else if (transferMetadata.e) {
                cexb cexbVar = this.P;
                Long valueOf = Long.valueOf(shareTarget.a);
                cexbVar.j(valueOf, new clws(shareTarget, transferMetadata, bq(shareTarget)));
                if (!bq(shareTarget) || ax()) {
                    cexbVar.c(valueOf, new cfbn());
                }
                ba();
            } else {
                this.P.j(Long.valueOf(shareTarget.a), new clws(shareTarget, transferMetadata, bq(shareTarget)));
            }
            List<cmcc> aX = aX(1);
            if (aX.isEmpty()) {
                aX = aX(0);
            }
            for (cmcc cmccVar : aX) {
                if (ax()) {
                    this.G.f(shareTarget);
                }
                cmccVar.e(shareTarget, transferMetadata);
            }
            return;
        }
        int i = transferMetadata.a;
        if (i == 1009 || i == 1008) {
            this.M = null;
        } else {
            cmca a = transferMetadata.a();
            a.d();
            this.M = new irx(shareTarget, a.a());
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
        List<cmcc> aX2 = aX(1);
        if (aX2.isEmpty()) {
            aX2 = aX(0);
        }
        for (cmcc cmccVar2 : aX2) {
            if (ax()) {
                this.G.f(shareTarget);
            }
            cmccVar2.e(shareTarget, transferMetadata);
        }
    }

    public final void ab(ShareTarget shareTarget, TransferMetadata transferMetadata) {
        char c;
        Integer num;
        char c2;
        if (!fqmn.D()) {
            Map map = this.L;
            if (map != null && !map.containsKey(shareTarget) && transferMetadata.a == 1009) {
                cmfe.a.b().p("Skip the update due to not finding this shareTarget.", new Object[0]);
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
                ((cmcc) ((irx) it.next()).a).e(shareTarget, transferMetadata);
            }
            if (ay() && z) {
                map.remove(shareTarget);
                return;
            } else {
                if (transferMetadata.a != 1016) {
                    cmca a = transferMetadata.a();
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
            this.O.i(Long.valueOf(shareTarget.a), new clws(shareTarget, transferMetadata), new cfbn());
        } else {
            c = 3;
            num = 3;
            c2 = 2;
            if (transferMetadata.e) {
                cexb cexbVar = this.O;
                Long valueOf = Long.valueOf(shareTarget.a);
                cexbVar.j(valueOf, new clws(shareTarget, transferMetadata, bq(shareTarget)));
                if (!bq(shareTarget) || ay()) {
                    cexbVar.c(valueOf, new cfbn());
                }
                if (!this.N.k(valueOf)) {
                    Iterator it2 = this.o.e().iterator();
                    while (it2.hasNext()) {
                        ((clwr) it2.next()).a.c(shareTarget);
                    }
                }
            } else {
                this.O.j(Long.valueOf(shareTarget.a), new clws(shareTarget, transferMetadata, bq(shareTarget)));
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
            ((cmcc) ((irx) it3.next()).a).e(shareTarget, transferMetadata);
        }
    }

    public final void ac(ShareTarget shareTarget, int i, RangingData rangingData) {
        Iterator it = this.o.e().iterator();
        while (it.hasNext()) {
            ((clwr) it.next()).a.b(shareTarget, i, rangingData);
        }
    }

    public final void ad() {
        t(false);
        ak(false);
        aY();
        clxh.t();
        this.b.t();
        this.c.r();
        bxdd c = w().c();
        c.d();
        bxdg.g(c);
        AtomicBoolean atomicBoolean = crny.a;
        boolean compareAndSet = atomicBoolean.compareAndSet(false, true);
        Context context = this.I;
        if (compareAndSet) {
            cmfe.a.d().p("DeleteCachedImages start.", new Object[0]);
            crmi.r(crny.b(context));
            atomicBoolean.set(false);
            cmfe.a.d().p("DeleteCachedImages end.", new Object[0]);
        } else {
            cmfe.a.d().p("DeleteCachedImages failed.", new Object[0]);
        }
        crnj.j(context);
        if (fqmk.ac()) {
            crlo.d(context).b();
        }
        crmu.e(context, C(false));
        cmfe.a.b().p("Deleted all Nearby partial payloads.", new Object[0]);
        crmv.a(context, false);
        crnj.i(context);
        ah();
        aJ();
        ak(true);
        if (fqmn.a.a().l()) {
            cmgj cmgjVar = (cmgj) this.ab.a();
            eiig.x(cmgjVar);
            final fvaq fvaqVar = new fvaq() { // from class: cmgb
                @Override // defpackage.fvaq
                public final Object a(Object obj) {
                    return cloc.a;
                }
            };
            ((enpf) cmgjVar.a.b(new eiho() { // from class: cmgc
                @Override // defpackage.eiho
                public final Object apply(Object obj) {
                    return fvaq.this.a(obj);
                }
            }, enre.a)).v(fqmf.af(), TimeUnit.MILLISECONDS);
        }
        M();
    }

    public final void ae(Runnable runnable) {
        ScheduledExecutorService scheduledExecutorService = this.az;
        if (scheduledExecutorService == null) {
            cmfe.a.e().p("Unable to execute task. No executor found.", new Object[0]);
        } else {
            scheduledExecutorService.execute(runnable);
        }
    }

    public final void af(Runnable runnable, long j) {
        ((cfdi) this.az).schedule(runnable, j, TimeUnit.MILLISECONDS);
    }

    public final void ag(boolean z) {
        this.B = z;
        cmfe.a.b().h("Bluetooth is %s", true != z ? "disabled" : "enabled");
        W();
        au();
    }

    public final void ah() {
        Object obj;
        dfaq e = crll.e(this);
        try {
            dfbl.n(e);
            obj = e.i();
        } catch (InterruptedException | ExecutionException e2) {
            ((ejhf) ((ejhf) cexf.a.j()).s(e2)).B("Failed %s while waiting for the task.", "getSupportedAccounts");
            if (e2 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            obj = null;
        }
        ArrayList arrayList = (ArrayList) obj;
        if (arrayList == null || arrayList.isEmpty()) {
            cmfe.a.e().p("No supported accounts found.", new Object[0]);
            q(null);
            return;
        }
        String c = bxdg.c(w(), "account", "");
        if (c.isEmpty()) {
            cmfe.a.e().p("Account name is empty.", new Object[0]);
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
        cmfe.a.b().h("Location is %s", true != z ? "disabled" : "enabled");
        W();
        au();
    }

    public final void aj(boolean z) {
        if (z == this.au) {
            cmfe.a.d().h("Power Save is already %s, skipping invalidate", true == z ? "enabled" : "disabled");
            return;
        }
        this.au = z;
        cmfe.a.b().h("Power Save is %s", true == z ? "enabled" : "disabled");
        W();
    }

    public final void ak(boolean z) {
        if (z == this.at) {
            cmfe.a.d().h("Screen is already %s, skipping invalidate", true == z ? "unlocked" : "locked");
            return;
        }
        this.at = z;
        cmfe.a.b().h("Screen is %s", true == z ? "unlocked" : "locked");
        if (z) {
            this.aC = SystemClock.elapsedRealtime();
        }
        final crmb crmbVar = this.aO;
        final Runnable runnable = new Runnable() { // from class: clpi
            @Override // java.lang.Runnable
            public final void run() {
                NearbySharingChimeraService nearbySharingChimeraService = NearbySharingChimeraService.this;
                nearbySharingChimeraService.X();
                nearbySharingChimeraService.W();
            }
        };
        if (crmbVar.a == 0) {
            runnable.run();
            return;
        }
        if (crmbVar.b(runnable)) {
            return;
        }
        ScheduledFuture scheduledFuture = crmbVar.c;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            crmbVar.c.cancel(false);
        }
        crmbVar.c = ((cfdi) crmbVar.b).schedule(new Runnable() { // from class: crma
            @Override // java.lang.Runnable
            public final void run() {
                crmb.this.b(runnable);
            }
        }, crmbVar.a(), TimeUnit.MILLISECONDS);
    }

    public final void al() {
        this.aE = new AnonymousClass19();
        this.aF = new AnonymousClass20();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.gms.nearby.sharing.CERTIFICATES_REGENERATION");
        cfcs.b(this, this.aE, intentFilter);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("com.google.android.gms.nearby.sharing.ACCEPT_CONSTELLATION");
        cfcs.b(this, this.aF, intentFilter2);
        if (crll.o(this, v())) {
            cmdi cmdiVar = new cmdi();
            cmdiVar.a = 7;
            cmdiVar.b = 1;
            ar(new cmdj(cmdiVar));
        }
        this.b.s();
    }

    public final void am(int i) {
        if (fqmk.Z()) {
            Integer aV = aV();
            if (aV != null && aV.intValue() == 3) {
                return;
            }
        } else if (ax()) {
            return;
        }
        if (i != 3 && this.c.P(v())) {
            clxh clxhVar = this.G;
            Context context = clxhVar.a;
            if (!cmfy.b(context).d()) {
                int i2 = i != 0 ? i != 4 ? R.string.sharing_notification_channel_contacts_visibility : R.string.sharing_notification_channel_self_share_visibility : R.string.sharing_notification_channel_hidden_visibility;
                cfaj cfajVar = new cfaj(context, "nearby_sharing_privacy");
                cfajVar.N(new ikb());
                cfajVar.F(context.getString(R.string.sharing_notification_channel_everyone_visibility_ended));
                cfajVar.E(context.getString(i2));
                cfajVar.g = clxhVar.b();
                cfajVar.S();
                cfajVar.l = 0;
                cfajVar.R();
                cfajVar.K(true);
                cfajVar.D(true);
                cfajVar.A = crno.a(context);
                cfajVar.U();
                cfajVar.T();
                cfajVar.M(R.drawable.sharing_ic_v3_foreground);
                cfajVar.Q(context.getString(R.string.sharing_product_name_v3));
                clxh.u(cfajVar);
                clxhVar.s(4, cfajVar.b());
            }
            this.c.F(v(), false);
        }
    }

    public final void an() {
        this.b.w();
        cmfe.a.b().p("Shut down SharingProvider", new Object[0]);
    }

    public final synchronized void ao() {
        if (this.aw) {
            cmfe.a.b().p("2.4GHz Wi-Fi connection warming up ended", new Object[0]);
            this.ax = true;
            W();
        }
    }

    public final void ap() {
        if (!bk()) {
            cmfe.a.a().p("Failed to stop advertising because we weren't advertising.", new Object[0]);
            return;
        }
        cewq cewqVar = this.aA;
        if (cewqVar != null) {
            cewqVar.b();
            this.aA = null;
        }
        eitj aU = aU();
        int size = aU.size();
        for (int i = 0; i < size; i++) {
            ((coiy) aU.get(i)).B();
        }
        this.ai = -1;
        this.s = null;
        this.ap.clear();
        cmfe.a.b().p("Advertising has stopped", new Object[0]);
    }

    public final void aq() {
        if (fqmk.y() && this.H) {
            this.H = false;
            cmfe.a.b().h("BLE has %s", true != crlw.d(this.I) ? "failed turned off" : "successfully turned off");
        }
        this.F.h();
        this.v = false;
        this.w = false;
        this.y.clear();
        this.ar = false;
        this.x = false;
        this.G.g();
        cjpg.b().i(null);
        cmfe.a.b().p("Fast Initiation Scanning has stopped", new Object[0]);
    }

    public final void ar(cmdj cmdjVar) {
        if (!ModuleInitializer.a(this)) {
            cmfe.a.a().p("Cannot sync, because Nearby Share is not available.", new Object[0]);
            return;
        }
        this.b.D(cmdjVar);
        Account v = v();
        long currentTimeMillis = System.currentTimeMillis();
        if (v != null) {
            clmo b = crll.b(this, v);
            fecj fecjVar = (fecj) b.iB(5, null);
            fecjVar.X(b);
            if (!fecjVar.b.L()) {
                fecjVar.U();
            }
            clmo clmoVar = (clmo) fecjVar.b;
            clmo clmoVar2 = clmo.a;
            clmoVar.b |= 128;
            clmoVar.k = currentTimeMillis;
            crll.p(this, v, (clmo) fecjVar.Q());
        }
        Context context = this.I;
        if (crmv.c(context)) {
            Account c = this.c.c();
            if (c == null) {
                u(0);
            } else {
                cmsq.a(context).d(c).z(new dfak() { // from class: clpx
                    @Override // defpackage.dfak
                    public final void gn(Object obj) {
                        final Boolean bool = (Boolean) obj;
                        final NearbySharingChimeraService nearbySharingChimeraService = NearbySharingChimeraService.this;
                        nearbySharingChimeraService.ae(new Runnable() { // from class: clpr
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
            cmfe.a.b().p("Not allowed to auto turn on device settings.", new Object[0]);
            return;
        }
        if (!ax() && !ay()) {
            cmfe.a.b().p("Don't turn on the device settings without foreground surface.", new Object[0]);
            return;
        }
        final Context context = this.I;
        if (croc.e(context)) {
            return;
        }
        ArraySet arraySet = new ArraySet();
        if (Build.VERSION.SDK_INT != 29 && !crny.h(context) && !croc.f(context)) {
            dfaq c = croc.c(context);
            c.z(new dfak() { // from class: crmc
                @Override // defpackage.dfak
                public final void gn(Object obj) {
                    crmg.d(context, true);
                }
            });
            c.y(new dfah() { // from class: crmd
                @Override // defpackage.dfah
                public final void gm(Exception exc) {
                    cmfe.a.e().f(exc).p("Failed to turn on Wifi.", new Object[0]);
                }
            });
            arraySet.add(c);
        }
        if (!crlw.g(context)) {
            dfaq c2 = crlw.c(context);
            c2.z(new dfak() { // from class: crme
                @Override // defpackage.dfak
                public final void gn(Object obj) {
                    crmg.c(context, true);
                }
            });
            c2.y(new dfah() { // from class: crmf
                @Override // defpackage.dfah
                public final void gm(Exception exc) {
                    cmfe.a.e().f(exc).p("Failed to turn on Bluetooth.", new Object[0]);
                }
            });
            arraySet.add(c2);
        }
        cfdd.c("turnOnDeviceSettings", dfbl.e(arraySet), fqmf.r());
    }

    public final synchronized void at(boolean z) {
        if (this.aw == z) {
            return;
        }
        if (z) {
            this.ax = false;
            this.C = cewq.d(cmfe.a, new Runnable() { // from class: clqb
                @Override // java.lang.Runnable
                public final void run() {
                    NearbySharingChimeraService.this.ao();
                }
            }, fqmf.a.a().cq(), this.ay);
        } else {
            cewq cewqVar = this.C;
            if (cewqVar != null) {
                cewqVar.b();
            }
        }
        this.aw = z;
        cmfe.a.b().i("%s 2.4GHz Wi-Fi connection and %s warming up period", true != z ? "Without" : "Has", true != this.ax ? "in" : "out of");
        W();
    }

    public final void au() {
        if (cexc.h(this) && crny.i(this)) {
            if (asqh.a()) {
                try {
                    TileService.requestListeningState(getApplicationContext(), new ComponentName(getPackageName(), "com.google.android.gms.nearby.sharing.SharingTileService"));
                } catch (IllegalArgumentException e) {
                    cmfe.a.e().f(e).p("Failed to update quick setting tile.", new Object[0]);
                } catch (SecurityException e2) {
                    cmfe.a.e().f(e2).p("Failed to update quick setting tile.", new Object[0]);
                }
            }
            if (fqmn.e()) {
                M();
            }
        }
    }

    public final void av() {
        cmdb cmdbVar = this.K;
        eygi B = B();
        Intent intent = this.T;
        long c = this.K.c();
        int i = this.aq;
        final Context context = this.I;
        final exxm w = cmdh.w(context, B, intent, c, 0L, i);
        if (fqmk.ac()) {
            cmdbVar.k(new Runnable() { // from class: cmcx
                @Override // java.lang.Runnable
                public final void run() {
                    crlo.d(context).c(w);
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
        if (fqmf.bd()) {
            return this.c.U(account, i);
        }
        return false;
    }

    public final int c(ShareTarget shareTarget) {
        if (fqmn.D()) {
            if (!aH(shareTarget)) {
                return 35511;
            }
            Y(shareTarget);
        }
        asmd asmdVar = (asmd) this.Q.get(Long.valueOf(shareTarget.a));
        if (fqmn.w()) {
            if (asmdVar != null) {
                asmdVar.interrupt();
                ab(shareTarget, new cmca(1009).a());
                cmfe.a.b().p("Set to CANCELLED due to client cancelling during download.", new Object[0]);
                return 0;
            }
            int b = y(shareTarget).b(shareTarget);
            this.M = null;
            cmfe.a.b().i("Client cancelled file with %s, result: %s", shareTarget, Integer.valueOf(b));
            return b;
        }
        if (asmdVar != null) {
            asmdVar.interrupt();
            ab(shareTarget, new cmca(1009).a());
            cmfe.a.b().p("Set to CANCELLED due to client cancelling during download.", new Object[0]);
            return 0;
        }
        Map map = this.L;
        if (map != null && map.containsKey(shareTarget) && ((TransferMetadata) map.get(shareTarget)).a == 1001) {
            map.put(shareTarget, new cmca(1009).a());
            cmfe.a.b().p("Set to CANCELLED due to client cancelled immediately.", new Object[0]);
        }
        int b2 = y(shareTarget).b(shareTarget);
        this.M = null;
        cmfe.a.b().i("Client cancelled file with %s, result: %s", shareTarget, Integer.valueOf(b2));
        return b2;
    }

    public final int d(ContactFilter contactFilter) {
        return this.b.d(contactFilter);
    }

    @Override // defpackage.bxgd, com.google.android.chimera.BoundService
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(fileDescriptor, printWriter, strArr);
        try {
            printWriter.write("                           .@@@@@@@@@@@@@@@@@@@@@@@.\n                      .@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@.\n                   .@@@@@@@@@                     @@@@@@@@@.\n                 @@@@@@@@                             @@@@@@@@\n               @@@@@@@                                   @@@@@@@\n             @@@@@@@                                       @@@@@@.\n            @@@@@@             @@@@@                         @@@@@@\n           @@@@@@               @@@@@@                        @@@@@@\n          @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@                      @@@@@@\n          .@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@                       @@@@@\n                               @@@@@@@                          @@@@@\n                              @@@@@        @@@@@\n          @@@@@                          @@@@@@\n          @@@@@                       @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@.\n          @@@@@@                      @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n           @@@@@@                        @@@@@@               @@@@@@\n            @@@@@@                         @@@@@             @@@@@@\n             @@@@@@@                                       @@@@@@.\n               @@@@@@@                                   @@@@@@@\n                 @@@@@@@@                             @@@@@@@@\n                   .@@@@@@@@@                     @@@@@@@@@.\n                       @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n                           .@@@@@@@@@@@@@@@@@@@@@@@.\n");
            printWriter.write("\n");
            printWriter.write(String.format("%s\n", "com.google.android.gms.nearby.sharing.NearbySharingService"));
            printWriter.flush();
            printWriter.write("  Device Settings: \n");
            printWriter.write(String.format("    Version: %s\n", fqmk.f()));
            Context context = this.I;
            int m = crno.m(context);
            printWriter.write(String.format("    Device Type: %s\n", m != 1 ? m != 2 ? m != 3 ? "LAPTOP" : "TABLET" : "PHONE" : "UNKNOWN_DEVICE_TYPE"));
            printWriter.write(String.format("    Account Type: %s\n", fqmf.aS()));
            printWriter.flush();
            printWriter.write("  User Settings: \n");
            printWriter.write(String.format("    Device name: %s\n", this.c.h(v())));
            printWriter.write(String.format("    Opted In: %s\n", Boolean.valueOf(crmv.c(context))));
            printWriter.write(String.format("    Enabled: %s\n", Boolean.valueOf(aA())));
            printWriter.write(String.format("    Visibility: %s\n", crnt.s(k())));
            printWriter.write(String.format("    Data Usage Preference: %s\n", D(i())));
            printWriter.write(String.format("    Show HUN Enabled: %s\n", Boolean.valueOf(aB())));
            printWriter.flush();
            printWriter.write("  System State: \n");
            printWriter.write(String.format("    Screen Unlocked: %s\n", Boolean.valueOf(this.at)));
            printWriter.write(String.format("    Airplane Mode Enabled: %s\n", Boolean.valueOf(croc.e(this))));
            printWriter.write(String.format("    Bluetooth Enabled: %s\n", Boolean.valueOf(this.B)));
            printWriter.write(String.format("    BLE Enabled: %s\n", Boolean.valueOf(crlw.e(context))));
            printWriter.write(String.format("    WiFi Enabled: %s\n", Boolean.valueOf(croc.f(this))));
            printWriter.write(String.format("    Location Enabled: %s\n", Boolean.valueOf(this.av)));
            printWriter.write(String.format("    Battery Saver Enabled: %s\n", Boolean.valueOf(this.au)));
            printWriter.write(String.format("    Do-Not-Disturb Enabled: %s\n", Boolean.valueOf(Settings.Global.getInt(this.G.a.getContentResolver(), "zen_mode", 0) != 0)));
            printWriter.write(String.format("    Primary Profile: %s\n", Boolean.valueOf(cexc.h(this))));
            printWriter.write(String.format("    Setup Wizard In Progress: %s\n", Boolean.valueOf(!bp())));
            printWriter.flush();
            printWriter.write("  Internal State: \n");
            printWriter.write(String.format("    Advertising: %s\n", Boolean.valueOf(bk())));
            printWriter.write(String.format("    Scanning: %s\n", Boolean.valueOf(aE())));
            printWriter.write(String.format("    Transferring Files: %s\n", Boolean.valueOf(aI())));
            printWriter.write("    Registered Receive Surfaces:\n");
            this.n.g(printWriter, new cewx() { // from class: clpp
                @Override // defpackage.cewx
                public final String a(Object obj) {
                    return NearbySharingChimeraService.H((cmcc) obj);
                }
            }, new cewx() { // from class: clqa
                @Override // defpackage.cewx
                public final String a(Object obj) {
                    String str;
                    clwq clwqVar = (clwq) obj;
                    int i = NearbySharingChimeraService.ad;
                    String G = NearbySharingChimeraService.G(clwqVar.a);
                    int i2 = clwqVar.b;
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
            this.o.g(printWriter, new cewx() { // from class: clqj
                @Override // defpackage.cewx
                public final String a(Object obj) {
                    return NearbySharingChimeraService.H((cmcc) obj);
                }
            }, new cewx() { // from class: clqk
                @Override // defpackage.cewx
                public final String a(Object obj) {
                    int i = NearbySharingChimeraService.ad;
                    return cmay.a(((clwr) obj).b);
                }
            });
            printWriter.write(String.format("    Fast Init Advertising: %s\n", Boolean.valueOf(this.F.i())));
            printWriter.write(String.format("    Fast Init Scanning: %s\n", Boolean.valueOf(this.F.k())));
            printWriter.write(String.format("    Fast Init HUN Suppressed: %s\n", Boolean.valueOf(this.G.c.b())));
            printWriter.write(String.format("    Number of Owned Devices: %s\n", Integer.valueOf(this.c.b())));
            irx irxVar = this.r;
            if (irxVar != null) {
                printWriter.write(String.format("    Cached Attachments: %s\n", irxVar.b));
            }
            printWriter.flush();
            if (fqmn.D()) {
                printWriter.write("  Discovered ShareTargets:\n");
                this.N.g(printWriter, new cewx() { // from class: clql
                    @Override // defpackage.cewx
                    public final String a(Object obj) {
                        int i = NearbySharingChimeraService.ad;
                        return Long.toString(((Long) obj).longValue());
                    }
                }, new cewx() { // from class: clqm
                    @Override // defpackage.cewx
                    public final String a(Object obj) {
                        int i = NearbySharingChimeraService.ad;
                        return ((ShareTarget) obj).b;
                    }
                });
                printWriter.write("  Outgoing Transfers:\n");
                this.O.g(printWriter, new cewx() { // from class: clqn
                    @Override // defpackage.cewx
                    public final String a(Object obj) {
                        int i = NearbySharingChimeraService.ad;
                        return Long.toString(((Long) obj).longValue());
                    }
                }, new cewx() { // from class: clqo
                    @Override // defpackage.cewx
                    public final String a(Object obj) {
                        clws clwsVar = (clws) obj;
                        String str = clwsVar.a.b;
                        int i = clwsVar.b.a;
                        int i2 = NearbySharingChimeraService.ad;
                        return str + " | " + TransferMetadata.c(i);
                    }
                });
                printWriter.write("  Incoming Transfers:\n");
                this.P.g(printWriter, new cewx() { // from class: clou
                    @Override // defpackage.cewx
                    public final String a(Object obj) {
                        int i = NearbySharingChimeraService.ad;
                        return Long.toString(((Long) obj).longValue());
                    }
                }, new cewx() { // from class: clov
                    @Override // defpackage.cewx
                    public final String a(Object obj) {
                        clws clwsVar = (clws) obj;
                        String str = clwsVar.a.b;
                        int i = clwsVar.b.a;
                        int i2 = NearbySharingChimeraService.ad;
                        return str + " | " + TransferMetadata.c(i);
                    }
                });
            } else {
                this.S.h(printWriter);
            }
            if (fqmk.a.a().aa()) {
                cfch.b(new aspo(printWriter, "  "), fqmm.class, fqmp.class);
            }
            cmtr cmtrVar = this.F;
            printWriter.write(String.format("%s\n", "com.google.android.gms.nearby.sharing.discovery.FastInitiation"));
            printWriter.write(String.format("  Scan Mode: %s\n", cmtr.c(cmtrVar.b)));
            printWriter.write(String.format("  Current Advertising Fast Init Type: %s\n", cmtr.b(cmtrVar.g)));
            printWriter.write(String.format("  Reported BLE Metadata: %s\n", cmtrVar.f));
            printWriter.write(String.format("  %s\n", "Sighted BLE Peripherals"));
            ejfg listIterator = eits.k(cmtrVar.c).entrySet().listIterator();
            while (listIterator.hasNext()) {
                Map.Entry entry = (Map.Entry) listIterator.next();
                printWriter.write(String.format("    %s -> %s\n", entry.getKey(), entry.getValue()));
            }
            printWriter.flush();
            coiq coiqVar = this.c;
            if (coiqVar != null) {
                coiqVar.n(printWriter);
            }
            coiy coiyVar = this.b;
            if (coiyVar != null) {
                coiyVar.p(printWriter);
            }
            cmdb cmdbVar = this.K;
            if (cmdbVar != null) {
                cmfl cmflVar = cmdbVar.f.a;
                if (!cmflVar.isEmpty()) {
                    printWriter.write("\n[Analytics Logger Dump]\n");
                    Iterator it = cmflVar.iterator();
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

    @Override // defpackage.jon
    public final job getLifecycle() {
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
        if (fqmn.D()) {
            Y(shareTarget);
        }
        int g = y(shareTarget).g(shareTarget);
        this.M = null;
        cmfe.a.b().h("Client opened incoming file from %s", shareTarget);
        return g;
    }

    @Override // defpackage.bxgd, com.google.android.chimera.BoundService, defpackage.qan
    public final IBinder onBind(Intent intent) {
        this.aX.a();
        return super.onBind(intent);
    }

    @Override // defpackage.clxi, com.google.android.chimera.BoundService, defpackage.qan
    public final void onCreate() {
        this.aX.b();
        aR();
        if (!ModuleInitializer.a(this)) {
            cmfe.a.b().p("Nearby sharing service is disabled.  Do not instantiate Nearby Share", new Object[0]);
            return;
        }
        cmfe.a.b().p("NearbySharingService onCreate", new Object[0]);
        Context context = this.I;
        this.K = cmdb.f(context);
        this.J = (PowerManager) getApplicationContext().getSystemService(PowerManager.class);
        if (!fqmn.r()) {
            this.Y = new eijx(QuickShareRoomDatabase.l.a(context));
        }
        if (this.az == null) {
            this.az = cfdj.g(new cfbm(fqls.b(), fqmn.B()));
        }
        ae(new Runnable() { // from class: clpw
            @Override // java.lang.Runnable
            public final void run() {
                File[] listFiles;
                cmty cmtyVar = new cmty();
                NearbySharingChimeraService nearbySharingChimeraService = NearbySharingChimeraService.this;
                nearbySharingChimeraService.A = cmtyVar;
                if (nearbySharingChimeraService.c == null) {
                    Context context2 = nearbySharingChimeraService.I;
                    String c = bxdg.c(nearbySharingChimeraService.w(), "device_id", null);
                    if (c == null) {
                        SecureRandom secureRandom = new SecureRandom();
                        StringBuilder sb = new StringBuilder();
                        for (int i = 0; i < 10; i++) {
                            sb.append("ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".charAt(secureRandom.nextInt(36)));
                        }
                        c = sb.toString();
                        bxdd c2 = nearbySharingChimeraService.w().c();
                        c2.h("device_id", c);
                        bxdg.g(c2);
                    }
                    nearbySharingChimeraService.c = new coiq(context2, c);
                }
                if (nearbySharingChimeraService.m == null) {
                    nearbySharingChimeraService.m = new cmdv(nearbySharingChimeraService.I);
                }
                nearbySharingChimeraService.b = nearbySharingChimeraService.z();
                Context context3 = nearbySharingChimeraService.I;
                crmg.b(context3);
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
                if (cmfy.b(context3).i()) {
                    ContentResolver contentResolver = context3.getContentResolver();
                    if (cmfy.b(context3).i() && asqh.b()) {
                        int integer = nearbySharingChimeraService.getResources().getInteger(R.integer.sharing_max_name_length_bytes);
                        nearbySharingChimeraService.R = new clrz(nearbySharingChimeraService, contentResolver, integer);
                        try {
                            contentResolver.registerContentObserver(Settings.Global.getUriFor("device_name"), false, nearbySharingChimeraService.R);
                        } catch (SecurityException unused) {
                            cmfe.a.e().h("Failed to register content observer for %s", Settings.Global.getUriFor("device_name"));
                        }
                        String a = cfau.a(contentResolver, "device_name");
                        if (a != null) {
                            String a2 = crnv.a(a, integer);
                            cmfe.a.b().h("Changing Nearby Share device name to %s", a2);
                            nearbySharingChimeraService.r(a2);
                        }
                    }
                }
                if (fqmk.q()) {
                    File file = new File(nearbySharingChimeraService.C(true), "nearby_share_previews");
                    if (file.exists() && (listFiles = file.listFiles()) != null) {
                        for (File file2 : listFiles) {
                            cmfe.a.a().h("Deleting preview file: %s", file2.getName());
                            file2.delete();
                        }
                    }
                }
                nearbySharingChimeraService.M();
            }
        });
        clxh d = clxh.d(context);
        this.G = d;
        d.e();
        this.aO = new crmb(this.az, fqmf.a.a().bF(), TimeUnit.MILLISECONDS);
        if (ModuleInitializer.a(this)) {
            this.aH = new AnonymousClass2();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            iln.b(this, this.aH, intentFilter, 2);
            ae(new Runnable() { // from class: clpm
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
            iln.b(this, this.aG, intentFilter2, 2);
            DisplayManager displayManager = (DisplayManager) getSystemService(DisplayManager.class);
            clrt clrtVar = new clrt(this);
            this.aI = clrtVar;
            displayManager.registerDisplayListener(clrtVar, new byhr(Looper.getMainLooper()));
            ae(new Runnable() { // from class: clpq
                @Override // java.lang.Runnable
                public final void run() {
                    NearbySharingChimeraService nearbySharingChimeraService = NearbySharingChimeraService.this;
                    nearbySharingChimeraService.ak(crno.j(nearbySharingChimeraService.getApplicationContext()));
                }
            });
            AnonymousClass5 anonymousClass5 = new AnonymousClass5();
            this.aK = anonymousClass5;
            iln.b(this, anonymousClass5, new IntentFilter("android.location.MODE_CHANGED"), 2);
            ae(new Runnable() { // from class: clpe
                @Override // java.lang.Runnable
                public final void run() {
                    NearbySharingChimeraService nearbySharingChimeraService = NearbySharingChimeraService.this;
                    nearbySharingChimeraService.ai(exft.b(nearbySharingChimeraService));
                }
            });
            AnonymousClass6 anonymousClass6 = new AnonymousClass6();
            this.aL = anonymousClass6;
            iln.b(this, anonymousClass6, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"), 2);
            ae(new Runnable() { // from class: clpn
                @Override // java.lang.Runnable
                public final void run() {
                    NearbySharingChimeraService nearbySharingChimeraService = NearbySharingChimeraService.this;
                    nearbySharingChimeraService.ag(crlw.g(nearbySharingChimeraService));
                }
            });
            if (fqmk.y()) {
                AnonymousClass7 anonymousClass7 = new AnonymousClass7();
                this.aM = anonymousClass7;
                iln.b(this, anonymousClass7, new IntentFilter("android.bluetooth.adapter.action.BLE_STATE_CHANGED"), 2);
            }
            this.aJ = new AnonymousClass1();
            IntentFilter intentFilter3 = new IntentFilter();
            intentFilter3.addAction("com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE");
            intentFilter3.addCategory("com.google.android.gms.auth.category.ACCOUNT_REMOVED");
            intentFilter3.addCategory("com.google.android.gms.auth.category.ACCOUNT_ADDED");
            iln.c(this, this.aJ, intentFilter3, "com.google.android.gms.auth.permission.GOOGLE_ACCOUNT_CHANGE", null, 2);
            AnonymousClass10 anonymousClass10 = new AnonymousClass10();
            this.aP = anonymousClass10;
            cfcs.b(this, anonymousClass10, new IntentFilter("com.google.android.gms.nearby.sharing.ACTION_AUTO_DISMISS"));
            AnonymousClass11 anonymousClass11 = new AnonymousClass11();
            this.aQ = anonymousClass11;
            iln.b(this, anonymousClass11, new IntentFilter("android.intent.action.DEVICE_STORAGE_LOW"), 2);
            if (fqmk.a.a().W()) {
                AnonymousClass12 anonymousClass12 = new AnonymousClass12();
                this.aU = anonymousClass12;
                iln.c(this, anonymousClass12, new IntentFilter("com.google.android.gms.nearby.CONNECTION_STATE_CHANGED"), "com.google.android.gms.permission.INTERNAL_BROADCAST", null, true != fqls.t() ? 2 : 4);
            }
            ContentResolver contentResolver = context.getContentResolver();
            this.aV = new clqz(this);
            try {
                contentResolver.registerContentObserver(Settings.Global.getUriFor("ble_scan_always_enabled"), false, this.aV);
            } catch (SecurityException e) {
                cmfe.a.e().f(e).h("Failed to register content observer for %s", Settings.Global.getUriFor("ble_scan_always_enabled"));
            }
            ContentResolver contentResolver2 = this.I.getContentResolver();
            this.aW = new clrb(this);
            try {
                contentResolver2.registerContentObserver(Settings.Global.getUriFor("device_provisioned"), false, this.aW);
            } catch (SecurityException e2) {
                cmfe.a.e().f(e2).h("Failed to register content observer for %s", Settings.Global.getUriFor("device_provisioned"));
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
        if (fqmn.G()) {
            this.aN = new TracingBroadcastReceiver() { // from class: com.google.android.gms.nearby.sharing.NearbySharingChimeraService.8
                @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
                public final void jz(final Context context2, Intent intent) {
                    NearbySharingChimeraService.this.ae(new Runnable() { // from class: clrx
                        @Override // java.lang.Runnable
                        public final void run() {
                            clmy.a(context2);
                        }
                    });
                }
            };
            IntentFilter intentFilter7 = new IntentFilter();
            intentFilter7.addAction("android.intent.action.USER_SWITCHED");
            iln.b(this, this.aN, intentFilter7, 2);
            ae(new Runnable() { // from class: clpt
                @Override // java.lang.Runnable
                public final void run() {
                    clmy.a(NearbySharingChimeraService.this);
                }
            });
        }
        cmfe.a.b().p("NearbySharingService created", new Object[0]);
    }

    @Override // defpackage.bxgd, com.google.android.chimera.BoundService, defpackage.qan
    public final void onDestroy() {
        this.aX.c();
        ae(new Runnable() { // from class: clpf
            @Override // java.lang.Runnable
            public final void run() {
                NearbySharingChimeraService nearbySharingChimeraService = NearbySharingChimeraService.this;
                nearbySharingChimeraService.aM();
                nearbySharingChimeraService.ap();
                nearbySharingChimeraService.F.f();
                nearbySharingChimeraService.an();
                cqin cqinVar = nearbySharingChimeraService.d;
                if (cqinVar != null) {
                    cqinVar.m();
                }
            }
        });
        cewq cewqVar = this.C;
        if (cewqVar != null) {
            cewqVar.b();
            this.C = null;
        }
        cfdj.h(this.az, "NearbySharingServiceExecutor");
        cfdj.h(this.ay, "NearbySharingServiceExecutor.alarmExecutor");
        cfdj.h(this.D, "NearbySharingServiceExecutor.downloadAttachmentsExecutor");
        Context context = this.I;
        cfcs.g(context, this.aH, this.aG);
        if (this.aI != null) {
            ((DisplayManager) getSystemService(DisplayManager.class)).unregisterDisplayListener(this.aI);
            this.aI = null;
        }
        cfcs.g(context, this.aK, this.aL, this.aP, this.aQ, this.aU, this.aJ, this.aM, this.aR, this.aS, this.aT, this.aN);
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
            cfcs.f(context, this.aD);
            this.as = false;
        }
        cmfe.a.b().p("NearbySharingService destroyed", new Object[0]);
        super.onDestroy();
    }

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final boolean onUnbind(Intent intent) {
        return true;
    }

    public final int p(ShareTarget shareTarget, Intent intent, boolean z) {
        if (!aE()) {
            cmfe.a.b().p("Failed to send file to remote ShareTarget. Not scanning.", new Object[0]);
            return fqmk.ah() ? 35511 : 13;
        }
        if (!bi()) {
            cmfe.a.b().p("Failed to send file to remote ShareTarget. No registered share sheet.", new Object[0]);
            return fqmk.ah() ? 35511 : 13;
        }
        if (fqmn.D() && (aH(shareTarget) || !this.N.k(Long.valueOf(shareTarget.a)))) {
            return 35511;
        }
        if (fqmk.s()) {
            as();
        }
        if (intent.hasExtra("referrer_package_name")) {
            this.K.g = intent.getStringExtra("referrer_package_name");
        }
        shareTarget.o();
        if (!fqmk.aj() || fqmn.j()) {
            cmca cmcaVar = new cmca(1001);
            cmcaVar.h = true;
            ab(shareTarget, cmcaVar.a());
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        if (shareTarget.e().isEmpty()) {
            entj entjVar = new entj();
            O(shareTarget, intent, new clrm(this, atomicBoolean, shareTarget, entjVar, intent));
            if (cfdd.a("downloadAttachments", entjVar) != 0) {
                cmfe.a.e().p("Failed to send file to remote ShareTarget. No attachment found.", new Object[0]);
                ab(shareTarget, new cmca(1011).a());
                return 35514;
            }
        }
        cmdb cmdbVar = this.K;
        List e = shareTarget.e();
        exxm w = cmdh.w(this.I, B(), this.T, this.K.c(), 0L, this.aq);
        fecj L = cmdh.L(5);
        fecj v = exxe.a.v();
        exwz v2 = cmdh.v(e);
        if (!v.b.L()) {
            v.U();
        }
        exxe exxeVar = (exxe) v.b;
        v2.getClass();
        exxeVar.c = v2;
        exxeVar.b |= 1;
        exxe exxeVar2 = (exxe) v.Q();
        if (!L.b.L()) {
            L.U();
        }
        exzg exzgVar = (exzg) L.b;
        exzg exzgVar2 = exzg.a;
        exxeVar2.getClass();
        exzgVar.h = exxeVar2;
        exzgVar.b |= 32;
        if (!L.b.L()) {
            L.U();
        }
        exzg exzgVar3 = (exzg) L.b;
        w.getClass();
        exzgVar3.Y = w;
        exzgVar3.c |= 8388608;
        cmdbVar.i(new cmcj((exzg) L.Q()));
        if (intent.hasExtra("com.google.android.gms.nearby.sharing.EXTRA_REQUIRED_PACKAGE")) {
            shareTarget.e.putString("com.google.android.gms.nearby.sharing.EXTRA_REQUIRED_PACKAGE", intent.getStringExtra("com.google.android.gms.nearby.sharing.EXTRA_REQUIRED_PACKAGE"));
        }
        bb(false);
        this.am = true;
        aZ();
        PendingIntent pendingIntent = shareTarget.j;
        if (pendingIntent == null) {
            return y(shareTarget).h(F(), shareTarget, new cmcc() { // from class: clpd
                @Override // defpackage.cmcc
                public final void e(final ShareTarget shareTarget2, final TransferMetadata transferMetadata) {
                    final NearbySharingChimeraService nearbySharingChimeraService = NearbySharingChimeraService.this;
                    final AtomicBoolean atomicBoolean2 = atomicBoolean;
                    nearbySharingChimeraService.ae(new Runnable() { // from class: clqg
                        @Override // java.lang.Runnable
                        public final void run() {
                            NearbySharingChimeraService nearbySharingChimeraService2 = NearbySharingChimeraService.this;
                            ShareTarget shareTarget3 = shareTarget2;
                            TransferMetadata transferMetadata2 = transferMetadata;
                            if (!atomicBoolean2.get() || !fqmk.aj() || fqmn.j()) {
                                nearbySharingChimeraService2.ab(shareTarget3, transferMetadata2);
                                return;
                            }
                            cmca a = transferMetadata2.a();
                            a.h = false;
                            nearbySharingChimeraService2.ab(shareTarget3, a.a());
                        }
                    });
                }
            }, z);
        }
        String g = this.S.g(shareTarget);
        eitj eitjVar = crnv.a;
        if (TextUtils.isEmpty(g)) {
            ab(shareTarget, new cmca(1007).a());
            cmfe.a.b().i("Unable to send to %s by action %s due to missing package name", shareTarget, pendingIntent);
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
            cmfe.a.b().j("Sent to %s by action %s for package %s", shareTarget, pendingIntent, g);
        } catch (PendingIntent.CanceledException e2) {
            cmfe.a.e().f(e2).j("Failed to send to %s by action %s for package %s", shareTarget, pendingIntent, g);
            if (fqmk.ah()) {
                return 13;
            }
        }
        cmca cmcaVar2 = new cmca(1015);
        cmcaVar2.h = (!fqmk.aj() || atomicBoolean.get() || fqmn.j()) ? false : true;
        ab(shareTarget, cmcaVar2.a());
        return 0;
    }

    public final int q(Account account) {
        clws clwsVar;
        if (!fqmk.a.a().l() && (aI() || bn())) {
            cmfe.a.b().p("Skipped setting account since a transfer is ongoing", new Object[0]);
            return 13;
        }
        if (Objects.equals(account, v())) {
            return 35500;
        }
        if (!this.c.Z(account)) {
            return 13;
        }
        if (account == null) {
            bxdd c = w().c();
            c.j("account");
            bxdg.g(c);
        } else {
            bxdd c2 = w().c();
            c2.h("account", account.name);
            bxdg.g(c2);
        }
        String h = this.c.h(account);
        eitj eitjVar = crnv.a;
        if (TextUtils.isEmpty(h)) {
            this.c.w(F());
        }
        au();
        if (!fqmn.e()) {
            M();
        }
        if (crll.o(this, account)) {
            cmdi cmdiVar = new cmdi();
            cmdiVar.a = 16;
            cmdiVar.b = 1;
            ar(new cmdj(cmdiVar));
        }
        if (bk()) {
            ap();
            cmfe.a.b().p("Account has changed. Refreshing receive surface state.", new Object[0]);
            U();
        }
        if (!fqmk.aj() || fqmn.j()) {
            cexb cexbVar = this.N;
            for (ShareTarget shareTarget : cexbVar.e()) {
                cexb cexbVar2 = this.O;
                Long valueOf = Long.valueOf(shareTarget.a);
                if (!cexbVar2.k(valueOf) || (clwsVar = (clws) cexbVar2.a(valueOf)) == null || clwsVar.b.e) {
                    Iterator it = this.o.e().iterator();
                    while (it.hasNext()) {
                        ((clwr) it.next()).a.c(shareTarget);
                    }
                    this.S.m(shareTarget);
                }
            }
            cexbVar.f();
            eitj aU = aU();
            int size = aU.size();
            for (int i = 0; i < size; i++) {
                ((coiy) aU.get(i)).z();
                if (fqmk.aj()) {
                    this.K.n();
                    av();
                }
            }
        } else if (aE()) {
            aM();
            cmfe.a.b().p("Account has changed. Refreshing send surface state.", new Object[0]);
        }
        if (bi()) {
            cmfe.a.b().p("Account has changed. Refreshing send surface state.", new Object[0]);
            aZ();
        }
        this.K.h(this.I.getApplicationContext(), this.c.c());
        return 0;
    }

    public final int r(String str) {
        String trim = str.trim();
        eitj eitjVar = crnv.a;
        if (TextUtils.isEmpty(trim)) {
            cmfe.a.e().p("deviceName cannot be empty", new Object[0]);
            return 13;
        }
        int integer = getResources().getInteger(R.integer.sharing_max_name_length_bytes);
        Charset charset = ae;
        if (trim.getBytes(charset).length > integer) {
            cmfe.a.e().i("deviceName is too large. Expected at most %d bytes. Got %d bytes.", Integer.valueOf(integer), Integer.valueOf(trim.getBytes(charset).length));
            return 13;
        }
        if (fqmf.a.a().cX() && trim.equals("code:reset")) {
            ad();
            cmfe.a.b().p("Reset all local Nearby Sharing state", new Object[0]);
            return 35503;
        }
        if (F().equals(trim)) {
            return 35500;
        }
        this.c.x(trim);
        Context context = this.I;
        if (cmfy.b(context).i() && asqh.b() && !trim.equals(crnv.a(eiif.b(cfau.a(context.getContentResolver(), "device_name")), integer))) {
            Settings.Global.putString(context.getContentResolver(), "device_name", trim);
        }
        if (bk()) {
            ap();
            cmfe.a.b().p("Device name has changed. Refreshing receive surface state.", new Object[0]);
            U();
        }
        M();
        cmfe.a.b().h("Device name set to %s", trim);
        int length = !TextUtils.isEmpty(trim) ? trim.length() : 0;
        cmdb cmdbVar = this.K;
        fecj L = cmdh.L(46);
        fecj v = exyq.a.v();
        if (!v.b.L()) {
            v.U();
        }
        exyq exyqVar = (exyq) v.b;
        exyqVar.b |= 1;
        exyqVar.c = length;
        if (!L.b.L()) {
            L.U();
        }
        exzg exzgVar = (exzg) L.b;
        exyq exyqVar2 = (exyq) v.Q();
        exzg exzgVar2 = exzg.a;
        exyqVar2.getClass();
        exzgVar.R = exyqVar2;
        exzgVar.c |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
        cmdbVar.i(new cmck((exzg) L.Q()));
        return 0;
    }

    public final int s(int i, long j, String str) {
        final long j2 = j;
        if (i != 0 && i != 1 && i != 3 && i != 4) {
            cmfe.a.e().p("Cannot set invalid device visibility.", new Object[0]);
            return 13;
        }
        int i2 = this.c.d(v()).f;
        if (i != 3 && i2 == i) {
            cmfe.a.e().p("Cannot set device visibility, since already in the desired visibility.", new Object[0]);
            return 35500;
        }
        cewq cewqVar = this.aB;
        if (cewqVar != null) {
            cewqVar.b();
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
            if (!crmv.d(context)) {
                crnj.i(context);
            }
        }
        cmfe.a.b().h("Visibility mode changed to %s", crnt.s(i));
        cmdb cmdbVar = this.K;
        fecj L = cmdh.L(4);
        fecj v = exyr.a.v();
        eygm a = crmr.a(i2);
        if (!v.b.L()) {
            v.U();
        }
        fecp fecpVar = v.b;
        exyr exyrVar = (exyr) fecpVar;
        exyrVar.d = a.g;
        exyrVar.b |= 2;
        eygm a2 = crmr.a(i);
        if (!fecpVar.L()) {
            v.U();
        }
        fecp fecpVar2 = v.b;
        exyr exyrVar2 = (exyr) fecpVar2;
        exyrVar2.c = a2.g;
        exyrVar2.b |= 1;
        eyep x2 = cmdh.x(eiif.b(str));
        if (!fecpVar2.L()) {
            v.U();
        }
        fecp fecpVar3 = v.b;
        exyr exyrVar3 = (exyr) fecpVar3;
        exyrVar3.e = x2.n;
        exyrVar3.b |= 4;
        if (!fecpVar3.L()) {
            v.U();
        }
        exyr exyrVar4 = (exyr) v.b;
        exyrVar4.b |= 8;
        exyrVar4.f = j2;
        if (!L.b.L()) {
            L.U();
        }
        exzg exzgVar = (exzg) L.b;
        exyr exyrVar5 = (exyr) v.Q();
        exzg exzgVar2 = exzg.a;
        exyrVar5.getClass();
        exzgVar.g = exyrVar5;
        exzgVar.b |= 16;
        cmdbVar.i(new cmck((exzg) L.Q()));
        if (i == 3 && j2 > 0) {
            final int i4 = x().g;
            this.aB = cewq.d(cmfe.a, new Runnable() { // from class: clpo
                @Override // java.lang.Runnable
                public final void run() {
                    cexi b = cmfe.a.b();
                    long j3 = j2;
                    int i5 = i4;
                    b.i("Reverting visibility to %s after %s millis", crnt.s(i5), Long.valueOf(j3));
                    NearbySharingChimeraService nearbySharingChimeraService = NearbySharingChimeraService.this;
                    nearbySharingChimeraService.c.F(nearbySharingChimeraService.v(), true);
                    nearbySharingChimeraService.am(i5);
                    nearbySharingChimeraService.s(i5, 0L, "");
                }
            }, Math.max(0L, j2 - 200), this.az);
        }
        if (bk()) {
            cmfe.a.b().p("Visibility has changed. Refreshing receive surface state.", new Object[0]);
            ap();
        }
        if (aF() && aA()) {
            aq();
        }
        U();
        if (!fqmn.e()) {
            M();
        }
        au();
        if (this.t == null) {
            this.t = cewl.d(this.I);
        }
        this.t.f("com.google.gms.nearby.sharing");
        return 0;
    }

    public final int t(boolean z) {
        if (!ModuleInitializer.a(this)) {
            cmfe.a.a().p("Cannot set enable, because Nearby Share is not available.", new Object[0]);
            return 35501;
        }
        if ((fqmk.t() ? bxdg.i(w(), "enabled", false) : aA()) == z) {
            return 35500;
        }
        bxdd c = w().c();
        c.e("enabled", z);
        bxdg.g(c);
        if (!z) {
            aY();
            clxh.t();
            cmfe.a.b().p("Stopping scanning because nearby share is disabled.", new Object[0]);
            aM();
            ap();
            cmfe.a.b().p("Stopping advertising because nearby share is disabled.", new Object[0]);
            aq();
            an();
            Context context = this.I;
            cfcs.f(context, this.aD);
            cfcs.f(context, this.aE);
            cfcs.f(context, this.aF);
            SharingSyncChimeraService.d(context);
            this.as = false;
            crmu.e(context, C(false));
            this.c.N();
        }
        coiy z2 = z();
        this.b = z2;
        z2.v(k());
        crmg.b(this.I);
        if (z) {
            clxh.t();
            al();
            V();
            cmdi cmdiVar = new cmdi();
            cmdiVar.b = 1;
            cmdiVar.a = 7;
            P(new cmdj(cmdiVar));
        }
        W();
        if (!fqmn.e()) {
            M();
        }
        au();
        cmfe.a.b().h("NearbySharing was %s", true != z ? "disabled" : "enabled");
        return 0;
    }

    public final int u(int i) {
        return s(i, 0L, "");
    }

    public final Account v() {
        return this.c.c();
    }

    public final bxdf w() {
        return bxek.a(getApplicationContext(), "nearby", "nearbysharing:service:state", 0);
    }

    public final DeviceVisibility x() {
        DeviceVisibility d = this.c.d(v());
        if (crmo.a(this)) {
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
            coiq coiqVar = this.c;
            int i3 = d.g;
            if (i3 == 4) {
                i3 = (int) fqmf.s();
            }
            coiqVar.y(i3, 0L);
            d = this.c.d(v());
            int i4 = d.f;
            if (i4 != 4) {
                cmfe.a.b().h("Self-share visibility mode fallback to %s", crnt.s(i4));
                if (!fqmn.e()) {
                    M();
                }
                au();
                return d;
            }
            cmfe.a.e().p("missing fallback visibility for self-share with no account", new Object[0]);
        }
        return d;
    }

    public final coiy y(ShareTarget shareTarget) {
        coiy c = this.S.c(shareTarget);
        if (c != null) {
            return c;
        }
        cmfe.a.e().h("Failed to fetch provider for %s", shareTarget);
        return new cojq();
    }

    public final coiy z() {
        coiy cojrVar;
        coiy corkVar;
        cexi cexiVar = cmfe.a;
        cexiVar.d().p("Initializing the SharingProvider.", new Object[0]);
        clwp clwpVar = this.S;
        if (clwpVar.d("INTERNAL_PROVIDER_ID") != null) {
            if (aE()) {
                aM();
            }
            if (bk()) {
                ap();
            }
        }
        clwpVar.k("INTERNAL_PROVIDER_ID");
        if (this.d == null || (aA() && (this.d.n() || this.d.o()))) {
            Context context = this.I;
            this.d = new cqin(context, this.c, this.K);
            this.ag = new coqc(context, this.c, this.d);
            this.F = new cmtr(this, this.ag);
        }
        coiy d = clwpVar.d("INTERNAL_PROVIDER_ID");
        Context applicationContext = getApplicationContext();
        if (d != null) {
            return d;
        }
        if (fqmf.a.a().dn()) {
            corkVar = new cpsw(applicationContext);
        } else {
            if (aA()) {
                cojrVar = fqmk.aj() ? fqmn.r() ? new cosn(applicationContext, this.c, this.m, this.ag, this.d, this.K, this.Z, this, this.ac) : new cosn(applicationContext, this.c, this.m, this.ag, this.d, this.K, this.Y, this, this.ac) : fqmn.r() ? new copw(applicationContext, this.c, this.m, this.ag, this.d, this.K, this.Z) : new copw(applicationContext, this.c, this.m, this.ag, this.d, this.K, this.Y);
            } else {
                cexiVar.a().p("Initiated DisabledNearbySharingProvider, because Nearby Share is disabled.", new Object[0]);
                if (fqmn.a.a().n()) {
                    corkVar = new cork(this.d);
                } else {
                    cojrVar = new cojr(applicationContext, this.c, this.m, this.ag, this.d, this.K, this.Y);
                }
            }
            corkVar = cojrVar;
        }
        clwpVar.j(corkVar, new clwo("INTERNAL_PROVIDER_ID", getPackageName()));
        return corkVar;
    }
}
