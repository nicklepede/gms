package com.google.android.gms.fido.fido2.ui;

import android.app.KeyguardManager;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.activity.result.ActivityResult;
import com.google.android.gms.R;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.RequestOptions;
import com.google.android.gms.fido.fido2.ui.AuthenticateChimeraActivity;
import com.google.android.gms.fido.u2f.api.StateUpdate;
import com.google.android.gms.fido.u2f.api.view.ViewOptions;
import defpackage.abv;
import defpackage.arwb;
import defpackage.arxd;
import defpackage.asot;
import defpackage.basf;
import defpackage.bbbk;
import defpackage.bbbx;
import defpackage.bbcd;
import defpackage.bbcp;
import defpackage.bbct;
import defpackage.bbhu;
import defpackage.bbjl;
import defpackage.bbkb;
import defpackage.bbqy;
import defpackage.bbqz;
import defpackage.bbrr;
import defpackage.bbsi;
import defpackage.bbsn;
import defpackage.bbto;
import defpackage.bcbt;
import defpackage.bcbv;
import defpackage.bcds;
import defpackage.bchz;
import defpackage.bcjb;
import defpackage.bcjw;
import defpackage.bcnh;
import defpackage.bcni;
import defpackage.bcnl;
import defpackage.bcnp;
import defpackage.eigb;
import defpackage.eiid;
import defpackage.ejhf;
import defpackage.entj;
import defpackage.ew;
import defpackage.fnxz;
import defpackage.fnyu;
import defpackage.fnzw;
import defpackage.igm;
import defpackage.igp;
import java.util.Set;
import java.util.UUID;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class AuthenticateChimeraActivity extends bbkb {
    public static final asot l = bcni.a("AuthenticateChimeraActivity");
    private UUID A;
    private bcjw B;
    private bbct D;
    private bcnh H;
    private bcjb I;
    public bcnl m;
    public String n;
    public bcnp o;
    public bbqy p;
    public RequestOptions q;
    public bchz r;
    public bcds s;
    public abv t;
    public abv u;
    public abv v;
    public ActivityResult w;
    public String x;
    public entj y;
    private bbcd z;
    private Boolean C = false;
    private eiid E = eigb.a;
    private boolean F = false;
    private boolean G = true;

    public static void t(ResultReceiver resultReceiver, PublicKeyCredential publicKeyCredential) {
        if (resultReceiver == null || !fnzw.p()) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putByteArray("FIDO2_CREDENTIAL_EXTRA", arxd.n(publicKeyCredential));
        resultReceiver.send(-1, bundle);
    }

    public static final ActivityResult x(PublicKeyCredential publicKeyCredential) {
        Intent intent = new Intent();
        intent.putExtra("FIDO2_CREDENTIAL_EXTRA", arxd.n(publicKeyCredential));
        intent.putExtra("FIDO2_CREDENTIAL_JSON_EXTRA", publicKeyCredential.c());
        AuthenticatorResponse a = publicKeyCredential.a();
        if (a instanceof AuthenticatorErrorResponse) {
            intent.putExtra("FIDO2_ERROR_EXTRA", a.h());
        } else {
            intent.putExtra("FIDO2_RESPONSE_EXTRA", a.h());
        }
        return new ActivityResult(-1, intent);
    }

    private final String y(bcnl bcnlVar, RequestOptions requestOptions, String str) {
        ApplicationInfo applicationInfo;
        Object obj = str;
        if (arwb.b(this.C, true)) {
            obj = str;
            if (this.E.h()) {
                obj = str;
                if (!bbhu.k(requestOptions)) {
                    obj = this.E.c();
                }
            }
        }
        if (requestOptions instanceof BrowserPublicKeyCredentialCreationOptions) {
            return ((BrowserPublicKeyCredentialCreationOptions) requestOptions).a.a.a;
        }
        if (requestOptions instanceof BrowserPublicKeyCredentialRequestOptions) {
            return ((BrowserPublicKeyCredentialRequestOptions) requestOptions).a.c;
        }
        if (fnyu.a.a().a() && arwb.b(obj, "com.google.android.gms")) {
            return getString(R.string.common_google);
        }
        PackageManager packageManager = getApplicationContext().getPackageManager();
        try {
            applicationInfo = packageManager.getApplicationInfo((String) obj, 0);
        } catch (PackageManager.NameNotFoundException e) {
            ((ejhf) ((ejhf) l.j()).s(e)).x("Application info cannot be retrieved");
            this.o.a(bcnlVar, e);
            applicationInfo = null;
        }
        if (applicationInfo != null && packageManager.getApplicationLabel(applicationInfo) != null) {
            return packageManager.getApplicationLabel(applicationInfo).toString();
        }
        ((ejhf) l.j()).x("Cannot retrieve application name and package name is used instead");
        return (String) obj;
    }

    @Override // defpackage.bbkb
    public final void j() {
        if (this.p == null) {
            ((ejhf) l.j()).x("No FIDO API ongoing to startEmbeddedSecurityKey");
            return;
        }
        setTheme(R.style.Theme_Fido_Transparent_DayNight);
        l();
        bbqy bbqyVar = this.p;
        if (bbqyVar.a == null) {
            bbqyVar.g();
        }
        bbjl bbjlVar = bbqyVar.a;
        if (bbjlVar != null) {
            bbjlVar.i();
        } else {
            bbqy.b.f("startEmbeddedSecurityKey should not be called for null securityKeyRequestController.", new Object[0]);
        }
    }

    @Override // defpackage.bbkb
    protected final void n(ViewOptions viewOptions) {
        bbqy bbqyVar = this.p;
        if (bbqyVar != null) {
            bbqyVar.c(new StateUpdate(StateUpdate.Type.UPDATE_CURRENT_VIEW, viewOptions.a()));
        } else {
            ((ejhf) l.j()).x("No FIDO API helper to update the current view");
        }
    }

    @Override // defpackage.bbkb
    protected final void o(StateUpdate stateUpdate) {
        PublicKeyCredential a;
        bbqy bbqyVar = this.p;
        if (bbqyVar == null) {
            ((ejhf) l.j()).x("No FIDO API to update");
            return;
        }
        bbqyVar.c(stateUpdate);
        if (arwb.b(stateUpdate, StateUpdate.a)) {
            if (fnxz.k()) {
                bbto bbtoVar = new bbto();
                bbsi bbsiVar = new bbsi();
                bbsiVar.b(ErrorCode.NOT_ALLOWED_ERR);
                bbsiVar.a = "User canceled the request";
                bbtoVar.c = bbsiVar.a();
                a = bbtoVar.a();
            } else {
                bbto bbtoVar2 = new bbto();
                bbsi bbsiVar2 = new bbsi();
                bbsiVar2.b(ErrorCode.ABORT_ERR);
                bbsiVar2.a = "User canceled the request";
                bbtoVar2.c = bbsiVar2.a();
                a = bbtoVar2.a();
            }
            this.o.a(this.m, new IllegalArgumentException("User canceled the request"));
            t(this.q.b(), a);
            v(a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x045d  */
    @Override // defpackage.bbkb, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onCreate(android.os.Bundle r12) {
        /*
            Method dump skipped, instructions count: 1381
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.fido2.ui.AuthenticateChimeraActivity.onCreate(android.os.Bundle):void");
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onResume() {
        super.onResume();
        if (this.F) {
            this.F = false;
            ((ejhf) l.h()).x("Flow to background");
            this.r.l(basf.TYPE_PASSKEYS_APP_FOREGROUND);
        }
    }

    @Override // defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onUserLeaveHint() {
        super.onUserLeaveHint();
        ((ejhf) l.h()).x("Flow to foreground");
        this.F = true;
        this.r.l(basf.TYPE_PASSKEYS_APP_BACKGROUND);
    }

    public final Set s() {
        return this.p.d.a();
    }

    public final void u(eiid eiidVar) {
        boolean z;
        if (eiidVar.h() && ((Boolean) eiidVar.c()).booleanValue()) {
            ((ejhf) l.h()).x("Using SilentOrStrongBoxUserVerifier.");
            this.D = new bbcp(gI());
        } else {
            ((ejhf) l.h()).x("Using default UserVerifier.");
            ew gI = gI();
            RequestOptions requestOptions = this.q;
            this.D = new bbbx(this, gI, requestOptions, y(this.m, requestOptions, this.n));
        }
        if (this.k.d.n()) {
            Boolean bool = (Boolean) this.k.d.hT();
            z = bool.booleanValue();
            ((ejhf) l.h()).B("Result for hasPasskeyOrDeviceBoundKeys = %s", bool);
        } else {
            z = false;
        }
        bcnl bcnlVar = this.m;
        RequestOptions requestOptions2 = this.q;
        bbct bbctVar = this.D;
        bbcd bbcdVar = this.z;
        final bbbk bbbkVar = new bbbk(this, gI());
        bbbkVar.g = igp.a(new igm() { // from class: bbax
            @Override // defpackage.igm
            public final Object a(final igk igkVar) {
                bbbk.this.c.b.g(this, new jpd() { // from class: bbaw
                    @Override // defpackage.jpd
                    public final void a(Object obj) {
                        bchy bchyVar = (bchy) obj;
                        Status status = bchyVar.a;
                        asot asotVar = bbbk.a;
                        if (!status.equals(Status.b)) {
                            status.b();
                        }
                        igk.this.b(bchyVar);
                    }
                });
                return "credentialController observe callback for secure transaction page.";
            }
        });
        bbbkVar.f = igp.a(new igm() { // from class: bbay
            @Override // defpackage.igm
            public final Object a(final igk igkVar) {
                bbbk.this.c.c.g(this, new jpd() { // from class: bbav
                    @Override // defpackage.jpd
                    public final void a(Object obj) {
                        bchx bchxVar = (bchx) obj;
                        Status status = bchxVar.a;
                        asot asotVar = bbbk.a;
                        if (!status.equals(Status.b)) {
                            status.b();
                        }
                        igk.this.b(bchxVar);
                    }
                });
                return "credentialController observe callback";
            }
        });
        KeyguardManager keyguardManager = (KeyguardManager) getSystemService("keyguard");
        bbbkVar.d = keyguardManager != null && keyguardManager.isDeviceSecure();
        bcnp bcnpVar = this.o;
        String str = this.n;
        bcbt bcbtVar = new bcbt(this, requestOptions2);
        boolean z2 = z;
        UUID uuid = this.A;
        runOnUiThread(new Runnable() { // from class: bcbn
            @Override // java.lang.Runnable
            public final void run() {
                AuthenticateChimeraActivity authenticateChimeraActivity = AuthenticateChimeraActivity.this;
                authenticateChimeraActivity.s.a.g(authenticateChimeraActivity, new bcbu(authenticateChimeraActivity));
            }
        });
        bbqz bbqzVar = new bbqz(uuid, this, bcnlVar, requestOptions2, bbctVar, bbbkVar, bbcdVar, bcbtVar, bcnpVar, str, new bcbv(this), Boolean.valueOf(z2), this.G);
        this.p = ((requestOptions2 instanceof PublicKeyCredentialRequestOptions) || (requestOptions2 instanceof BrowserPublicKeyCredentialRequestOptions)) ? bbqy.e(bbqzVar) : bbqy.d(bbqzVar);
        Boolean bool2 = this.C;
        if (bool2 != null && bool2.booleanValue()) {
            ((ejhf) l.h()).x("Starting security key only flow");
            this.p.j();
            return;
        }
        ((ejhf) l.h()).x("Starting generic processRequest flow");
        bbqy bbqyVar = this.p;
        if (bbqyVar.a == null) {
            bbqyVar.g();
        }
        bbjl bbjlVar = bbqyVar.a;
        if (bbjlVar != null) {
            bbjlVar.g();
        } else {
            bbqy.b.f("start should not be called for null securityKeyRequestController.", new Object[0]);
        }
        o(StateUpdate.c);
    }

    public final void v(PublicKeyCredential publicKeyCredential) {
        ActivityResult x = x(publicKeyCredential);
        setResult(x.a, x.b);
        finish();
    }

    public final void w(AuthenticatorResponse authenticatorResponse, bbsn bbsnVar, boolean z, bbrr bbrrVar, eiid eiidVar) {
        this.p.h(authenticatorResponse, bbsnVar, z, bbrrVar, eiidVar);
    }
}
