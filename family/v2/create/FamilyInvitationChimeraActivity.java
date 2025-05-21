package com.google.android.gms.family.v2.create;

import android.accounts.Account;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.R;
import com.google.android.gms.family.v2.create.FamilyInvitationChimeraActivity;
import com.google.android.gms.family.v2.model.ContactPickerOptionsData;
import com.google.android.gms.family.v2.model.PageData;
import com.google.android.gms.family.v2.model.PageDataMap;
import com.google.android.gms.family.v2.model.ProfileData;
import defpackage.aqup;
import defpackage.asng;
import defpackage.azpv;
import defpackage.azpx;
import defpackage.azqa;
import defpackage.azqb;
import defpackage.azqc;
import defpackage.azqe;
import defpackage.azqq;
import defpackage.azrr;
import defpackage.azxm;
import defpackage.azxq;
import defpackage.azyi;
import defpackage.azyj;
import defpackage.azyu;
import defpackage.azyv;
import defpackage.bp;
import defpackage.bqna;
import defpackage.cq;
import defpackage.eiig;
import defpackage.eiuu;
import defpackage.ejdg;
import defpackage.epuz;
import defpackage.ew;
import defpackage.femw;
import defpackage.fnmh;
import defpackage.fnmw;
import defpackage.qet;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class FamilyInvitationChimeraActivity extends qet implements azxm, azyu, azyi {
    private static final eiuu j = new ejdg("yt-tandem");
    private String k;
    private azpx l;
    private PageDataMap m;
    private ContactPickerOptionsData n;
    private azpv o;
    private boolean p = false;
    private int q = 0;
    private int r;
    private azrr s;
    private azqc t;
    private azqq u;

    private final Intent C() {
        Intent putExtra = new Intent().putExtra("accountName", this.k);
        putExtra.putExtra("familyChanged", this.p);
        this.l.b();
        if (!this.l.b().isEmpty()) {
            putExtra.putExtra("consistencyToken", this.l.b()).putExtra("tokenExpirationTimeSecs", this.l.a());
        }
        return putExtra;
    }

    private static String D(String str) {
        return str == null ? "" : str;
    }

    private final void E() {
        cq cqVar = (cq) getSupportFragmentManager().h("invite-preconditions");
        if (cqVar != null) {
            cqVar.dismissAllowingStateLoss();
        }
        getWindow().clearFlags(8192);
    }

    private final void F() {
        setResult(3, C());
        finish();
        if (getIntent().getBooleanExtra("fromCreate", false)) {
            overridePendingTransition(0, 0);
        }
    }

    private final void G(boolean z, ArrayList arrayList) {
        q();
        String str = this.k;
        eiig.x(str);
        PageDataMap pageDataMap = this.m;
        eiig.x(pageDataMap);
        azyj x = azyj.x(str, pageDataMap.a(true != z ? 7 : 6), arrayList);
        bp bpVar = new bp(getSupportFragmentManager());
        bpVar.F(R.id.fm_family_invitation_fragment_container, x);
        bpVar.w("backStackTagSuccessFragment");
        bpVar.a();
    }

    private final boolean H() {
        return getIntent().getBooleanExtra("isDirectAddInvitations", false);
    }

    private final void I(int i) {
        setResult(4, new Intent().putExtra("accountName", this.k).putExtra("errorCode", i));
        finish();
    }

    @Override // defpackage.azxm
    public final void A(int i) {
        if (i > 0) {
            getWindow().addFlags(8192);
            String str = this.k;
            eiig.x(str);
            azyv.x(str, i, this.r).show(getSupportFragmentManager(), "invite-preconditions");
            return;
        }
        int i2 = azqb.a;
        azqa azqaVar = new azqa(this);
        azqaVar.j(R.string.fm_family_is_full);
        azqaVar.m(R.string.fm_cant_invite_more_members);
        azqaVar.setPositiveButton(R.string.common_continue, new DialogInterface.OnClickListener() { // from class: azwh
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                dialogInterface.dismiss();
                FamilyInvitationChimeraActivity.this.B();
            }
        });
        azqaVar.a();
    }

    @Override // defpackage.azxm
    public final void B() {
        PageDataMap pageDataMap = this.m;
        if (pageDataMap == null || pageDataMap.c(7)) {
            G(false, null);
        } else {
            F();
        }
    }

    @Override // defpackage.azxm, defpackage.azyu, defpackage.azyi
    public final azrr hA() {
        return this.s;
    }

    @Override // defpackage.azxm
    public final int k() {
        return this.q;
    }

    @Override // defpackage.azxm, defpackage.azyu
    public final azpv l() {
        return this.o;
    }

    @Override // defpackage.azxm, defpackage.azyu
    public final azpx m() {
        return this.l;
    }

    @Override // defpackage.azxm
    public final ProfileData n() {
        return (ProfileData) getIntent().getParcelableExtra("profileData");
    }

    @Override // defpackage.azyu
    public final void o() {
        azqb.b(this).show();
        E();
    }

    @Override // defpackage.qfw, defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onActivityResult(int i, int i2, Intent intent) {
        PageDataMap pageDataMap;
        super.onActivityResult(i, i2, intent);
        if (i != 1) {
            if (i != 2) {
                return;
            }
            this.t.b(this.u.c, i2);
            azqq azqqVar = this.u;
            eiig.x(intent);
            azqqVar.e(intent);
            if (i2 != -1) {
                F();
                return;
            } else {
                this.p = true;
                r();
                return;
            }
        }
        if (intent != null && intent.getStringExtra("consistencyToken") != null) {
            this.l.c(intent.getStringExtra("consistencyToken"), intent.getLongExtra("tokenExpirationTimeSecs", 0L));
        }
        eiig.x(intent);
        int intExtra = this.q + intent.getIntExtra("num-invitations-created", 0);
        this.q = intExtra;
        if (intExtra > 0) {
            this.p = true;
        }
        if (i2 == 0) {
            if (H() && (pageDataMap = this.m) != null && pageDataMap.c(7)) {
                G(false, new ArrayList());
                return;
            }
            PageDataMap pageDataMap2 = this.m;
            if (pageDataMap2 == null || pageDataMap2.c(5)) {
                q();
                return;
            } else {
                F();
                return;
            }
        }
        PageDataMap pageDataMap3 = this.m;
        if (pageDataMap3 != null && !pageDataMap3.c(6) && !this.m.c(7)) {
            r();
            return;
        }
        if (!H()) {
            eiig.x(intent);
            G(intent.getIntExtra("num-invitations-sent", 0) != 0, null);
            return;
        }
        eiig.x(intent);
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("direct-add-contacts-list");
        boolean z = (parcelableArrayListExtra == null || parcelableArrayListExtra.isEmpty()) ? false : true;
        this.p = z;
        G(z, parcelableArrayListExtra);
    }

    @Override // defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onBackPressed() {
        if (getSupportFragmentManager().b() == 0) {
            F();
            return;
        }
        String str = getSupportFragmentManager().aw(0).m;
        eiig.x(str);
        if (str.equals("backStackTagSuccessFragment")) {
            r();
        } else {
            super.onBackPressed();
        }
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.s = new azrr(this);
        String q = asng.q(this);
        if (!aqup.d(this).h(q)) {
            this.s.e(4, 8);
            I(-3);
            return;
        }
        azqe.d(this, getIntent(), q);
        String stringExtra = getIntent().getStringExtra("accountName");
        this.k = stringExtra;
        if (stringExtra == null) {
            this.s.e(4, 13);
            I(-2);
            return;
        }
        Account account = null;
        for (Account account2 : bqna.b(this).p("com.google")) {
            if (true == account2.name.equals(this.k)) {
                account = account2;
            }
        }
        if (account == null) {
            this.s.e(4, 14);
            I(-2);
            return;
        }
        String str = this.k;
        eiig.x(str);
        this.t = new azqc(this, str);
        String D = D(getIntent().getStringExtra("appId"));
        this.o = new azpv(D, Integer.toString(ModuleManager.get(this).getCurrentModule().moduleVersion));
        azrr azrrVar = this.s;
        String str2 = this.k;
        eiig.x(str2);
        azpv azpvVar = this.o;
        azrrVar.d(str2, azpvVar.b, azpvVar.a);
        this.r = getIntent().getIntExtra("inviteeRole", 3);
        this.l = new azpx();
        boolean k = fnmh.k();
        if (!k) {
            this.s.a();
        }
        femw b = fnmw.b();
        String d = azqq.d(D);
        if (!H() && k && (b.b.contains(d) || j.contains(d))) {
            String str3 = this.k;
            eiig.x(str3);
            azqq azqqVar = new azqq(str3, d, this.l, q);
            this.u = azqqVar;
            this.t.c(azqqVar.f(), ModuleManager.get(this).getCurrentModule().moduleVersion, this.u.c);
            startActivityForResult(this.u.a("family_module_first_party"), 2);
            return;
        }
        if (bundle != null && bundle.getString("consistencyToken") != null) {
            this.l.c(bundle.getString("consistencyToken"), bundle.getLong("tokenExpirationTimeSecs", 0L));
        } else if (getIntent().getStringExtra("consistencyToken") != null) {
            this.l.c(getIntent().getStringExtra("consistencyToken"), getIntent().getLongExtra("tokenExpirationTimeSecs", 0L));
        }
        this.m = bundle != null ? (PageDataMap) bundle.getParcelable("pageDataMap") : null;
        if (bundle != null) {
            this.p = bundle.getBoolean("familyChanged");
        } else {
            this.p = getIntent().getBooleanExtra("familyChanged", false);
        }
        setContentView(R.layout.fm_activity_family_invitation_v2);
        q();
        ew supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.g(R.id.fm_family_invitation_fragment_container) == null) {
            bp bpVar = new bp(supportFragmentManager);
            String str4 = this.k;
            eiig.x(str4);
            int i = this.r;
            boolean H = H();
            azxq azxqVar = new azxq();
            Bundle bundle2 = new Bundle(3);
            bundle2.putString("accountName", str4);
            bundle2.putInt("inviteeRole", i);
            bundle2.putBoolean("isDirectAddInvitations", H);
            azxqVar.setArguments(bundle2);
            bpVar.t(R.id.fm_family_invitation_fragment_container, azxqVar);
            bpVar.a();
        }
    }

    @Override // defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("pageDataMap", this.m);
        this.l.b();
        if (!this.l.b().isEmpty()) {
            bundle.putString("consistencyToken", this.l.b());
            bundle.putLong("tokenExpirationTimeSecs", this.l.a());
        }
        bundle.putBoolean("familyChanged", this.p);
    }

    @Override // defpackage.azyu
    public final void p() {
        E();
    }

    @Override // defpackage.azxm
    public final void q() {
        findViewById(R.id.fm_family_invitation_loading_screen).setVisibility(8);
    }

    @Override // defpackage.azxm
    public final void r() {
        setResult(1, C());
        finish();
    }

    @Override // defpackage.azxm
    public final void s() {
        F();
    }

    @Override // defpackage.azxm
    public final void t() {
        findViewById(R.id.fm_family_invitation_loading_screen).setVisibility(0);
    }

    @Override // defpackage.azxm, defpackage.azyu
    public final void u(int i, int i2) {
        Intent putExtra = new Intent().setClassName(this, "com.google.android.gms.family.invites.SendInvitationsActivity").putExtra("accountName", this.k).putExtra("consistencyToken", this.l.b()).putExtra("tokenExpirationTimeSecs", this.l.a()).putExtra("max-available-slots", i).putExtra("appId", this.o.a).putExtra("customTheme", getIntent().getIntExtra("customTheme", 0)).putExtra("predefinedTheme", D(getIntent().getStringExtra("predefinedTheme"))).putExtra("clientCallingPackage", asng.q(this)).putExtra("isOnboardInvitations", z()).putExtra("inviteeRole", this.r);
        PageDataMap pageDataMap = this.m;
        Intent putExtra2 = putExtra.putExtra("invitesSendingPagedata", (pageDataMap == null || !pageDataMap.c(23)) ? new PageData(epuz.a) : this.m.a(23));
        PageDataMap pageDataMap2 = this.m;
        Intent putExtra3 = putExtra2.putExtra("invitesRetryPagedata", (pageDataMap2 == null || !pageDataMap2.c(24)) ? new PageData(epuz.a) : this.m.a(24));
        PageDataMap pageDataMap3 = this.m;
        Intent putExtra4 = putExtra3.putExtra("invitesRetryLaterPagedata", (pageDataMap3 == null || !pageDataMap3.c(25)) ? new PageData(epuz.a) : this.m.a(25));
        putExtra4.putExtra("isDirectAddInvitations", H());
        putExtra4.putExtra("contactPickerOptions", this.n);
        startActivityForResult(putExtra4, 1);
        E();
    }

    @Override // defpackage.azxm
    public final void v(ContactPickerOptionsData contactPickerOptionsData) {
        this.n = contactPickerOptionsData;
    }

    @Override // defpackage.azxm
    public final void w(PageDataMap pageDataMap) {
        this.m = pageDataMap;
    }

    @Override // defpackage.azyi
    public final void x() {
        r();
    }

    @Override // defpackage.azxm
    public final void y() {
        this.s.f(4, 8, "updaterequired");
        I(-3);
    }

    @Override // defpackage.azyu
    public final boolean z() {
        return getIntent().getBooleanExtra("isOnboardInvitations", true);
    }
}
