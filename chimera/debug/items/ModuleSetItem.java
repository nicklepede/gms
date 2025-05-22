package com.google.android.gms.chimera.debug.items;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.chimera.debug.items.ModuleSetItem;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aqkt;
import defpackage.atzr;
import defpackage.fxue;
import defpackage.fxwo;
import defpackage.fxxm;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class ModuleSetItem extends AbstractSafeParcelable implements ReflectedParcelable, Comparable {
    public static final Parcelable.Creator CREATOR = new aqkt();
    public final int a;
    public final String b;
    public final long c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final List g;

    public ModuleSetItem(int i, String str, long j, String str2, boolean z, boolean z2, List list) {
        fxxm.f(str, "moduleSetId");
        fxxm.f(str2, "status");
        fxxm.f(list, "enabledFeatures");
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = str2;
        this.e = z;
        this.f = z2;
        this.g = list;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        ModuleSetItem moduleSetItem = (ModuleSetItem) obj;
        fxxm.f(moduleSetItem, "other");
        return fxue.b(this, moduleSetItem, new fxwo[]{new fxwo() { // from class: aqkr
            @Override // defpackage.fxwo
            public final Object a(Object obj2) {
                ModuleSetItem moduleSetItem2 = (ModuleSetItem) obj2;
                fxxm.f(moduleSetItem2, "it");
                return moduleSetItem2.b;
            }
        }, new fxwo() { // from class: aqks
            @Override // defpackage.fxwo
            public final Object a(Object obj2) {
                ModuleSetItem moduleSetItem2 = (ModuleSetItem) obj2;
                fxxm.f(moduleSetItem2, "it");
                return Long.valueOf(moduleSetItem2.c);
            }
        }});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fxxm.f(parcel, "out");
        int i2 = this.a;
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, i2);
        atzr.v(parcel, 2, this.b, false);
        atzr.q(parcel, 3, this.c);
        atzr.v(parcel, 4, this.d, false);
        atzr.e(parcel, 5, this.e);
        atzr.e(parcel, 6, this.f);
        atzr.x(parcel, 7, this.g, false);
        atzr.c(parcel, a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ModuleSetItem(String str, long j, String str2, boolean z, boolean z2, List list) {
        this(1, str, j, str2, z, z2, list);
        fxxm.f(str, "moduleSetId");
        fxxm.f(list, "enabledFeatures");
    }
}
