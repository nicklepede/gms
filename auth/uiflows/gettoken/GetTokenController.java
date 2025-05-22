package com.google.android.gms.auth.uiflows.gettoken;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.R;
import com.google.android.gms.auth.BrowserResolutionCookie;
import com.google.android.gms.auth.ResolutionData;
import com.google.android.gms.auth.firstparty.dataservice.ConsentResult;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.FACLConfig;
import com.google.android.gms.auth.firstparty.shared.FACLData;
import com.google.android.gms.auth.firstparty.shared.ScopeData;
import com.google.android.gms.auth.firstparty.shared.ScopeDetail;
import com.google.android.gms.auth.uiflows.addaccount.DmSetScreenlockChimeraActivity;
import com.google.android.gms.auth.uiflows.addaccount.WrapperControlledChimeraActivity;
import com.google.android.gms.auth.uiflows.common.UpdateCredentialsChimeraActivity;
import com.google.android.gms.auth.uiflows.consent.BrowserConsentChimeraActivity;
import com.google.android.gms.auth.uiflows.consent.GrantCredentialsWithAclChimeraActivity;
import com.google.android.gms.auth.uiflows.controller.Controller;
import com.google.android.gms.auth.uiflows.minutemaid.MinuteMaidChimeraActivity;
import com.google.android.gms.chimera.modules.auth.account.base.AppContextProvider;
import defpackage.acno;
import defpackage.acnp;
import defpackage.acnt;
import defpackage.adau;
import defpackage.afji;
import defpackage.afjk;
import defpackage.afjo;
import defpackage.afll;
import defpackage.aflp;
import defpackage.aflr;
import defpackage.afox;
import defpackage.atmp;
import defpackage.atmt;
import defpackage.atzb;
import defpackage.dxyi;
import defpackage.fnbo;
import defpackage.fywe;
import defpackage.wjv;
import defpackage.wwh;
import defpackage.wxa;
import defpackage.xbw;
import defpackage.xfu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class GetTokenController implements Controller {
    public static final Parcelable.Creator CREATOR = new aflr();
    private final Context a;
    private final acnt b;
    private final wwh c;
    private final AccountAuthenticatorResponse d;
    private final Account e;
    private final TokenRequest f;
    private final boolean g;
    private final boolean h;
    private final atmt i;
    private int j;

    public GetTokenController(AccountAuthenticatorResponse accountAuthenticatorResponse, TokenRequest tokenRequest, boolean z, boolean z2, atmt atmtVar, int i) {
        Context a = AppContextProvider.a();
        acnt acntVar = new acnt(AppContextProvider.a());
        AppContextProvider.a().getPackageManager();
        wwh wwhVar = (wwh) wwh.a.b();
        this.a = a;
        this.b = acntVar;
        this.c = wwhVar;
        this.d = accountAuthenticatorResponse;
        atzb.s(tokenRequest);
        this.f = tokenRequest;
        this.e = tokenRequest.a();
        this.g = z;
        this.h = z2;
        this.i = atmtVar;
        this.j = i;
    }

    private final Intent c(acnp acnpVar, adau adauVar) {
        boolean booleanValue = ((Boolean) acnpVar.b(GetTokenChimeraActivity.i, false)).booleanValue();
        Context context = this.a;
        boolean z = this.h;
        return atmp.c(context, this.e, false, z, this.i.a(), false, null, true, adauVar.ak, booleanValue, 1, Bundle.EMPTY, false);
    }

    private final afll d(int i, String str) {
        Intent putExtra = new Intent().putExtra("errorCode", i).putExtra("errorMessage", str);
        AccountAuthenticatorResponse accountAuthenticatorResponse = this.d;
        if (accountAuthenticatorResponse != null) {
            accountAuthenticatorResponse.onError(i, str);
        }
        return new afll(0, null, 0, putExtra, -1, -1);
    }

    @Override // com.google.android.gms.auth.uiflows.controller.Controller
    public final afll a(aflp aflpVar) {
        String str;
        String str2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        if (aflpVar == null) {
            if (this.b.a()) {
                return new afll(10, GetTokenChimeraActivity.j(this.a, this.f, this.g, this.h, this.i), 0, null, -1, -1);
            }
            Context context = this.a;
            return new afll(1001, afjo.c.a(context, new afjk(this.h, false, 0, context.getString(R.string.common_no_network), context.getString(R.string.auth_error_no_network), this.i)), 0, null, -1, -1);
        }
        Intent intent = aflpVar.c;
        new acnp(intent != null ? intent.getExtras() : new Bundle());
        int i = aflpVar.a;
        if (i == 10) {
            int i2 = aflpVar.b;
            if (i2 == -1) {
                acnp acnpVar = new acnp(intent.getExtras());
                TokenResponse tokenResponse = (TokenResponse) acnpVar.a(GetTokenChimeraActivity.h);
                if (tokenResponse == null) {
                    Log.w("Auth", String.format(Locale.US, "[GetToken, GetTokenController] Unable to get token", new Object[0]));
                    return d(5, "token response is null");
                }
                adau a = tokenResponse.a();
                if (a == adau.SUCCESS && !TextUtils.isEmpty(tokenResponse.d)) {
                    Account account = this.e;
                    if (!account.equals(tokenResponse.u)) {
                        Log.w("Auth", String.format(Locale.US, "[GetToken, GetTokenController] Account in TokenResponse does not match! Expected %s but got %s.", account, tokenResponse.u));
                    }
                    Intent putExtra = new Intent().putExtra("authAccount", tokenResponse.u.name).putExtra("accountType", tokenResponse.u.type).putExtra("authtoken", tokenResponse.d);
                    AccountAuthenticatorResponse accountAuthenticatorResponse = this.d;
                    if (accountAuthenticatorResponse != null) {
                        accountAuthenticatorResponse.onResult(putExtra.getExtras());
                    }
                    return new afll(0, null, -1, putExtra, -1, -1);
                }
                int ordinal = a.ordinal();
                if (ordinal != 8) {
                    if (ordinal != 22) {
                        if (ordinal != 23) {
                            switch (ordinal) {
                                case fywe.D /* 30 */:
                                case fywe.E /* 31 */:
                                case 32:
                                case fywe.G /* 33 */:
                                case fywe.H /* 34 */:
                                case fywe.I /* 35 */:
                                case fywe.J /* 36 */:
                                case fywe.L /* 38 */:
                                case fywe.M /* 39 */:
                                    if (this.j < 32) {
                                        Intent c = c(acnpVar, a);
                                        if (c != null) {
                                            return new afll(32, WrapperControlledChimeraActivity.b(this.a, this.h, this.i, c), 0, null, -1, -1);
                                        }
                                        Log.w("Auth", String.format(Locale.US, "[GetToken, GetTokenController] Can't install device management app, status=%s", a.ak));
                                        return d(6, "device management not supported");
                                    }
                                    break;
                                case fywe.K /* 37 */:
                                    dxyi dxyiVar = xbw.a;
                                    if (fnbo.a.lK().E()) {
                                        Context context2 = this.a;
                                        Account account2 = this.e;
                                        boolean z12 = this.h;
                                        atmt atmtVar = this.i;
                                        acno acnoVar = DmSetScreenlockChimeraActivity.h;
                                        Intent className = new Intent().setClassName(context2, "com.google.android.gms.auth.uiflows.addaccount.DmSetScreenlockActivity");
                                        acnp acnpVar2 = new acnp();
                                        acnpVar2.d(DmSetScreenlockChimeraActivity.h, account2);
                                        acnpVar2.d(afji.b, Boolean.valueOf(z12));
                                        acnpVar2.d(afji.a, atmtVar.a());
                                        return new afll(33, className.putExtras(acnpVar2.a), 0, null, -1, -1);
                                    }
                                    if (this.j < 32) {
                                        Intent c2 = c(acnpVar, a);
                                        if (c2 != null) {
                                            return new afll(32, WrapperControlledChimeraActivity.b(this.a, this.h, this.i, c2), 0, null, -1, -1);
                                        }
                                        Log.w("Auth", String.format(Locale.US, "[GetToken, GetTokenController] screenlock required", new Object[0]));
                                        return d(6, "device management not supported");
                                    }
                                    break;
                                default:
                                    Log.w("Auth", String.format(Locale.US, "[GetToken, GetTokenController] Unexpected status in token response: ".concat(String.valueOf(String.valueOf(a))), new Object[0]));
                                    return d(5, a.ak);
                            }
                        } else {
                            ResolutionData resolutionData = tokenResponse.z;
                            if (resolutionData != null && resolutionData.c == 2) {
                                Context context3 = this.a;
                                Account account3 = this.e;
                                String str3 = resolutionData.d;
                                BrowserResolutionCookie[] browserResolutionCookieArr = resolutionData.e;
                                atmt atmtVar2 = this.i;
                                acno acnoVar2 = BrowserConsentChimeraActivity.h;
                                Intent className2 = new Intent().setClassName(context3, "com.google.android.gms.auth.uiflows.consent.BrowserConsentActivity");
                                acnp acnpVar3 = new acnp();
                                acnpVar3.d(BrowserConsentChimeraActivity.h, account3);
                                acnpVar3.d(BrowserConsentChimeraActivity.i, str3);
                                acnpVar3.d(BrowserConsentChimeraActivity.j, browserResolutionCookieArr);
                                acnpVar3.d(afji.a, atmtVar2.a());
                                return new afll(40, className2.putExtras(acnpVar3.a), 0, null, -1, -1);
                            }
                        }
                    } else if (this.j < 40) {
                        TokenRequest tokenRequest = this.f;
                        wjv a2 = wjv.a(tokenRequest.b());
                        boolean z13 = !a2.e();
                        String d = a2.d();
                        AppDescription appDescription = tokenRequest.i;
                        String str4 = appDescription.e;
                        int i3 = appDescription.b;
                        String str5 = this.e.name;
                        List<ScopeDetail> b = tokenResponse.b();
                        int i4 = xfu.a;
                        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                        if (b != null) {
                            for (ScopeDetail scopeDetail : b) {
                                ArrayList arrayList2 = new ArrayList();
                                Iterator it = scopeDetail.a().iterator();
                                while (it.hasNext()) {
                                    arrayList2.add((String) it.next());
                                }
                                FACLData fACLData = scopeDetail.h;
                                String str6 = null;
                                if (fACLData != null) {
                                    FACLConfig fACLConfig = fACLData.b;
                                    if (fACLConfig != null) {
                                        str6 = fACLConfig.c;
                                        z9 = fACLConfig.g;
                                        z10 = fACLConfig.e;
                                        z11 = fACLConfig.f;
                                        boolean z14 = fACLConfig.b;
                                        z8 = fACLConfig.d;
                                        z7 = z14;
                                    } else {
                                        z7 = false;
                                        z8 = false;
                                        z9 = false;
                                        z10 = false;
                                        z11 = false;
                                    }
                                    String str7 = fACLData.c;
                                    z5 = z7;
                                    z = fACLData.d;
                                    str = str6;
                                    z6 = z8;
                                    z2 = z9;
                                    z3 = z10;
                                    z4 = z11;
                                    str2 = str7;
                                } else {
                                    str = null;
                                    str2 = null;
                                    z = false;
                                    z2 = false;
                                    z3 = false;
                                    z4 = false;
                                    z5 = false;
                                    z6 = false;
                                }
                                arrayList.add(new ScopeData(scopeDetail.b, scopeDetail.c, scopeDetail.d, scopeDetail.e, fACLData != null, str, str2, z, z2, z3, z4, z5, z6, arrayList2, scopeDetail.f));
                            }
                        }
                        String str8 = tokenRequest.a;
                        boolean z15 = tokenResponse.r;
                        int i5 = tokenResponse.s;
                        String str9 = tokenResponse.y;
                        int i6 = GrantCredentialsWithAclChimeraActivity.i;
                        Intent className3 = new Intent().setClassName(AppContextProvider.a(), "com.google.android.gms.auth.uiflows.consent.GrantCredentialsWithAclActivity");
                        className3.putExtra("callingPkg", str4);
                        className3.putExtra("callingUid", i3);
                        className3.putExtra("service", str8);
                        className3.putExtra("acctName", str5);
                        className3.putParcelableArrayListExtra("scopeData", arrayList);
                        className3.putExtra("GrantCredentialsWithAclChimeraActivityhasTitle", z15);
                        className3.putExtra("GrantCredentialsWithAclChimeraActivitytitle", i5);
                        className3.putExtra("GrantCredentialsWithAclChimeraActivityconsentCookieWrapper", str9);
                        className3.putExtra("GrantCredentialsWithAclChimeraActivityisRemoteApp", z13);
                        className3.putExtra("GrantCredentialsWithAclChimeraActivityremoteAppLabel", d);
                        return new afll(40, className3, 0, null, -1, -1);
                    }
                } else if (this.j < 20) {
                    wwh wwhVar = this.c;
                    Account account4 = this.e;
                    if (wwhVar.g(account4)) {
                        Context context4 = this.a;
                        return new afll(22, afjo.c.a(context4, new afjk(this.h, false, 0, context4.getString(R.string.auth_get_token_bad_auth_work_service_account_title), context4.getString(R.string.auth_get_token_bad_auth_work_service_account_message), null)), 0, null, 0, 0);
                    }
                    Context context5 = this.a;
                    afox afoxVar = new afox(context5, 3);
                    afoxVar.a = account4.name;
                    afoxVar.b = account4.type;
                    atmt atmtVar3 = this.i;
                    afoxVar.b(atmtVar3);
                    return new afll(20, MinuteMaidChimeraActivity.p(context5, account4, this.h, atmtVar3, afoxVar.a()), 0, null, 0, 0);
                }
                return d(5, "something went wrong");
            }
            if (i2 == 0) {
                return d(4, "user canceled");
            }
        } else if (i == 40) {
            this.j = 40;
            int i7 = aflpVar.b;
            if (i7 == -1) {
                ConsentResult consentResult = (ConsentResult) intent.getParcelableExtra(ConsentResult.a);
                adau b2 = adau.b(consentResult.c);
                if (b2 != adau.SUCCESS) {
                    Log.w("Auth", String.format(Locale.US, "[GetToken, GetTokenController] Unexpected status in grant credentials response: ".concat(String.valueOf(String.valueOf(b2))), new Object[0]));
                    return d(5, b2.ak);
                }
                TokenRequest tokenRequest2 = this.f;
                tokenRequest2.d(consentResult.a());
                tokenRequest2.p = consentResult.g;
                tokenRequest2.q = consentResult.h;
                return new afll(10, GetTokenChimeraActivity.j(this.a, tokenRequest2, this.g, this.h, this.i), 0, null, -1, -1);
            }
            if (i7 == 0) {
                return d(4, "user declined");
            }
        } else {
            if (i == 1001) {
                return d(3, "no network");
            }
            if (i == 32) {
                this.j = 32;
                switch (aflpVar.b) {
                    case 2:
                    case 7:
                    case 8:
                        return d(5, "something went wrong");
                    case 3:
                        return d(3, "dm agent data fetch error");
                    case 4:
                        return d(3, "dm agent download install error");
                    case 5:
                    case 9:
                        Log.w("Auth", String.format(Locale.US, "[GetToken, GetTokenController] device management not supported", new Object[0]));
                        return d(6, "device management not supported");
                    case 6:
                        return d(4, "user canceled");
                    default:
                        return new afll(10, GetTokenChimeraActivity.j(this.a, this.f, this.g, this.h, this.i), 0, null, -1, -1);
                }
            }
            if (i == 33) {
                this.j = 33;
                return aflpVar.b == -1 ? new afll(10, GetTokenChimeraActivity.j(this.a, this.f, this.g, this.h, this.i), 0, null, -1, -1) : d(4, "missing lock screen");
            }
            switch (i) {
                case fywe.t /* 20 */:
                    this.j = 20;
                    int i8 = aflpVar.b;
                    if (i8 == -1) {
                        acnp acnpVar4 = new acnp(intent.getExtras());
                        String str10 = (String) acnpVar4.a(MinuteMaidChimeraActivity.h);
                        String str11 = (String) acnpVar4.a(MinuteMaidChimeraActivity.j);
                        Account account5 = this.e;
                        if (!TextUtils.isEmpty(str11) && !account5.name.equalsIgnoreCase(str11)) {
                            wxa.w(8);
                        }
                        return new afll(21, UpdateCredentialsChimeraActivity.j(this.a, account5, str10, this.h, this.i), 0, null, 0, 0);
                    }
                    if (i8 == 0) {
                        return d(4, "user did not reauth");
                    }
                    if (i8 == 2) {
                        return d(5, "something went wrong");
                    }
                    break;
                case fywe.u /* 21 */:
                    this.j = 21;
                    int i9 = aflpVar.b;
                    if (i9 == -1) {
                        return new afll(10, GetTokenChimeraActivity.j(this.a, this.f, this.g, this.h, this.i), 0, null, 0, 0);
                    }
                    if (i9 == 0) {
                        return d(5, "something went wrong");
                    }
                    break;
                case fywe.v /* 22 */:
                    this.j = 22;
                    Log.w("Auth", String.format(Locale.US, "[GetToken, GetTokenController] work service account", new Object[0]));
                    return d(6, "work service account");
            }
        }
        throw new IllegalStateException(String.format("Result not handled with id %d and resultCode %d.", Integer.valueOf(i), Integer.valueOf(aflpVar.b)));
    }

    @Override // com.google.android.gms.auth.uiflows.controller.Controller
    public final String b() {
        return "GetTokenController";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.d, 0);
        parcel.writeParcelable(this.f, 0);
        parcel.writeByte(this.g ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.h ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.i.a(), 0);
        parcel.writeInt(this.j);
    }
}
