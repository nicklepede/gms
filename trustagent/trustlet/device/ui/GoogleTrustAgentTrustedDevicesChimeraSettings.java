package com.google.android.gms.trustagent.trustlet.device.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.activity.result.ActivityResult;
import com.google.android.gms.R;
import com.google.android.gms.trustagent.trustlet.device.bluetooth.model.TrustableDevice;
import defpackage.abt;
import defpackage.asej;
import defpackage.asot;
import defpackage.asqh;
import defpackage.dg;
import defpackage.dgmu;
import defpackage.dgoy;
import defpackage.dgqz;
import defpackage.dgsk;
import defpackage.eiig;
import defpackage.ejhf;
import defpackage.ngn;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class GoogleTrustAgentTrustedDevicesChimeraSettings extends dgmu implements dgoy, abt {
    private static final asot m = asot.b("TrustAgent", asej.TRUSTAGENT);
    dgqz l;
    private boolean n = false;

    @Override // defpackage.dgmq
    protected final ngn a() {
        Bundle bundle = new Bundle();
        Intent intent = getIntent();
        if (intent != null && intent.getExtras() != null) {
            Bundle extras = intent.getExtras();
            int i = extras != null ? extras.getInt("notification_type_key", -1) : -1;
            if (i >= 0) {
                bundle.putInt("notification_type", i);
            }
        }
        dgsk dgskVar = new dgsk();
        dgskVar.setArguments(bundle);
        return dgskVar;
    }

    @Override // defpackage.dgoy
    public final void b() {
        l().N();
    }

    @Override // defpackage.abt
    public final /* bridge */ /* synthetic */ void jq(Object obj) {
        ActivityResult activityResult = (ActivityResult) obj;
        int i = activityResult.a;
        if (asqh.f()) {
            j.intValue();
            if (i == -11) {
                finish();
                i = -11;
            }
        }
        Intent intent = activityResult.b;
        if (intent == null) {
            return;
        }
        int intExtra = intent.getIntExtra("extra_request_code", 0);
        if (i == -1) {
            if (intExtra != 1002) {
                ((ejhf) m.j()).x("Unknown request code");
            } else if (Objects.equals(intent.getAction(), "com.google.android.gms.auth.trustagent.ADD_DEVICE")) {
                Optional e = TrustableDevice.e(intent);
                final dgqz dgqzVar = this.l;
                Objects.requireNonNull(dgqzVar);
                e.ifPresent(new Consumer() { // from class: dgrb
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void q(Object obj2) {
                        dgqz.this.a((TrustableDevice) obj2);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        }
    }

    @Override // defpackage.dgmq
    protected final String k() {
        return "TrustedDevicesFragment";
    }

    public final dgsk l() {
        dg h = getSupportFragmentManager().h("TrustedDevicesFragment");
        eiig.x(h);
        return (dgsk) h;
    }

    @Override // defpackage.dgmu, defpackage.dgmq, defpackage.dgmn, defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getIntent();
        this.l = new dgqz(this);
        if (bundle != null) {
            this.n = bundle.getBoolean("TrustedDeviceDialogActionTakenKey", false);
        }
        hy().h();
    }

    @Override // defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // defpackage.dgmq, com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.trusted_devices_actions_help) {
            return super.onOptionsItemSelected(menuItem);
        }
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(getString(R.string.auth_trust_agent_bluetooth_disabled_help_link))));
        return true;
    }

    @Override // defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("TrustedDeviceDialogActionTakenKey", this.n);
        super.onSaveInstanceState(bundle);
    }
}
