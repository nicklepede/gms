package com.google.android.gms.apperrors;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.chimera.IntentOperation;
import com.google.android.finsky.apperrors.PlayAppErrorReport;
import com.google.android.finsky.updateprompt.PlayAppFilteredError;
import defpackage.asvp;
import defpackage.asxe;
import defpackage.atzb;
import defpackage.atzs;
import defpackage.auid;
import defpackage.aumo;
import defpackage.ausn;
import defpackage.eluo;
import defpackage.qmp;
import defpackage.qmr;
import defpackage.tep;
import defpackage.tet;
import java.util.logging.Level;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class PlayAppErrorsReportOperation extends IntentOperation {
    public static final /* synthetic */ int a = 0;
    private static final ausn b = ausn.b("PlayAppErrorsReportOperation", auid.STATS);
    private static final Intent c = new Intent("com.google.android.finsky.BIND_APP_ERROR_SERVICE").setPackage("com.android.vending");
    private static final Intent d = new Intent("com.google.android.finsky.BIND_APP_FILTERED_ERROR_SERVICE").setPackage("com.android.vending");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        asvp asvpVar;
        if (!asxe.d(this).h("com.android.vending")) {
            ((eluo) b.f(Level.WARNING).ai(458)).x("Could not verify Play Store signature");
            return;
        }
        qmp qmpVar = null;
        if ("com.google.android.gms.apperrors.PLAY_APP_ERRORS_REPORT_ACTION".equals(intent.getAction())) {
            PlayAppErrorReport playAppErrorReport = (PlayAppErrorReport) atzs.b(intent, "report", PlayAppErrorReport.CREATOR);
            atzb.s(playAppErrorReport);
            asvpVar = new asvp();
            try {
                try {
                    if (aumo.a().d(this, c, asvpVar, 1)) {
                        IBinder a2 = asvpVar.a();
                        if (a2 != null) {
                            IInterface queryLocalInterface = a2.queryLocalInterface("com.google.android.finsky.apperrors.IPlayAppErrorsService");
                            qmpVar = queryLocalInterface instanceof tep ? (tep) queryLocalInterface : new tep(a2);
                        }
                        if (qmpVar == null) {
                            ((eluo) b.f(Level.WARNING).ai(462)).x("Connection failed");
                            return;
                        }
                        Parcel fE = qmpVar.fE();
                        qmr.e(fE, playAppErrorReport);
                        qmpVar.fH(1, fE);
                        return;
                    }
                    return;
                } catch (RemoteException | InterruptedException e) {
                    ((eluo) ((eluo) b.f(Level.WARNING).s(e)).ai(461)).x("Service call failed");
                    return;
                }
            } finally {
            }
        }
        if (!"com.google.android.gms.apperrors.PLAY_APP_FILTERED_ERROR_ACTION".equals(intent.getAction())) {
            ((eluo) b.f(Level.WARNING).ai(457)).B("Unknown intent action '%s'", intent.getAction());
            return;
        }
        PlayAppFilteredError playAppFilteredError = (PlayAppFilteredError) atzs.b(intent, "error", PlayAppFilteredError.CREATOR);
        atzb.s(playAppFilteredError);
        asvpVar = new asvp();
        try {
            try {
                if (aumo.a().d(this, d, asvpVar, 1)) {
                    IBinder a3 = asvpVar.a();
                    if (a3 != null) {
                        IInterface queryLocalInterface2 = a3.queryLocalInterface("com.google.android.finsky.updateprompt.IPlayAppFilteredErrorsService");
                        qmpVar = queryLocalInterface2 instanceof tet ? (tet) queryLocalInterface2 : new tet(a3);
                    }
                    if (qmpVar == null) {
                        ((eluo) b.f(Level.WARNING).ai(460)).x("Connection failed");
                        return;
                    }
                    Parcel fE2 = qmpVar.fE();
                    qmr.e(fE2, playAppFilteredError);
                    qmpVar.fH(1, fE2);
                }
            } catch (RemoteException | InterruptedException e2) {
                ((eluo) ((eluo) b.f(Level.WARNING).s(e2)).ai(459)).x("Service call failed");
            }
        } finally {
        }
    }
}
