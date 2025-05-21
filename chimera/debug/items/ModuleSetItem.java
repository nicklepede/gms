package com.google.android.gms.chimera.debug.items;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.chimera.debug.items.ModuleSetItem;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aoja;
import defpackage.arxc;
import defpackage.fuyg;
import defpackage.fvaq;
import defpackage.fvbo;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class ModuleSetItem extends AbstractSafeParcelable implements ReflectedParcelable, Comparable {
    public static final Parcelable.Creator CREATOR = new aoja();
    public final int a;
    public final String b;
    public final long c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final List g;

    public ModuleSetItem(int i, String str, long j, String str2, boolean z, boolean z2, List list) {
        fvbo.f(str, "moduleSetId");
        fvbo.f(str2, "status");
        fvbo.f(list, "enabledFeatures");
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
        fvbo.f(moduleSetItem, "other");
        return fuyg.b(this, moduleSetItem, new fvaq[]{new fvaq() { // from class: aoiy
            @Override // defpackage.fvaq
            public final Object a(Object obj2) {
                ModuleSetItem moduleSetItem2 = (ModuleSetItem) obj2;
                fvbo.f(moduleSetItem2, "it");
                return moduleSetItem2.b;
            }
        }, new fvaq() { // from class: aoiz
            @Override // defpackage.fvaq
            public final Object a(Object obj2) {
                ModuleSetItem moduleSetItem2 = (ModuleSetItem) obj2;
                fvbo.f(moduleSetItem2, "it");
                return Long.valueOf(moduleSetItem2.c);
            }
        }});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fvbo.f(parcel, "out");
        int i2 = this.a;
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, i2);
        arxc.v(parcel, 2, this.b, false);
        arxc.q(parcel, 3, this.c);
        arxc.v(parcel, 4, this.d, false);
        arxc.e(parcel, 5, this.e);
        arxc.e(parcel, 6, this.f);
        arxc.x(parcel, 7, this.g, false);
        arxc.c(parcel, a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ModuleSetItem(String str, long j, String str2, boolean z, boolean z2, List list) {
        this(1, str, j, str2, z, z2, list);
        fvbo.f(str, "moduleSetId");
        fvbo.f(list, "enabledFeatures");
    }
}
