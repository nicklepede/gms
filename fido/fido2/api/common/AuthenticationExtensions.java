package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.bbrz;
import defpackage.eite;
import defpackage.eitj;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class AuthenticationExtensions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bbrz();
    public final FidoAppIdExtension a;
    public final CableAuthenticationExtension b;
    public final UserVerificationMethodExtension c;
    public final GoogleMultiAssertionExtension d;
    public final GoogleSessionIdExtension e;
    public final GoogleSilentVerificationExtension f;
    public final DevicePublicKeyExtension g;
    public final GoogleTunnelServerIdExtension h;
    public final GoogleThirdPartyPaymentExtension i;
    public final PrfExtension j;
    public final SimpleTransactionAuthorizationExtension k;
    public final HmacSecretExtension l;
    public final PaymentExtension m;

    public AuthenticationExtensions(FidoAppIdExtension fidoAppIdExtension, CableAuthenticationExtension cableAuthenticationExtension, UserVerificationMethodExtension userVerificationMethodExtension, GoogleMultiAssertionExtension googleMultiAssertionExtension, GoogleSessionIdExtension googleSessionIdExtension, GoogleSilentVerificationExtension googleSilentVerificationExtension, DevicePublicKeyExtension devicePublicKeyExtension, GoogleTunnelServerIdExtension googleTunnelServerIdExtension, GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension, PrfExtension prfExtension, SimpleTransactionAuthorizationExtension simpleTransactionAuthorizationExtension, HmacSecretExtension hmacSecretExtension, PaymentExtension paymentExtension) {
        this.a = fidoAppIdExtension;
        this.c = userVerificationMethodExtension;
        this.b = cableAuthenticationExtension;
        this.d = googleMultiAssertionExtension;
        this.e = googleSessionIdExtension;
        this.f = googleSilentVerificationExtension;
        this.g = devicePublicKeyExtension;
        this.h = googleTunnelServerIdExtension;
        this.i = googleThirdPartyPaymentExtension;
        this.j = prfExtension;
        this.k = simpleTransactionAuthorizationExtension;
        this.l = hmacSecretExtension;
        this.m = paymentExtension;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions a(org.json.JSONObject r19) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions.a(org.json.JSONObject):com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions");
    }

    public final eitj b() {
        int i = eitj.d;
        eite eiteVar = new eite();
        if (this.a != null) {
            eiteVar.i("fidoAppIdExtension");
        }
        if (this.c != null) {
            eiteVar.i("userVerificationMethodExtension");
        }
        if (this.b != null) {
            eiteVar.i("cableAuthenticationExtension");
        }
        if (this.d != null) {
            eiteVar.i("google_multiAssertionExtension");
        }
        if (this.e != null) {
            eiteVar.i("google_sessionIdExtension");
        }
        if (this.f != null) {
            eiteVar.i("google_silentVerificationExtension");
        }
        if (this.g != null) {
            eiteVar.i("devicePublicKeyExtension");
        }
        if (this.h != null) {
            eiteVar.i("google_tunnelServerIdExtension");
        }
        if (this.i != null) {
            eiteVar.i("google_thirdPartyPaymentExtension");
        }
        if (this.j != null) {
            eiteVar.i("prfAlreadyHashed");
        }
        if (this.k != null) {
            eiteVar.i("txAuthSimple");
        }
        if (this.m != null) {
            eiteVar.i("payment");
        }
        return eiteVar.g();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticationExtensions)) {
            return false;
        }
        AuthenticationExtensions authenticationExtensions = (AuthenticationExtensions) obj;
        return arwb.b(this.a, authenticationExtensions.a) && arwb.b(this.b, authenticationExtensions.b) && arwb.b(this.c, authenticationExtensions.c) && arwb.b(this.d, authenticationExtensions.d) && arwb.b(this.e, authenticationExtensions.e) && arwb.b(this.f, authenticationExtensions.f) && arwb.b(this.g, authenticationExtensions.g) && arwb.b(this.h, authenticationExtensions.h) && arwb.b(this.i, authenticationExtensions.i) && arwb.b(this.j, authenticationExtensions.j) && arwb.b(this.k, authenticationExtensions.k) && arwb.b(this.l, authenticationExtensions.l) && arwb.b(this.m, authenticationExtensions.m);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m});
    }

    public final String toString() {
        PaymentExtension paymentExtension = this.m;
        SimpleTransactionAuthorizationExtension simpleTransactionAuthorizationExtension = this.k;
        PrfExtension prfExtension = this.j;
        GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension = this.i;
        GoogleTunnelServerIdExtension googleTunnelServerIdExtension = this.h;
        DevicePublicKeyExtension devicePublicKeyExtension = this.g;
        GoogleSilentVerificationExtension googleSilentVerificationExtension = this.f;
        GoogleSessionIdExtension googleSessionIdExtension = this.e;
        GoogleMultiAssertionExtension googleMultiAssertionExtension = this.d;
        UserVerificationMethodExtension userVerificationMethodExtension = this.c;
        CableAuthenticationExtension cableAuthenticationExtension = this.b;
        return "AuthenticationExtensions{\n fidoAppIdExtension=" + String.valueOf(this.a) + ", \n cableAuthenticationExtension=" + String.valueOf(cableAuthenticationExtension) + ", \n userVerificationMethodExtension=" + String.valueOf(userVerificationMethodExtension) + ", \n googleMultiAssertionExtension=" + String.valueOf(googleMultiAssertionExtension) + ", \n googleSessionIdExtension=" + String.valueOf(googleSessionIdExtension) + ", \n googleSilentVerificationExtension=" + String.valueOf(googleSilentVerificationExtension) + ", \n devicePublicKeyExtension=" + String.valueOf(devicePublicKeyExtension) + ", \n googleTunnelServerIdExtension=" + String.valueOf(googleTunnelServerIdExtension) + ", \n googleThirdPartyPaymentExtension=" + String.valueOf(googleThirdPartyPaymentExtension) + ", \n prfExtension=" + String.valueOf(prfExtension) + ", \n simpleTransactionAuthorizationExtension=" + String.valueOf(simpleTransactionAuthorizationExtension) + ", \n paymentExtension=" + String.valueOf(paymentExtension) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        FidoAppIdExtension fidoAppIdExtension = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 2, fidoAppIdExtension, i, false);
        arxc.t(parcel, 3, this.b, i, false);
        arxc.t(parcel, 4, this.c, i, false);
        arxc.t(parcel, 5, this.d, i, false);
        arxc.t(parcel, 6, this.e, i, false);
        arxc.t(parcel, 7, this.f, i, false);
        arxc.t(parcel, 8, this.g, i, false);
        arxc.t(parcel, 9, this.h, i, false);
        arxc.t(parcel, 10, this.i, i, false);
        arxc.t(parcel, 11, this.j, i, false);
        arxc.t(parcel, 12, this.k, i, false);
        arxc.t(parcel, 13, this.l, i, false);
        arxc.t(parcel, 14, this.m, i, false);
        arxc.c(parcel, a);
    }
}
