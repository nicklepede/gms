package com.google.android.gms.credential.manager.batchupload;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.atxd;
import defpackage.atxe;
import defpackage.atxf;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public abstract class BatchUploadResult implements Parcelable {

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public final class Conflict extends BatchUploadResult {
        public static final Parcelable.Creator CREATOR = new atxd();
        private final int a;
        private final int b;
        private final int c;

        public Conflict(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Conflict)) {
                return false;
            }
            Conflict conflict = (Conflict) obj;
            return this.a == conflict.a && this.b == conflict.b && this.c == conflict.c;
        }

        public final int hashCode() {
            return (((this.a * 31) + this.b) * 31) + this.c;
        }

        public final String toString() {
            return "Conflict(nrOfConflict=" + this.a + ", nrOfConflictsKeptCurrentAccountVersion=" + this.b + ", nrOfConflictsKeptChosenAccountVersion=" + this.c + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            fvbo.f(parcel, "dest");
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.c);
        }

        public Conflict() {
            this(0, 0, 0);
        }
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public final class Error extends BatchUploadResult {
        public static final Error a = new Error();
        public static final Parcelable.Creator CREATOR = new atxe();

        private Error() {
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
    public final class Success extends BatchUploadResult {
        public static final Parcelable.Creator CREATOR = new atxf();
        private final int a;

        public Success(int i) {
            this.a = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && this.a == ((Success) obj).a;
        }

        public final int hashCode() {
            return this.a;
        }

        public final String toString() {
            return "Success(nrOfPasswordsMoved=" + this.a + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            fvbo.f(parcel, "dest");
            parcel.writeInt(this.a);
        }

        public Success() {
            this(0);
        }
    }
}
