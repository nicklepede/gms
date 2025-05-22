package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.awareness.snapshot.internal.BeaconStateImpl;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ajhk;
import defpackage.atzr;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class SnapshotRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ajhk();
    public final int a;
    public final ArrayList b;
    public final int c;
    public long d;

    public SnapshotRequest() {
        this.a = 10005;
        this.b = null;
        this.c = 0;
        this.d = 0L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SnapshotRequest)) {
            return false;
        }
        SnapshotRequest snapshotRequest = (SnapshotRequest) obj;
        if (this.c != snapshotRequest.c || this.a != snapshotRequest.a) {
            return false;
        }
        ArrayList arrayList = snapshotRequest.b;
        ArrayList arrayList2 = this.b;
        if ((arrayList2 == null) ^ (arrayList == null)) {
            return false;
        }
        if (arrayList2 != null) {
            if (arrayList2.size() != arrayList.size()) {
                return false;
            }
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                boolean contains = arrayList.contains((BeaconStateImpl.TypeFilterImpl) arrayList2.get(i));
                i++;
                if (!contains) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i;
        ArrayList arrayList = this.b;
        if (arrayList != null) {
            int size = arrayList.size();
            i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                i += ((BeaconStateImpl.TypeFilterImpl) arrayList.get(i2)).hashCode() * 13;
            }
        } else {
            i = 0;
        }
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(i), Integer.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = atzr.a(parcel);
        atzr.o(parcel, 2, i2);
        atzr.y(parcel, 3, this.b, false);
        atzr.o(parcel, 4, this.c);
        atzr.c(parcel, a);
    }

    public SnapshotRequest(int i, ArrayList arrayList, int i2) {
        this.a = i;
        this.b = arrayList;
        this.c = i2;
        this.d = 0L;
    }
}
