package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.czob;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class CustomizedSnoozePresetEntity extends AbstractSafeParcelable implements CustomizedSnoozePreset {
    public static final Parcelable.Creator CREATOR = new czob();
    public final TimeEntity a;
    public final TimeEntity b;
    public final TimeEntity c;

    public CustomizedSnoozePresetEntity(Time time, Time time2, Time time3) {
        this.a = (TimeEntity) time;
        this.b = (TimeEntity) time2;
        this.c = (TimeEntity) time3;
    }

    @Override // com.google.android.gms.reminders.model.CustomizedSnoozePreset
    public final Time a() {
        return this.b;
    }

    @Override // com.google.android.gms.reminders.model.CustomizedSnoozePreset
    public final Time b() {
        return this.c;
    }

    @Override // com.google.android.gms.reminders.model.CustomizedSnoozePreset
    public final Time c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CustomizedSnoozePreset)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        CustomizedSnoozePreset customizedSnoozePreset = (CustomizedSnoozePreset) obj;
        return atyq.b(c(), customizedSnoozePreset.c()) && atyq.b(a(), customizedSnoozePreset.a()) && atyq.b(b(), customizedSnoozePreset.b());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{c(), a(), b()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        TimeEntity timeEntity = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 2, timeEntity, i, false);
        atzr.t(parcel, 3, this.b, i, false);
        atzr.t(parcel, 4, this.c, i, false);
        atzr.c(parcel, a);
    }

    public CustomizedSnoozePresetEntity(TimeEntity timeEntity, TimeEntity timeEntity2, TimeEntity timeEntity3) {
        this.a = timeEntity;
        this.b = timeEntity2;
        this.c = timeEntity3;
    }

    @Override // defpackage.atqs
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
