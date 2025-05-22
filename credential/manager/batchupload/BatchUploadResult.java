package com.google.android.gms.credential.manager.batchupload;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.awbg;
import defpackage.awbh;
import defpackage.awbi;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public abstract class BatchUploadResult implements Parcelable {

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public final class Conflict extends BatchUploadResult {
        public static final Parcelable.Creator CREATOR = new awbg();
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
            fxxm.f(parcel, "dest");
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.c);
        }

        public Conflict() {
            this(0, 0, 0);
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public final class Error extends BatchUploadResult {
        public static final Error a = new Error();
        public static final Parcelable.Creator CREATOR = new awbh();

        private Error() {
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
    public final class Success extends BatchUploadResult {
        public static final Parcelable.Creator CREATOR = new awbi();
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
            fxxm.f(parcel, "dest");
            parcel.writeInt(this.a);
        }

        public Success() {
            this(0);
        }
    }
}
