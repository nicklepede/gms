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
import defpackage.asxe;
import defpackage.aura;
import defpackage.bbtr;
import defpackage.bbtt;
import defpackage.bbtw;
import defpackage.bbtx;
import defpackage.bbty;
import defpackage.bbua;
import defpackage.bbum;
import defpackage.bbvn;
import defpackage.bcbi;
import defpackage.bcbm;
import defpackage.bcce;
import defpackage.bccf;
import defpackage.bccq;
import defpackage.bccr;
import defpackage.bp;
import defpackage.bsup;
import defpackage.cq;
import defpackage.ekvl;
import defpackage.elhz;
import defpackage.elqn;
import defpackage.esiy;
import defpackage.ew;
import defpackage.fhbp;
import defpackage.fqep;
import defpackage.fqfe;
import defpackage.rxx;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class FamilyInvitationChimeraActivity extends rxx implements bcbi, bccq, bcce {
    private static final elhz j = new elqn("yt-tandem");
    private String k;
    private bbtt l;
    private PageDataMap m;
    private ContactPickerOptionsData n;
    private bbtr o;
    private boolean p = false;
    private int q = 0;
    private int r;
    private bbvn s;
    private bbty t;
    private bbum u;

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
        ekvl.y(str);
        PageDataMap pageDataMap = this.m;
        ekvl.y(pageDataMap);
        bccf x = bccf.x(str, pageDataMap.a(true != z ? 7 : 6), arrayList);
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

    @Override // defpackage.bcbi
    public final void A(int i) {
        if (i > 0) {
            getWindow().addFlags(8192);
            String str = this.k;
            ekvl.y(str);
            bccr.x(str, i, this.r).show(getSupportFragmentManager(), "invite-preconditions");
            return;
        }
        int i2 = bbtx.a;
        bbtw bbtwVar = new bbtw(this);
        bbtwVar.l(R.string.fm_family_is_full);
        bbtwVar.o(R.string.fm_cant_invite_more_members);
        bbtwVar.setPositiveButton(R.string.common_continue, new DialogInterface.OnClickListener() { // from class: bcad
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                dialogInterface.dismiss();
                FamilyInvitationChimeraActivity.this.B();
            }
        });
        bbtwVar.a();
    }

    @Override // defpackage.bcbi
    public final void B() {
        PageDataMap pageDataMap = this.m;
        if (pageDataMap == null || pageDataMap.c(7)) {
            G(false, null);
        } else {
            F();
        }
    }

    @Override // defpackage.bcbi, defpackage.bccq, defpackage.bcce
    public final bbvn hQ() {
        return this.s;
    }

    @Override // defpackage.bcbi
    public final int k() {
        return this.q;
    }

    @Override // defpackage.bcbi, defpackage.bccq
    public final bbtr l() {
        return this.o;
    }

    @Override // defpackage.bcbi, defpackage.bccq
    public final bbtt m() {
        return this.l;
    }

    @Override // defpackage.bcbi
    public final ProfileData n() {
        return (ProfileData) getIntent().getParcelableExtra("profileData");
    }

    @Override // defpackage.bccq
    public final void o() {
        bbtx.b(this).show();
        E();
    }

    @Override // defpackage.rza, defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onActivityResult(int i, int i2, Intent intent) {
        PageDataMap pageDataMap;
        super.onActivityResult(i, i2, intent);
        if (i != 1) {
            if (i != 2) {
                return;
            }
            this.t.b(this.u.c, i2);
            bbum bbumVar = this.u;
            ekvl.y(intent);
            bbumVar.e(intent);
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
        ekvl.y(intent);
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
            ekvl.y(intent);
            G(intent.getIntExtra("num-invitations-sent", 0) != 0, null);
            return;
        }
        ekvl.y(intent);
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("direct-add-contacts-list");
        boolean z = (parcelableArrayListExtra == null || parcelableArrayListExtra.isEmpty()) ? false : true;
        this.p = z;
        G(z, parcelableArrayListExtra);
    }

    @Override // defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onBackPressed() {
        if (getSupportFragmentManager().b() == 0) {
            F();
            return;
        }
        String str = getSupportFragmentManager().aw(0).m;
        ekvl.y(str);
        if (str.equals("backStackTagSuccessFragment")) {
            r();
        } else {
            super.onBackPressed();
        }
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.s = new bbvn(this);
        String q = aura.q(this);
        if (!asxe.d(this).h(q)) {
            this.s.e(4, 8);
            I(-3);
            return;
        }
        bbua.d(this, getIntent(), q);
        String stringExtra = getIntent().getStringExtra("accountName");
        this.k = stringExtra;
        if (stringExtra == null) {
            this.s.e(4, 13);
            I(-2);
            return;
        }
        Account account = null;
        for (Account account2 : bsup.b(this).p("com.google")) {
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
        ekvl.y(str);
        this.t = new bbty(this, str);
        String D = D(getIntent().getStringExtra("appId"));
        this.o = new bbtr(D, Integer.toString(ModuleManager.get(this).getCurrentModule().moduleVersion));
        bbvn bbvnVar = this.s;
        String str2 = this.k;
        ekvl.y(str2);
        bbtr bbtrVar = this.o;
        bbvnVar.d(str2, bbtrVar.b, bbtrVar.a);
        this.r = getIntent().getIntExtra("inviteeRole", 3);
        this.l = new bbtt();
        boolean k = fqep.k();
        if (!k) {
            this.s.a();
        }
        fhbp b = fqfe.b();
        String d = bbum.d(D);
        if (!H() && k && (b.b.contains(d) || j.contains(d))) {
            String str3 = this.k;
            ekvl.y(str3);
            bbum bbumVar = new bbum(str3, d, this.l, q);
            this.u = bbumVar;
            this.t.c(bbumVar.f(), ModuleManager.get(this).getCurrentModule().moduleVersion, this.u.c);
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
            ekvl.y(str4);
            int i = this.r;
            boolean H = H();
            bcbm bcbmVar = new bcbm();
            Bundle bundle2 = new Bundle(3);
            bundle2.putString("accountName", str4);
            bundle2.putInt("inviteeRole", i);
            bundle2.putBoolean("isDirectAddInvitations", H);
            bcbmVar.setArguments(bundle2);
            bpVar.t(R.id.fm_family_invitation_fragment_container, bcbmVar);
            bpVar.a();
        }
    }

    @Override // defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
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

    @Override // defpackage.bccq
    public final void p() {
        E();
    }

    @Override // defpackage.bcbi
    public final void q() {
        findViewById(R.id.fm_family_invitation_loading_screen).setVisibility(8);
    }

    @Override // defpackage.bcbi
    public final void r() {
        setResult(1, C());
        finish();
    }

    @Override // defpackage.bcbi
    public final void s() {
        F();
    }

    @Override // defpackage.bcbi
    public final void t() {
        findViewById(R.id.fm_family_invitation_loading_screen).setVisibility(0);
    }

    @Override // defpackage.bcbi, defpackage.bccq
    public final void u(int i, int i2) {
        Intent putExtra = new Intent().setClassName(this, "com.google.android.gms.family.invites.SendInvitationsActivity").putExtra("accountName", this.k).putExtra("consistencyToken", this.l.b()).putExtra("tokenExpirationTimeSecs", this.l.a()).putExtra("max-available-slots", i).putExtra("appId", this.o.a).putExtra("customTheme", getIntent().getIntExtra("customTheme", 0)).putExtra("predefinedTheme", D(getIntent().getStringExtra("predefinedTheme"))).putExtra("clientCallingPackage", aura.q(this)).putExtra("isOnboardInvitations", z()).putExtra("inviteeRole", this.r);
        PageDataMap pageDataMap = this.m;
        Intent putExtra2 = putExtra.putExtra("invitesSendingPagedata", (pageDataMap == null || !pageDataMap.c(23)) ? new PageData(esiy.a) : this.m.a(23));
        PageDataMap pageDataMap2 = this.m;
        Intent putExtra3 = putExtra2.putExtra("invitesRetryPagedata", (pageDataMap2 == null || !pageDataMap2.c(24)) ? new PageData(esiy.a) : this.m.a(24));
        PageDataMap pageDataMap3 = this.m;
        Intent putExtra4 = putExtra3.putExtra("invitesRetryLaterPagedata", (pageDataMap3 == null || !pageDataMap3.c(25)) ? new PageData(esiy.a) : this.m.a(25));
        putExtra4.putExtra("isDirectAddInvitations", H());
        putExtra4.putExtra("contactPickerOptions", this.n);
        startActivityForResult(putExtra4, 1);
        E();
    }

    @Override // defpackage.bcbi
    public final void v(ContactPickerOptionsData contactPickerOptionsData) {
        this.n = contactPickerOptionsData;
    }

    @Override // defpackage.bcbi
    public final void w(PageDataMap pageDataMap) {
        this.m = pageDataMap;
    }

    @Override // defpackage.bcce
    public final void x() {
        r();
    }

    @Override // defpackage.bcbi
    public final void y() {
        this.s.f(4, 8, "updaterequired");
        I(-3);
    }

    @Override // defpackage.bccq
    public final boolean z() {
        return getIntent().getBooleanExtra("isOnboardInvitations", true);
    }
}
