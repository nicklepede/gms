package com.google.android.gms.nearby.fastpair.triangle;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.internal.NodeParcelable;
import defpackage.clbu;
import defpackage.ekvk;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class NodeHolder implements Parcelable {
    public static final Parcelable.Creator CREATOR = new clbu();
    public final String a;
    public final boolean b;

    public NodeHolder(NodeParcelable nodeParcelable) {
        this.a = nodeParcelable.a;
        this.b = nodeParcelable.d;
    }

    public static HashSet a(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(new NodeHolder((NodeParcelable) it.next()));
        }
        return hashSet;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NodeHolder) {
            NodeHolder nodeHolder = (NodeHolder) obj;
            if (Objects.equals(this.a, nodeHolder.a) && this.b == nodeHolder.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Boolean.valueOf(this.b));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeByte(this.b ? (byte) 1 : (byte) 0);
    }

    public NodeHolder(Parcel parcel) {
        this.a = ekvk.b(parcel.readString());
        this.b = parcel.readByte() != 0;
    }
}
