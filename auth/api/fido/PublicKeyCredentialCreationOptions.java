package com.google.android.gms.auth.api.fido;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity;
import com.google.android.gms.fido.fido2.api.common.TokenBinding;
import defpackage.arwb;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.asnj;
import defpackage.eitj;
import defpackage.feay;
import defpackage.zaq;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class PublicKeyCredentialCreationOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new zaq();
    public final PublicKeyCredentialRpEntity a;
    public final PublicKeyCredentialUserEntity b;
    public final feay c;
    public final eitj d;
    public final Double e;
    public final eitj f;
    public final AuthenticatorSelectionCriteria g;
    public final TokenBinding h;
    public final AttestationConveyancePreference i;
    public final AuthenticationExtensions j;
    public final eitj k;

    public PublicKeyCredentialCreationOptions(PublicKeyCredentialRpEntity publicKeyCredentialRpEntity, PublicKeyCredentialUserEntity publicKeyCredentialUserEntity, feay feayVar, List list, Double d, List list2, AuthenticatorSelectionCriteria authenticatorSelectionCriteria, TokenBinding tokenBinding, AttestationConveyancePreference attestationConveyancePreference, AuthenticationExtensions authenticationExtensions, List list3) {
        arwm.t(publicKeyCredentialRpEntity, "relying party entity shouldn't be null");
        this.a = publicKeyCredentialRpEntity;
        arwm.t(publicKeyCredentialUserEntity, "user entity shouldn't be null");
        this.b = publicKeyCredentialUserEntity;
        this.c = feayVar;
        arwm.t(list, "parameters shouldn't be null");
        this.d = eitj.i(list);
        this.e = d;
        this.f = list2 == null ? null : eitj.i(list2);
        this.g = authenticatorSelectionCriteria;
        this.h = tokenBinding;
        this.i = attestationConveyancePreference;
        this.j = authenticationExtensions;
        this.k = list3 != null ? eitj.i(list3) : null;
    }

    public final String a() {
        AttestationConveyancePreference attestationConveyancePreference = this.i;
        if (attestationConveyancePreference == null) {
            return null;
        }
        return attestationConveyancePreference.d;
    }

    public final boolean equals(Object obj) {
        eitj eitjVar;
        eitj eitjVar2;
        eitj eitjVar3;
        if (!(obj instanceof PublicKeyCredentialCreationOptions)) {
            return false;
        }
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) obj;
        if (arwb.b(this.a, publicKeyCredentialCreationOptions.a) && arwb.b(this.b, publicKeyCredentialCreationOptions.b) && arwb.b(this.c, publicKeyCredentialCreationOptions.c) && arwb.b(this.e, publicKeyCredentialCreationOptions.e)) {
            eitj eitjVar4 = this.d;
            eitj eitjVar5 = publicKeyCredentialCreationOptions.d;
            if (eitjVar4.containsAll(eitjVar5) && eitjVar5.containsAll(eitjVar4) && ((((eitjVar = this.f) == null && publicKeyCredentialCreationOptions.f == null) || (eitjVar != null && (eitjVar2 = publicKeyCredentialCreationOptions.f) != null && eitjVar.containsAll(eitjVar2) && eitjVar2.containsAll(eitjVar))) && arwb.b(this.g, publicKeyCredentialCreationOptions.g) && arwb.b(this.h, publicKeyCredentialCreationOptions.h) && arwb.b(this.i, publicKeyCredentialCreationOptions.i) && arwb.b(this.j, publicKeyCredentialCreationOptions.j))) {
                eitj eitjVar6 = this.k;
                if (eitjVar6 == null && publicKeyCredentialCreationOptions.k == null) {
                    return true;
                }
                return eitjVar6 != null && (eitjVar3 = publicKeyCredentialCreationOptions.k) != null && eitjVar6.containsAll(eitjVar3) && eitjVar3.containsAll(eitjVar6);
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k});
    }

    public final String toString() {
        return String.format(Locale.US, "PublicKeyCredentialCreationOptions: {\nrp: %s\nuser: %s\nchallenge: %s\ntimeoutSeconds: %s\nparameters: %s\nexcludeList: %s\nauthenticatorSelection: %s\ntokenBinding: %s\nattestationConveyancePreference: %s\nauthenticationExtensions :%s\nattestationFormats: %s}", this.a, this.b, asnj.c(this.c.M()), this.e, this.d, this.f, this.g, this.h, a(), this.j, this.k);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 2, publicKeyCredentialRpEntity, i, false);
        arxc.t(parcel, 3, this.b, i, false);
        arxc.i(parcel, 4, this.c.M(), false);
        arxc.y(parcel, 5, this.d, false);
        arxc.B(parcel, 6, this.e);
        arxc.y(parcel, 7, this.f, false);
        arxc.t(parcel, 8, this.g, i, false);
        arxc.t(parcel, 9, this.h, i, false);
        arxc.v(parcel, 10, a(), false);
        arxc.t(parcel, 11, this.j, i, false);
        arxc.x(parcel, 12, this.k, false);
        arxc.c(parcel, a);
    }
}
