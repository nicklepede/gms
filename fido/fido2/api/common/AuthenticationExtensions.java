package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bdvq;
import defpackage.elgj;
import defpackage.elgo;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class AuthenticationExtensions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bdvq();
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

    public final elgo b() {
        int i = elgo.d;
        elgj elgjVar = new elgj();
        if (this.a != null) {
            elgjVar.i("fidoAppIdExtension");
        }
        if (this.c != null) {
            elgjVar.i("userVerificationMethodExtension");
        }
        if (this.b != null) {
            elgjVar.i("cableAuthenticationExtension");
        }
        if (this.d != null) {
            elgjVar.i("google_multiAssertionExtension");
        }
        if (this.e != null) {
            elgjVar.i("google_sessionIdExtension");
        }
        if (this.f != null) {
            elgjVar.i("google_silentVerificationExtension");
        }
        if (this.g != null) {
            elgjVar.i("devicePublicKeyExtension");
        }
        if (this.h != null) {
            elgjVar.i("google_tunnelServerIdExtension");
        }
        if (this.i != null) {
            elgjVar.i("google_thirdPartyPaymentExtension");
        }
        if (this.j != null) {
            elgjVar.i("prfAlreadyHashed");
        }
        if (this.k != null) {
            elgjVar.i("txAuthSimple");
        }
        if (this.m != null) {
            elgjVar.i("payment");
        }
        return elgjVar.g();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticationExtensions)) {
            return false;
        }
        AuthenticationExtensions authenticationExtensions = (AuthenticationExtensions) obj;
        return atyq.b(this.a, authenticationExtensions.a) && atyq.b(this.b, authenticationExtensions.b) && atyq.b(this.c, authenticationExtensions.c) && atyq.b(this.d, authenticationExtensions.d) && atyq.b(this.e, authenticationExtensions.e) && atyq.b(this.f, authenticationExtensions.f) && atyq.b(this.g, authenticationExtensions.g) && atyq.b(this.h, authenticationExtensions.h) && atyq.b(this.i, authenticationExtensions.i) && atyq.b(this.j, authenticationExtensions.j) && atyq.b(this.k, authenticationExtensions.k) && atyq.b(this.l, authenticationExtensions.l) && atyq.b(this.m, authenticationExtensions.m);
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
        int a = atzr.a(parcel);
        atzr.t(parcel, 2, fidoAppIdExtension, i, false);
        atzr.t(parcel, 3, this.b, i, false);
        atzr.t(parcel, 4, this.c, i, false);
        atzr.t(parcel, 5, this.d, i, false);
        atzr.t(parcel, 6, this.e, i, false);
        atzr.t(parcel, 7, this.f, i, false);
        atzr.t(parcel, 8, this.g, i, false);
        atzr.t(parcel, 9, this.h, i, false);
        atzr.t(parcel, 10, this.i, i, false);
        atzr.t(parcel, 11, this.j, i, false);
        atzr.t(parcel, 12, this.k, i, false);
        atzr.t(parcel, 13, this.l, i, false);
        atzr.t(parcel, 14, this.m, i, false);
        atzr.c(parcel, a);
    }
}
