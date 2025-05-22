package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abcc;
import defpackage.abcr;
import defpackage.abcy;
import defpackage.abcz;
import defpackage.abda;
import defpackage.atyq;
import defpackage.atzb;
import defpackage.atzr;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@Deprecated
/* loaded from: classes2.dex */
public final class BeginSignInRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new abcc();
    public final PasswordRequestOptions a;
    public final GoogleIdTokenRequestOptions b;
    public final String c;
    public final boolean d;
    public final int e;
    public final PasskeysRequestOptions f;
    public final PasskeyJsonRequestOptions g;
    public final boolean h;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    @Deprecated
    public final class GoogleIdTokenRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new abcr();
        public final boolean a;
        public final String b;
        public final String c;
        public final boolean d;
        public final String e;
        public final List f;
        public final boolean g;

        public GoogleIdTokenRequestOptions(boolean z, String str, String str2, boolean z2, String str3, List list, boolean z3) {
            boolean z4 = true;
            if (z2 && z3) {
                z4 = false;
            }
            atzb.c(z4, "filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.");
            this.a = z;
            if (z) {
                atzb.t(str, "serverClientId must be provided if Google ID tokens are requested");
            }
            this.b = str;
            this.c = str2;
            this.d = z2;
            ArrayList arrayList = null;
            if (list != null && !list.isEmpty()) {
                arrayList = new ArrayList(list);
                Collections.sort(arrayList);
            }
            this.f = arrayList;
            this.e = str3;
            this.g = z3;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof GoogleIdTokenRequestOptions)) {
                return false;
            }
            GoogleIdTokenRequestOptions googleIdTokenRequestOptions = (GoogleIdTokenRequestOptions) obj;
            return this.a == googleIdTokenRequestOptions.a && atyq.b(this.b, googleIdTokenRequestOptions.b) && atyq.b(this.c, googleIdTokenRequestOptions.c) && this.d == googleIdTokenRequestOptions.d && atyq.b(this.e, googleIdTokenRequestOptions.e) && atyq.b(this.f, googleIdTokenRequestOptions.f) && this.g == googleIdTokenRequestOptions.g;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b, this.c, Boolean.valueOf(this.d), this.e, this.f, Boolean.valueOf(this.g)});
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            boolean z = this.a;
            int a = atzr.a(parcel);
            atzr.e(parcel, 1, z);
            atzr.v(parcel, 2, this.b, false);
            atzr.v(parcel, 3, this.c, false);
            atzr.e(parcel, 4, this.d);
            atzr.v(parcel, 5, this.e, false);
            atzr.x(parcel, 6, this.f, false);
            atzr.e(parcel, 7, this.g);
            atzr.c(parcel, a);
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    @Deprecated
    public final class PasskeyJsonRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new abcy();
        public final boolean a;
        public final String b;

        public PasskeyJsonRequestOptions(boolean z, String str) {
            if (z) {
                atzb.s(str);
            }
            this.a = z;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PasskeyJsonRequestOptions)) {
                return false;
            }
            PasskeyJsonRequestOptions passkeyJsonRequestOptions = (PasskeyJsonRequestOptions) obj;
            return this.a == passkeyJsonRequestOptions.a && atyq.b(this.b, passkeyJsonRequestOptions.b);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b});
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            boolean z = this.a;
            int a = atzr.a(parcel);
            atzr.e(parcel, 1, z);
            atzr.v(parcel, 2, this.b, false);
            atzr.c(parcel, a);
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    @Deprecated
    public final class PasskeysRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new abcz();
        public final boolean a;
        public final byte[] b;
        public final String c;

        public PasskeysRequestOptions(boolean z, byte[] bArr, String str) {
            if (z) {
                atzb.s(bArr);
                atzb.s(str);
            }
            this.a = z;
            this.b = bArr;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PasskeysRequestOptions)) {
                return false;
            }
            PasskeysRequestOptions passkeysRequestOptions = (PasskeysRequestOptions) obj;
            return this.a == passkeysRequestOptions.a && Arrays.equals(this.b, passkeysRequestOptions.b) && Objects.equals(this.c, passkeysRequestOptions.c);
        }

        public final int hashCode() {
            return (Objects.hash(Boolean.valueOf(this.a), this.c) * 31) + Arrays.hashCode(this.b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            boolean z = this.a;
            int a = atzr.a(parcel);
            atzr.e(parcel, 1, z);
            atzr.i(parcel, 2, this.b, false);
            atzr.v(parcel, 3, this.c, false);
            atzr.c(parcel, a);
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    @Deprecated
    public final class PasswordRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new abda();
        public final boolean a;

        public PasswordRequestOptions(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof PasswordRequestOptions) && this.a == ((PasswordRequestOptions) obj).a;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a)});
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            boolean z = this.a;
            int a = atzr.a(parcel);
            atzr.e(parcel, 1, z);
            atzr.c(parcel, a);
        }
    }

    public BeginSignInRequest(PasswordRequestOptions passwordRequestOptions, GoogleIdTokenRequestOptions googleIdTokenRequestOptions, String str, boolean z, int i, PasskeysRequestOptions passkeysRequestOptions, PasskeyJsonRequestOptions passkeyJsonRequestOptions, boolean z2) {
        atzb.s(passwordRequestOptions);
        this.a = passwordRequestOptions;
        atzb.s(googleIdTokenRequestOptions);
        this.b = googleIdTokenRequestOptions;
        this.c = str;
        this.d = z;
        this.e = i;
        this.f = passkeysRequestOptions == null ? new PasskeysRequestOptions(false, null, null) : passkeysRequestOptions;
        this.g = passkeyJsonRequestOptions == null ? new PasskeyJsonRequestOptions(false, null) : passkeyJsonRequestOptions;
        this.h = z2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BeginSignInRequest)) {
            return false;
        }
        BeginSignInRequest beginSignInRequest = (BeginSignInRequest) obj;
        return atyq.b(this.a, beginSignInRequest.a) && atyq.b(this.b, beginSignInRequest.b) && atyq.b(this.f, beginSignInRequest.f) && atyq.b(this.g, beginSignInRequest.g) && atyq.b(this.c, beginSignInRequest.c) && this.d == beginSignInRequest.d && this.e == beginSignInRequest.e && this.h == beginSignInRequest.h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.f, this.g, this.c, Boolean.valueOf(this.d), Integer.valueOf(this.e), Boolean.valueOf(this.h)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PasswordRequestOptions passwordRequestOptions = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, passwordRequestOptions, i, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.e(parcel, 4, this.d);
        atzr.o(parcel, 5, this.e);
        atzr.t(parcel, 6, this.f, i, false);
        atzr.t(parcel, 7, this.g, i, false);
        atzr.e(parcel, 8, this.h);
        atzr.c(parcel, a);
    }
}
