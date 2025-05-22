package com.google.android.gms.reminders.internal.ref;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.TaskId;
import com.google.android.gms.reminders.model.TaskIdEntity;
import defpackage.cznx;
import defpackage.czos;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class TaskIdRef extends cznx implements TaskId {
    public TaskIdRef(DataHolder dataHolder, int i, String str) {
        super(dataHolder, i, str);
    }

    @Override // com.google.android.gms.reminders.model.TaskId
    public final String a() {
        return r(p("client_assigned_id"));
    }

    @Override // com.google.android.gms.reminders.model.TaskId
    public final String c() {
        return r(p("client_assigned_thread_id"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.atql
    public final boolean equals(Object obj) {
        if (!(obj instanceof TaskId)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return TaskIdEntity.d(this, (TaskId) obj);
    }

    @Override // defpackage.atql
    public final int hashCode() {
        return TaskIdEntity.b(this);
    }

    @Override // defpackage.atql, defpackage.atqs
    public final /* synthetic */ Object l() {
        return new TaskIdEntity(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        czos.a(new TaskIdEntity(this), parcel);
    }
}
