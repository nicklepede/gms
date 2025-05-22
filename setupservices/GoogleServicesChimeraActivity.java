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
import defpackage.a;
import defpackage.ajxm;
import defpackage.atad;
import defpackage.atfd;
import defpackage.atfn;
import defpackage.atmr;
import defpackage.atmt;
import defpackage.atmu;
import defpackage.auad;
import defpackage.auio;
import defpackage.aupz;
import defpackage.auqx;
import defpackage.aury;
import defpackage.bsxr;
import defpackage.bsxv;
import defpackage.cbiq;
import defpackage.demi;
import defpackage.demn;
import defpackage.dems;
import defpackage.demx;
import defpackage.denc;
import defpackage.deng;
import defpackage.deno;
import defpackage.dent;
import defpackage.deny;
import defpackage.deoa;
import defpackage.deob;
import defpackage.deoc;
import defpackage.deoe;
import defpackage.deoh;
import defpackage.deon;
import defpackage.deow;
import defpackage.deoy;
import defpackage.depb;
import defpackage.depc;
import defpackage.depd;
import defpackage.depg;
import defpackage.depi;
import defpackage.depk;
import defpackage.depl;
import defpackage.depo;
import defpackage.depp;
import defpackage.depr;
import defpackage.dept;
import defpackage.depu;
import defpackage.depy;
import defpackage.deqb;
import defpackage.deqc;
import defpackage.deqd;
import defpackage.deqe;
import defpackage.dhkz;
import defpackage.dhlk;
import defpackage.dhlq;
import defpackage.dhlw;
import defpackage.dhma;
import defpackage.dhmr;
import defpackage.dkbl;
import defpackage.doyw;
import defpackage.dozv;
import defpackage.dvty;
import defpackage.dvtz;
import defpackage.dyls;
import defpackage.efrl;
import defpackage.eftg;
import defpackage.efug;
import defpackage.efus;
import defpackage.efuu;
import defpackage.efwn;
import defpackage.efwt;
import defpackage.ektg;
import defpackage.ekvi;
import defpackage.ekww;
import defpackage.ekxd;
import defpackage.emll;
import defpackage.emrf;
import defpackage.emri;
import defpackage.emrk;
import defpackage.emrm;
import defpackage.emrn;
import defpackage.eqgo;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fuuj;
import defpackage.fuuz;
import defpackage.fvns;
import defpackage.iri;
import defpackage.wih;
import defpackage.xcb;
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

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class GoogleServicesChimeraActivity extends deon implements DialogInterface.OnClickListener, efwt, efus {
    public static final auad j = new auad("SetupServices", "GoogleServicesActivity");
    public List A;
    public atmu B;
    public efug C;
    public Bundle D;
    public byte[] E;
    public GoogleServicesExpandableItem F;
    public depb G;
    public depc H;
    public deoy I;
    public depg J;
    public deow K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public ekvi P;
    public boolean Q;
    public dyls R;
    public ekvi S;
    public String T;
    public depr U;
    public dvtz V;
    public cbiq W;
    public dvty X;
    public dvty Y;
    public final deqe Z;
    public final deqe aa;
    public final deqe ab;
    private final ekww aj;
    private final ekww ak;
    private boolean al;
    private final eqgo am;
    private Bundle an;
    private long ao;
    private xcb ap;
    private ajxm aq;
    private final deqe ar;
    private final deqe as;
    private final deqe at;
    private final deqe au;
    private final deqe av;
    private final deqe aw;
    public final ekww o;
    public final ekww p;
    public final ekww q;
    public depo r;
    public deqc s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public final ekww k = ekxd.a(new ekww() { // from class: delc
        @Override // defpackage.ekww
        public final Object lK() {
            return Boolean.valueOf(fofq.a.lK().k());
        }
    });
    public final ekww l = ekxd.a(new ekww() { // from class: delj
        @Override // defpackage.ekww
        public final Object lK() {
            return Long.valueOf(fofq.a.lK().g());
        }
    });
    private final ekww ac = ekxd.a(new ekww() { // from class: delk
        @Override // defpackage.ekww
        public final Object lK() {
            return fofq.f();
        }
    });
    private final ekww ad = ekxd.a(new ekww() { // from class: delm
        @Override // defpackage.ekww
        public final Object lK() {
            return Long.valueOf(fofq.a.lK().c());
        }
    });
    private final ekww ae = ekxd.a(new ekww() { // from class: deln
        @Override // defpackage.ekww
        public final Object lK() {
            return Boolean.valueOf(fofq.g());
        }
    });
    private final ekww af = ekxd.a(new ekww() { // from class: delo
        @Override // defpackage.ekww
        public final Object lK() {
            return Boolean.valueOf(fofq.a.lK().o());
        }
    });
    private final ekww ag = ekxd.a(new ekww() { // from class: delp
        @Override // defpackage.ekww
        public final Object lK() {
            return Boolean.valueOf(fofq.a.lK().n());
        }
    });
    private final ekww ah = ekxd.a(new ekww() { // from class: delq
        @Override // defpackage.ekww
        public final Object lK() {
            return Boolean.valueOf(fofq.a.lK().p());
        }
    });
    public final ekww m = ekxd.a(new ekww() { // from class: delr
        @Override // defpackage.ekww
        public final Object lK() {
            return Boolean.valueOf(fuuz.a.lK().an());
        }
    });
    public final ekww n = ekxd.a(new ekww() { // from class: dels
        @Override // defpackage.ekww
        public final Object lK() {
            return Boolean.valueOf(foes.a.lK().a());
        }
    });
    private final ekww ai = ekxd.a(new ekww() { // from class: deld
        @Override // defpackage.ekww
        public final Object lK() {
            return Long.valueOf(fuuz.a.lK().a());
        }
    });

    public GoogleServicesChimeraActivity() {
        ekww a = ekxd.a(new ekww() { // from class: dele
            @Override // defpackage.ekww
            public final Object lK() {
                return Boolean.valueOf(fuuz.a.lK().Z());
            }
        });
        this.aj = a;
        ekww a2 = ekxd.a(new ekww() { // from class: delf
            @Override // defpackage.ekww
            public final Object lK() {
                return Boolean.valueOf(fuuz.a.lK().al());
            }
        });
        this.o = a2;
        this.p = ekxd.a(new ekww() { // from class: delg
            @Override // defpackage.ekww
            public final Object lK() {
                return Boolean.valueOf(fuuz.a.lK().ak());
            }
        });
        this.ak = ekxd.a(new ekww() { // from class: delh
            @Override // defpackage.ekww
            public final Object lK() {
                return Boolean.valueOf(fuuz.a.lK().ai());
            }
        });
        this.am = new aupz(3, 9);
        this.ao = 0L;
        ektg ektgVar = ektg.a;
        this.P = ektgVar;
        this.Q = false;
        this.R = null;
        this.S = ektgVar;
        this.T = "shouldShowFullScreenBackup";
        demi demiVar = new demi(this, ((Boolean) a.lK()).booleanValue(), ((Boolean) a2.lK()).booleanValue());
        this.Z = demiVar;
        demn demnVar = new demn(this, ((Boolean) a.lK()).booleanValue(), ((Boolean) a2.lK()).booleanValue());
        this.ar = demnVar;
        dems demsVar = new dems(this, ((Boolean) a.lK()).booleanValue(), ((Boolean) a2.lK()).booleanValue());
        this.aa = demsVar;
        demx demxVar = new demx(this, ((Boolean) a.lK()).booleanValue(), ((Boolean) a2.lK()).booleanValue());
        this.as = demxVar;
        denc dencVar = new denc(this, ((Boolean) a.lK()).booleanValue(), ((Boolean) a2.lK()).booleanValue());
        this.at = dencVar;
        deng dengVar = new deng(this, ((Boolean) a.lK()).booleanValue(), ((Boolean) a2.lK()).booleanValue());
        this.au = dengVar;
        deno denoVar = new deno(this, ((Boolean) a.lK()).booleanValue(), ((Boolean) a2.lK()).booleanValue());
        this.ab = denoVar;
        dent dentVar = Build.VERSION.SDK_INT >= 30 ? new dent(this, ((Boolean) a.lK()).booleanValue(), ((Boolean) a2.lK()).booleanValue()) : null;
        this.av = dentVar;
        deny denyVar = new deny(this, ((Boolean) a.lK()).booleanValue(), ((Boolean) a2.lK()).booleanValue());
        this.aw = denyVar;
        List asList = Arrays.asList(demiVar, demnVar, demsVar, demxVar, dentVar, dencVar, dengVar, denoVar, denyVar);
        this.A = asList;
        this.A = (List) Collection.EL.stream(asList).filter(new Predicate() { // from class: dekx
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo478negate() {
                return Predicate$CC.$default$negate(this);
            }

            @Override // java.util.function.Predicate
            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return Objects.nonNull((deqe) obj);
            }
        }).collect(Collectors.toCollection(new Supplier() { // from class: deky
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ArrayList();
            }
        }));
        this.q = ekxd.a(new ekww() { // from class: deli
            @Override // defpackage.ekww
            public final Object lK() {
                GoogleServicesChimeraActivity googleServicesChimeraActivity = GoogleServicesChimeraActivity.this;
                return new depn(googleServicesChimeraActivity, googleServicesChimeraActivity.n(), googleServicesChimeraActivity.t, googleServicesChimeraActivity.u, googleServicesChimeraActivity.A(), new BackupManager(googleServicesChimeraActivity));
            }
        });
    }

    private final emrf F() {
        emrn emrnVar = ((emll) k().b).r;
        if (emrnVar == null) {
            emrnVar = emrn.a;
        }
        fgrc fgrcVar = (fgrc) emrnVar.iQ(5, null);
        fgrcVar.X(emrnVar);
        return (emrf) fgrcVar;
    }

    private final void G(int i) {
        j.h(a.j(i, "Calls finish() with result code: "), new Object[0]);
        if (((Boolean) this.ak.lK()).booleanValue()) {
            c(i);
        } else if (w() && i == 0) {
            c(0);
        } else {
            I();
            c(i);
        }
    }

    private final void H() {
        GoogleServicesTextItem googleServicesTextItem = (GoogleServicesTextItem) this.C.jO(R.id.google_services_tos);
        if (googleServicesTextItem != null && googleServicesTextItem.l) {
            ekww ekwwVar = bsxv.a;
            bsxr.a(auio.SETUPSERVICES_TOS_VIEWED);
        }
        GoogleServicesExpandableItem googleServicesExpandableItem = this.F;
        if (googleServicesExpandableItem == null || !googleServicesExpandableItem.l) {
            return;
        }
        ekww ekwwVar2 = bsxv.a;
        bsxr.a(auio.SETUPSERVICES_DEVICE_MAINTENANCE_VIEWED);
    }

    private final void I() {
        dhlw dhlwVar;
        j.h("setOptIns.", new Object[0]);
        try {
            String[] strArr = dozv.a;
            int i = iri.a;
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
                String[] strArr2 = dozv.a;
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
            doyw.d(getContentResolver(), "use_location_for_services", 1);
            sendBroadcast(new Intent("com.google.android.gsf.settings.GoogleLocationSettings.UPDATE_LOCATION_SETTINGS"));
        } catch (RuntimeException e2) {
            j.f("Error invoking forceSetUseLocationForServices: ".concat(String.valueOf(e2.getMessage())), new Object[0]);
        }
        Account n = n();
        for (deqe deqeVar : this.A) {
            deoe deoeVar = deqeVar.g;
            if (deoeVar != null && deoeVar.h()) {
                boolean g = deoeVar.g();
                j.h(deqeVar.h() + ": " + g, new Object[0]);
                deqeVar.d(g);
            }
        }
        final wih wihVar = new wih();
        wihVar.a = 2;
        wihVar.b = depk.PHONE.e.eK;
        if (n != null) {
            wihVar.c = n.name;
        }
        final boolean z = p().getBoolean("is_setup_wizard", false);
        auad auadVar = depl.a;
        if (n == null) {
            dhlwVar = dhmr.d(null);
        } else {
            dhma dhmaVar = new dhma();
            new depi(this, n, dhmaVar).start();
            dhlwVar = dhmaVar.a;
        }
        dhlwVar.d(new dhkz() { // from class: dely
            /* JADX WARN: Code restructure failed: missing block: B:173:0x02dd, code lost:
            
                if (android.text.TextUtils.isEmpty(r8 != null ? r8.getText() : null) == false) goto L84;
             */
            @Override // defpackage.dhkz
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object a(defpackage.dhlw r21) {
                /*
                    Method dump skipped, instructions count: 1356
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.dely.a(dhlw):java.lang.Object");
            }
        }).x(new dhlk() { // from class: delx
            @Override // defpackage.dhlk
            public final void hH(dhlw dhlwVar2) {
                auad auadVar2 = GoogleServicesChimeraActivity.j;
                if (!dhlwVar2.m()) {
                    GoogleServicesChimeraActivity.j.p("Exception writing audit records", dhlwVar2.h(), new Object[0]);
                    return;
                }
                GoogleServicesChimeraActivity.j.h("Audit recorded. result=".concat(String.valueOf(String.valueOf(dhlwVar2.i()))), new Object[0]);
            }
        });
    }

    private static void J(final dhma dhmaVar, final long j2) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        dhmaVar.a.x(new dhlk() { // from class: dekz
            @Override // defpackage.dhlk
            public final void hH(dhlw dhlwVar) {
                auad auadVar = GoogleServicesChimeraActivity.j;
                countDownLatch.countDown();
            }
        });
        new aupz(1, 10).execute(new Runnable() { // from class: delb
            @Override // java.lang.Runnable
            public final void run() {
                auad auadVar = GoogleServicesChimeraActivity.j;
                CountDownLatch countDownLatch2 = countDownLatch;
                long j3 = j2;
                dhma dhmaVar2 = dhmaVar;
                try {
                    countDownLatch2.await(j3, TimeUnit.SECONDS);
                    if (dhmaVar2.a.l()) {
                        return;
                    }
                    dhmaVar2.d(new TimeoutException("Task timed out after " + j3 + " seconds"));
                } catch (InterruptedException e) {
                    if (dhmaVar2.a.l()) {
                        return;
                    }
                    dhmaVar2.d(e);
                }
            }
        });
    }

    private final boolean K() {
        j.j("showFullScreenBackupOptInInsteadOfGservicesToggle=%b (using cached value)", this.P.c());
        this.S = ekvi.j(((Boolean) this.P.c()).booleanValue() ? emrm.SHOWN_CACHED_TRUE : emrm.NOT_SHOWN_CACHED_FALSE);
        return ((Boolean) this.P.c()).booleanValue();
    }

    private static final void L(dhlw dhlwVar, final String str) {
        final Instant ofEpochMilli = Instant.ofEpochMilli(SystemClock.elapsedRealtime());
        dhlwVar.x(new dhlk() { // from class: dema
            @Override // defpackage.dhlk
            public final void hH(dhlw dhlwVar2) {
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
        if (((Boolean) this.m.lK()).booleanValue()) {
            if (A()) {
                this.S = ekvi.j(emrm.NOT_SHOWN_BACKUP_OPT_IN_SUPPRESSED);
                return false;
            }
            if (this.P.h()) {
                return K();
            }
            dyls dylsVar = this.R;
            if (dylsVar != null) {
                boolean z2 = dylsVar.b == 2;
                this.S = ekvi.j(z2 ? emrm.SHOWN_RESTORE_API_RESULT_RESTORE_OPT_IN : emrm.NOT_SHOWN_RESTORE_API_RESULT_NOT_RESTORE_OPT_IN);
                return z2;
            }
            if (((Boolean) this.n.lK()).booleanValue() && this.S.h()) {
                return false;
            }
            this.S = ekvi.j(emrm.NOT_SHOWN_RESTORE_API_RESULT_NULL);
            return false;
        }
        if (!((Boolean) this.k.lK()).booleanValue()) {
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
            if (((Boolean) this.n.lK()).booleanValue() && this.S.h()) {
                return false;
            }
            this.S = ekvi.j(emrm.NOT_SHOWN_MANAGEMENT_INFO_NOT_FETCHED);
            return false;
        }
        boolean b = eftg.b(getIntent());
        if (this.M) {
            if (b) {
                booleanValue = ((Boolean) this.ag.lK()).booleanValue();
                z = true;
            } else {
                booleanValue = ((Boolean) this.ah.lK()).booleanValue();
                z = false;
            }
        } else if (b) {
            booleanValue = ((Boolean) this.ae.lK()).booleanValue();
            z = true;
        } else {
            booleanValue = ((Boolean) this.af.lK()).booleanValue();
            z = false;
        }
        j.j("showFullScreenBackupOptInInsteadOfGservicesToggle=%b (canUseManagementInfo=%b isManagedAccount=%b isAnySetupWizard=%b)", Boolean.valueOf(booleanValue), Boolean.valueOf(this.N), Boolean.valueOf(this.M), Boolean.valueOf(z));
        this.S = ekvi.j(booleanValue ? emrm.SHOWN_EVALUATED_TRUE : emrm.NOT_SHOWN_EVALUATED_FALSE);
        return booleanValue;
    }

    public final fgrc C() {
        emrn emrnVar = ((emll) k().b).r;
        if (emrnVar == null) {
            emrnVar = emrn.a;
        }
        emrk emrkVar = emrnVar.g;
        if (emrkVar == null) {
            emrkVar = emrk.a;
        }
        fgrc fgrcVar = (fgrc) emrkVar.iQ(5, null);
        fgrcVar.X(emrkVar);
        boolean z = this.O;
        if (!fgrcVar.b.L()) {
            fgrcVar.U();
        }
        emrk emrkVar2 = (emrk) fgrcVar.b;
        int i = 1;
        emrkVar2.b |= 1;
        emrkVar2.c = z;
        boolean a = dept.a("pixel_legal_joint_permission", false);
        if (!fgrcVar.b.L()) {
            fgrcVar.U();
        }
        emrk emrkVar3 = (emrk) fgrcVar.b;
        emrkVar3.b |= 2;
        emrkVar3.d = a;
        boolean a2 = dept.a("pixel_legal_joint_permission_v2", false);
        if (!fgrcVar.b.L()) {
            fgrcVar.U();
        }
        emrk emrkVar4 = (emrk) fgrcVar.b;
        emrkVar4.b |= 4;
        emrkVar4.e = a2;
        boolean t = auqx.t(getApplicationContext());
        if (!fgrcVar.b.L()) {
            fgrcVar.U();
        }
        fgri fgriVar = fgrcVar.b;
        emrk emrkVar5 = (emrk) fgriVar;
        emrkVar5.b |= 8;
        emrkVar5.f = t;
        if (this.t) {
            i = 2;
        } else if (this.w) {
            i = 3;
        } else if (this.x || this.O) {
            i = 4;
        }
        if (!fgriVar.L()) {
            fgrcVar.U();
        }
        emrk emrkVar6 = (emrk) fgrcVar.b;
        emrkVar6.j = i - 1;
        emrkVar6.b |= 128;
        return fgrcVar;
    }

    @Override // defpackage.dekn
    protected final String a() {
        return "GoogleServicesActivity";
    }

    @Override // defpackage.efwt
    public final void gH() {
        onBackPressed();
    }

    @Override // defpackage.atmc
    protected final void gJ(String str, boolean z) {
        int i = efwn.a;
        if (efrl.z(this)) {
            setTheme(R.style.UsePartnerResourceThemeOverlay);
        } else {
            setTheme(R.style.NotUsePartnerResourceThemeOverlay);
        }
        if (p().getBoolean("is_setup_wizard", false) ? !efrl.v(this) : !fuuz.i()) {
            atmr.f(this, str);
        } else {
            atmr.h(this, str);
        }
        if (efrl.w(this)) {
            setTheme(efwn.a(this));
        }
        atmr.d(this, z, getBaseContext());
    }

    @Override // defpackage.deqi
    public final Bundle j() {
        if (this.D == null) {
            this.D = new Bundle();
        }
        return this.D;
    }

    @Override // defpackage.efwt
    public final void jM() {
        H();
        if (isDestroyed()) {
            return;
        }
        if (((Boolean) this.ak.lK()).booleanValue()) {
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
        eftg.a(getIntent(), o);
        o.putExtra("account", n());
        j().putBoolean("full_screen_backup_launched", true);
        startActivityForResult(o, 101);
    }

    @Override // defpackage.dekn, defpackage.deqk
    public final void m() {
        for (deqe deqeVar : this.A) {
            deoe deoeVar = deqeVar.g;
            if (deoeVar != null && deoeVar.h()) {
                fgrc k = k();
                boolean g = deoeVar.g();
                int i = deqeVar.i(k);
                emrn emrnVar = ((emll) k.b).r;
                if (emrnVar == null) {
                    emrnVar = emrn.a;
                }
                emri emriVar = (emri) emrnVar.c.get(i);
                fgrc fgrcVar = (fgrc) emriVar.iQ(5, null);
                fgrcVar.X(emriVar);
                if (!fgrcVar.b.L()) {
                    fgrcVar.U();
                }
                emri emriVar2 = (emri) fgrcVar.b;
                emri emriVar3 = emri.a;
                emriVar2.b |= 4;
                emriVar2.e = g;
                emri emriVar4 = (emri) fgrcVar.Q();
                emrn emrnVar2 = ((emll) k.b).r;
                if (emrnVar2 == null) {
                    emrnVar2 = emrn.a;
                }
                fgrc fgrcVar2 = (fgrc) emrnVar2.iQ(5, null);
                fgrcVar2.X(emrnVar2);
                emrf emrfVar = (emrf) fgrcVar2;
                emrfVar.a(i, emriVar4);
                emrn emrnVar3 = (emrn) emrfVar.Q();
                if (!k.b.L()) {
                    k.U();
                }
                emll emllVar = (emll) k.b;
                emrnVar3.getClass();
                emllVar.r = emrnVar3;
                emllVar.b |= 32768;
            }
        }
        if (((Boolean) this.k.lK()).booleanValue() || ((Boolean) this.m.lK()).booleanValue()) {
            emrf F = F();
            boolean b = eftg.b(getIntent());
            if (!F.b.L()) {
                F.U();
            }
            emrn emrnVar4 = (emrn) F.b;
            emrn emrnVar5 = emrn.a;
            emrnVar4.b |= 1;
            emrnVar4.d = b;
            boolean z = this.u;
            if (!F.b.L()) {
                F.U();
            }
            emrn emrnVar6 = (emrn) F.b;
            emrnVar6.b |= 2;
            emrnVar6.e = z;
            if (this.S.h()) {
                Object c = this.S.c();
                if (!F.b.L()) {
                    F.U();
                }
                emrn emrnVar7 = (emrn) F.b;
                emrnVar7.f = ((emrm) c).q;
                emrnVar7.b |= 4;
            }
            fgrc k2 = k();
            emrn emrnVar8 = (emrn) F.Q();
            if (!k2.b.L()) {
                k2.U();
            }
            emll emllVar2 = (emll) k2.b;
            emll emllVar3 = emll.a;
            emrnVar8.getClass();
            emllVar2.r = emrnVar8;
            emllVar2.b |= 32768;
        }
    }

    public final Account n() {
        Account account = (Account) p().getParcelable("account");
        if (fuuj.a.lK().a() && account != null && "Android Enterprise".equals(account.name)) {
            return null;
        }
        return account;
    }

    public final Intent o() {
        return new Intent((String) this.ac.lK()).setPackage("com.google.android.apps.restore");
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 101) {
            j.f("Received result from unknown requestCode=%d", Integer.valueOf(i));
            return;
        }
        auad auadVar = j;
        auadVar.h("Received result from backup opt-in requestCode=%d", 101);
        j().remove("full_screen_backup_launched");
        if (i2 != 0) {
            auadVar.h("Result ok and finish.", new Object[0]);
            G(-1);
            return;
        }
        auadVar.h("Result canceled from backup opt-in.", new Object[0]);
        if (!this.L) {
            auadVar.h("No opt-ins to display, going back.", new Object[0]);
            G(0);
        }
        auadVar.h("Other opt-ins to display, do nothing.", new Object[0]);
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onBackPressed() {
        j.h("onBackPressed.", new Object[0]);
        G(0);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.D.putBoolean("aadc_diaglog_dismissed", true);
        dialogInterface.dismiss();
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x06e7  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0710 A[LOOP:0: B:139:0x070a->B:141:0x0710, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0479  */
    @Override // defpackage.dekn, defpackage.deoj, defpackage.atmc, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onCreate(android.os.Bundle r25) {
        /*
            Method dump skipped, instructions count: 1861
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.setupservices.GoogleServicesChimeraActivity.onCreate(android.os.Bundle):void");
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onPause() {
        j.h("savePreferences.", new Object[0]);
        deoa q = q();
        for (deqe deqeVar : this.A) {
            deoe deoeVar = deqeVar.g;
            if (deoeVar != null && deoeVar.h()) {
                q.b(deqeVar.h(), deoeVar.g());
            }
        }
        byte[] bArr = this.E;
        if (bArr != null) {
            q.c(bArr);
        }
        if ((((Boolean) this.k.lK()).booleanValue() || ((Boolean) this.m.lK()).booleanValue()) && !this.P.h()) {
            q.b(this.T, B());
        }
        q.a();
        super.onPause();
    }

    @Override // defpackage.dekn, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
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

    public final deoa q() {
        return (p().getBoolean("is_setup_wizard", false) || p().getBoolean("deferredSetup", false)) ? new deob(getSharedPreferences("com.google.android.gms.setupservices.SetupWizardPreferences", 0)) : new deoc(j());
    }

    public final void r(emrk emrkVar) {
        fgrc k = k();
        emrf F = F();
        if (!F.b.L()) {
            F.U();
        }
        emrn emrnVar = (emrn) F.b;
        emrn emrnVar2 = emrn.a;
        emrkVar.getClass();
        emrnVar.g = emrkVar;
        emrnVar.b |= 8;
        boolean b = eftg.b(getIntent());
        if (!F.b.L()) {
            F.U();
        }
        emrn emrnVar3 = (emrn) F.b;
        emrnVar3.b |= 1;
        emrnVar3.d = b;
        emrn emrnVar4 = (emrn) F.Q();
        if (!k.b.L()) {
            k.U();
        }
        emll emllVar = (emll) k.b;
        emll emllVar2 = emll.a;
        emrnVar4.getClass();
        emllVar.r = emrnVar4;
        emllVar.b |= 32768;
    }

    public final void s(final int i) {
        int i2 = depp.a;
        atad a = dkbl.a(this);
        atfn atfnVar = new atfn();
        atfnVar.a = new atfd() { // from class: dkan
            @Override // defpackage.atfd
            public final void d(Object obj, Object obj2) {
                ((dkcg) ((dkcn) obj).H()).e(new dkba((dhma) obj2));
            }
        };
        atfnVar.d = 4513;
        a.jd(atfnVar.a()).z(new dhlq() { // from class: dela
            @Override // defpackage.dhlq
            public final void gC(Object obj) {
                atat atatVar = (atat) obj;
                if (((dkci) atatVar.a).c() || ((dkci) atatVar.a).b() > 0) {
                    GoogleServicesChimeraActivity googleServicesChimeraActivity = GoogleServicesChimeraActivity.this;
                    fgrc C = googleServicesChimeraActivity.C();
                    if (!C.b.L()) {
                        C.U();
                    }
                    int i3 = i;
                    emrk emrkVar = (emrk) C.b;
                    emrk emrkVar2 = emrk.a;
                    emrkVar.b |= 64;
                    emrkVar.i = i3;
                    googleServicesChimeraActivity.r((emrk) C.Q());
                }
            }
        });
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.efus
    public final void t(efuu efuuVar) {
        char c;
        depu depuVar;
        if (isFinishing()) {
            return;
        }
        String str = efuuVar.a;
        if ("safety_net_details".equals(str)) {
            depd depdVar = new depd(this, this.s, this.t);
            CharSequence charSequence = deqd.a(depdVar.e, R.array.setupservices_google_services_safety_net_dialog_text, depdVar.a).a;
            Bundle bundle = new Bundle();
            bundle.putCharSequence("message", charSequence);
            deoh deohVar = new deoh();
            deohVar.setArguments(bundle);
            deohVar.show(gY(), "dialog");
            return;
        }
        deqc deqcVar = this.s;
        depo depoVar = this.r;
        auad auadVar = deqb.a;
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
        depy depyVar = null;
        switch (c) {
            case 0:
                deqc deqcVar2 = deqc.DEFAULT;
                int ordinal = deqcVar.ordinal();
                if (ordinal == 1) {
                    depuVar = depu.PRIVACY_POLICY_KIDS;
                    break;
                } else if (ordinal == 3) {
                    depuVar = depu.PRIVACY_POLICY_AUTO;
                    break;
                } else if (!depoVar.b("DE")) {
                    depuVar = depu.PRIVACY_POLICY;
                    break;
                } else {
                    depuVar = depu.PRIVACY_POLICY_GERMANY;
                    break;
                }
            case 1:
                deqc deqcVar3 = deqc.DEFAULT;
                if (deqcVar.ordinal() == 3) {
                    depuVar = depu.TERMS_OF_SERVICE_AUTO;
                    break;
                } else if (!depoVar.b("DE")) {
                    depuVar = depu.TERMS_OF_SERVICE;
                    break;
                } else {
                    depuVar = depu.TERMS_OF_SERVICE_GERMANY;
                    break;
                }
            case 2:
                depuVar = depu.APP_PERMISSIONS_KOREA;
                break;
            case 3:
                depuVar = depu.ADDITIONAL_PRIVACY_KOREA;
                break;
            case 4:
                depuVar = depu.LOCATION_TOS_KOREA;
                break;
            case 5:
                depuVar = depu.AUTOMOTIVE_MAPS_TOS;
                break;
            case 6:
                depuVar = depu.GOOGLE_DATA_USE;
                break;
            case 7:
                depuVar = depu.SAFTY_DATA;
                break;
            case '\b':
                depuVar = depu.LOCATION_ACCURACY;
                break;
            default:
                depuVar = null;
                break;
        }
        if (depuVar != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("policy", depuVar.name());
            depyVar = new depy();
            depyVar.setArguments(bundle2);
        }
        if (depyVar != null) {
            depyVar.show(gY(), "dialog");
            return;
        }
        j.m("Failed to create PolicyDialogFragment, id=".concat(String.valueOf(str)), new Object[0]);
    }

    public final void u(final int i) {
        if (fvns.i()) {
            int i2 = depp.a;
            dkbl.a(this).aL(new ElCapitanOptions(false, i)).z(new dhlq() { // from class: delz
                @Override // defpackage.dhlq
                public final void gC(Object obj) {
                    final GoogleServicesChimeraActivity googleServicesChimeraActivity = GoogleServicesChimeraActivity.this;
                    final int i3 = i;
                    depp.a(googleServicesChimeraActivity).z(new dhlq() { // from class: dekp
                        @Override // defpackage.dhlq
                        public final void gC(Object obj2) {
                            atat atatVar = (atat) obj2;
                            if (atatVar.o() || atatVar.n() > 0) {
                                GoogleServicesChimeraActivity googleServicesChimeraActivity2 = GoogleServicesChimeraActivity.this;
                                fgrc C = googleServicesChimeraActivity2.C();
                                if (!C.b.L()) {
                                    C.U();
                                }
                                int i4 = i3;
                                emrk emrkVar = (emrk) C.b;
                                emrk emrkVar2 = emrk.a;
                                emrkVar.b |= 32;
                                emrkVar.h = i4;
                                googleServicesChimeraActivity2.r((emrk) C.Q());
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
        return (this.O || this.w || this.x) && aury.l(this);
    }

    @Override // defpackage.atmc
    protected final atmt x() {
        Bundle bundle = p().getBundle("ui_parameters");
        if (bundle != null) {
            return atmt.b(bundle);
        }
        atmt b = atmt.b(null);
        b.a = p().getString("theme");
        return b;
    }

    public final boolean z() {
        return !j().getBoolean("full_screen_backup_launched", false) && B() && this.K.f() && !this.v;
    }
}
