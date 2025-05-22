package com.google.android.gms.kids.libs.webview;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.brou;
import defpackage.brov;
import defpackage.brow;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public abstract class BaseWebViewViewModel$AuthState implements Parcelable {

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public final class Authenticated extends BaseWebViewViewModel$AuthState {
        public static final Parcelable.Creator CREATOR = new brou();
        public final Account a;

        public Authenticated(Account account) {
            fxxm.f(account, "account");
            this.a = account;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Authenticated) && fxxm.n(this.a, ((Authenticated) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Authenticated(account=" + this.a + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            fxxm.f(parcel, "dest");
            parcel.writeParcelable(this.a, i);
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public final class Initializing extends BaseWebViewViewModel$AuthState {
        public static final Initializing a = new Initializing();
        public static final Parcelable.Creator CREATOR = new brov();

        private Initializing() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            fxxm.f(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public final class Unauthenticated extends BaseWebViewViewModel$AuthState {
        public static final Unauthenticated a = new Unauthenticated();
        public static final Parcelable.Creator CREATOR = new brow();

        private Unauthenticated() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            fxxm.f(parcel, "dest");
            parcel.writeInt(1);
        }
    }
}
