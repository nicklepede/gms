package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cuge;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class BackedUpContactsPerDeviceEntity extends AbstractSafeParcelable implements BackedUpContactsPerDevice {
    public static final Parcelable.Creator CREATOR = new cuge();
    public final String a;
    public final Long b;
    public final String c;
    public final Long d;
    public final Long e;
    public final DeviceVersionEntity f;
    private final List g;
    private List h;

    public BackedUpContactsPerDeviceEntity(String str, Long l, List list, String str2, Long l2, Long l3, DeviceVersionEntity deviceVersionEntity) {
        this.a = str;
        this.b = l;
        this.g = list;
        this.c = str2;
        this.d = l2;
        this.e = l3;
        this.f = deviceVersionEntity;
    }

    @Override // com.google.android.gms.people.protomodel.BackedUpContactsPerDevice
    public final DeviceVersion a() {
        return this.f;
    }

    @Override // com.google.android.gms.people.protomodel.BackedUpContactsPerDevice
    public final Long b() {
        return this.b;
    }

    @Override // com.google.android.gms.people.protomodel.BackedUpContactsPerDevice
    public final Long c() {
        return this.e;
    }

    @Override // com.google.android.gms.people.protomodel.BackedUpContactsPerDevice
    public final Long d() {
        return this.d;
    }

    @Override // com.google.android.gms.people.protomodel.BackedUpContactsPerDevice
    public final String e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BackedUpContactsPerDevice)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        BackedUpContactsPerDevice backedUpContactsPerDevice = (BackedUpContactsPerDevice) obj;
        return arwb.b(f(), backedUpContactsPerDevice.f()) && arwb.b(b(), backedUpContactsPerDevice.b()) && arwb.b(g(), backedUpContactsPerDevice.g()) && arwb.b(e(), backedUpContactsPerDevice.e()) && arwb.b(d(), backedUpContactsPerDevice.d()) && arwb.b(c(), backedUpContactsPerDevice.c()) && arwb.b(a(), backedUpContactsPerDevice.a());
    }

    @Override // com.google.android.gms.people.protomodel.BackedUpContactsPerDevice
    public final String f() {
        return this.a;
    }

    @Override // com.google.android.gms.people.protomodel.BackedUpContactsPerDevice
    public final List g() {
        List list;
        if (this.h == null && (list = this.g) != null) {
            this.h = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.h.add((SourceStats) it.next());
            }
        }
        return this.h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{f(), b(), g(), e(), d(), c(), a()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 2, str, false);
        arxc.y(parcel, 3, g(), false);
        arxc.v(parcel, 4, this.c, false);
        arxc.I(parcel, 5, this.d);
        arxc.I(parcel, 6, this.e);
        arxc.I(parcel, 7, this.b);
        arxc.t(parcel, 8, this.f, i, false);
        arxc.c(parcel, a);
    }

    public BackedUpContactsPerDeviceEntity(String str, List list, String str2, Long l, Long l2) {
        this.a = str;
        this.b = null;
        this.c = str2;
        this.d = l;
        this.e = l2;
        this.h = list;
        if (list != null) {
            this.g = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.g.add((SourceStatsEntity) ((SourceStats) it.next()));
            }
        } else {
            this.g = null;
        }
        this.f = null;
    }

    @Override // defpackage.arod
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
