package com.google.android.gms.fido.u2f.ui;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.R;
import com.google.android.gms.fido.u2f.api.StateUpdate;
import com.google.android.gms.fido.u2f.api.common.BrowserRegisterRequestParams;
import com.google.android.gms.fido.u2f.api.common.BrowserRequestParams;
import com.google.android.gms.fido.u2f.api.common.BrowserSignRequestParams;
import com.google.android.gms.fido.u2f.api.common.ErrorCode;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.google.android.gms.fido.u2f.api.common.RegisterRequestParams;
import com.google.android.gms.fido.u2f.api.common.RequestParams;
import com.google.android.gms.fido.u2f.api.common.ResponseData;
import com.google.android.gms.fido.u2f.api.common.SignRequestParams;
import com.google.android.gms.fido.u2f.api.view.ViewOptions;
import defpackage.atzb;
import defpackage.bdcs;
import defpackage.bdct;
import defpackage.bdny;
import defpackage.beow;
import defpackage.beox;
import defpackage.beoy;
import defpackage.bepg;
import defpackage.beph;
import defpackage.beqz;
import defpackage.berf;
import defpackage.berk;
import defpackage.berp;
import defpackage.berr;
import defpackage.besk;
import defpackage.beut;
import defpackage.beuu;
import defpackage.beuy;
import defpackage.edxt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class AuthenticateChimeraActivity extends bdny {
    private static final beow l = new beow("U2fAuthChimeraActivity");
    private beqz m;
    private berp n;
    private String o;
    private RequestParams p;
    private beph q;
    private beoy r;

    public static Intent s(Context context, beox beoxVar, RequestParams requestParams) {
        atzb.s(context);
        atzb.s(requestParams);
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.fido.u2f.ui.AuthenticateActivity");
        intent.putExtra("RequestExtra", requestParams);
        intent.putExtra("SessionContextSourceExtra", beoxVar);
        return intent;
    }

    @Override // defpackage.bdny
    public final void j() {
        throw new RuntimeException("Embedded Security Key option is not available for U2F request!");
    }

    @Override // defpackage.bdny
    protected final void n(ViewOptions viewOptions) {
        beqz beqzVar = this.m;
        if (beqzVar != null) {
            beqzVar.b(new StateUpdate(StateUpdate.Type.UPDATE_CURRENT_VIEW, viewOptions.a()));
            return;
        }
        berp berpVar = this.n;
        if (berpVar != null) {
            berpVar.b(new StateUpdate(StateUpdate.Type.UPDATE_CURRENT_VIEW, viewOptions.a()));
        } else {
            l.f("No FIDO API helper to update the current view", new Object[0]);
        }
    }

    @Override // defpackage.bdny
    protected final void o(StateUpdate stateUpdate) {
        try {
            beqz beqzVar = this.m;
            if (beqzVar != null) {
                beqzVar.b(stateUpdate);
                return;
            }
            berp berpVar = this.n;
            if (berpVar != null) {
                berpVar.b(stateUpdate);
            } else {
                l.f("No FIDO API to update", new Object[0]);
            }
        } catch (SecurityException e) {
            this.q.a(this.r, e);
            t(new ErrorResponseData(ErrorCode.BAD_REQUEST, "SecurityException"));
        } catch (Exception e2) {
            this.q.a(this.r, e2);
            t(new ErrorResponseData(ErrorCode.OTHER_ERROR));
        }
    }

    @Override // defpackage.bdny, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        beox beoxVar = (beox) getIntent().getSerializableExtra("SessionContextSourceExtra");
        RequestParams requestParams = this.p;
        this.r = beoy.b(beoxVar, requestParams == null ? null : requestParams.d());
        this.q = bepg.a(getApplicationContext());
        if (getCallingActivity() == null) {
            l.f("Calling activity is null. No FIDO2 operation is processed", new Object[0]);
            finish();
            return;
        }
        String packageName = getCallingActivity().getPackageName();
        this.o = packageName;
        l.h("U2f operation is requested from ".concat(String.valueOf(packageName)), new Object[0]);
        setTheme(R.style.Theme_Fido_Transparent_DayNight);
        getContainerActivity();
        int i = edxt.a;
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onResume() {
        ApplicationInfo applicationInfo;
        beow beowVar = l;
        beowVar.d("onResume", new Object[0]);
        super.onResume();
        try {
            beqz beqzVar = this.m;
            if (beqzVar != null) {
                beqzVar.b(StateUpdate.c);
                return;
            }
            berp berpVar = this.n;
            if (berpVar != null) {
                berpVar.b(StateUpdate.c);
                return;
            }
            beowVar.f("No FIDO API call to resume, and a new request is being processed.", new Object[0]);
            RequestParams requestParams = (RequestParams) getIntent().getParcelableExtra("RequestExtra");
            this.p = requestParams;
            String str = this.o;
            if (requestParams instanceof BrowserRequestParams) {
                str = ((BrowserRequestParams) requestParams).a().getAuthority();
            } else {
                PackageManager packageManager = getApplicationContext().getPackageManager();
                try {
                    applicationInfo = packageManager.getApplicationInfo(str, 0);
                } catch (PackageManager.NameNotFoundException unused) {
                    l.f("Application info cannot be retrieved", new Object[0]);
                    applicationInfo = null;
                }
                if (applicationInfo == null || packageManager.getApplicationLabel(applicationInfo) == null) {
                    l.f("Cannot retrieve application name and package name is used instead", new Object[0]);
                } else {
                    str = packageManager.getApplicationLabel(applicationInfo).toString();
                }
            }
            atzb.m(!str.trim().isEmpty(), "App name or authority from request params cannot be empty after trimming.");
            this.j = new beuy(this, str, false, this.r.a);
            beut beutVar = new beut(this);
            beuu beuuVar = new beuu(this);
            Context applicationContext = getApplicationContext();
            try {
                if (this.p instanceof BrowserRequestParams) {
                    beqz beqzVar2 = new beqz(this.q);
                    this.m = beqzVar2;
                    RequestParams requestParams2 = this.p;
                    if (requestParams2 instanceof BrowserRegisterRequestParams) {
                        beoy beoyVar = this.r;
                        BrowserRegisterRequestParams browserRegisterRequestParams = (BrowserRegisterRequestParams) requestParams2;
                        int i = bdct.a;
                        String str2 = this.o;
                        beqz.a.h("headfulRegister is called by ".concat(String.valueOf(str2)), new Object[0]);
                        beqzVar2.c = true;
                        if (bdct.b(browserRegisterRequestParams.b.toString(), str2, applicationContext) == null) {
                            throw new SecurityException("Calling app is not a legitimate browser!");
                        }
                        beqzVar2.b.d(applicationContext, beoyVar, browserRegisterRequestParams, beuuVar, beqzVar2.a(applicationContext), str2);
                        return;
                    }
                    if (!(requestParams2 instanceof BrowserSignRequestParams)) {
                        l.f("Unsupported BrowserRequestParams type!", new Object[0]);
                        return;
                    }
                    beoy beoyVar2 = this.r;
                    BrowserSignRequestParams browserSignRequestParams = (BrowserSignRequestParams) requestParams2;
                    int i2 = bdct.a;
                    String str3 = this.o;
                    beqz.a.h("headfulSign is called by ".concat(String.valueOf(str3)), new Object[0]);
                    beqzVar2.c = true;
                    if (bdct.b(browserSignRequestParams.b.toString(), str3, applicationContext) == null) {
                        throw new SecurityException("Calling app is not a legitimate browser!");
                    }
                    beqzVar2.b.e(applicationContext, beoyVar2, browserSignRequestParams, beutVar, beqzVar2.a(applicationContext), str3);
                    return;
                }
                berp berpVar2 = new berp(this.q);
                this.n = berpVar2;
                RequestParams requestParams3 = this.p;
                if (requestParams3 instanceof RegisterRequestParams) {
                    beoy beoyVar3 = this.r;
                    RegisterRequestParams registerRequestParams = (RegisterRequestParams) requestParams3;
                    int i3 = bdct.a;
                    String str4 = this.o;
                    berp.a.h("headfulRegister is called by ".concat(String.valueOf(str4)), new Object[0]);
                    bdcs a = bdct.a(str4);
                    if (a == null) {
                        throw new SecurityException("Calling app is unknown; facetId should not be null!");
                    }
                    berpVar2.c = true;
                    berr berrVar = berpVar2.b;
                    besk a2 = berpVar2.a(applicationContext);
                    beow beowVar2 = berr.b;
                    beowVar2.h("doRegister for apps is called", new Object[0]);
                    berrVar.c = applicationContext;
                    berrVar.d = beuuVar;
                    berrVar.e = a2;
                    berrVar.f = new berf(registerRequestParams);
                    berrVar.g.k(beoyVar3, str4, registerRequestParams, a2.a());
                    if (!a2.a().isEmpty()) {
                        berrVar.h(beoyVar3, a);
                        return;
                    } else {
                        beowVar2.f("No enabled transport found on the platform", new Object[0]);
                        berrVar.g(beoyVar3, ErrorCode.CONFIGURATION_UNSUPPORTED);
                        return;
                    }
                }
                if (!(requestParams3 instanceof SignRequestParams)) {
                    l.f("Unsupported RequestParams type!", new Object[0]);
                    return;
                }
                beoy beoyVar4 = this.r;
                SignRequestParams signRequestParams = (SignRequestParams) requestParams3;
                int i4 = bdct.a;
                String str5 = this.o;
                berp.a.h("headfulSign is called by ".concat(String.valueOf(str5)), new Object[0]);
                bdcs a3 = bdct.a(str5);
                if (a3 == null) {
                    throw new SecurityException("Calling app is unknown; facetId should not be null!");
                }
                berpVar2.c = true;
                berr berrVar2 = berpVar2.b;
                besk a4 = berpVar2.a(applicationContext);
                beow beowVar3 = berr.b;
                beowVar3.h("doSign for apps is called", new Object[0]);
                berrVar2.c = applicationContext;
                berrVar2.d = beutVar;
                berrVar2.e = a4;
                berrVar2.f = new berk(signRequestParams);
                berrVar2.g.n(beoyVar4, str5, signRequestParams, berrVar2.e.a());
                if (!a4.a().isEmpty()) {
                    berrVar2.h(beoyVar4, a3);
                } else {
                    beowVar3.f("No enabled transport found on the platform", new Object[0]);
                    berrVar2.g(beoyVar4, ErrorCode.CONFIGURATION_UNSUPPORTED);
                }
            } catch (SecurityException e) {
                this.q.a(this.r, e);
                t(new ErrorResponseData(ErrorCode.BAD_REQUEST, "SecurityException"));
            } catch (Exception e2) {
                this.q.a(this.r, e2);
                t(new ErrorResponseData(ErrorCode.OTHER_ERROR));
            }
        } catch (SecurityException e3) {
            this.q.a(this.r, e3);
            t(new ErrorResponseData(ErrorCode.BAD_REQUEST, "SecurityException"));
        } catch (Exception e4) {
            this.q.a(this.r, e4);
            t(new ErrorResponseData(ErrorCode.OTHER_ERROR));
        }
    }

    public final void t(ResponseData responseData) {
        l.d("setActivityResult ".concat(responseData.a().toString()), new Object[0]);
        Intent intent = new Intent();
        intent.putExtra("RESPONSE_EXTRA", responseData);
        setResult(-1, intent);
        finish();
    }
}
