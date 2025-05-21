package com.google.android.gms.auth.api.fido;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.TokenBinding;
import com.google.android.gms.fido.fido2.api.common.UserVerificationRequirement;
import defpackage.arwb;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.asnj;
import defpackage.eitj;
import defpackage.feay;
import defpackage.zas;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class PublicKeyCredentialRequestOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new zas();
    public final feay a;
    public final Double b;
    public final String c;
    public final eitj d;
    public final TokenBinding e;
    public final UserVerificationRequirement f;
    public final AuthenticationExtensions g;

    public PublicKeyCredentialRequestOptions(feay feayVar, Double d, String str, List list, TokenBinding tokenBinding, UserVerificationRequirement userVerificationRequirement, AuthenticationExtensions authenticationExtensions) {
        this.a = feayVar;
        this.b = d;
        arwm.q(str);
        this.c = str;
        this.d = list == null ? null : eitj.i(list);
        this.e = tokenBinding;
        this.f = userVerificationRequirement;
        this.g = authenticationExtensions;
    }

    public final boolean equals(Object obj) {
        eitj eitjVar;
        eitj eitjVar2;
        if (!(obj instanceof PublicKeyCredentialRequestOptions)) {
            return false;
        }
        PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = (PublicKeyCredentialRequestOptions) obj;
        return arwb.b(this.a, publicKeyCredentialRequestOptions.a) && arwb.b(this.b, publicKeyCredentialRequestOptions.b) && arwb.b(this.c, publicKeyCredentialRequestOptions.c) && (((eitjVar = this.d) == null && publicKeyCredentialRequestOptions.d == null) || (eitjVar != null && (eitjVar2 = publicKeyCredentialRequestOptions.d) != null && eitjVar.containsAll(eitjVar2) && eitjVar2.containsAll(eitjVar))) && arwb.b(this.e, publicKeyCredentialRequestOptions.e) && arwb.b(this.f, publicKeyCredentialRequestOptions.f) && arwb.b(this.g, publicKeyCredentialRequestOptions.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g});
    }

    public final String toString() {
        return String.format(Locale.US, "PublicKeyCredentialCreationOptions: {\nchallenge: %s\ntimeoutSeconds: %s\nrpId: %s\nallowList: %s\ntokenBinding: %s\nauthenticationExtensions :%s}", asnj.c(this.a.M()), this.b, this.c, this.d, this.e, this.g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        feay feayVar = this.a;
        int a = arxc.a(parcel);
        arxc.i(parcel, 2, feayVar.M(), false);
        arxc.B(parcel, 3, this.b);
        arxc.v(parcel, 4, this.c, false);
        arxc.y(parcel, 5, this.d, false);
        arxc.t(parcel, 6, this.e, i, false);
        UserVerificationRequirement userVerificationRequirement = this.f;
        arxc.v(parcel, 7, userVerificationRequirement == null ? null : userVerificationRequirement.d, false);
        arxc.t(parcel, 8, this.g, i, false);
        arxc.c(parcel, a);
    }
}
