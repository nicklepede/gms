package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.czor;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class TaskEntity extends AbstractSafeParcelable implements Task {
    public static final Parcelable.Creator CREATOR = new czor();
    public final TaskIdEntity a;
    public final Integer b;
    public final String c;
    public final Long d;
    public final Long e;
    public final Boolean f;
    public final Boolean g;
    public final Boolean h;
    public final Boolean i;
    public final Long j;
    public final DateTimeEntity k;
    public final DateTimeEntity l;
    public final LocationEntity m;
    public final LocationGroupEntity n;
    public final Long o;
    public final byte[] p;
    public final RecurrenceInfoEntity q;
    public final byte[] r;
    public final Integer s;
    public final ExternalApplicationLinkEntity t;
    public final Long u;
    public final Long v;

    public TaskEntity(TaskIdEntity taskIdEntity, Integer num, String str, Long l, Long l2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Long l3, DateTimeEntity dateTimeEntity, DateTimeEntity dateTimeEntity2, LocationEntity locationEntity, LocationGroupEntity locationGroupEntity, Long l4, byte[] bArr, RecurrenceInfoEntity recurrenceInfoEntity, byte[] bArr2, Integer num2, ExternalApplicationLinkEntity externalApplicationLinkEntity, Long l5, Long l6) {
        this.a = taskIdEntity;
        this.b = num;
        this.c = str;
        this.d = l;
        this.e = l2;
        this.f = bool;
        this.g = bool2;
        this.h = bool3;
        this.i = bool4;
        this.j = l3;
        this.k = dateTimeEntity;
        this.l = dateTimeEntity2;
        this.m = locationEntity;
        this.n = locationGroupEntity;
        this.o = l4;
        this.p = bArr;
        this.q = recurrenceInfoEntity;
        this.r = bArr2;
        this.s = num2;
        this.t = externalApplicationLinkEntity;
        this.u = l5;
        this.v = l6;
    }

    public static int b(Task task) {
        return Arrays.hashCode(new Object[]{task.h(), task.K(), task.R(), task.M(), task.L(), task.i(), task.j(), task.k(), task.I(), task.Q(), task.a(), task.c(), task.e(), task.f(), task.P(), task.T(), task.g(), task.S(), task.J(), task.d(), task.O()});
    }

    public static boolean m(Task task, Task task2) {
        return atyq.b(task.h(), task2.h()) && atyq.b(task.K(), task2.K()) && atyq.b(task.R(), task2.R()) && atyq.b(task.M(), task2.M()) && atyq.b(task.L(), task2.L()) && atyq.b(task.i(), task2.i()) && atyq.b(task.j(), task2.j()) && atyq.b(task.k(), task2.k()) && atyq.b(task.I(), task2.I()) && atyq.b(task.Q(), task2.Q()) && atyq.b(task.a(), task2.a()) && atyq.b(task.c(), task2.c()) && atyq.b(task.e(), task2.e()) && atyq.b(task.f(), task2.f()) && atyq.b(task.P(), task2.P()) && Arrays.equals(task.T(), task2.T()) && atyq.b(task.g(), task2.g()) && atyq.b(task.S(), task2.S()) && atyq.b(task.J(), task2.J()) && atyq.b(task.d(), task2.d()) && atyq.b(task.O(), task2.O());
    }

    @Override // com.google.android.gms.reminders.model.Task
    public final Boolean I() {
        return this.i;
    }

    @Override // com.google.android.gms.reminders.model.Task
    public final Integer J() {
        return this.s;
    }

    @Override // com.google.android.gms.reminders.model.Task
    public final Integer K() {
        return this.b;
    }

    @Override // com.google.android.gms.reminders.model.Task
    public final Long L() {
        return this.e;
    }

    @Override // com.google.android.gms.reminders.model.Task
    public final Long M() {
        return this.d;
    }

    @Override // com.google.android.gms.reminders.model.Task
    public final Long N() {
        return this.v;
    }

    @Override // com.google.android.gms.reminders.model.Task
    public final Long O() {
        return this.u;
    }

    @Override // com.google.android.gms.reminders.model.Task
    public final Long P() {
        return this.o;
    }

    @Override // com.google.android.gms.reminders.model.Task
    public final Long Q() {
        return this.j;
    }

    @Override // com.google.android.gms.reminders.model.Task
    public final String R() {
        return this.c;
    }

    @Override // com.google.android.gms.reminders.model.Task
    public final byte[] S() {
        return this.r;
    }

    @Override // com.google.android.gms.reminders.model.Task
    public final byte[] T() {
        return this.p;
    }

    @Override // com.google.android.gms.reminders.model.Task
    public final DateTime a() {
        return this.k;
    }

    @Override // com.google.android.gms.reminders.model.Task
    public final DateTime c() {
        return this.l;
    }

    @Override // com.google.android.gms.reminders.model.Task
    public final ExternalApplicationLink d() {
        return this.t;
    }

    @Override // com.google.android.gms.reminders.model.Task
    public final Location e() {
        return this.m;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Task)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return m(this, (Task) obj);
    }

    @Override // com.google.android.gms.reminders.model.Task
    public final LocationGroup f() {
        return this.n;
    }

    @Override // com.google.android.gms.reminders.model.Task
    public final RecurrenceInfo g() {
        return this.q;
    }

    @Override // com.google.android.gms.reminders.model.Task
    public final TaskId h() {
        return this.a;
    }

    public final int hashCode() {
        return b(this);
    }

    @Override // com.google.android.gms.reminders.model.Task
    public final Boolean i() {
        return this.f;
    }

    @Override // com.google.android.gms.reminders.model.Task
    public final Boolean j() {
        return this.g;
    }

    @Override // com.google.android.gms.reminders.model.Task
    public final Boolean k() {
        return this.h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        czor.a(this, parcel, i);
    }

    public TaskEntity(Task task) {
        this(task.h(), task.K(), task.R(), task.M(), task.L(), task.i(), task.j(), task.k(), task.I(), task.Q(), task.a(), task.c(), task.e(), task.f(), task.P(), task.T(), task.g(), task.S(), task.J(), task.d(), task.O(), task.N(), false);
    }

    @Override // defpackage.atqs
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }

    public TaskEntity(TaskId taskId, Integer num, String str, Long l, Long l2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Long l3, DateTime dateTime, DateTime dateTime2, Location location, LocationGroup locationGroup, Long l4, byte[] bArr, RecurrenceInfo recurrenceInfo, byte[] bArr2, Integer num2, ExternalApplicationLink externalApplicationLink, Long l5, Long l6, boolean z) {
        this.b = num;
        this.c = str;
        this.d = l;
        this.e = l2;
        this.f = bool;
        this.g = bool2;
        this.h = bool3;
        this.i = bool4;
        this.j = l3;
        this.o = l4;
        this.p = bArr;
        this.r = bArr2;
        this.s = num2;
        this.u = l5;
        this.v = l6;
        if (z) {
            this.a = (TaskIdEntity) taskId;
            this.k = (DateTimeEntity) dateTime;
            this.l = (DateTimeEntity) dateTime2;
            this.m = (LocationEntity) location;
            this.n = (LocationGroupEntity) locationGroup;
            this.q = (RecurrenceInfoEntity) recurrenceInfo;
            this.t = (ExternalApplicationLinkEntity) externalApplicationLink;
            return;
        }
        this.a = taskId == null ? null : new TaskIdEntity(taskId);
        this.k = dateTime == null ? null : new DateTimeEntity(dateTime);
        this.l = dateTime2 == null ? null : new DateTimeEntity(dateTime2);
        this.m = location == null ? null : new LocationEntity(location);
        this.n = locationGroup == null ? null : new LocationGroupEntity(locationGroup);
        this.q = recurrenceInfo == null ? null : new RecurrenceInfoEntity(recurrenceInfo);
        this.t = externalApplicationLink != null ? new ExternalApplicationLinkEntity(externalApplicationLink) : null;
    }
}
