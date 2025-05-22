package com.google.android.gms.romanesco.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.czzq;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class BackedUpContactsPerDeviceEntity extends AbstractSafeParcelable implements BackedUpContactsPerDevice {
    public static final Parcelable.Creator CREATOR = new czzq();
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

    @Override // com.google.android.gms.romanesco.protomodel.BackedUpContactsPerDevice
    public final DeviceVersion a() {
        return this.f;
    }

    @Override // com.google.android.gms.romanesco.protomodel.BackedUpContactsPerDevice
    public final Long b() {
        return this.b;
    }

    @Override // com.google.android.gms.romanesco.protomodel.BackedUpContactsPerDevice
    public final Long c() {
        return this.e;
    }

    @Override // com.google.android.gms.romanesco.protomodel.BackedUpContactsPerDevice
    public final Long d() {
        return this.d;
    }

    @Override // com.google.android.gms.romanesco.protomodel.BackedUpContactsPerDevice
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
        return atyq.b(f(), backedUpContactsPerDevice.f()) && atyq.b(b(), backedUpContactsPerDevice.b()) && atyq.b(g(), backedUpContactsPerDevice.g()) && atyq.b(e(), backedUpContactsPerDevice.e()) && atyq.b(d(), backedUpContactsPerDevice.d()) && atyq.b(c(), backedUpContactsPerDevice.c()) && atyq.b(a(), backedUpContactsPerDevice.a());
    }

    @Override // com.google.android.gms.romanesco.protomodel.BackedUpContactsPerDevice
    public final String f() {
        return this.a;
    }

    @Override // com.google.android.gms.romanesco.protomodel.BackedUpContactsPerDevice
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
        int a = atzr.a(parcel);
        atzr.v(parcel, 2, str, false);
        atzr.y(parcel, 3, g(), false);
        atzr.v(parcel, 4, this.c, false);
        atzr.I(parcel, 5, this.d);
        atzr.I(parcel, 6, this.e);
        atzr.I(parcel, 7, this.b);
        atzr.t(parcel, 8, this.f, i, false);
        atzr.c(parcel, a);
    }

    public BackedUpContactsPerDeviceEntity(String str, Long l, List list, String str2, Long l2, Long l3, DeviceVersion deviceVersion, boolean z) {
        this.a = str;
        this.b = l;
        this.c = str2;
        this.d = l2;
        this.e = l3;
        if (z) {
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
        } else {
            this.h = list;
            if (list != null) {
                this.g = new ArrayList(list.size());
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    SourceStats sourceStats = (SourceStats) it2.next();
                    this.g.add(new SourceStatsEntity(sourceStats.c(), sourceStats.a(), sourceStats.b()));
                }
            } else {
                this.g = null;
            }
            deviceVersion = deviceVersion != null ? new DeviceVersionEntity(deviceVersion.a()) : null;
        }
        this.f = (DeviceVersionEntity) deviceVersion;
    }

    @Override // defpackage.atqs
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
