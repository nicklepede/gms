package com.google.android.gms.reminders.internal.ref;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.TaskId;
import com.google.android.gms.reminders.model.TaskIdEntity;
import defpackage.cxeb;
import defpackage.cxew;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class TaskIdRef extends cxeb implements TaskId {
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

    @Override // defpackage.arnw
    public final boolean equals(Object obj) {
        if (!(obj instanceof TaskId)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return TaskIdEntity.d(this, (TaskId) obj);
    }

    @Override // defpackage.arnw
    public final int hashCode() {
        return TaskIdEntity.b(this);
    }

    @Override // defpackage.arnw, defpackage.arod
    public final /* synthetic */ Object l() {
        return new TaskIdEntity(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        cxew.a(new TaskIdEntity(this), parcel);
    }
}
