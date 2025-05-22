package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.czos;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class TaskIdEntity extends AbstractSafeParcelable implements TaskId {
    public static final Parcelable.Creator CREATOR = new czos();
    public final String a;
    public final String b;

    public TaskIdEntity(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static int b(TaskId taskId) {
        return Arrays.hashCode(new Object[]{taskId.a(), taskId.c()});
    }

    public static boolean d(TaskId taskId, TaskId taskId2) {
        return atyq.b(taskId.a(), taskId2.a()) && atyq.b(taskId.c(), taskId2.c());
    }

    @Override // com.google.android.gms.reminders.model.TaskId
    public final String a() {
        return this.a;
    }

    @Override // com.google.android.gms.reminders.model.TaskId
    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TaskId)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return d(this, (TaskId) obj);
    }

    public final int hashCode() {
        return b(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        czos.a(this, parcel);
    }

    public TaskIdEntity(TaskId taskId) {
        this(taskId.a(), taskId.c());
    }

    @Override // defpackage.atqs
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
