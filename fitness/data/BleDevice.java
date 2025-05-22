package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.bihl;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@Deprecated
/* loaded from: classes4.dex */
public class BleDevice extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new bihl();
    public final String a;
    public final String b;
    public final List c;
    public final List d;

    public BleDevice(String str, String str2, List list, List list2) {
        this.a = str;
        this.b = str2;
        this.c = DesugarCollections.unmodifiableList(list);
        this.d = DesugarCollections.unmodifiableList(list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BleDevice)) {
            return false;
        }
        BleDevice bleDevice = (BleDevice) obj;
        return this.b.equals(bleDevice.b) && this.a.equals(bleDevice.a) && new HashSet(this.c).equals(new HashSet(bleDevice.c)) && new HashSet(this.d).equals(new HashSet(bleDevice.d));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a, this.c, this.d});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("name", this.b, arrayList);
        atyp.b("address", this.a, arrayList);
        atyp.b("dataTypes", this.d, arrayList);
        atyp.b("supportedProfiles", this.c, arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.x(parcel, 3, this.c, false);
        atzr.y(parcel, 4, this.d, false);
        atzr.c(parcel, a);
    }

    public BleDevice(String str, String str2, Set set, Set set2) {
        atzb.s(str);
        this.a = str;
        atzb.s(str2);
        this.b = str2;
        atzb.s(set2);
        this.d = new ArrayList(set2);
        atzb.s(set);
        this.c = new ArrayList(set);
    }
}
