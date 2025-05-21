package com.google.android.gms.setupservices;

import android.accounts.Account;
import android.app.backup.BackupManager;
import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.R;
import com.google.android.gms.setupservices.GoogleServicesChimeraActivity;
import com.google.android.gms.setupservices.item.GoogleServicesExpandableItem;
import com.google.android.gms.setupservices.item.GoogleServicesTextItem;
import com.google.android.gms.usagereporting.ElCapitanOptions;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.a;
import defpackage.ahww;
import defpackage.aqxo;
import defpackage.arco;
import defpackage.arcy;
import defpackage.arkc;
import defpackage.arke;
import defpackage.arkf;
import defpackage.arxo;
import defpackage.aseu;
import defpackage.asmf;
import defpackage.asnd;
import defpackage.asoe;
import defpackage.bqqa;
import defpackage.bqqe;
import defpackage.byzz;
import defpackage.dccc;
import defpackage.dcch;
import defpackage.dccm;
import defpackage.dccr;
import defpackage.dccw;
import defpackage.dcda;
import defpackage.dcdi;
import defpackage.dcdn;
import defpackage.dcds;
import defpackage.dcdu;
import defpackage.dcdv;
import defpackage.dcdw;
import defpackage.dcdy;
import defpackage.dceb;
import defpackage.dceh;
import defpackage.dceq;
import defpackage.dces;
import defpackage.dcev;
import defpackage.dcew;
import defpackage.dcex;
import defpackage.dcfa;
import defpackage.dcfc;
import defpackage.dcfe;
import defpackage.dcff;
import defpackage.dcfi;
import defpackage.dcfj;
import defpackage.dcfl;
import defpackage.dcfn;
import defpackage.dcfo;
import defpackage.dcfs;
import defpackage.dcfv;
import defpackage.dcfw;
import defpackage.dcfx;
import defpackage.dcfy;
import defpackage.dezt;
import defpackage.dfae;
import defpackage.dfak;
import defpackage.dfaq;
import defpackage.dfau;
import defpackage.dfbl;
import defpackage.dhqf;
import defpackage.dmni;
import defpackage.dmoh;
import defpackage.dtjm;
import defpackage.dtjn;
import defpackage.dvzr;
import defpackage.edeq;
import defpackage.edgl;
import defpackage.edhl;
import defpackage.edhx;
import defpackage.edhz;
import defpackage.edjs;
import defpackage.edjy;
import defpackage.eigb;
import defpackage.eiid;
import defpackage.eijr;
import defpackage.eijy;
import defpackage.ejya;
import defpackage.ekdt;
import defpackage.ekdw;
import defpackage.ekdy;
import defpackage.ekea;
import defpackage.ekeb;
import defpackage.ensv;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.frzo;
import defpackage.fsae;
import defpackage.fssc;
import defpackage.ips;
import defpackage.umi;
import defpackage.vga;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class GoogleServicesChimeraActivity extends dceh implements DialogInterface.OnClickListener, edjy, edhx {
    public static final arxo j = new arxo("SetupServices", "GoogleServicesActivity");
    public List A;
    public arkf B;
    public edhl C;
    public Bundle D;
    public byte[] E;
    public GoogleServicesExpandableItem F;
    public dcev G;
    public dcew H;
    public dces I;
    public dcfa J;
    public dceq K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public eiid P;
    public boolean Q;
    public dvzr R;
    public eiid S;
    public String T;
    public dcfl U;
    public dtjn V;
    public byzz W;
    public dtjm X;
    public dtjm Y;
    public final dcfy Z;
    public final dcfy aa;
    public final dcfy ab;
    private final eijr aj;
    private final eijr ak;
    private boolean al;
    private final ensv am;
    private Bundle an;
    private long ao;
    private vga ap;
    private ahww aq;
    private final dcfy ar;
    private final dcfy as;
    private final dcfy at;
    private final dcfy au;
    private final dcfy av;
    private final dcfy aw;
    public final eijr o;
    public final eijr p;
    public final eijr q;
    public dcfi r;
    public dcfw s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public final eijr k = eijy.a(new eijr() { // from class: dcaw
        @Override // defpackage.eijr
        public final Object a() {
            return Boolean.valueOf(flog.a.a().k());
        }
    });
    public final eijr l = eijy.a(new eijr() { // from class: dcbd
        @Override // defpackage.eijr
        public final Object a() {
            return Long.valueOf(flog.a.a().g());
        }
    });
    private final eijr ac = eijy.a(new eijr() { // from class: dcbe
        @Override // defpackage.eijr
        public final Object a() {
            return flog.f();
        }
    });
    private final eijr ad = eijy.a(new eijr() { // from class: dcbg
        @Override // defpackage.eijr
        public final Object a() {
            return Long.valueOf(flog.a.a().c());
        }
    });
    private final eijr ae = eijy.a(new eijr() { // from class: dcbh
        @Override // defpackage.eijr
        public final Object a() {
            return Boolean.valueOf(flog.g());
        }
    });
    private final eijr af = eijy.a(new eijr() { // from class: dcbi
        @Override // defpackage.eijr
        public final Object a() {
            return Boolean.valueOf(flog.a.a().o());
        }
    });
    private final eijr ag = eijy.a(new eijr() { // from class: dcbj
        @Override // defpackage.eijr
        public final Object a() {
            return Boolean.valueOf(flog.a.a().n());
        }
    });
    private final eijr ah = eijy.a(new eijr() { // from class: dcbk
        @Override // defpackage.eijr
        public final Object a() {
            return Boolean.valueOf(flog.a.a().p());
        }
    });
    public final eijr m = eijy.a(new eijr() { // from class: dcbl
        @Override // defpackage.eijr
        public final Object a() {
            return Boolean.valueOf(fsae.a.a().ao());
        }
    });
    public final eijr n = eijy.a(new eijr() { // from class: dcbm
        @Override // defpackage.eijr
        public final Object a() {
            return Boolean.valueOf(flni.a.a().a());
        }
    });
    private final eijr ai = eijy.a(new eijr() { // from class: dcax
        @Override // defpackage.eijr
        public final Object a() {
            return Long.valueOf(fsae.a.a().a());
        }
    });

    public GoogleServicesChimeraActivity() {
        eijr a = eijy.a(new eijr() { // from class: dcay
            @Override // defpackage.eijr
            public final Object a() {
                return Boolean.valueOf(fsae.a.a().Z());
            }
        });
        this.aj = a;
        eijr a2 = eijy.a(new eijr() { // from class: dcaz
            @Override // defpackage.eijr
            public final Object a() {
                return Boolean.valueOf(fsae.a.a().am());
            }
        });
        this.o = a2;
        this.p = eijy.a(new eijr() { // from class: dcba
            @Override // defpackage.eijr
            public final Object a() {
                return Boolean.valueOf(fsae.a.a().al());
            }
        });
        this.ak = eijy.a(new eijr() { // from class: dcbb
            @Override // defpackage.eijr
            public final Object a() {
                return Boolean.valueOf(fsae.a.a().aj());
            }
        });
        this.am = new asmf(3, 9);
        this.ao = 0L;
        eigb eigbVar = eigb.a;
        this.P = eigbVar;
        this.Q = false;
        this.R = null;
        this.S = eigbVar;
        this.T = "shouldShowFullScreenBackup";
        dccc dcccVar = new dccc(this, ((Boolean) a.a()).booleanValue(), ((Boolean) a2.a()).booleanValue());
        this.Z = dcccVar;
        dcch dcchVar = new dcch(this, ((Boolean) a.a()).booleanValue(), ((Boolean) a2.a()).booleanValue());
        this.ar = dcchVar;
        dccm dccmVar = new dccm(this, ((Boolean) a.a()).booleanValue(), ((Boolean) a2.a()).booleanValue());
        this.aa = dccmVar;
        dccr dccrVar = new dccr(this, ((Boolean) a.a()).booleanValue(), ((Boolean) a2.a()).booleanValue());
        this.as = dccrVar;
        dccw dccwVar = new dccw(this, ((Boolean) a.a()).booleanValue(), ((Boolean) a2.a()).booleanValue());
        this.at = dccwVar;
        dcda dcdaVar = new dcda(this, ((Boolean) a.a()).booleanValue(), ((Boolean) a2.a()).booleanValue());
        this.au = dcdaVar;
        dcdi dcdiVar = new dcdi(this, ((Boolean) a.a()).booleanValue(), ((Boolean) a2.a()).booleanValue());
        this.ab = dcdiVar;
        dcdn dcdnVar = Build.VERSION.SDK_INT >= 30 ? new dcdn(this, ((Boolean) a.a()).booleanValue(), ((Boolean) a2.a()).booleanValue()) : null;
        this.av = dcdnVar;
        dcds dcdsVar = new dcds(this, ((Boolean) a.a()).booleanValue(), ((Boolean) a2.a()).booleanValue());
        this.aw = dcdsVar;
        List asList = Arrays.asList(dcccVar, dcchVar, dccmVar, dccrVar, dcdnVar, dccwVar, dcdaVar, dcdiVar, dcdsVar);
        this.A = asList;
        this.A = (List) Collection.EL.stream(asList).filter(new Predicate() { // from class: dcar
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo463negate() {
                return Predicate$CC.$default$negate(this);
            }

            @Override // java.util.function.Predicate
            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return Objects.nonNull((dcfy) obj);
            }
        }).collect(Collectors.toCollection(new Supplier() { // from class: dcas
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ArrayList();
            }
        }));
        this.q = eijy.a(new eijr() { // from class: dcbc
            @Override // defpackage.eijr
            public final Object a() {
                GoogleServicesChimeraActivity googleServicesChimeraActivity = GoogleServicesChimeraActivity.this;
                return new dcfh(googleServicesChimeraActivity, googleServicesChimeraActivity.n(), googleServicesChimeraActivity.t, googleServicesChimeraActivity.u, googleServicesChimeraActivity.A(), new BackupManager(googleServicesChimeraActivity));
            }
        });
    }

    private final ekdt F() {
        ekeb ekebVar = ((ejya) k().b).r;
        if (ekebVar == null) {
            ekebVar = ekeb.a;
        }
        fecj fecjVar = (fecj) ekebVar.iB(5, null);
        fecjVar.X(ekebVar);
        return (ekdt) fecjVar;
    }

    private final void G(int i) {
        j.h(a.j(i, "Calls finish() with result code: "), new Object[0]);
        if (((Boolean) this.ak.a()).booleanValue()) {
            c(i);
        } else if (w() && i == 0) {
            c(0);
        } else {
            I();
            c(i);
        }
    }

    private final void H() {
        GoogleServicesTextItem googleServicesTextItem = (GoogleServicesTextItem) this.C.jy(R.id.google_services_tos);
        if (googleServicesTextItem != null && googleServicesTextItem.l) {
            eijr eijrVar = bqqe.a;
            bqqa.a(aseu.SETUPSERVICES_TOS_VIEWED);
        }
        GoogleServicesExpandableItem googleServicesExpandableItem = this.F;
        if (googleServicesExpandableItem == null || !googleServicesExpandableItem.l) {
            return;
        }
        eijr eijrVar2 = bqqe.a;
        bqqa.a(aseu.SETUPSERVICES_DEVICE_MAINTENANCE_VIEWED);
    }

    private final void I() {
        dfaq dfaqVar;
        j.h("setOptIns.", new Object[0]);
        try {
            String[] strArr = dmoh.a;
            int i = ips.a;
            try {
                ContentResolver contentResolver = getContentResolver();
                String string = Settings.Secure.getString(contentResolver, "allowed_geolocation_origins");
                HashSet<String> hashSet = new HashSet();
                if (!TextUtils.isEmpty(string)) {
                    for (String str : string.split("\\s+")) {
                        if (!TextUtils.isEmpty(str)) {
                            hashSet.add(str);
                        }
                    }
                }
                String[] strArr2 = dmoh.a;
                for (int i2 = 0; i2 < 2; i2++) {
                    hashSet.add(strArr2[i2]);
                }
                StringBuilder sb = new StringBuilder();
                for (String str2 : hashSet) {
                    if (sb.length() > 0) {
                        sb.append(' ');
                    }
                    sb.append(str2);
                }
                Settings.Secure.putString(contentResolver, "allowed_geolocation_origins", sb.toString());
            } catch (RuntimeException e) {
                Log.e("UseLocationForServices", "Failed to set browser geolocation permissions: ".concat(e.toString()));
            }
            dmni.d(getContentResolver(), "use_location_for_services", 1);
            sendBroadcast(new Intent("com.google.android.gsf.settings.GoogleLocationSettings.UPDATE_LOCATION_SETTINGS"));
        } catch (RuntimeException e2) {
            j.f("Error invoking forceSetUseLocationForServices: ".concat(String.valueOf(e2.getMessage())), new Object[0]);
        }
        Account n = n();
        for (dcfy dcfyVar : this.A) {
            dcdy dcdyVar = dcfyVar.g;
            if (dcdyVar != null && dcdyVar.h()) {
                boolean g = dcdyVar.g();
                j.h(dcfyVar.h() + ": " + g, new Object[0]);
                dcfyVar.d(g);
            }
        }
        final umi umiVar = new umi();
        umiVar.a = 2;
        umiVar.b = dcfe.PHONE.e.eJ;
        if (n != null) {
            umiVar.c = n.name;
        }
        final boolean z = p().getBoolean("is_setup_wizard", false);
        arxo arxoVar = dcff.a;
        if (n == null) {
            dfaqVar = dfbl.d(null);
        } else {
            dfau dfauVar = new dfau();
            new dcfc(this, n, dfauVar).start();
            dfaqVar = dfauVar.a;
        }
        dfaqVar.d(new dezt() { // from class: dcbs
            /* JADX WARN: Code restructure failed: missing block: B:173:0x02c5, code lost:
            
                if (android.text.TextUtils.isEmpty(r7 != null ? r7.getText() : null) == false) goto L84;
             */
            @Override // defpackage.dezt
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object a(defpackage.dfaq r15) {
                /*
                    Method dump skipped, instructions count: 1322
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.dcbs.a(dfaq):java.lang.Object");
            }
        }).x(new dfae() { // from class: dcbr
            @Override // defpackage.dfae
            public final void hr(dfaq dfaqVar2) {
                arxo arxoVar2 = GoogleServicesChimeraActivity.j;
                if (!dfaqVar2.m()) {
                    GoogleServicesChimeraActivity.j.p("Exception writing audit records", dfaqVar2.h(), new Object[0]);
                    return;
                }
                GoogleServicesChimeraActivity.j.h("Audit recorded. result=".concat(String.valueOf(String.valueOf(dfaqVar2.i()))), new Object[0]);
            }
        });
    }

    private static void J(final dfau dfauVar, final long j2) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        dfauVar.a.x(new dfae() { // from class: dcat
            @Override // defpackage.dfae
            public final void hr(dfaq dfaqVar) {
                arxo arxoVar = GoogleServicesChimeraActivity.j;
                countDownLatch.countDown();
            }
        });
        new asmf(1, 10).execute(new Runnable() { // from class: dcav
            @Override // java.lang.Runnable
            public final void run() {
                arxo arxoVar = GoogleServicesChimeraActivity.j;
                CountDownLatch countDownLatch2 = countDownLatch;
                long j3 = j2;
                dfau dfauVar2 = dfauVar;
                try {
                    countDownLatch2.await(j3, TimeUnit.SECONDS);
                    if (dfauVar2.a.l()) {
                        return;
                    }
                    dfauVar2.d(new TimeoutException("Task timed out after " + j3 + " seconds"));
                } catch (InterruptedException e) {
                    if (dfauVar2.a.l()) {
                        return;
                    }
                    dfauVar2.d(e);
                }
            }
        });
    }

    private final boolean K() {
        j.j("showFullScreenBackupOptInInsteadOfGservicesToggle=%b (using cached value)", this.P.c());
        this.S = eiid.j(((Boolean) this.P.c()).booleanValue() ? ekea.SHOWN_CACHED_TRUE : ekea.NOT_SHOWN_CACHED_FALSE);
        return ((Boolean) this.P.c()).booleanValue();
    }

    private static final void L(dfaq dfaqVar, final String str) {
        final Instant ofEpochMilli = Instant.ofEpochMilli(SystemClock.elapsedRealtime());
        dfaqVar.x(new dfae() { // from class: dcbu
            @Override // defpackage.dfae
            public final void hr(dfaq dfaqVar2) {
                GoogleServicesChimeraActivity.j.h("Task:%s completed in %d millis.", str, Long.valueOf(Duration.between(ofEpochMilli, Instant.ofEpochMilli(SystemClock.elapsedRealtime())).toMillis()));
            }
        });
    }

    public final boolean A() {
        if (getIntent() != null) {
            return getIntent().getBooleanExtra("suppress_backup_opt_in", false);
        }
        return false;
    }

    public final boolean B() {
        boolean booleanValue;
        boolean z;
        if (((Boolean) this.m.a()).booleanValue()) {
            if (A()) {
                this.S = eiid.j(ekea.NOT_SHOWN_BACKUP_OPT_IN_SUPPRESSED);
                return false;
            }
            if (this.P.h()) {
                return K();
            }
            dvzr dvzrVar = this.R;
            if (dvzrVar != null) {
                boolean z2 = dvzrVar.b == 2;
                this.S = eiid.j(z2 ? ekea.SHOWN_RESTORE_API_RESULT_RESTORE_OPT_IN : ekea.NOT_SHOWN_RESTORE_API_RESULT_NOT_RESTORE_OPT_IN);
                return z2;
            }
            if (((Boolean) this.n.a()).booleanValue() && this.S.h()) {
                return false;
            }
            this.S = eiid.j(ekea.NOT_SHOWN_RESTORE_API_RESULT_NULL);
            return false;
        }
        if (!((Boolean) this.k.a()).booleanValue()) {
            return false;
        }
        if (!this.Q) {
            j.h("False for showFullScreenBackupOptInInsteadOfGservicesToggle: intent not available", new Object[0]);
            return false;
        }
        if (this.P.h()) {
            return K();
        }
        if (!this.N) {
            if (((Boolean) this.n.a()).booleanValue() && this.S.h()) {
                return false;
            }
            this.S = eiid.j(ekea.NOT_SHOWN_MANAGEMENT_INFO_NOT_FETCHED);
            return false;
        }
        boolean b = edgl.b(getIntent());
        if (this.M) {
            if (b) {
                booleanValue = ((Boolean) this.ag.a()).booleanValue();
                z = true;
            } else {
                booleanValue = ((Boolean) this.ah.a()).booleanValue();
                z = false;
            }
        } else if (b) {
            booleanValue = ((Boolean) this.ae.a()).booleanValue();
            z = true;
        } else {
            booleanValue = ((Boolean) this.af.a()).booleanValue();
            z = false;
        }
        j.j("showFullScreenBackupOptInInsteadOfGservicesToggle=%b (canUseManagementInfo=%b isManagedAccount=%b isAnySetupWizard=%b)", Boolean.valueOf(booleanValue), Boolean.valueOf(this.N), Boolean.valueOf(this.M), Boolean.valueOf(z));
        this.S = eiid.j(booleanValue ? ekea.SHOWN_EVALUATED_TRUE : ekea.NOT_SHOWN_EVALUATED_FALSE);
        return booleanValue;
    }

    public final fecj C() {
        ekeb ekebVar = ((ejya) k().b).r;
        if (ekebVar == null) {
            ekebVar = ekeb.a;
        }
        ekdy ekdyVar = ekebVar.g;
        if (ekdyVar == null) {
            ekdyVar = ekdy.a;
        }
        fecj fecjVar = (fecj) ekdyVar.iB(5, null);
        fecjVar.X(ekdyVar);
        boolean z = this.O;
        if (!fecjVar.b.L()) {
            fecjVar.U();
        }
        ekdy ekdyVar2 = (ekdy) fecjVar.b;
        int i = 1;
        ekdyVar2.b |= 1;
        ekdyVar2.c = z;
        boolean a = dcfn.a("pixel_legal_joint_permission", false);
        if (!fecjVar.b.L()) {
            fecjVar.U();
        }
        ekdy ekdyVar3 = (ekdy) fecjVar.b;
        ekdyVar3.b |= 2;
        ekdyVar3.d = a;
        boolean a2 = dcfn.a("pixel_legal_joint_permission_v2", false);
        if (!fecjVar.b.L()) {
            fecjVar.U();
        }
        ekdy ekdyVar4 = (ekdy) fecjVar.b;
        ekdyVar4.b |= 4;
        ekdyVar4.e = a2;
        boolean t = asnd.t(getApplicationContext());
        if (!fecjVar.b.L()) {
            fecjVar.U();
        }
        fecp fecpVar = fecjVar.b;
        ekdy ekdyVar5 = (ekdy) fecpVar;
        ekdyVar5.b |= 8;
        ekdyVar5.f = t;
        if (this.t) {
            i = 2;
        } else if (this.w) {
            i = 3;
        } else if (this.x || this.O) {
            i = 4;
        }
        if (!fecpVar.L()) {
            fecjVar.U();
        }
        ekdy ekdyVar6 = (ekdy) fecjVar.b;
        ekdyVar6.j = i - 1;
        ekdyVar6.b |= 128;
        return fecjVar;
    }

    @Override // defpackage.dcah
    protected final String a() {
        return "GoogleServicesActivity";
    }

    @Override // defpackage.edjy
    public final void gs() {
        onBackPressed();
    }

    @Override // defpackage.arjn
    protected final void gu(String str, boolean z) {
        int i = edjs.a;
        if (edeq.z(this)) {
            setTheme(R.style.UsePartnerResourceThemeOverlay);
        } else {
            setTheme(R.style.NotUsePartnerResourceThemeOverlay);
        }
        if (p().getBoolean("is_setup_wizard", false) ? !edeq.v(this) : !fsae.i()) {
            arkc.f(this, str);
        } else {
            arkc.h(this, str);
        }
        if (edeq.w(this)) {
            setTheme(edjs.a(this));
        }
        arkc.d(this, z, getBaseContext());
    }

    @Override // defpackage.dcgc
    public final Bundle j() {
        if (this.D == null) {
            this.D = new Bundle();
        }
        return this.D;
    }

    @Override // defpackage.edjy
    public final void jw() {
        H();
        if (isDestroyed()) {
            return;
        }
        if (((Boolean) this.ak.a()).booleanValue()) {
            j.h("onNavigateNext and setting opt-ins because user pressed Accept now.", new Object[0]);
            I();
        }
        if (!z()) {
            j.h("Finishing activity directly because full screen backup opt-in is not shown.", new Object[0]);
            G(-1);
            return;
        }
        j.h("Showing full screen backup opt-in.", new Object[0]);
        Intent o = o();
        edgl.a(getIntent(), o);
        o.putExtra("account", n());
        j().putBoolean("full_screen_backup_launched", true);
        startActivityForResult(o, 101);
    }

    @Override // defpackage.dcah, defpackage.dcge
    public final void m() {
        for (dcfy dcfyVar : this.A) {
            dcdy dcdyVar = dcfyVar.g;
            if (dcdyVar != null && dcdyVar.h()) {
                fecj k = k();
                boolean g = dcdyVar.g();
                int i = dcfyVar.i(k);
                ekeb ekebVar = ((ejya) k.b).r;
                if (ekebVar == null) {
                    ekebVar = ekeb.a;
                }
                ekdw ekdwVar = (ekdw) ekebVar.c.get(i);
                fecj fecjVar = (fecj) ekdwVar.iB(5, null);
                fecjVar.X(ekdwVar);
                if (!fecjVar.b.L()) {
                    fecjVar.U();
                }
                ekdw ekdwVar2 = (ekdw) fecjVar.b;
                ekdw ekdwVar3 = ekdw.a;
                ekdwVar2.b |= 4;
                ekdwVar2.e = g;
                ekdw ekdwVar4 = (ekdw) fecjVar.Q();
                ekeb ekebVar2 = ((ejya) k.b).r;
                if (ekebVar2 == null) {
                    ekebVar2 = ekeb.a;
                }
                fecj fecjVar2 = (fecj) ekebVar2.iB(5, null);
                fecjVar2.X(ekebVar2);
                ekdt ekdtVar = (ekdt) fecjVar2;
                ekdtVar.a(i, ekdwVar4);
                ekeb ekebVar3 = (ekeb) ekdtVar.Q();
                if (!k.b.L()) {
                    k.U();
                }
                ejya ejyaVar = (ejya) k.b;
                ekebVar3.getClass();
                ejyaVar.r = ekebVar3;
                ejyaVar.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
            }
        }
        if (((Boolean) this.k.a()).booleanValue() || ((Boolean) this.m.a()).booleanValue()) {
            ekdt F = F();
            boolean b = edgl.b(getIntent());
            if (!F.b.L()) {
                F.U();
            }
            ekeb ekebVar4 = (ekeb) F.b;
            ekeb ekebVar5 = ekeb.a;
            ekebVar4.b |= 1;
            ekebVar4.d = b;
            boolean z = this.u;
            if (!F.b.L()) {
                F.U();
            }
            ekeb ekebVar6 = (ekeb) F.b;
            ekebVar6.b |= 2;
            ekebVar6.e = z;
            if (this.S.h()) {
                Object c = this.S.c();
                if (!F.b.L()) {
                    F.U();
                }
                ekeb ekebVar7 = (ekeb) F.b;
                ekebVar7.f = ((ekea) c).q;
                ekebVar7.b |= 4;
            }
            fecj k2 = k();
            ekeb ekebVar8 = (ekeb) F.Q();
            if (!k2.b.L()) {
                k2.U();
            }
            ejya ejyaVar2 = (ejya) k2.b;
            ejya ejyaVar3 = ejya.a;
            ekebVar8.getClass();
            ejyaVar2.r = ekebVar8;
            ejyaVar2.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
        }
    }

    public final Account n() {
        Account account = (Account) p().getParcelable("account");
        if (frzo.a.a().a() && account != null && "Android Enterprise".equals(account.name)) {
            return null;
        }
        return account;
    }

    public final Intent o() {
        return new Intent((String) this.ac.a()).setPackage("com.google.android.apps.restore");
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 101) {
            j.f("Received result from unknown requestCode=%d", Integer.valueOf(i));
            return;
        }
        arxo arxoVar = j;
        arxoVar.h("Received result from backup opt-in requestCode=%d", 101);
        j().remove("full_screen_backup_launched");
        if (i2 != 0) {
            arxoVar.h("Result ok and finish.", new Object[0]);
            G(-1);
            return;
        }
        arxoVar.h("Result canceled from backup opt-in.", new Object[0]);
        if (!this.L) {
            arxoVar.h("No opt-ins to display, going back.", new Object[0]);
            G(0);
        }
        arxoVar.h("Other opt-ins to display, do nothing.", new Object[0]);
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onBackPressed() {
        j.h("onBackPressed.", new Object[0]);
        G(0);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.D.putBoolean("aadc_diaglog_dismissed", true);
        dialogInterface.dismiss();
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x06e9  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0712 A[LOOP:0: B:139:0x070c->B:141:0x0712, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0657  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x047b  */
    @Override // defpackage.dcah, defpackage.dced, defpackage.arjn, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onCreate(android.os.Bundle r25) {
        /*
            Method dump skipped, instructions count: 1863
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.setupservices.GoogleServicesChimeraActivity.onCreate(android.os.Bundle):void");
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onPause() {
        j.h("savePreferences.", new Object[0]);
        dcdu q = q();
        for (dcfy dcfyVar : this.A) {
            dcdy dcdyVar = dcfyVar.g;
            if (dcdyVar != null && dcdyVar.h()) {
                q.b(dcfyVar.h(), dcdyVar.g());
            }
        }
        byte[] bArr = this.E;
        if (bArr != null) {
            q.c(bArr);
        }
        if ((((Boolean) this.k.a()).booleanValue() || ((Boolean) this.m.a()).booleanValue()) && !this.P.h()) {
            q.b(this.T, B());
        }
        q.a();
        super.onPause();
    }

    @Override // defpackage.dcah, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putAll(this.D);
    }

    public final Bundle p() {
        if (this.an == null) {
            Bundle extras = getIntent().getExtras();
            this.an = extras == null ? new Bundle() : new Bundle(extras);
        }
        return this.an;
    }

    public final dcdu q() {
        return (p().getBoolean("is_setup_wizard", false) || p().getBoolean("deferredSetup", false)) ? new dcdv(getSharedPreferences("com.google.android.gms.setupservices.SetupWizardPreferences", 0)) : new dcdw(j());
    }

    public final void r(ekdy ekdyVar) {
        fecj k = k();
        ekdt F = F();
        if (!F.b.L()) {
            F.U();
        }
        ekeb ekebVar = (ekeb) F.b;
        ekeb ekebVar2 = ekeb.a;
        ekdyVar.getClass();
        ekebVar.g = ekdyVar;
        ekebVar.b |= 8;
        boolean b = edgl.b(getIntent());
        if (!F.b.L()) {
            F.U();
        }
        ekeb ekebVar3 = (ekeb) F.b;
        ekebVar3.b |= 1;
        ekebVar3.d = b;
        ekeb ekebVar4 = (ekeb) F.Q();
        if (!k.b.L()) {
            k.U();
        }
        ejya ejyaVar = (ejya) k.b;
        ejya ejyaVar2 = ejya.a;
        ekebVar4.getClass();
        ejyaVar.r = ekebVar4;
        ejyaVar.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
    }

    public final void s(final int i) {
        int i2 = dcfj.a;
        aqxo a = dhqf.a(this);
        arcy arcyVar = new arcy();
        arcyVar.a = new arco() { // from class: dhph
            @Override // defpackage.arco
            public final void d(Object obj, Object obj2) {
                ((dhra) ((dhrh) obj).H()).e(new dhpu((dfau) obj2));
            }
        };
        arcyVar.d = 4513;
        a.iO(arcyVar.a()).z(new dfak() { // from class: dcau
            @Override // defpackage.dfak
            public final void gn(Object obj) {
                aqye aqyeVar = (aqye) obj;
                if (((dhrc) aqyeVar.a).c() || ((dhrc) aqyeVar.a).b() > 0) {
                    GoogleServicesChimeraActivity googleServicesChimeraActivity = GoogleServicesChimeraActivity.this;
                    fecj C = googleServicesChimeraActivity.C();
                    if (!C.b.L()) {
                        C.U();
                    }
                    int i3 = i;
                    ekdy ekdyVar = (ekdy) C.b;
                    ekdy ekdyVar2 = ekdy.a;
                    ekdyVar.b |= 64;
                    ekdyVar.i = i3;
                    googleServicesChimeraActivity.r((ekdy) C.Q());
                }
            }
        });
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.edhx
    public final void t(edhz edhzVar) {
        char c;
        dcfo dcfoVar;
        if (isFinishing()) {
            return;
        }
        String str = edhzVar.a;
        if ("safety_net_details".equals(str)) {
            dcex dcexVar = new dcex(this, this.s, this.t);
            CharSequence charSequence = dcfx.a(dcexVar.e, R.array.setupservices_google_services_safety_net_dialog_text, dcexVar.a).a;
            Bundle bundle = new Bundle();
            bundle.putCharSequence("message", charSequence);
            dceb dcebVar = new dceb();
            dcebVar.setArguments(bundle);
            dcebVar.show(gI(), "dialog");
            return;
        }
        dcfw dcfwVar = this.s;
        dcfi dcfiVar = this.r;
        arxo arxoVar = dcfv.a;
        switch (str.hashCode()) {
            case -1864179838:
                if (str.equals("google_privacy")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -57954866:
                if (str.equals("location_tos")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 115032:
                if (str.equals("tos")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 145140592:
                if (str.equals("additional_privacy")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 196924336:
                if (str.equals("maps_tos")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1306655991:
                if (str.equals("safety_data")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1425908582:
                if (str.equals("app_permissions")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1789394802:
                if (str.equals("data_use")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1930831427:
                if (str.equals("location_accuracy")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        dcfs dcfsVar = null;
        switch (c) {
            case 0:
                dcfw dcfwVar2 = dcfw.DEFAULT;
                int ordinal = dcfwVar.ordinal();
                if (ordinal == 1) {
                    dcfoVar = dcfo.PRIVACY_POLICY_KIDS;
                    break;
                } else if (ordinal == 3) {
                    dcfoVar = dcfo.PRIVACY_POLICY_AUTO;
                    break;
                } else if (!dcfiVar.b("DE")) {
                    dcfoVar = dcfo.PRIVACY_POLICY;
                    break;
                } else {
                    dcfoVar = dcfo.PRIVACY_POLICY_GERMANY;
                    break;
                }
            case 1:
                dcfw dcfwVar3 = dcfw.DEFAULT;
                if (dcfwVar.ordinal() == 3) {
                    dcfoVar = dcfo.TERMS_OF_SERVICE_AUTO;
                    break;
                } else if (!dcfiVar.b("DE")) {
                    dcfoVar = dcfo.TERMS_OF_SERVICE;
                    break;
                } else {
                    dcfoVar = dcfo.TERMS_OF_SERVICE_GERMANY;
                    break;
                }
            case 2:
                dcfoVar = dcfo.APP_PERMISSIONS_KOREA;
                break;
            case 3:
                dcfoVar = dcfo.ADDITIONAL_PRIVACY_KOREA;
                break;
            case 4:
                dcfoVar = dcfo.LOCATION_TOS_KOREA;
                break;
            case 5:
                dcfoVar = dcfo.AUTOMOTIVE_MAPS_TOS;
                break;
            case 6:
                dcfoVar = dcfo.GOOGLE_DATA_USE;
                break;
            case 7:
                dcfoVar = dcfo.SAFTY_DATA;
                break;
            case '\b':
                dcfoVar = dcfo.LOCATION_ACCURACY;
                break;
            default:
                dcfoVar = null;
                break;
        }
        if (dcfoVar != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("policy", dcfoVar.name());
            dcfsVar = new dcfs();
            dcfsVar.setArguments(bundle2);
        }
        if (dcfsVar != null) {
            dcfsVar.show(gI(), "dialog");
            return;
        }
        j.m("Failed to create PolicyDialogFragment, id=".concat(String.valueOf(str)), new Object[0]);
    }

    public final void u(final int i) {
        if (fssc.i()) {
            int i2 = dcfj.a;
            dhqf.a(this).aM(new ElCapitanOptions(false, i)).z(new dfak() { // from class: dcbt
                @Override // defpackage.dfak
                public final void gn(Object obj) {
                    final GoogleServicesChimeraActivity googleServicesChimeraActivity = GoogleServicesChimeraActivity.this;
                    final int i3 = i;
                    dcfj.a(googleServicesChimeraActivity).z(new dfak() { // from class: dcaj
                        @Override // defpackage.dfak
                        public final void gn(Object obj2) {
                            aqye aqyeVar = (aqye) obj2;
                            if (aqyeVar.p() || aqyeVar.o() > 0) {
                                GoogleServicesChimeraActivity googleServicesChimeraActivity2 = GoogleServicesChimeraActivity.this;
                                fecj C = googleServicesChimeraActivity2.C();
                                if (!C.b.L()) {
                                    C.U();
                                }
                                int i4 = i3;
                                ekdy ekdyVar = (ekdy) C.b;
                                ekdy ekdyVar2 = ekdy.a;
                                ekdyVar.b |= 32;
                                ekdyVar.h = i4;
                                googleServicesChimeraActivity2.r((ekdy) C.Q());
                            }
                        }
                    });
                }
            });
        }
    }

    public final void v() {
        H();
        setResult(-1, null);
        this.h.a(-1);
        I();
        try {
            Intent intent = new Intent("com.google.android.apps.tips.action.COVERSHEET");
            intent.setPackage("com.google.android.apps.tips");
            intent.setFlags(268468224);
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            j.m("Coversheet was not found", new Object[0]);
        }
        finishAndRemoveTask();
    }

    public final boolean w() {
        return (this.O || this.w || this.x) && asoe.l(this);
    }

    @Override // defpackage.arjn
    protected final arke x() {
        Bundle bundle = p().getBundle("ui_parameters");
        if (bundle != null) {
            return arke.b(bundle);
        }
        arke b = arke.b(null);
        b.a = p().getString("theme");
        return b;
    }

    public final boolean z() {
        return !j().getBoolean("full_screen_backup_launched", false) && B() && this.K.f() && !this.v;
    }
}
