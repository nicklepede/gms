package com.google.android.gms.thunderbird.worker;

import android.location.Location;
import com.google.android.gms.libs.platform.GmsAlarmManagerCompat$OnAlarmListener;
import com.google.android.gms.thunderbird.state.ActivationInfo;
import com.google.android.gms.thunderbird.state.DeviceState;
import com.google.android.gms.thunderbird.state.EmergencyInfo;
import com.google.android.gms.thunderbird.worker.ConfigWorker;
import defpackage.aslq;
import defpackage.asot;
import defpackage.bry;
import defpackage.bxbu;
import defpackage.bzim;
import defpackage.dfvc;
import defpackage.dfzr;
import defpackage.dgao;
import defpackage.dgbw;
import defpackage.dgbx;
import defpackage.dgcl;
import defpackage.dgcm;
import defpackage.dgcs;
import defpackage.eigb;
import defpackage.eiho;
import defpackage.eiid;
import defpackage.eiig;
import defpackage.eitj;
import defpackage.eivv;
import defpackage.ejfh;
import defpackage.ejhf;
import defpackage.ensj;
import defpackage.enss;
import defpackage.ensu;
import defpackage.fsnb;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class ConfigWorker extends dgcs implements GmsAlarmManagerCompat$OnAlarmListener, bzim {
    public final dfvc a;
    public final Collection b;
    public final dgbw c;
    public EmergencyInfo d;
    public int e;
    public Location f;
    public long g;
    public boolean h;
    private final Map j;
    private boolean k;
    private boolean l;
    private enss m;
    private ensu n;
    private dgao o;
    private boolean p;
    private Location q;
    private boolean r;
    private eiid s;

    public ConfigWorker(dgcl dgclVar, dfvc dfvcVar, EmergencyInfo emergencyInfo) {
        super(dgclVar);
        eiig.x(dfvcVar);
        this.a = dfvcVar;
        this.d = emergencyInfo;
        this.j = new bry(2);
        this.b = new ArrayList(2);
        this.c = new dgbw(this);
        this.s = eigb.a;
        this.e = 0;
        long j = dfvcVar.l;
        this.g = Math.min(j == 0 ? fsnb.a.a().g() : j, fsnb.b());
    }

    private final boolean A() {
        int i = this.e;
        eiig.r(i >= 2, "isTrackingComplete: state must be >= STATE_TRACKING, but is %s", i);
        return this.e > 2 || this.a.x == 0 || q() >= this.g;
    }

    private final boolean B(Location location) {
        return location != null && s(location) == dgbx.VALID;
    }

    private final dgbx s(Location location) {
        if (location == null) {
            return dgbx.NULL;
        }
        dfvc dfvcVar = this.a;
        return (dfvcVar.b || !location.isFromMockProvider() || fsnb.a.a().H()) ? !location.hasAccuracy() ? dgbx.NO_ACCURACY : location.getAccuracy() <= 0.0f ? dgbx.INVALID_ACCURACY : location.getAccuracy() > 20000.0f ? dgbx.TOO_INACCURATE : dfzr.a(location) < -5000 ? dgbx.TOO_RECENT : dfzr.a(location) >= dfvcVar.b() ? dgbx.TOO_STALE : dgbx.VALID : dgbx.MOCK;
    }

    private final void t() {
        boolean z = false;
        if (this.e == 2 && A()) {
            z = true;
        }
        eiig.v(z, "completeTracking: state must be STATE_TRACKING and isTrackingComplete() must be true. State is %s, isTrackingComplete() returned %s.", Integer.toString(this.e), Boolean.valueOf(A()));
        k(3);
    }

    private final void u() {
        ensu ensuVar = this.n;
        if (ensuVar != null) {
            ensuVar.cancel(true);
            this.n = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005f, code lost:
    
        if (r4 == 0) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void v(defpackage.dgcm r11, android.location.Location r12) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.thunderbird.worker.ConfigWorker.v(dgcm, android.location.Location):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void w() {
        /*
            Method dump skipped, instructions count: 435
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.thunderbird.worker.ConfigWorker.w():void");
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [enss, java.lang.Object] */
    private final void x() {
        if (this.e != 1) {
            if (this.s.h()) {
                this.s.c().cancel(false);
                this.s = eigb.a;
                return;
            }
            return;
        }
        long a = this.a.a() - q();
        if (this.s.h() || a <= 0) {
            return;
        }
        ensu schedule = jK().a.schedule(new Runnable() { // from class: dgbr
            @Override // java.lang.Runnable
            public final void run() {
                ConfigWorker configWorker = ConfigWorker.this;
                if (configWorker.e == 1 && configWorker.p()) {
                    configWorker.g(true);
                }
            }
        }, a, TimeUnit.MILLISECONDS);
        aslq.c(schedule);
        this.s = eiid.j(schedule);
    }

    private final void y() {
        if (this.e == 2) {
            asot asotVar = dfzr.a;
            jK().d().e("TrackingComplete", jI().f + this.g, jK().a, this);
            this.r = true;
        } else if (this.r) {
            jK().d().d(this);
            this.r = false;
        }
    }

    private final boolean z() {
        int i = this.e;
        eiig.r(i >= 3, "isPendingFinishedComplete: state must be >= STATE_PENDING_FINISHED, but is %s", i);
        eiig.q(this.j.isEmpty(), "isPendingFinishedComplete: scheduledReports must be empty");
        if (this.e > 3) {
            return true;
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            if (!((enss) it.next()).isDone()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.libs.platform.GmsAlarmManagerCompat$OnAlarmListener
    public final void a(bxbu bxbuVar) {
        int i = this.e;
        eiig.r(i == 2, "onAlarm: state must be STATE_TRACKING, but is %s", i);
        if (!A()) {
            y();
        } else {
            ((ejhf) ((ejhf) dfzr.a.h()).ah((char) 11347)).B("%s maximum tracking delta expired", this);
            t();
        }
    }

    public final dgcm c() {
        return new dgcm(this, q());
    }

    public final void e() {
        if (this.e >= 4) {
            return;
        }
        Map map = this.j;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((ensu) it.next()).cancel(true);
        }
        map.clear();
        Iterator it2 = this.b.iterator();
        while (it2.hasNext()) {
            ((enss) it2.next()).cancel(true);
        }
        k(5);
    }

    public final void f() {
        int i = this.e;
        if (i > 3) {
            return;
        }
        boolean z = false;
        if (i == 3 && z()) {
            z = true;
        }
        eiig.v(z, "completePendingFinished: state must be STATE_PENDING_FINISHED and isPendingFinishedComplete() must be true. State is %s, isPendingFinishedComplete() returned %s.", Integer.toString(this.e), Boolean.valueOf(z()));
        eiig.q(!this.l, "completePendingFinished: locationRequest already set");
        eiig.q(!this.r, "completePendingFinished: trackingCompleteAlarm already set");
        k(4);
    }

    public final void g(boolean z) {
        boolean z2 = false;
        if (this.e == 1 && p()) {
            z2 = true;
        }
        eiig.v(z2, "completeSampling: state must be STATE_SAMPLING and isSamplingComplete() must be true. State is %s, isSamplingComplete() returned %s.", Integer.toString(this.e), Boolean.valueOf(p()));
        if (this.b.isEmpty() && this.q == null) {
            if (!this.a.r.b()) {
                e();
                return;
            } else if (z) {
                ((ejhf) ((ejhf) dfzr.a.h()).ah((char) 11344)).B("%s unable to derive any location - sending empty report", this);
                v(c(), null);
            }
        }
        k(2);
    }

    public final void h(String str) {
        if (o()) {
            return;
        }
        this.d = this.d.i(str);
        m(null);
    }

    public final void i(final dgcm dgcmVar) {
        int i = this.e;
        eiig.r(i < 3, "scheduleReport: state must be < STATE_PENDING_FINISHED, but is %s", i);
        Map map = this.j;
        eiig.q(!map.containsKey(dgcmVar), "scheduleReport: scheduledReports must not contain key reportWorker");
        long q = dgcmVar.a - q();
        ((ejhf) ((ejhf) dfzr.a.h()).ah(11352)).O("%s scheduled work in %dms", dgcmVar, q);
        if (q <= 0) {
            l(dgcmVar);
            return;
        }
        ensu schedule = jK().a.schedule(new Runnable() { // from class: dgbo
            @Override // java.lang.Runnable
            public final void run() {
                ConfigWorker.this.l(dgcmVar);
            }
        }, q, TimeUnit.MILLISECONDS);
        aslq.c(schedule);
        if (schedule.isDone()) {
            return;
        }
        map.put(dgcmVar, schedule);
    }

    public final void j(long j) {
        if (j == this.g) {
            return;
        }
        this.g = Math.min(j, fsnb.b());
        if (this.e == 2) {
            if (A()) {
                t();
            } else {
                y();
            }
        }
    }

    @Override // defpackage.dgcs, defpackage.dgcr
    public final ActivationInfo jI() {
        return this.d.a;
    }

    @Override // defpackage.dgcs, defpackage.dgcr
    public final String jJ() {
        return super.jJ() + ":" + this.a.a + ":" + eivv.j(this.d.b, new eiho() { // from class: dgbu
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                return ((DeviceState) obj).h();
            }
        }).toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(int i) {
        int i2 = i;
        eiig.a(i2 > this.e);
        eiig.q(this.j.isEmpty(), "setState: scheduledReports must be empty");
        if (i2 == 4) {
            int i3 = this.e;
            eiig.r(i3 == 3, "setState: state must be STATE_PENDING_FINISHED, but is %s", i3);
            i2 = 4;
        }
        this.e = i2;
        asot asotVar = dfzr.a;
        ejhf ejhfVar = (ejhf) ((ejhf) asotVar.h()).ah(11356);
        int i4 = this.e;
        ejhfVar.P("%s state switched to %s", this, i4 != 0 ? i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? "CANCELED" : "FINISHED" : "PENDING_FINISHED" : "TRACKING" : "SAMPLING" : "READY");
        int i5 = this.e;
        if (i5 == 1) {
            eiig.r(true, "scheduleSamplingModeReports: state must be STATE_SAMPLING, but is %s", 1);
            dfvc dfvcVar = this.a;
            ejfh it = ((eitj) dfvcVar.w).iterator();
            while (it.hasNext()) {
                Long l = (Long) it.next();
                long longValue = l.longValue();
                if (longValue < 0 || longValue > dfvcVar.a()) {
                    ((ejhf) ((ejhf) dfzr.a.j()).ah(11353)).T("%s delta %dms is not in range [0, %d]ms", this, l, Long.valueOf(dfvcVar.a()));
                } else {
                    i(new dgcm(this, longValue));
                }
            }
            this.k = true;
            if (p()) {
                g(false);
                return;
            } else {
                w();
                x();
                return;
            }
        }
        if (i5 == 2) {
            if (fsnb.s()) {
                int i6 = this.e;
                eiig.r(i6 == 2, "scheduleTrackingModeReports: state must be STATE_TRACKING, but is %s", i6);
                long j = this.a.x;
                if (j == 0) {
                    ((ejhf) ((ejhf) asotVar.h()).ah((char) 11355)).x("scheduleTrackingModeReports: no tracking period configured");
                } else if (this.n != null) {
                    ((ejhf) ((ejhf) asotVar.j()).ah((char) 11354)).x("scheduleTrackingModeReports: tracking future already scheduled");
                } else {
                    this.n = jK().a.scheduleWithFixedDelay(new Runnable() { // from class: dgbt
                        @Override // java.lang.Runnable
                        public final void run() {
                            ConfigWorker configWorker = ConfigWorker.this;
                            if (configWorker.e == 2) {
                                ((ejhf) ((ejhf) dfzr.a.h()).ah((char) 11345)).x("scheduleTrackingModeReports: schedule immediate report");
                                configWorker.i(configWorker.c());
                            }
                        }
                    }, j, j, TimeUnit.MILLISECONDS);
                }
            }
            if (A()) {
                t();
                return;
            } else {
                w();
                y();
                return;
            }
        }
        if (i5 == 3) {
            w();
            if (fsnb.s()) {
                u();
            }
            y();
            x();
            if (z()) {
                f();
                return;
            } else {
                aslq.c(ensj.a(this.b).c(new Runnable() { // from class: dgbs
                    @Override // java.lang.Runnable
                    public final void run() {
                        ConfigWorker.this.f();
                    }
                }, jK().a));
                return;
            }
        }
        if (i5 == 4) {
            ((ejhf) ((ejhf) dfzr.a.h()).ah((char) 11358)).B("%s config complete", this);
            this.c.c();
        } else if (i5 == 5) {
            w();
            if (fsnb.s()) {
                u();
            }
            y();
            x();
            ((ejhf) ((ejhf) dfzr.a.h()).ah((char) 11357)).B("%s config canceled", this);
            this.c.c();
        }
    }

    public final void l(dgcm dgcmVar) {
        int i = this.e;
        eiig.r(i < 3, "startReport: state must be < STATE_PENDING_FINISHED, but is %s", i);
        this.j.remove(dgcmVar);
        Location location = this.q;
        if (m(location)) {
            return;
        }
        if (!fsnb.a.a().aU() ? !B(location) : !(location != null && dfzr.a(location) < fsnb.h())) {
            this.p = true;
            v(dgcmVar, location);
        } else {
            ((ejhf) ((ejhf) dfzr.a.h()).ah((char) 11359)).B("%s no location to report", dgcmVar);
        }
        if (this.e == 1 && p()) {
            g(true);
        }
    }

    public final boolean m(Location location) {
        if (this.p || this.a.c(jK(), this.d, location) != null) {
            return false;
        }
        ((ejhf) ((ejhf) dfzr.a.h()).ah((char) 11343)).B("%s no longer matched by emergency", this);
        e();
        return true;
    }

    public final boolean n() {
        return this.e == 5;
    }

    public final boolean o() {
        int i = this.e;
        return i == 4 || i == 5;
    }

    @Override // defpackage.bzim
    public final void onLocationChanged(Location location) {
        int i = this.e;
        if (i != 1 && i != 2) {
            ((ejhf) ((ejhf) dfzr.a.j()).ah(11351)).z("rejecting incoming location: state must be STATE_SAMPLING or STATE_TRACKING, but is %s", this.e);
            return;
        }
        if (!B(location)) {
            ((ejhf) ((ejhf) dfzr.a.h()).ah(11350)).P("%s rejecting incoming location with validity %s", this, s(location));
            return;
        }
        if (this.f == null) {
            this.f = location;
        }
        this.q = location;
        int i2 = this.e;
        if (i2 == 1) {
            if (this.a.v && this.b.isEmpty()) {
                ((ejhf) ((ejhf) dfzr.a.h()).ah((char) 11349)).B("%s first time location", this);
                i(c());
                return;
            }
            return;
        }
        if (i2 == 2) {
            asot asotVar = dfzr.a;
            if (fsnb.s()) {
                return;
            }
            i(c());
        }
    }

    public final boolean p() {
        int i = this.e;
        eiig.r(i > 0, "isSamplingComplete: state must be >= STATE_SAMPLING, but is %s", i);
        if (this.e > 1) {
            return true;
        }
        dfvc dfvcVar = this.a;
        return !(dfvcVar.v && this.q == null && q() < dfvcVar.a()) && this.k && this.j.isEmpty();
    }
}
