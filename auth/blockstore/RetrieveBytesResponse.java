package com.google.android.gms.auth.blockstore;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abxn;
import defpackage.abze;
import defpackage.atzr;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class RetrieveBytesResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new abze();

    @Deprecated
    public final Bundle a;
    public final List b;
    private final Map c;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class BlockstoreData extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new abxn();
        public final byte[] a;
        public final String b;

        public BlockstoreData(byte[] bArr, String str) {
            this.a = bArr;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof BlockstoreData)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            return Arrays.equals(this.a, ((BlockstoreData) obj).a);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a))});
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            byte[] bArr = this.a;
            int a = atzr.a(parcel);
            atzr.i(parcel, 1, bArr, false);
            atzr.v(parcel, 2, this.b, false);
            atzr.c(parcel, a);
        }
    }

    public RetrieveBytesResponse(Bundle bundle, List list) {
        this.a = bundle;
        this.b = list;
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BlockstoreData blockstoreData = (BlockstoreData) it.next();
            hashMap.put(blockstoreData.b, blockstoreData);
        }
        this.c = hashMap;
    }

    public final Map a() {
        return DesugarCollections.unmodifiableMap(this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = this.a;
        int a = atzr.a(parcel);
        atzr.g(parcel, 1, bundle, false);
        atzr.y(parcel, 2, this.b, false);
        atzr.c(parcel, a);
    }
}
