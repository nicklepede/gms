package com.google.android.gms.kids.libs.webview;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bphe;
import defpackage.bphf;
import defpackage.bphg;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public abstract class BaseWebViewViewModel$AuthState implements Parcelable {

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public final class Authenticated extends BaseWebViewViewModel$AuthState {
        public static final Parcelable.Creator CREATOR = new bphe();
        public final Account a;

        public Authenticated(Account account) {
            fvbo.f(account, "account");
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
            return (obj instanceof Authenticated) && fvbo.n(this.a, ((Authenticated) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Authenticated(account=" + this.a + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            fvbo.f(parcel, "dest");
            parcel.writeParcelable(this.a, i);
        }
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public final class Initializing extends BaseWebViewViewModel$AuthState {
        public static final Initializing a = new Initializing();
        public static final Parcelable.Creator CREATOR = new bphf();

        private Initializing() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            fvbo.f(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public final class Unauthenticated extends BaseWebViewViewModel$AuthState {
        public static final Unauthenticated a = new Unauthenticated();
        public static final Parcelable.Creator CREATOR = new bphg();

        private Unauthenticated() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            fvbo.f(parcel, "dest");
            parcel.writeInt(1);
        }
    }
}
