package com.google.android.gms.auth.api.fido;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.TokenBinding;
import com.google.android.gms.fido.fido2.api.common.UserVerificationRequirement;
import defpackage.abaj;
import defpackage.atyq;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.aurd;
import defpackage.elgo;
import defpackage.fgpr;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class PublicKeyCredentialRequestOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new abaj();
    public final fgpr a;
    public final Double b;
    public final String c;
    public final elgo d;
    public final TokenBinding e;
    public final UserVerificationRequirement f;
    public final AuthenticationExtensions g;

    public PublicKeyCredentialRequestOptions(fgpr fgprVar, Double d, String str, List list, TokenBinding tokenBinding, UserVerificationRequirement userVerificationRequirement, AuthenticationExtensions authenticationExtensions) {
        this.a = fgprVar;
        this.b = d;
        atzb.q(str);
        this.c = str;
        this.d = list == null ? null : elgo.i(list);
        this.e = tokenBinding;
        this.f = userVerificationRequirement;
        this.g = authenticationExtensions;
    }

    public final boolean equals(Object obj) {
        elgo elgoVar;
        elgo elgoVar2;
        if (!(obj instanceof PublicKeyCredentialRequestOptions)) {
            return false;
        }
        PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = (PublicKeyCredentialRequestOptions) obj;
        return atyq.b(this.a, publicKeyCredentialRequestOptions.a) && atyq.b(this.b, publicKeyCredentialRequestOptions.b) && atyq.b(this.c, publicKeyCredentialRequestOptions.c) && (((elgoVar = this.d) == null && publicKeyCredentialRequestOptions.d == null) || (elgoVar != null && (elgoVar2 = publicKeyCredentialRequestOptions.d) != null && elgoVar.containsAll(elgoVar2) && elgoVar2.containsAll(elgoVar))) && atyq.b(this.e, publicKeyCredentialRequestOptions.e) && atyq.b(this.f, publicKeyCredentialRequestOptions.f) && atyq.b(this.g, publicKeyCredentialRequestOptions.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g});
    }

    public final String toString() {
        return String.format(Locale.US, "PublicKeyCredentialCreationOptions: {\nchallenge: %s\ntimeoutSeconds: %s\nrpId: %s\nallowList: %s\ntokenBinding: %s\nauthenticationExtensions :%s}", aurd.c(this.a.M()), this.b, this.c, this.d, this.e, this.g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fgpr fgprVar = this.a;
        int a = atzr.a(parcel);
        atzr.i(parcel, 2, fgprVar.M(), false);
        atzr.B(parcel, 3, this.b);
        atzr.v(parcel, 4, this.c, false);
        atzr.y(parcel, 5, this.d, false);
        atzr.t(parcel, 6, this.e, i, false);
        UserVerificationRequirement userVerificationRequirement = this.f;
        atzr.v(parcel, 7, userVerificationRequirement == null ? null : userVerificationRequirement.d, false);
        atzr.t(parcel, 8, this.g, i, false);
        atzr.c(parcel, a);
    }
}
