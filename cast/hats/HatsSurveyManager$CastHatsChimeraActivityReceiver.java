package com.google.android.gms.cast.hats;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.libraries.surveys.SurveyMetadata;
import defpackage.amwy;
import defpackage.amwz;
import defpackage.arwm;
import defpackage.dxpl;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class HatsSurveyManager$CastHatsChimeraActivityReceiver extends TracingBroadcastReceiver {
    public boolean a;
    public final /* synthetic */ amwz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatsSurveyManager$CastHatsChimeraActivityReceiver(amwz amwzVar) {
        super("cast");
        this.b = amwzVar;
        this.a = false;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jz(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("com.google.android.gms.cast.activity.HATS_SURVEY_EVENT_ACTION_KEY_RESULT", -1);
        amwz.a.n("Received HaTS survey event: %d", Integer.valueOf(intExtra));
        if (intExtra == 0) {
            final amwz amwzVar = this.b;
            final SurveyMetadata surveyMetadata = (SurveyMetadata) intent.getParcelableExtra("com.google.android.gms.cast.activity.HATS_SURVEY_EVENT_ACTION_KEY_SURVEY_METADATA");
            amwz.a.m("onSurveyPrompted");
            amwzVar.n = amwy.PRESENTED;
            amwzVar.k = surveyMetadata != null ? surveyMetadata : amwzVar.k;
            amwzVar.m.ifPresent(new Consumer() { // from class: amwt
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    amwz.this.k(surveyMetadata, (amgd) obj, 0, true);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            return;
        }
        if (intExtra == 1) {
            final amwz amwzVar2 = this.b;
            final SurveyMetadata surveyMetadata2 = (SurveyMetadata) intent.getParcelableExtra("com.google.android.gms.cast.activity.HATS_SURVEY_EVENT_ACTION_KEY_SURVEY_METADATA");
            amwz.a.m("onSurveyClosed");
            amwzVar2.n = amwy.NOT_PRESENTED;
            amwzVar2.k = surveyMetadata2 != null ? surveyMetadata2 : amwzVar2.k;
            amwzVar2.m.ifPresent(new Consumer() { // from class: amwk
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    String str;
                    amgd amgdVar = (amgd) obj;
                    fecj v = emtb.a.v();
                    amwz amwzVar3 = amwz.this;
                    amgj amgjVar = amwzVar3.l;
                    arwm.s(amgjVar);
                    String b = amgjVar.b();
                    if (!v.b.L()) {
                        v.U();
                    }
                    fecp fecpVar = v.b;
                    emtb emtbVar = (emtb) fecpVar;
                    b.getClass();
                    emtbVar.b |= 2;
                    emtbVar.d = b;
                    if (!fecpVar.L()) {
                        v.U();
                    }
                    SurveyMetadata surveyMetadata3 = surveyMetadata2;
                    fecp fecpVar2 = v.b;
                    emtb emtbVar2 = (emtb) fecpVar2;
                    emtbVar2.g = 2;
                    emtbVar2.b |= 16;
                    if (surveyMetadata3 != null && (str = surveyMetadata3.c) != null) {
                        if (!fecpVar2.L()) {
                            v.U();
                        }
                        emtb emtbVar3 = (emtb) v.b;
                        emtbVar3.b |= 1;
                        emtbVar3.c = str;
                    }
                    emtb emtbVar4 = (emtb) v.Q();
                    CastDevice castDevice = amwzVar3.e;
                    amgj amgjVar2 = amwzVar3.l;
                    arwm.s(amgjVar2);
                    amgdVar.q(emtbVar4, castDevice, amgjVar2.a());
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            return;
        }
        if (intExtra == 2) {
            if (intent.hasExtra("com.google.android.gms.cast.activity.HATS_SURVEY_EVENT_ACTION_KEY_PRESENT_SURVEY_ERROR_TYPE")) {
                String stringExtra = intent.getStringExtra("com.google.android.gms.cast.activity.HATS_SURVEY_EVENT_ACTION_KEY_PRESENT_SURVEY_ERROR_TYPE");
                arwm.s(stringExtra);
                final dxpl dxplVar = (dxpl) Enum.valueOf(dxpl.class, stringExtra);
                final amwz amwzVar3 = this.b;
                final SurveyMetadata surveyMetadata3 = (SurveyMetadata) intent.getParcelableExtra("com.google.android.gms.cast.activity.HATS_SURVEY_EVENT_ACTION_KEY_SURVEY_METADATA");
                amwz.a.m("onPresentSurveyFailed");
                amwzVar3.n = amwy.NOT_PRESENTED;
                amwzVar3.k = surveyMetadata3 != null ? surveyMetadata3 : amwzVar3.k;
                amwzVar3.m.ifPresent(new Consumer() { // from class: amwr
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        String str;
                        amgd amgdVar = (amgd) obj;
                        fecj v = emtb.a.v();
                        amwz amwzVar4 = amwz.this;
                        amgj amgjVar = amwzVar4.l;
                        arwm.s(amgjVar);
                        String b = amgjVar.b();
                        if (!v.b.L()) {
                            v.U();
                        }
                        fecp fecpVar = v.b;
                        emtb emtbVar = (emtb) fecpVar;
                        b.getClass();
                        int i = 2;
                        emtbVar.b |= 2;
                        emtbVar.d = b;
                        if (!fecpVar.L()) {
                            v.U();
                        }
                        dxpl dxplVar2 = dxplVar;
                        emtb emtbVar2 = (emtb) v.b;
                        emtbVar2.g = 4;
                        emtbVar2.b |= 16;
                        annu.b();
                        switch (dxplVar2) {
                            case CLIENT_ACTIVITY_WAS_DESTROYED:
                                break;
                            case CLIENT_ACTIVITY_WAS_FINISHING:
                                i = 3;
                                break;
                            case CLIENT_ACTIVITY_WAS_NULL:
                                i = 4;
                                break;
                            case INVALID_COMPLETION_STYLE:
                                i = 5;
                                break;
                            case INVALID_PROMPT_STYLE:
                                i = 6;
                                break;
                            case INVALID_SURVEY_DATA_TYPE:
                                i = 7;
                                break;
                            case INVALID_SURVEY_PAYLOAD:
                                i = 8;
                                break;
                            case SURVEY_ALREADY_RUNNING:
                                i = 9;
                                break;
                            case SURVEY_EXPIRED:
                                i = 10;
                                break;
                            case UNSUPPORTED_EMBEDDED_SURVEY_CONTAINER:
                                i = 11;
                                break;
                            default:
                                i = 1;
                                break;
                        }
                        if (!v.b.L()) {
                            v.U();
                        }
                        SurveyMetadata surveyMetadata4 = surveyMetadata3;
                        fecp fecpVar2 = v.b;
                        emtb emtbVar3 = (emtb) fecpVar2;
                        emtbVar3.h = i - 1;
                        emtbVar3.b |= 32;
                        if (surveyMetadata4 != null && (str = surveyMetadata4.c) != null) {
                            if (!fecpVar2.L()) {
                                v.U();
                            }
                            emtb emtbVar4 = (emtb) v.b;
                            emtbVar4.b = 1 | emtbVar4.b;
                            emtbVar4.c = str;
                        }
                        emtb emtbVar5 = (emtb) v.Q();
                        CastDevice castDevice = amwzVar4.e;
                        amgj amgjVar2 = amwzVar4.l;
                        arwm.s(amgjVar2);
                        amgdVar.n(emtbVar5, castDevice, amgjVar2.a());
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return;
            }
            return;
        }
        if (intExtra == 3) {
            final amwz amwzVar4 = this.b;
            final SurveyMetadata surveyMetadata4 = (SurveyMetadata) intent.getParcelableExtra("com.google.android.gms.cast.activity.HATS_SURVEY_EVENT_ACTION_KEY_SURVEY_METADATA");
            amwz.a.m("didAnswerSingleSelectQuestion");
            amwzVar4.n = amwy.PRESENTED;
            amwzVar4.k = surveyMetadata4 != null ? surveyMetadata4 : amwzVar4.k;
            amwzVar4.m.ifPresent(new Consumer() { // from class: amwl
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    amwz.this.k(surveyMetadata4, (amgd) obj, 2, false);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            return;
        }
        if (intExtra == 4) {
            final amwz amwzVar5 = this.b;
            final SurveyMetadata surveyMetadata5 = (SurveyMetadata) intent.getParcelableExtra("com.google.android.gms.cast.activity.HATS_SURVEY_EVENT_ACTION_KEY_SURVEY_METADATA");
            amwz.a.m("didAnswerOpenTextQuestion");
            amwzVar5.n = amwy.PRESENTED;
            amwzVar5.k = surveyMetadata5 != null ? surveyMetadata5 : amwzVar5.k;
            amwzVar5.m.ifPresent(new Consumer() { // from class: amwn
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    amwz.this.k(surveyMetadata5, (amgd) obj, 3, false);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            return;
        }
        if (intExtra != 5) {
            amwz.a.m("Received unknown HaTS survey event!");
            return;
        }
        final amwz amwzVar6 = this.b;
        int intExtra2 = intent.getIntExtra("com.google.android.gms.cast.activity.HATS_SURVEY_EVENT_ACTION_KEY_REQUEST_CODE", -999);
        final int intExtra3 = intent.getIntExtra("com.google.android.gms.cast.activity.HATS_SURVEY_EVENT_ACTION_KEY_RESULT_CODE", -999);
        amwz.a.p("onActivityResult(): requestCode=%d, resultCode=%d", Integer.valueOf(intExtra2), Integer.valueOf(intExtra3));
        amwzVar6.n = amwy.NOT_PRESENTED;
        amwzVar6.m.ifPresent(new Consumer() { // from class: amwu
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                String str;
                amgd amgdVar = (amgd) obj;
                fecj v = emtb.a.v();
                amwz amwzVar7 = amwz.this;
                amgj amgjVar = amwzVar7.l;
                arwm.s(amgjVar);
                String b = amgjVar.b();
                if (!v.b.L()) {
                    v.U();
                }
                int i = intExtra3;
                fecp fecpVar = v.b;
                emtb emtbVar = (emtb) fecpVar;
                b.getClass();
                emtbVar.b |= 2;
                emtbVar.d = b;
                int i2 = i != -1 ? 4 : 2;
                if (!fecpVar.L()) {
                    v.U();
                }
                fecp fecpVar2 = v.b;
                emtb emtbVar2 = (emtb) fecpVar2;
                emtbVar2.g = i2 - 1;
                emtbVar2.b |= 16;
                SurveyMetadata surveyMetadata6 = amwzVar7.k;
                if (surveyMetadata6 != null && (str = surveyMetadata6.c) != null) {
                    if (!fecpVar2.L()) {
                        v.U();
                    }
                    emtb emtbVar3 = (emtb) v.b;
                    emtbVar3.b |= 1;
                    emtbVar3.c = str;
                }
                emtb emtbVar4 = (emtb) v.Q();
                CastDevice castDevice = amwzVar7.e;
                amgj amgjVar2 = amwzVar7.l;
                arwm.s(amgjVar2);
                amgdVar.q(emtbVar4, castDevice, amgjVar2.a());
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        if (this.a) {
            amwzVar6.b.unregisterReceiver(this);
            this.a = false;
        }
    }
}
