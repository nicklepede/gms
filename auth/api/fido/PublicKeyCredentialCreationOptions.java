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
import defpackage.abah;
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
public class PublicKeyCredentialCreationOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new abah();
    public final PublicKeyCredentialRpEntity a;
    public final PublicKeyCredentialUserEntity b;
    public final fgpr c;
    public final elgo d;
    public final Double e;
    public final elgo f;
    public final AuthenticatorSelectionCriteria g;
    public final TokenBinding h;
    public final AttestationConveyancePreference i;
    public final AuthenticationExtensions j;
    public final elgo k;

    public PublicKeyCredentialCreationOptions(PublicKeyCredentialRpEntity publicKeyCredentialRpEntity, PublicKeyCredentialUserEntity publicKeyCredentialUserEntity, fgpr fgprVar, List list, Double d, List list2, AuthenticatorSelectionCriteria authenticatorSelectionCriteria, TokenBinding tokenBinding, AttestationConveyancePreference attestationConveyancePreference, AuthenticationExtensions authenticationExtensions, List list3) {
        atzb.t(publicKeyCredentialRpEntity, "relying party entity shouldn't be null");
        this.a = publicKeyCredentialRpEntity;
        atzb.t(publicKeyCredentialUserEntity, "user entity shouldn't be null");
        this.b = publicKeyCredentialUserEntity;
        this.c = fgprVar;
        atzb.t(list, "parameters shouldn't be null");
        this.d = elgo.i(list);
        this.e = d;
        this.f = list2 == null ? null : elgo.i(list2);
        this.g = authenticatorSelectionCriteria;
        this.h = tokenBinding;
        this.i = attestationConveyancePreference;
        this.j = authenticationExtensions;
        this.k = list3 != null ? elgo.i(list3) : null;
    }

    public final String a() {
        AttestationConveyancePreference attestationConveyancePreference = this.i;
        if (attestationConveyancePreference == null) {
            return null;
        }
        return attestationConveyancePreference.d;
    }

    public final boolean equals(Object obj) {
        elgo elgoVar;
        elgo elgoVar2;
        elgo elgoVar3;
        if (!(obj instanceof PublicKeyCredentialCreationOptions)) {
            return false;
        }
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) obj;
        if (atyq.b(this.a, publicKeyCredentialCreationOptions.a) && atyq.b(this.b, publicKeyCredentialCreationOptions.b) && atyq.b(this.c, publicKeyCredentialCreationOptions.c) && atyq.b(this.e, publicKeyCredentialCreationOptions.e)) {
            elgo elgoVar4 = this.d;
            elgo elgoVar5 = publicKeyCredentialCreationOptions.d;
            if (elgoVar4.containsAll(elgoVar5) && elgoVar5.containsAll(elgoVar4) && ((((elgoVar = this.f) == null && publicKeyCredentialCreationOptions.f == null) || (elgoVar != null && (elgoVar2 = publicKeyCredentialCreationOptions.f) != null && elgoVar.containsAll(elgoVar2) && elgoVar2.containsAll(elgoVar))) && atyq.b(this.g, publicKeyCredentialCreationOptions.g) && atyq.b(this.h, publicKeyCredentialCreationOptions.h) && atyq.b(this.i, publicKeyCredentialCreationOptions.i) && atyq.b(this.j, publicKeyCredentialCreationOptions.j))) {
                elgo elgoVar6 = this.k;
                if (elgoVar6 == null && publicKeyCredentialCreationOptions.k == null) {
                    return true;
                }
                return elgoVar6 != null && (elgoVar3 = publicKeyCredentialCreationOptions.k) != null && elgoVar6.containsAll(elgoVar3) && elgoVar3.containsAll(elgoVar6);
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k});
    }

    public final String toString() {
        return String.format(Locale.US, "PublicKeyCredentialCreationOptions: {\nrp: %s\nuser: %s\nchallenge: %s\ntimeoutSeconds: %s\nparameters: %s\nexcludeList: %s\nauthenticatorSelection: %s\ntokenBinding: %s\nattestationConveyancePreference: %s\nauthenticationExtensions :%s\nattestationFormats: %s}", this.a, this.b, aurd.c(this.c.M()), this.e, this.d, this.f, this.g, this.h, a(), this.j, this.k);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 2, publicKeyCredentialRpEntity, i, false);
        atzr.t(parcel, 3, this.b, i, false);
        atzr.i(parcel, 4, this.c.M(), false);
        atzr.y(parcel, 5, this.d, false);
        atzr.B(parcel, 6, this.e);
        atzr.y(parcel, 7, this.f, false);
        atzr.t(parcel, 8, this.g, i, false);
        atzr.t(parcel, 9, this.h, i, false);
        atzr.v(parcel, 10, a(), false);
        atzr.t(parcel, 11, this.j, i, false);
        atzr.x(parcel, 12, this.k, false);
        atzr.c(parcel, a);
    }
}
